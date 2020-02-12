class Xamples{
	
	public String ShowYours(String a) {
		return "Iam";
	}
	
	public String ShowMine(String b) {
		return "Sofaking";
	}
	
	public int ShowYours(int a) {
		return 1;
	}
	
	public int ShowMine(int b) {
		return 2;
	}
	
	public double ShowYours(double a) {
		return 1.1;
	}
	
	public double ShowMine(double b) {
		return 2.2;
	}

}
class useIt{
	public static void main(String[]args){
		Xamples iWill = new Xamples();
	
		String allah = iWill.ShowMine("");
	
		String bak = iWill.ShowYours("");
	
		int hakka = iWill.ShowMine(1);
	
		int shirpa = iWill.ShowYours(2);
	
		double jihad = iWill.ShowMine(1.1);
	
		double dirka = iWill.ShowYours(2.2);
	
		System.out.println("I AM SOFA KING WE TODD ED");
		System.out.println(bak);
		System.out.println(allah);
		System.out.println(hakka);
		System.out.println(shirpa);
		System.out.println(jihad);
		System.out.println(dirka);
	}
}
