package SalaryCalculate;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class ViewMain extends JFrame {
	public ViewMain(){
		setTitle("월급 계산기 ver0.0");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		setSize(640,480);
		
		JLabel jpUp = new JLabel("보현이의 월급 계산기!! (한달을 4주 28일로 계산)");
		JPanel jpDown = new JPanel();
		
		Panel jpDownLeft = new Panel();
		JLabel jpDownLeft00 = new JLabel("    시급     ");
		TextField jpDownLeft01 = new TextField("숫자만 입력");
		JLabel jpDownLeft10 = new JLabel(" 하루 일하는 시간");
		TextField jpDownLeft11 = new TextField("숫자만 입력(0~24)");
		JLabel jpDownLeft20 = new JLabel("한주에 일하는 일 수");
		TextField jpDownLeft21 = new TextField("숫자만 입력(0~7)");
		
		JPanel jpDownRight = new JPanel();
		JPanel jpDownRightUp = new JPanel();
		JLabel jpDownRightDown = new JLabel("당신의 월급은?? 두구두구");
		JButton jbutton = new JButton("월급 계산하기");
		
		jbutton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				int num1 = Integer.parseInt(jpDownLeft01.getText());
				int num2 = Integer.parseInt(jpDownLeft11.getText());
				int num3 = Integer.parseInt(jpDownLeft21.getText());
				
				jpDownRightDown.setText(Integer.toString(calculate(num1, num2, num3)));
			}
		});
		

		jpUp.setAlignmentX(Label.CENTER);
		
		jpUp.setBackground(Color.ORANGE);
		//jpDownLeft01.setBackground(Color.green);
		jpDownLeft00.setBackground(Color.green);
		jpDownRightDown.setBackground(Color.RED);
		
		
		this.setLayout(new BoxLayout(this.getContentPane(), BoxLayout.Y_AXIS));
		this.add(jpUp);
		this.add(jpDown);

		
		jpDown.setLayout(new BoxLayout(jpDown, BoxLayout.X_AXIS));
		jpDown.add(jpDownLeft);
		jpDown.add(jpDownRight);
		
		jpDownLeft.setLayout(new GridLayout(3,2));
		jpDownLeft.add(jpDownLeft00);
		jpDownLeft.add(jpDownLeft01);
		jpDownLeft.add(jpDownLeft10);
		jpDownLeft.add(jpDownLeft11);
		jpDownLeft.add(jpDownLeft20);
		jpDownLeft.add(jpDownLeft21);
		
		jpDownRight.setLayout(new BoxLayout(jpDownRight, BoxLayout.Y_AXIS));
		jpDownRight.add(jpDownRightUp);
		jpDownRight.add(jpDownRightDown);
		
		jpDownRightUp.add(jbutton);
	}
	
	public int calculate(int salary, int dayWork, int weekWork){
		int result;
		
		result = salary * dayWork * weekWork * 4;
		
		return result;
	}
}
