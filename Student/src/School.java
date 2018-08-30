
public class School {
	private String name;
	private int age = 15;
	
	
	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		if(age>=15) {
		this.age = age;
		}else {
			System.out.println("error");
		}
	}
	
	public int getAge() {
		return age;
	}
	
	public String getName() {
		return name;
	}
	
	
	public static void main(String args[]) {
		
		Student s1	=	new Student();
		s1.name		=	"Kishore";
		s1.age		=	-90;
		System.out.println(s1.name+s1.age);
	}
}
