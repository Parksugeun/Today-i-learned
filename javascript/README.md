자바스크립트

변수선언 : var, let, const (var은 쓰지 말자!)
let box;
데이터를 담아주는 것 -> 데이터 할당
자바스크립트에서 = 은 할당의 의미 (같다 X)
box(변수명) = 123(할당연산자);
let box =123;
재할당: 이미 데이터가 할당되어 있는 변수에 다시 할당하는 것
let->재할당 가능함, 재선언은 불가능함
재선언: 이미 선언되어 있는 변수명으로 다시 선언하는 것
const: 상수 변수를 의미한다.(변하지 않는 값) 재할당이 불가능함, 선언과 할당이 동시에 이루어져야 함. 재선언 불가능함
const word = 'abc';
let->재할당O 재선언X
const->재할당X 재선언X
var->재할당O 재선언O (중복된 변수명으로 혼란이 생김으로 사용하지 말 것)

변수명 주의사항

1. 변수명은 동사가 아닌 명사로 지정할 것
2. 첫 글자는 숫자가 아닌 영어로
3. 예약어를 사용하지 말 것
   \*\*\*cameCase: 띄어쓰기 대신 대문자로 구분
   snake*case: 띄어쓰기 대신 언더바*로 구분
   PascalCase: 첫글자도 대문자, 띄어쓰기 대신 대문자로 구분

데이터타입
String 문자열 -> 텍스트 데이터 "", '' 로 정의. 숫자나 특수문자, 공백 등 모든것이 문자화
Number 숫자 -> 모든 연산이 가능. 산술연산자: +, -, \*, / -> +를 제외한 산술연살자들은 문자열 연산을 시도할 시 NaN을 반환. +는 문자열 연결 연산자로 문자열로 합쳐진다.
자바스크립트에서 사칙연산에 활용되는 연산자들은 연산을 적용시키자 하는 데이터를 감지했을 때 숫자로 변환이 가능한지를 먼저 판단하고 변환이 가능하다면 변환, 불가능 하다면 NaN을 반환함
Boolean
undefined
null
symbol
Bigint
Array 배열[] -> 순서가 있는 데이터 컬렉션을 저장할 때 사용, 데이터 컬렉션이 논리적으로 정의된 규칙에 의해 나열된 것
배열에 들어있는 각각의 데이터는 Element(요소)라고 부른다.
배열의 각 요소는 index(위치값)라는 값을 가진다. 항상 0부터 시작 0,1,2,3,4 ... 순서대로 각자의 인덱스 값을 가진다.
Property: 데이터 타입마다 가지고 있는 고유한 속성들
Array.length: 특정 배열의 길이
index: 0,1,2,3,4
length:1,2,3,4,5 로 시작하는 숫자가 서로 다르다
Method: 어떠한 기능을 가지고 있는 명령어
Array의 Method: push() pop() indexOf() includes()
Array.push(): 배열의 가장 뒤에 데이터를 추가해주는 Method
Array.pop(): 배열 가장 끝에 있는 데이터를 제거하는 Method
Array.includes(): 특정 배열에 주어진 데이터가 존재하는지 여부 확인 T/F 반환
Array.indexOf(): 특정 배열에서 주어진 데이터의 Index 값을 찾아 반환
Object: 객체 여러개의 Property를 가진 값
let userData = {
name:'Jason',
age:27,
gender:'Male'
};
객체 접근 방법2가지
Dot notaion: userDate.name ->"Jason"
userData.email="jason@naver.com"
let userData = {
name:'Jason',
age:27,
gender:'Male',
email:"jason@naver.com"
};
Bracket notaion: 대괄호 사용, 문자열이 아닌경우 변수로 인식하기 때문에 문자열을 사용해야함
userData["name"] ->"Jason" 데이터 검색
userData["email"]="jason@naver.com" 데이터 추가
let userData = {
name:'Jason',
age:27,
gender:'Male',
email:"jason@naver.com"
};
객체(Object).Method 종류: Object.keys(), Object.values()
Object.keys(): 주어진 객체의 key만을 가져와 배열에 담아주는 메서드
let userData = {
name:'Jason',
age:27,
gender:'Male'
};
Object.keys(userData)-> ["name","age","gender"] 배열은 문자열로 가져와짐

    Object.values(): 주어진 객체의 value만을 가져와 배열에 담아주는 메서드
        let userData = {
        name:'Jason',
        age:27,
        gender:'Male'
    };
    Object.values(userData) -> ["Jason",25,"Male"]

배열정의

1. 순서가 존재하는 데이터의 창고
2. 대괄호로 생성
3. 각각의 요소는 쉼표로 구분
4. 0부터 시작하는 위치 데이터 Index-> 이를 활용해서 요소에 접근
   배열속성
   length 배열에 존재하는 요소의 개수를 기반으로 해당 배열의 길이를 담은 속성
   배열 메서드
   1.push() -> 데이터추가
   2.pop() -> 데이터삭제
   3.indexOf() -> Index조회
   4.includes() -> 포함 여부 확인

객체정의

1. 중괄호를 사용해서 정의
2. 내부의 요소는 Property(키+값)
3. Dot notaion, Bracket notaion
4. 위 두가지로 새로운 Property도 생성
   객체메서드
5. Object.keys() -> key 모음을 배열로(문자열로)
6. Object.values() -> value 모음을 배열로(데이터 그대로)

