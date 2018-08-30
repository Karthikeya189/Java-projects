
public class Employe {
int id ;
String name;

	Employe (int id, String name){
		this.id = id;
		this.name= name;
	}
		
public static void main(String[] args) {
		Employe E1 = new Employe(9999, "Karthik");
		
		Employe E2 = new Employe ( 6666, "Ravi");
		
		System.out.println(E1.id+" "+E1.name);
		System.out.println(E2.id+" "+E2.name);
}


}
