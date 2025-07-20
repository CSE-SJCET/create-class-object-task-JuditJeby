package module1;
 class Student{
	String name;
	int rollNumber;
	char grade;
	
	void displayDetails() {
		System.out.println("Name of the student:"+name);
		System.out.println("Roll number of the student: "+rollNumber);
		System.out.println("Grade of the student:"+grade);
	}
}
public class Main {
      public static void main(String[] args) {
        
    
		Student student=new Student();
		student.name="Judit";
		student.rollNumber=45;
		student.grade='A';
		
		student.displayDetails();
	
	}

}

