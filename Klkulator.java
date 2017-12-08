import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.util.Scanner;


public class Kalkulator extends JFrame implements ActionListener
	{
	
	JLabel twzrost, twaga, wynik, abmi, bbmi, cbmi, dbmi, ebmi, fbmi, gbmi, hbmi, ibmi;
	JTextField owzrost, owaga;
	JButton oblicz;
	double bmi, wzrost, waga;
	
	public Kalkulator()
		{
		
		
		
		setSize(400,400);
		setTitle("Body Mass Index (BMI) 1.0.1");
		setLayout(null);
		
		twzrost = new JLabel("Wzrost w cm");
		twzrost.setBounds(20,20,150,20);
		add(twzrost);
		
		twaga = new JLabel("Waga w kg");
		twaga.setBounds(20,50,250,20);
		add(twaga);
		
		owzrost = new JTextField("");
		owzrost.setBounds(150,20,50,20);
		add(owzrost);
		
		owaga = new JTextField("");
		owaga.setBounds(150,50,50,20);
		add(owaga);
		
		oblicz = new JButton("Oblicz");
		oblicz.setBounds(150,100,100,20);
		add(oblicz);
		oblicz.addActionListener(this);
		
		wynik = new JLabel("");
		wynik.setBounds(120,130,160,20);
		add(wynik);
		
		
		
		abmi = new JLabel("Zakresy wartości BMI:");
		abmi.setBounds(120,160,160,20);
		add(abmi);
		
		bbmi = new JLabel("mniej niż 16 - wygłodzenie");
		bbmi.setBounds(120,180,160,20);
		add(bbmi);
		
		cbmi = new JLabel("16 - 16.99 - wychudzenie");
		cbmi.setBounds(120,200,160,20);
		add(cbmi);
		
		dbmi = new JLabel("17 - 18.49 - niedowaga");
		dbmi.setBounds(120,220,160,20);
		add(dbmi);
		
		ebmi = new JLabel("18.5 - 24.99 - wartość prawidłowa");
		ebmi.setBounds(120,240,220,20);
		add(ebmi);
		
		fbmi = new JLabel("25 - 29.99 - nadwaga");
		fbmi.setBounds(120,260,160,20);
		add(fbmi);
		
		gbmi = new JLabel("30 - 34.99 - I stopień otyłości");
		gbmi.setBounds(120,280,160,20);
		add(gbmi);
		
		hbmi = new JLabel("35 - 39.99 - II stopień otyłości");
		hbmi.setBounds(120,300,180,20);
		add(hbmi);
		
		ibmi = new JLabel("powyżej 40 - otyłość skrajna");
		ibmi.setBounds(120,320,160,20);
		add(ibmi);
		
		
		
		
		}
	
	
		
	
	public void actionPerformed(ActionEvent e) 
		{
	waga = Double.parseDouble(owaga.getText());
	wzrost = Double.parseDouble(owzrost.getText());
	wzrost = wzrost/100;
	
	bmi = waga / (wzrost*2);
	bmi *= 100;
	bmi = Math.round(bmi);
	bmi /= 100;
	
	wynik.setForeground(Color.blue);
	wynik.setText(String.valueOf("Twój wynik to:  " + bmi));
	
		
	if (bmi<16)
			{
		bbmi.setForeground(Color.yellow);
			}
	else if ((bmi>16)&(bmi<16.99))
			{
		cbmi.setForeground(Color.yellow);
			}
	
	else if ((bmi>17)&(bmi<18.49))
			{
			dbmi.setForeground(Color.yellow);
			}
	
	else if ((bmi>18.50)&(bmi<24.99))
	{
ebmi.setForeground(Color.green);
	}
	else if ((bmi>25)&(bmi<29.99))
	{
fbmi.setForeground(Color.red);
	}
	else if ((bmi>30)&(bmi<34.99))
	{
gbmi.setForeground(Color.red);
	}
	else if ((bmi>35)&(bmi<39.99))
	{
hbmi.setForeground(Color.red);
	}
	else if (bmi>40)
	{
ibmi.setForeground(Color.red);
	}
	
		}




		public static void main(String[] args)
			{
			Kalkulator aplikacja = new Kalkulator();
			aplikacja.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			aplikacja.setVisible(true);
			
			
			
			}
		
		
		
	
	
	
	}




