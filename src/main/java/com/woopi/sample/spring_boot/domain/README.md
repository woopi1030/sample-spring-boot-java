
# domain

domain 패키지는 개별 프로젝트의 비지니스 로직을 담아놓은 패지키입니다.

domain 패키지 안에 개별 패키지를 생성하여 관리합니다.

domain 안에 있는 sample 패키지는 다른 도메인 작성 시 참고할 수 있는 코드 컨벤션을 위해서 작성합니다.


- 구성
  - domain package
    - 개별 package
        1. Controller : APi end-point 정의
        2. Service : 비지니스 로직 정의
        3. DomainService : 도메인 접근에만 사용되는 서비스
        4. Repository : 데이터 CURD 인터페이스 (JPA)
        5. Mapper : 복잡한 쿼리를 수행하는 맵퍼 (추가 예정)
