## 고객 관리 어플

### 1. 사용 언어 및 환경
    Kotlin, Android Studio

### 2. 실행 화면 및 주요 기능  
#### 2-1. Main  
<img width="25%" src="https://user-images.githubusercontent.com/50562634/147571033-55f8b18e-eaf0-41a3-8e58-2af251e07cb7.PNG"/>  

    - ImageView와 Button 사용
    - Button에 OnClick 이벤트가 발생하면 intent를 사용하여 화면 이동
    
#### 2-2. 고객 데이터베이스
    - SQLite 사용
    - 필드 : custid, name, sex, phone, city

#### 2-3. 고객등록  
<img width="25%" src="https://user-images.githubusercontent.com/50562634/147571044-5696114f-f2da-41fc-ae90-94ccef4d486e.PNG"/>  
    
    - LinearLayout을 활용하여 TextView, EditText 등 사용
    - Button을 Click하면 입력한 값을 SQL문에 넣어 고객DB에 추가

#### 2-4. 고객 조회
<img width="25%" src="https://user-images.githubusercontent.com/50562634/147571048-f60ce6db-a756-4e0a-aa90-693e231082a8.PNG"/> <img width="25%" src="https://user-images.githubusercontent.com/50562634/147571050-c54c58f1-d57e-4a36-a661-79ac0bd1d91a.PNG"/>  
    
    - Rowitem.xml과 Customerlist.xml, 2개의 layout을 사용하여 고객 목록 조회
      Rowitem.xml : ImageView, TextView 등 사용
      Customerlist.xml : ListView 사용
    - ListView Click시 상세 내용 조회
    
