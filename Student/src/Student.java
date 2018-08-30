
public class Student {
	
		String name;
		int age = 15;
		
		int getAge() {
			return age;
		}
		
		String getName() {
			return name;
		}
		
		public int add(int a, int b) {
			return a+b;
		}
		
		
		public static void main(String args[]) {
			
			Student s1	=	new Student();
			s1.name		=	"Ravi";
			s1.age		=	22;
			Student s2	=	new Student();
			s2.name		= 	"Karthik";
			s2.age		=	25;
			System.out.println(s1.getName()+s1.getAge());
			System.out.println(s2.getName()+s2.getAge());
			
			int result = s1.add(30, 33);
			
			System.out.println(result);
		} 
		
		}

