import java.util.*;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;
import java.io.*;

public class Person{
	
	private String firstname, lastname, middlename;
	private int age;
	private char gender;
	private String color;
	
	public Person(){
		firstname = "John";
		middlename = "Daniel";
		lastname = "Doe";
		age=25;
		gender = 'm';
		color = "blue";
	}
	
	public Person(String firstname,String lastname){
		this.firstname=firstname;
		this.lastname=lastname;
	}
	
	public void setAge(int age){
		this.age=age;
	}
	
	public void setMiddleName(String mname){
		middlename = mname;
	}
	
	public void setGender(char ch){
		gender = ch;
	}
	
	public int  getAge(){
		return age;
	}
	
	public String getName(){
		return (firstname+" "+lastname);
	}
	
	public char getGender(){
		return gender;
	}
	
	public void savePerson(String filePath) throws IOException{
		FileWriter write = new FileWriter(filePath,true);
		PrintWriter prt = new PrintWriter(write);
		
		prt.printf("%s" + "%n", firstname+","+lastname);
		prt.close();
	}
	
	public boolean known(){
		boolean isknown = false;
		try {
			File file = new File("Ella.txt");
			FileReader fileReader = new FileReader(file);
			BufferedReader br = new BufferedReader(fileReader);
			String lineComp= firstname+","+lastname;
			String line;
			while ((line=br.readLine()) !=null){
				if (line.equalsIgnoreCase(lineComp)) isknown = true;
				
			}
			fileReader.close();
			} catch (IOException e){
				e.printStackTrace();
			}
			
		return isknown;
	}
	
	
	
}
		
