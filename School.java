import java.util.Iterator;
import java.util.Scanner;

class Student
{
	String id;
    String name;

    public Student(String id, StringBuffer name)
    {
    	this.id = id;
        this.name = new String(name);
    }
    void display()
    {
    	
    	System.out.println(id+"\t\t "+name);
    }
}    
class School
{
    public static void main(String[] args) 
    {     
        Scanner input = new Scanner(System.in);
        StringBuffer name = new StringBuffer();
        Student[] students = new Student[10];
        int numberOfStudents;
        numberOfStudents = Validation.read_number(input,  "Enter the number of students : ");
        String id;
        for(int i=0; i< numberOfStudents; i++)
        {
        	id = Validation.read_id(input,  "Enter the student ID : ");;
        	name.append(Validation.read_name(input, "Enter the first name : "));
        	name.append(" "+Validation.read_name(input, "Enter the last name : "));
        	students[i] = new Student(id, name);      
        }
        System.out.println("----- Details of Students -----");
        System.out.println("Student ID \t Name");

        for(int i=0;i<numberOfStudents; i++)
        {
        	students[i].display();
        }
    }
}