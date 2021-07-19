package superKeyword;

public class ChildClass extends ParentClass{
	// 처음에는 ChildClass는 메소드가 없다
	public void m1() {
		super.m1();
		// super.메소드명(); 코드를 입력하게 되면서 부모가 원래 상속한 m1 메소드를 가지게 된다
		System.out.println("ChildClass의 m1메소드가 실행이 되었습니다");
		// 하지만 ParentClass과 똑같은 m1 메소드를 가지게 되면서
	}
}
