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
		
		Duckets.pocketChange = new robertD.Moneys[2];//number of times "coin" pops up.
		
		
		// give each of the coins a value
		
		
			for(robertD.Moneys coin: Duckets.pocketChange){ //might need different for loop
				System.out.println(coin = robertD.Moneys.dime);
				System.out.println(coin = robertD.Moneys.penny);
	
				
					Duckets.pocketChange[0] = coin; //value attached to the last
				
			}
		System.out.println(Duckets.getValue(Duckets.pocketChange[0]) );
	}	//Show me the coins in your pocketChange.
		
}
		//Give me the sum of those coins.
class robert extends JFrame //implements ActionListener, ItemListener 
{
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

		pnl.add( txtArea ) ;
		pnl.add( txtArea1 ) ;
		setVisible( true );
	}
	/*public void actionPerformed( ActionEvent event ){
	if( event.getSource() == btn1) 
		JOptionPane.showMessageDialog(this ,"This is what you got in your pocket");*/
	public static void main( String[] args ){
	
			robert gui = new robert();
		
		}
}