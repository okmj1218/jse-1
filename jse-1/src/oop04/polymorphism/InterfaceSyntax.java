package oop04.polymorphism;
/*
 Date:2015.05.22
 Author:
 Desc: 인터페이스
 */
/*
 Interface
 - 추상메소드만으로 이루어짐...{} 가 없음
 - 클래스 바디가 없고 메소드의 프로토타입만 선언되어 있으면,
 	추상메소드가 됨
 - 추상메소드를 사용하는 이유는 앞으로 추가되거나 구현되어야 하는
 	기능을 설계 역할을 하며 실제 기능은 구현하지 않고
 	메소드의 프로토타입만 구현하는 것을 말함.
 - 추상메소드는 건축물에서 구조를 이루는 철근과 같고 설계도와 같은 역할을 함
 - 어떤 컴포넌트나 클래스의 이용 메소드를 공개할 목적으로 사용됨
 - 하나의 콤포너틑가 다양한 형태로 구현되어야 할 경우 인터페이스를 이동하면
 	콤포넌트와 사용법이 상당히 단순해짐
 - 자식 클래스는 인터페이스상에 있는 추상메소드를 전부 구현해야함
 -인터페이스상에 있는 메소드를 하나라도 구현하지 않으면 인터페이스를
 	상속받는 클래스는 추상클래스가 됨
 - 인터페이스는 객체를 만들수 없음, 따라서 반드시 그 인터페이스를 구현한 
 	클래스의 객체를 받아 사용해야함.
 - 인터페이스에 선언된 메소드를 호출하면 그인터페이스를 구현한 메소드가
 	자동으로 호출됨
 - 인터페이스를 이용하면 인터페이스를 구현하는 클래스들은 메소드의 형태가
 	같기 때문에 같은 메소드명을 이동하면서, 다양한 구현을 할 수 있음
 	이것은 마치 MySQL 등으로 개발된 프로그램을 Oracle 용으로 변경시에
 	JDBC 드라이버만 변경하면 프로그램이 작동하는 것과 같은 이치
 - 인터페이스는 기능을 구현해서 가지고 있는 것이 아니라
 	구현되어야 하는 구조를 가지고 있음.
 	이런 이유떄문에 컴포넌트의 통일성이 향상됨.
 */
/*
 인터페이스 참조
 - 인터페이스를 이용허용 메소드만 호출하는 경우는 인터페이스 타입을 그래도 사용함.
 - 각 클래스의 멤버변수에 접근하는 경우는 그 클래스 타입으로 형변환을 해주어야 함/
 - 인터페이스에 변수를 선언한다면 주로 상수를 선언함
 - 메소드만 선언되는 경우가 대부분
 - 인터페이스 타입 객체 = new 인터페이스 구현클래스
 		구현클래스 i = (구현클래스타입) 인터페이스객체
 */
public class InterfaceSyntax {

}
