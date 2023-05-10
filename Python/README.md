## 변수와 자료형

### 변수

변수는 값을 저장하는 공간입니다. 파이썬에서는 변수를 선언할 때, 타입을 지정할 필요가 없습니다. 다음과 같이 변수를 선언할 수 있습니다.

`a = 10
b = 'hello'`

위 코드에서 `a`와 `b`는 변수이고, 각각 정수와 문자열을 저장합니다.

### 자료형

파이썬에서는 여러 가지 자료형을 지원합니다. 가장 기본적인 자료형으로는 숫자형, 문자열, 불리언 값 등이 있습니다. 자세한 내용은 아래와 같습니다.

- 숫자형: 정수형(`int`), 실수형(`float`), 복소수형(`complex`) 등이 있습니다.
- 문자열: 문자열(`str`)을 지원하며, 작은따옴표(`'`)나 큰따옴표(`"`)로 감싸서 표현합니다.
- 불리언: 참(`True`)과 거짓(`False`)의 두 가지 값을 갖는 자료형입니다.

## 연산자

파이썬에서는 수학 연산자뿐만 아니라, 비교 연산자, 논리 연산자 등 다양한 연산자를 지원합니다. 아래는 대표적인 연산자들입니다.

- 수학 연산자: `+`, `-`, `*`, `/`, `//`(몫), `%`(나머지), `**`(거듭제곱)
- 비교 연산자: `>`, `<`, `>=`, `<=`, `==`, `!=`
- 논리 연산자: `and`, `or`, `not`

## 조건문과 반복문

### 조건문

조건문은 특정 조건이 참인 경우에만 코드를 실행하는 제어문입니다. 파이썬에서는 `if` 문을 이용하여 조건문을 표현합니다. 아래는 간단한 `if` 문의 예시입니다.

`x = 10 
if x > 5: print('x is greater than 5') `

위 코드에서는 `x`가 5보다 큰 경우에만 "x is greater than 5"를 출력합니다.

### 반복문

반복문은 코드 블록을 여러 번 반복하는 제어문입니다. 파이썬에서는 `for` 문과 `while` 문을 이용하여 반복문을 표현합니다. 아래는 간단한 `for` 문의 예시입니다.

`fruits = ['apple', 'banana', 'cherry'] 
 for fruit in fruits:     
    print`

## 리스트 관련 기타 메서드

1. `append()`: 리스트의 끝에 새로운 값을 추가합니다.

`my_list = [1, 2, 3]
my_list.append(4)
print(my_list)  # [1, 2, 3, 4]` 



2. `extend()`: 리스트의 끝에 다른 리스트의 값을 추가합니다.

`my_list = [1, 2, 3]
my_list.extend([4, 5])
print(my_list)  # [1, 2, 3, 4, 5]`



3. `insert()`: 리스트의 지정된 위치(index)에 새로운 값을 삽입합니다.

`my_list = [1, 2, 3]
my_list.insert(1, 4)
print(my_list)  # [1, 4, 2, 3]`



4. `remove()`: 리스트에서 지정된 값을 찾아서 삭제합니다.

`my_list = [1, 2, 3, 4]
my_list.remove(3)
print(my_list)  # [1, 2, 4]`



5. `pop()`: 리스트의 마지막 값을 반환하고 삭제합니다. 지정된 인덱스의 값을 삭제할 수도 있습니다.

`my_list = [1, 2, 3]
last_value = my_list.pop()
print(last_value)  # 3
print(my_list)  # [1, 2]
my_list.pop(0)
print(my_list)  # [2]`



6. `index()`: 리스트에서 지정된 값의 인덱스를 반환합니다.

`my_list = [1, 2, 3]
index = my_list.index(2)
print(index)  # 1`



7. `count()`: 리스트에서 지정된 값이 나타나는 횟수를 반환합니다.

`my_list = [1, 2, 3, 2]
count = my_list.count(2)
print(count)  # 2`



8. `sort()`: 리스트를 오름차순으로 정렬합니다. `reverse=True` 인수를 전달하면 내림차순으로 정렬합니다.

`my_list = [3, 1, 2]
my_list.sort()
print(my_list)  # [1, 2, 3]
my_list.sort(reverse=True)
print(my_list)  # [3, 2, 1]`



9. `sorted()`: 리스트의 복사본을 정렬한 결과를 반환합니다. `reverse=True` 인수를 전달하면 내림차순으로 정렬합니다.

`my_list = [3, 1, 2]
sorted_list = sorted(my_list)
print(sorted_list)  # [1, 2, 3]
sorted_list = sorted(my_list, reverse=True)
print(sorted_list)  # [3, 2, 1]`



11. `reverse()`: 리스트의 요소를 역순으로 정렬합니다. 리스트 자체를 변경하며, 새로운 리스트를 반환하지 않습니다.

`my_list = [1, 2, 3]
my_list.reverse()
print(my_list)  # [3, 2, 1]`



11. `copy()`: 리스트의 복사본을 생성합니다.

`my_list = [1, 2, 3]
new_list = my_list.copy()
print(new_list)  # [1, 2, 3]`



12. `clear()`: 리스트의 모든 값을 삭제합니다.

`my_list = [1, 2, 3]
my_list.clear()
print(my_list)  # []`



13. `len()`: 리스트의 길이를 반환합니다.

`my_list = [1, 2, 3]
length = len(my_list)
print(length)  # 3`



14. `join()`: 문자열 리스트를 연결하여 하나의 문자열로 만듭니다.

`my_list = ['apple', 'banana', 'orange']
result = ', '.join(my_list)
print(result)  # 'apple, banana, orange'`



15. `map()`: 리스트의 모든 요소에 함수를 적용하여 새로운 리스트를 만듭니다.

`my_list = [1, 2, 3]
new_list = list(map(lambda x: x * 2, my_list))
print(new_list)  # [2, 4, 6]`



16. `filter()`: 리스트의 모든 요소 중 함수 조건을 만족하는 요소로만 이루어진 새로운 리스트를 만듭니다.

`my_list = [1, 2, 3, 4, 5, 6]
new_list = list(filter(lambda x: x % 2 == 0, my_list))
print(new_list)  # [2, 4, 6]`



17. `any()`: 리스트의 요소 중 하나라도 참(True)이면 True를 반환합니다.

`my_list = [0, '', False, [], (), {}, None]
result = any(my_list)
print(result)  # False`



18. `all()`: 리스트의 모든 요소가 참(True)이면 True를 반환합니다.

`my_list = [1, 2, 3, 4, 5]
result = all([x > 0 for x in my_list])
print(result)  # True`



19. `enumerate()`: 리스트의 요소와 해당 요소의 인덱스를 반환하는 이터레이터를 생성합니다.

`my_list = ['apple', 'banana', 'orange'] 
for i, value in enumerate(my_list):
 print(i, value)
0 apple
1 banana
2 orange`



20. `zip()`: 여러 개의 리스트를 하나의 이터레이터로 묶어줍니다.

`names = ['Alice', 'Bob', 'Charlie']
ages = [25, 30, 35]
for name, age in zip(names, ages):
    print(name, age)
Alice 25
Bob 30
Charlie 35`
