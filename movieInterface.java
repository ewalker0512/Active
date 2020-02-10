interface CineCast{
	
	boolean setUpShowRoom(); //return true if the job is done else false
	
	boolean cleanShowRoom(); //return true if the job is done else false
	
	int countNumberofPatrons(); // count movie viewers in showroom

	boolean openMainDoors(); //return true if the job is done else false
	
	boolean lockMainDoors(); //return true if the job is done else false
	
	int sellConcestions(String item); // how many dollars does item cost
	
	void OutOfTP();  // No TPaper.... what do you do?
	
	String OutOfPopcorn();/*{   // override if you are the boss!!
		System.out.println("I'm tellling my boss to restock");
	}*/														
	
	String MessInBathroom(); // String output responce of employee
	
	String MessInShowRoom(); // String output responce of employee
	
	String MessInLobby();    // String output responce of employee
	
	//line 18: Abstract methods can't have a body.
}

class Employee {
	boolean setUpShowRoom(){
		return true;
	}
	boolean cleanShowRoom(){
		return true;
	}
	int countNumberofPatrons(){
		return 42;
	}
	boolean lockMainDoors(){
		return true;
	}
	int sellConcestions(String item){
		return 5;
	}
	void OutOfTP(){
		System.out.println("Use your hand.");
	}
	String OutOfPopcorn(){
		return "Get out....";
	}
	String MessInBathroom(){
		
		return "Right away mein Führer";
	}
	String MessInShowRoom(){
		return "Absolutely Chancellor";
	}
	String MessInLobby(){
		return "My Overlord, somebody made a mess";
	}
	
}

class Supervisor extends Employee{
	String GiveOrders(){
		return "Im gonna go sit in the office on my phone, go clean something.";
	}
}	

class Overlord extends Supervisor{
	String ironHand(){
		return "If I had it my way you would sleep here..."
	}
	boolean isaWanker(){
		return true;
	}
}