package lambda;

public class Quiz2 {

	public static void main(String[] args) {
		// helloprint 함수를 사용해서 :안녕하세요" 를 출력하기
		// 1. 구형클래스 -> 인스턴스 생성
		// 2. 익명		개인적으로 익명 메소드가 편한듯
		// 람다
		Hello hello = new Hello() {
			
			@Override
			public void helloPrint() {
				System.out.println("안녕하세요!");
			}
		};
		
		hello.helloPrint();
		
		Hello hellolamda = ()->System.out.println("안녕하세요!!");
		hellolamda.helloPrint();
		
		
		HelloImpl helloInstance = new HelloImpl();
		helloInstance.helloPrint();
	}

}

@FunctionalInterface
interface Hello {
	void helloPrint();
}


class HelloImpl implements Hello {

	@Override
	public void helloPrint() {
		System.out.println("안녕하세요!!!");
	}
	
}