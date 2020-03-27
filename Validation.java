import java.util.Scanner;

public class Validation
{
	public static int read_number(Scanner input, String input_message)
	{
		int number = -1;    
		while(number <= 0)
		{
			System.out.print(input_message);
			String num = input.nextLine();
			try 
			{
				number = Integer.valueOf(num);
				if(number<=0)
				{
					System.out.println("number of students must be a number greater than zero");
					number = -1;
				}
			} 
			catch (NumberFormatException e) 
			{
				System.out.println("number of students must be a number greater than zero. Re-enter again.");
				number = -1;
			}
		}
		return number;
	}
	
	public static String read_id(Scanner input, String input_message)
	{
		String id = "";    
		while(id.isEmpty())
		{
			System.out.print(input_message);
			String num = input.nextLine();
			try 
			{
				int number = Integer.valueOf(num);
				
				if(id.matches("[A-Za-z$&+,:;=?@#|'<>.-^*()%!]")) 
	            {
	            	System.out.println("Student ID contains only number. Re-enter again.");
	                id = "";
				}
				else 
				{
					id = num;
				}
			} catch (NumberFormatException e) 
			{
				System.out.println("Student ID contains only number. Re-enter again.");
                id = "";
			}
			
		}
		return id;
	}
	
    public static String read_name(Scanner in, String input_message)
	{
		String name = "";
        while(name.isEmpty())
        {
        	try 
	        {
	            System.out.print(input_message);
	            name = in.nextLine();
	            if(name.matches(".*\\d.*"))
	            {
	            	System.out.println(input_message.substring(10,input_message.lastIndexOf('e')+1)+" contains only alphabets. Re-enter again.");
	                name = "";
	            }
	            else if(name.matches("[$&+,:;=?@#|'<>.-^*()%!]")) 
	            {
//	            	System.out.println(input_message.substring(10,input_message.lastIndexOf('e')+1)+" contains only alphabets. Re-enter again.");
//	                name = "";
				}
	            else
	            {
	                name = name;
	            }
	
	        } 
        	catch (Exception e) 
        	{
        		System.out.println(input_message.substring(10,input_message.lastIndexOf('e')+1)+" contains only alphabets. Re-enter again.");
	            name = "";
	        }
        }
        return name;
	}
}
