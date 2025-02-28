package innerclass;

import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.TextArea;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

public class Quiz2 {

	public static void main(String[] args) {
		Frame frame = new Frame();                                                                                                                                                                                     
		// 레이아웃 새팅                                                                                                                                                                                                     
		frame.setLayout(new FlowLayout());                                                                                                                                                                             
		                                                                                                                                                                                                               
		// 기본 크기 설정                                                                                                                                                                                                    
		frame.setBounds(500,300,500,300);         
		
		TextArea area = new TextArea("텍스트상자.", 10, 50);
		// 화면출 출력할 것인가?                               
		frame.add(area);
		frame.setVisible(true);       
		
		// 포스 이벤트 등록
		// 텍스트 상자 창을 열면 열렸다고 출력
		// 닫으면 닫혔다고 출력
		
		// 익명클래스를 이용해서 구현체 만들기
		// 익명클래스를 만드는 방법 :  new 인터페이스이름 (){}
		// 부모한테 물려받은 추상메소드 재정의
		area.addFocusListener(new FocusListener() {
			
			// @는 어노테이션
			
			@Override
			public void focusLost(FocusEvent e) {
				System.out.println("포커스 아웃");
			}
			
			@Override
			public void focusGained(FocusEvent e) {
				System.out.println("포커스 인");
			}
		});

	}		

}
