import javax.swing.* ;
import java.awt.event.* ;	


class robertD{
	
	Moneys[] pocketChange;
	
	enum Moneys{
		penny, nickel, dime, quarter, halfdollar, dollar
	}

	public int getValue(Moneys coin){

		int value = 0;
		switch (coin){
			case penny:
				value = 1;
				break;
			case nickel:
				value = 5;
				break;
			case dime:
				value = 10;
				break;
			case quarter:
				value = 25;
				break;
			case halfdollar:
				value = 50;
				break;
			case dollar:
				value = 100;
				break;
		}

		return value;
	}
}

class dinero{
	public static void main(String... v){
		robertD Duckets = new robertD();
		robertD Buckets = new robertD();
		
		Duckets.pocketChange = new robertD.Moneys[1];//number of iterations
			for(robertD.Moneys coin: Duckets.pocketChange){ 
				System.out.println(coin = robertD.Moneys.dime);
					Duckets.pocketChange[0] = coin; //value attached to the last iteration in the for loop
					System.out.println(Duckets.getValue(Duckets.pocketChange[0]));
			}
		Buckets.pocketChange = new robertD.Moneys[1];
			for(robertD.Moneys coin: Buckets.pocketChange){
				System.out.println(coin = robertD.Moneys.quarter);
					Buckets.pocketChange[0] = coin;
					System.out.println(Buckets.getValue(Buckets.pocketChange[0]));
			}
	System.out.print("You have a total of: ");
	System.out.println( Duckets.getValue(Duckets.pocketChange[0]) +
						Buckets.getValue(Buckets.pocketChange[0]));
	}
	
}
		
class robert extends JFrame implements ActionListener {
	JPanel pnl = new JPanel() ;
	JTextArea txtArea = new JTextArea (8,38);
	JTextArea txtArea1 = new JTextArea (4,20);
	JButton btn1 = new JButton ("Whats in your Wallet?");

	public robert (){
		super("Pocket Change");
		setSize(1000,300);
		setDefaultCloseOperation( EXIT_ON_CLOSE );
		add(pnl);
	
		pnl.add( btn1 ) ;
		btn1.addActionListener(this);
		pnl.add( txtArea ) ;
		pnl.add( txtArea1 ) ;
		setVisible( true );
	}
	public void actionPerformed( ActionEvent event ){
	if( event.getSource() == btn1) 
		JOptionPane.showMessageDialog(this ,"You got a hole in your pocket and lost all your money");
		
	}
		public static void main( String[] args ){
	
			robert gui = new robert();
		
		}
	
} 