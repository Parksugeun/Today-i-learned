# 자주 사용되는 Java API

## 배열과 리스트
### 배열 정렬
- Arrays.sort(T[] a) : 배열 a를 오름차순으로 정렬한다.
- Arrays.sort(T[] a, Comparator<? super T> c) : 배열 a를 Comparator c를 이용하여 정렬한다.
### 리스트 정렬
- Collections.sort(List<T> list) : 리스트 list를 오름차순으로 정렬한다.
- Collections.sort(List<T> list, Comparator<? super T> c) : 리스트 list를 Comparator c를 이용하여 정렬한다.

## 문자열
- String.split(String regex) : 정규표현식 regex에 따라 문자열을 분리한다.
- String.join(CharSequence delimiter, Iterable<? extends CharSequence> elements) : 문자열 리스트 elements를 delimiter로 이어붙인다.
- StringBuilder : 문자열을 더할 때 사용하는 클래스로, 문자열 연산이 빈번할 때 성능을 향상시킨다.


## 수학
- Math.abs(int a) : 정수 a의 절대값을 반환한다.
- Math.max(int a, int b) : a와 b 중 더 큰 값을 반환한다.
- Math.min(int a, int b) : a와 b 중 더 작은 값을 반환한다.
- Math.sqrt(double a) : 실수 a의 제곱근을 반환한다.


## 정규표현식
- Pattern.compile(String regex) : 정규표현식 regex에 대한 패턴을 컴파일한다.
- Matcher : 문자열에서 패턴을 검색할 때 사용하는 클래스로, Pattern.matcher(CharSequence input) 메서드를 통해 인스턴스를 생성한다.


## 입출력
- Scanner : 표준 입력으로부터 데이터를 읽을 때 사용하는 클래스이다.
- System.out.println(String str) : 문자열 str을 출력하고 개행 문자를 출력한다.
- System.out.printf(String format, Object... args) : 지정된 형식 문자열에 대해 가변 인수 args를 포맷팅하여 출력한다.