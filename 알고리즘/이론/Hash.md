# Hash 문법

## HashMap<K, V>

HashMap은 Key-Value 쌍을 저장하는 자료구조입니다. Key는 중복을 허용하지 않으며, Value는 중복을 허용합니다. HashMap은 검색 및 삽입 연산의 시간 복잡도가 O(1)로 매우 빠르기 때문에 많이 사용됩니다.

`Map<K, V> map = new HashMap<>();` 

## LinkedHashMap<K, V>

LinkedHashMap은 HashMap과 비슷하지만, 요소들이 저장된 순서를 기억합니다. 즉, 삽입된 순서대로 요소들이 출력됩니다.

`Map<K, V> map = new LinkedHashMap<>();`

## TreeMap<K, V>

TreeMap은 Binary Search Tree를 기반으로 구현된 Map입니다. TreeMap은 검색 및 삽입 연산의 시간 복잡도가 O(log n)으로 HashMap보다 느리지만, 요소들이 Key에 따라 정렬된 상태로 유지됩니다.

`Map<K, V> map = new TreeMap<>();`

## HashSet<E>

HashSet은 중복을 허용하지 않는 Set 자료구조입니다. 내부적으로 HashMap을 이용하여 구현되며, 요소들의 순서를 보장하지 않습니다.

`Set<T> set = new HashSet<>();`

## LinkedHashSet<E>

LinkedHashSet은 HashSet과 비슷하지만, 요소들이 저장된 순서를 기억합니다. 즉, 삽입된 순서대로 요소들이 출력됩니다.

`Set<T> set = new LinkedHashSet<>();`

## TreeSet<E>

TreeSet은 Binary Search Tree를 기반으로 구현된 Set입니다. TreeSet은 검색 및 삽입 연산의 시간 복잡도가 O(log n)으로 HashSet보다 느리지만, 요소들이 정렬된 상태로 유지됩니다.

`Set<T> set = new TreeSet<>();`
