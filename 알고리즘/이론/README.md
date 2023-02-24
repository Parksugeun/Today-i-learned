# 알고리즘 이론

- ## Hash

## Hash

get/put/getOrDefault

String을 기반으로 정보를 기록하고 관리해야 될 때 사용

1. Hash는 전화번호부와 같다 정수가 아닌 키를 가질 수 있어 배열로 담을 수 없는 정보를 담을 수 있다.
2. 대부분 그 Key가 String이다.
3. put/get/getOrDefault

Iterator: Iterator란 자바의 컬렉션(Collection)에 저장되어 있는 요소들을 순회하는 인터페이스이다.

- 정의방법은 Iterator<T> iterator = Collection.iterator();
- 메서드는 다음 요소가 있는지 판단하는 hasNext(), 다음 요소를 가져오는 next(), 가져온 요소를 삭제하는 remove()

## **HashMap이란?**

HashMap은 Map인터페이스에 속해있는 컬렉션

Map 인터페이스의 기본 기능들을 전부 구현할 수 있다

데이터들은 모두 (키, 값)의 1:1 구조로 되어있는 Entry로 되어있다.



# 브라우저의 렌더링 과정

1. HTML 마크업 처리 후 DOM 트리 빌드

2. CSS 마크업 처리 후 CSSOM 트리를 빌드

3. DOM 및 CSSOM을 결합하여 렌더링 트리를 형성

4. 렌더링 트리에서 레이아웃을 싱행 후 각 노드의 기하학적 형태를 계산

5. 개별 노드를 화면에 페인트
