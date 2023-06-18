# Spring Batch Example | Project

## 참고 링크
- [Spring Batch] 스프링 배치 강좌 1. 프로그래밍의 꽃. 스프링 배치 Hello World!
  - https://www.fwantastic.com/2019/12/spring-batch-1-hello-world.html
- [Spring Batch] 스프링 배치 강좌 2. Metadata와 JobRepository 알아보기
  - https://www.fwantastic.com/2019/12/spring-batch-2-metadata-jobrepository.html
- [Spring Batch] 스프링 배치 강좌 3. JobExecutionContext를 활용하여 스텝간 데이터 공유하기
  - https://www.fwantastic.com/2019/12/spring-batch-3-jobexecutioncontext.html
- [Spring Batch] 스프링 배치 강좌 4. CSV 파일 읽어서 JDBC로 디비에 저장하기
  - https://www.fwantastic.com/2019/12/spring-batch-4-csv-jdbc.html
- [Spring Batch] 스프링 배치 강좌 5. JDBC 로 디비 읽어서 CSV 파일에 쓰기
  - https://www.fwantastic.com/2019/12/spring-batch-5-jdbc-csv.html

## 기본 설정
- Open JDK 11
- 스프링 배치 버전 4.2.1.RELEASE
- Oracle 19c
- MSSQL 연계도 필요

## 기타 설정
- 오프라인 세팅 필요(폐쇄망에서 사용할 예정)
- dependency 파일들도 별도 프로젝트 폴더 내로 받아지도록 설정 완료
- 테스트에서는 우선 H2 사용