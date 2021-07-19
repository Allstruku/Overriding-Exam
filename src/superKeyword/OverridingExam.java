package superKeyword;

// 부모가 가지고 있는 메소드과 똑같은 모양의 메소드를 자녀클래스 가지고 있는것
// overriding이란 메소드를 재정의하는 것이다

public class OverridingExam {
	public static void main(String[] args) {
		ChildClass c1 = new ChildClass();
		c1.m1();
		// ChildClass에서 메소드가 없는 상태에서는 ChildClass의 부모인 ParentClass에서 상속을 받은 m1 메소드를 실행한다
		// ChildClass에서도 똑같은 m1 메소드가 생기면서 ParentClass의 것이 아닌 ChildClass의 것이 출력이 된다. 이것을 오버라이딩이라고 한다
		// 하지만 오버라이딩을 한다고 해서 부모의 메소드가 완전히 사라지는것은 아니다
	}
}
