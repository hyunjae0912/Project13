package innerclass;

import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.EventListener;


public class Quiz1 {

	public static void main(String[] args) {                                                                                                                                                                           
		Frame frame = new Frame();                                                                                                                                                                                     
		// 레이아웃 새팅                                                                                                                                                                                                     
		frame.setLayout(new FlowLayout());                                                                                                                                                                             
		                                                                                                                                                                                                               
		// 기본 크기 설정                                                                                                                                                                                                    
		frame.setBounds(500,300,500,300);                                                                                                                                                                              
		// 화면출 출력할 것인가?                                                                                                                                                                                                
		frame.setVisible(true);                                                                                                                                                                                        
		                                                                                                                                                                                                               
		// 키보드 이벤트  
		// 부모한테 물려받은 추상메소드 구현
		// 익명클래스 구현 -> 인스턴스 생성
		frame.addKeyListener(new KeyListener() {
			
			@Override
			public void keyTyped(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void keyReleased(KeyEvent e) {
				System.out.println("키를 눌렀음");
				
			}
			
			@Override
			public void keyPressed(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		                                                                                                                                                                                                               
	}
}