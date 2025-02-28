package innerclass;

import java.awt.Button;
import java.awt.FlowLayout;
// 자바 프로그램으로 화면을 구현할 수 있는 기능 (요즘은 잘 안씀;; 다른 구현언어가 많이 있어서 굳이 사용하지는 않음)
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// 익명 클래스
public class Ex3 {

	public static void main(String[] args) {
		// 화면 생성
		Frame frame = new Frame();
		// 레이아웃 새팅
		frame.setLayout(new FlowLayout());
		
		// 기본 크기 설정
		frame.setBounds(500,300,500,300);
		// 화면출 출력할 것인가?
		frame.setVisible(true);
		// 버튼 생성
		Button button = new Button("Click");
		// 버튼 추가
		frame.add(button);
		
		// 버튼 이벤트 등록
		// 매개변수는 인터페이스로 바로 생성할 수 없다.
//		button.addActionListener(new EventHandler());
		
		// 익명 클래스를 사용하여 이벤트 등록
		
		// 익명 클래스를 만드는 방법 : 
		// new 인터페이스이름 (){}
		// 익명 클래스를 사용하는 이유 : 클래스를 일회성으로 사용하기 위해서
		button.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("버튼을 클릭했습니다.");
				
			}
		});
		
	}

}

// 이벤트 발동 클래스
// 자식클래스는 부모가 물려준 추상메소드를 모두 구현해야한다.
//class EventHandler implements ActionListener {
//	
//	// 액션 (이벤트처리)
//	@Override
//	public void actionPerformed(ActionEvent e) {
//		System.out.println("버튼을 클릭하셨습니다.");		
//	}
//}







