<br>

<div align=left>
  
![image](https://github.com/Vida0822/Algorithm_Study/assets/132312673/a9c6839f-7cb2-40c2-9973-63d47bd68ca5)


</div>

<br><br>

# 올래 👴
### 시니어 교육 매칭 웹서비스 
<br>

<b>1. Matching </b>
- #설문조사 #최적의성능 


<b>2. Security </b>
- #보안이생명


<b>3. Community   </b>


<b>4. Search </b>
- #내가원하는대로 
  <br><br><br><br>


# Ole Backend Team
### [📚 Ole Team Notion](https://www.notion.so/cf4d947709124ce79e4ed832cca0266e) <br>

|     | 이름   | 
|-----|------|
| BE 팀장 | 신희민  |
| BE 팀원 | 한진경  |
| BE 팀원 | 최현욱  |
| BE 팀원 | 임효진  |

<br><br>

# 프로젝트 세부사항
- ### 구현 영상<br>
  - [최종 발표영상 📷]() <br>

- ### 기간 :
  - 2023.03.10 ~ 2023.04.21
  - duty sheet : 

<br><br><br>

# Tech Stack

<br>
<div align=center> 

|     | 이름   | 
|-----|------|
| Back-end | Java 11 / Spring Boot 2.4 / Spring Data JPA  5.0 / Query DSL / Spring Security  |
|Server/Deployment | Apache Tomcat / AWS EC2 / AWS RDS  |
| DB | MySQL, RDS  |
| Tools / Test | IntelliJ IDEA / JUnit5  |
| Collaborations | Git / Swagger / Notion / Discord   |

  <br>

</div>

<br><br><br><br>

# Service Architecture

<br>

# Use-Case Diagram 
<details>
<summary> Use-Case 펼쳐보기 </summary>
<div markdown="1">  
  
![image](https://github.com/Vida0822/OOP/assets/132312673/63c45684-5aac-4300-ac45-ff9a7e244550)

</div>
</details>

<br><br>

# ERD
<details>
<summary> ERD 펼쳐보기 </summary>
<div markdown="1">  
  
  ![그림3](https://github.com/Vida0822/Algorithm_Study/assets/132312673/1bf815ae-80d5-47bf-8090-dde9e92fb9bd)


</div>
</details>

<br><br>

# API 명세서
[📄 API 바로가기](https://www.notion.so/API-912f126e301d45348be63d3b70ad9201?pvs=4)

<br><br>

# 주요 기능

| 설문조사 매칭 기능 | 검색 필터 |
|:------:|:------:|
| ![검색 조회]() | ![편집상태]() |
|- 8가지 항목에 대한 최적의 강의 추천 <br> - 이전 설문 내역 기반 맞춤 리스트 출력  | - 카테고리별 검색 <br> - 검색 필터(연관순, 댓글순, 조회순, 최신순) 제공 <br> |

|  찜, 수강신청 기능 | 커뮤니티, 뉴스 기능 |
|:------:|:------:|
| ![관리자]() | ![댓글로그]() |
|- 비회원도 손쉽게 교육 등록 <br> - 수강 내역 조회 및 등록 관리 <br> |- 다양한 의견을 나누는 커뮤니티 <br> - 유익한 정보를 제공하는 생활 뉴스 <br> |

<br><br>


# Trouble Shooting

💡 자세한 사항과 수치 및 통계자료는 토글 아래 링크를 통해 확인해 주세요. <br>
<br>
<details>
<summary> 검색 성능 개선</summary>
<div markdown="1">  

<br>

(1) [STEP1]&nbsp; 검색 성능 문제와 원인 분석, 개선방향 <br>
- 문제 : 실행환경(Local, EC2 서버 등)에 따라 속도와 성능 차이가 큼. <br>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;검색 조회, 특히 키워드 검색 부분의 속도가 현저히 느림. <br>
- 원인 : 라이브러리의 비효율적인 사용, 불필요한 쿼리
- 개선방향 : Jmeter(부하테스트)와 AOP Execution Timer(실행시간 측정) 도입<br> 
 &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; ➡︎ 단계별로 향상된 성능과 실행 속도를 측정해 나감. <br>
👉 https://www.notion.so/STEP1-fad9129c662e44859f1ff7d4df0dd75f
<br><br>

  
(2) [STEP3]&nbsp; 키워드 검색시 쿼리 개선 (Query DSL 적용) <br>
- 문제 : 라이브러리를 light한 버전으로 바꾸었지만 느린 검색 속도 (500ms 정도)
- 원인 : 키워드와 카테고리 검색 시, 비효율적인 쿼리문 (contain, join 등)
- 해결 : 제목, 내용, 키워드마다 반복적으로 나가던 쿼리를 한 번의 동적 쿼리로 처리. 
- 결과 : 부하테스트 쓰레드 700->2500으로 증가<br>
    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;실행시간은 400~500ms에서 300ms 정도로 단축됨.<br>
  👉 https://www.notion.so/STEP3-Query-DSL-939026377148406f93c7a571b767cd42
<br>


</div>
</details>

<details>
<summary> SSE </summary>
<div markdown="1">

</div>
</details>


<details>
<summary> 임시 인증코드 저장 </summary>
<div markdown="1">

</div>
</details>


<details>
<summary> CI / CD </summary>
<div markdown="1">
    <br>


</div>
</details>



<br><br><br>

 
