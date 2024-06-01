package com.example.olebackend.converter;

import com.example.olebackend.domain.News;
import com.example.olebackend.domain.NewsImage;
import com.example.olebackend.web.dto.NewsResponse;
import org.springframework.data.domain.Page;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class NewsConverter {

    // 목록에서의 썸네일
    public static NewsResponse.getNewsPreviewDTO toNewsPreviewDTO(News news) {

        return NewsResponse.getNewsPreviewDTO.builder()
                .id(news.getId())
                .createdAt(news.getCreatedAt())
                .category(news.getCategory().toString())
                .title(news.getTitle())
                .content(news.getContent())
                .author(news.getAuthor())
                .imageUrl(news.getImageUrl())
                .build();
    }

    public static NewsResponse.getNewsListDTO toNewsListDTO(Page<News> newsList) {
        List<NewsResponse.getNewsPreviewDTO> newsPreviewDTOList = newsList.stream()
                .map(NewsConverter::toNewsPreviewDTO).collect(Collectors.toList());

        return NewsResponse.getNewsListDTO.builder()
                .newsList(newsPreviewDTOList)
                .isLast(newsList.isLast())
                .isFirst(newsList.isFirst())
                .totalPage(newsList.getTotalPages())
                .totalElements(newsList.getTotalElements())
                .listSize(newsPreviewDTOList.size())
                .build();
    }

    public static NewsResponse.getNewsImagesDTO toNewsImageDTO(NewsImage newsImage) {
        return NewsResponse.getNewsImagesDTO.builder()
                .imageUrl(newsImage.getImageUrl())
                .build();
    }

    public static NewsResponse.getNewsDetailDTO toNewsDetailDTO(Optional<News> news) {
        List<NewsImage> imageList = news.get().getImageList();

        List<NewsResponse.getNewsImagesDTO> newsImagesDTOList = imageList.stream()
                .map(NewsConverter::toNewsImageDTO).collect(Collectors.toList());

        return NewsResponse.getNewsDetailDTO.builder()
                .title(news.get().getTitle())
                .content(news.get().getContent())
                .category(news.get().getCategory().toString())
                .author(news.get().getAuthor())
                .createdAt(news.get().getCreatedAt())
                .imageList(newsImagesDTOList)
                .views(news.get().getViews())
                .build();


    }
}
