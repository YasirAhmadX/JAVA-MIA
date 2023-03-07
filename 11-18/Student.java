//13.StudentClass.java
import java.util.Scanner;
public class Student{      
 
	 String name;
	 int rollno;
	 int age;
	 
	void info(){
	  System.out.println("Name: "+name);
	  System.out.println("Roll Number: "+rollno);
	  System.out.println("Age: "+age);
	}  
	
	
	public static void main(String[] args) {
		Student student = new Student();
        Scanner in = new Scanner(System.in);
		
		// Accessing and property value
		student.name = in.next();
        in.next();
		student.rollno = in.nextInt();
		student.age = in.nextInt();
		
		// Calling method
		student.info();
		
	}
}  
	
