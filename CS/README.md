CS

---

- [oop](#oop)
- [RESTful API](#restful-api)

## oop

- OOP는 현실 세계를 프로그래밍으로 옮겨와 현실 세계의 사물들을 객체로 보고, 그 객체로부터 개발하고자 하는 특징과 기능을 뽑아와 프로그래밍하는 기법(OOP로 코드를 작성할 시 재사용성과 변형가능성을 높일 수 있음)

- OOP 5가지 설계 원칙

1. SRP(단일 책임 원칙 Single Responsibility Principle) : 클래스는 단 하나의 목적을 가져야 하며, 클래스를 변경하는 이유는 단 하나의 이유여야 한다.
2. OCP(개방 폐쇠 원칙 Open-Closed Principle) : 클래스는 확장에는 열려 있고 변경에는 닫혀 있어야 한다.
3. LSP(리스코프 치환 원칙 Liskov Substitutuon Principle) : 상위 타입의 객체를 하위 타입으로 바꾸어도 프로그램은 일관되게 동작해야 한다.
4. ISP(인터페이스 분리 원칙 Interface Segregation Principle) : 클라이언트는 이용하지 않는 메소드에 의존하지 않도록 인터페이스를 분리해야 한다.
5. DIP(의존 역전 법칙 Dependency Inversion Principle) : 클라이언트는 인터페이스에 의존해야 하며 구현된 클래스에 의존해선 안된다.

## RESTful API

HTTP 통신에서 어떤 차원에 대한 CRUD 요청을 Resource와 Method로 표현하여 특정한 형태로 전달하는 방식

1. Resource(자원, URI) URI는 특정 리소스를 식별하는 통합 자원 식별자(Uniform Resource Identifier)를 의미한다. 웹 기술에서 사용하는 논리적 또는 물리적 리소스를 식별하는 고유한 문자열 시퀀스다.
2. Method(요청방식, GET 또는 POST등)
3. Representation of Resource(자원의 형태, JSON or XML 등)