함수의 선언 방식
함수 표현식
const sum = function(){
let result = 10+10; //선언 기워드가 동반됨
}
함수 선언문
function sum() {
let result = 10+10; // 호이스팅에 영향을 받음 위로 끌어올려짐
}
화살표 함수
const sum = () => {
let result = 10+10; //메서드안에서 함수를 써야 하는 경우에 사용됨
}

비교 연산자 : 두개의 데이터를 서로 비교하는 방법
= : 할당
=== : 서로 같다 (엄격한 비교, ==는 느슨한 비교임으로 ===를 사용해야함, 주소값까지 비교)
원시타입(Primitive type): String, Number, Booleanm Bigint, undefined, Symbol, Null
불변성=> 데이터 변화하지 않는다.
데이터를 가져올 때는 주소값을 기준으로 가져온다. 재할당 할 시 주소 값만 변경되고 기존의 데이터는 변화하지 않는다.(불변성 유지)
참조타입(Reference type): 이외의 모든 것
똑같이 주소값을 가지고 있지만 주소값에 객체가 아닌 실제로 객체가 들어있는 주소값의 메모리를 가지고 있다.(두번에 걸쳐서 객체를 가져옴)

조건문 : 코드의 실행 분기점

논리연산자
&& AND연산자 => 양쪽에 위치한 조건을 모두 만족하는 경우 true
|| OR연산자 => 양쪽에 위치한 조건 중, 하나라도 만족하는 경우 true

반복문: 반복적인 코드를 압축시켜줌
for문: 최초식, 조건식, 증감문

textContent: 텍스트를 추가해준다
defer: 스크립트를 해석하는 와중에도 태그도 동시에 생성됌 JS파일 오류 잡아줌(스크립트 태그 위치 상단)
innerHTML : 해당하는 태그 안에 html을 직접 입력해 주는 것
querySelector, getElmentById: 해당하는 id나 class를 가져옴
[]: 브라켓로테이션을 사용할 때 '' 를 사용해서 해당하는 것을 직접 가져올 수 있다. 사용하지 않을 경우 변수로 작용한다.

while문 주의사항: 종료 조건을 제대로 설정하지 않으면 무한반복(과부하가 생긴다.)
for in: 객체에 주로 사용
for of: 배열에 주로 사용

전달인자, 배개변수: 함수의 외부에서 데이터를 전달 받아 내부에서 활용하기 위한 수단

Web Storage: 브라우저 내에 존재하는 데이터 저장소
Session Storage: key-value 형태 저장(객체형태) 로컬환경에 데이터 저장
세션 단위로 구분되며 활용 (세션: 사용자의 웹 페이지 접속 상태에 따른 단위), 브라우저나 탭을 종료하면 영구 삭제
Local Storage: ket-value 형태 저장, 로컬 환경에 데이터 저장
도메인 단위로 구분되며 활용
브라우저 자체를 종료해도 존재
falsy한 데이터: undefined, null, 0, ''(공백), NaN
이외의 데이터는 truthy한 데이터
localStorage.setItem: 로컬 스토리지에 데이터를 저장
localStorage.getItem: 로컬 스토리지에 저장된 데이터 불러오기
localStorage.removeItem: 로컬 스토리지에 저장된 데이터 제거

<ul>: Unordered List 순서가 없는 리스트
<ol>: Ordered List 순서가 있는 리스트

Dom(Document Object Model): 브라우저가 HTML 문서를 파싱하는 과정에서 생겨나는 객체

document.createElement: 태그 생성
appendChild():태그 추가
document.querySelectorAll: 해당하는 태그를 모두 가져옴
.contains : 불리는 값으로 리턴해줌 포함하면 true 포함하지 않으면 false

스코프(scope): 변수참조의 유효범위
전역 스코프(global scope): 전역스코프에서 선언된 함수는 지역스코프에서 참조가 가능하다
지역 스코프(local scope): 함수 내부, 지역스코프에서 선언된 함수는 밖에서 참조 불가능
함수레벨 스코프: 선언된 함수 내부에 스코프를 의미, var키워드 외부에서 참조가 불가능
블록레벨 스코프: 중괄호를 사용하는 코드들 - if문 for반복문은 var키워드는 외부에서 정상적으로 참조가 된다.

JSON: 문자형 데이터 포맷, 배열이나 객체를 문자로 변환할 때 사용, 다시 원본형태로 변환도 가능하다.
typeof: 확인하고싶은 데이터 앞에 사용

호이스팅(hoisting): 함수 안에 있는 선언들을 모두 끌어올려서 해당 함수 유효 범위의 최상단에 선언하는 것
함수 표현식에서는 정의되기 이전에 호출되면 에러가 발생한다.
함수 선언식에서는 호이스팅이 되어 위로 끌어올려진다.

TDZ(Temporal Dead Zone) : 스코프의 시작 지점부터 초기화 시작 지점까지의 구간으로 TDZ은 let, const, class 구문의 유효성을 관리한다.
선언 단계: 선언한 변수는 식별자가 담기는 객체를 할당하는 단계
초기화 단계: 변수에 할당할 메모리 공간을 부여하는 단계
할당 단계: 정의된 변수에 데이터가 할당되는 단계

조건 (삼항) 연산자는 JavaScript에서 세 개의 피연산자를 받는 유일한 연산자, 앞에서부터 조건문, 물음표(?), 조건문이 참(truthy)일 경우 실행할 표현식, 콜론(:), 조건문이 거짓(falsy)일 경우 실행할 표현식이 배치. 해당 연산자는 if...else문의 대체재로 사용
