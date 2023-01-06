package grouping;

import java.util.ArrayList;
import java.util.List;

public class PersonList {
 
	
	public static void main(String[] args) {
		List<Person> listA = new ArrayList<Person>();
		listA.add(new Person("kim","23","game"));//0
		listA.add(new Person("lee","33","movie"));//1
        
		List<Person> listB = new ArrayList<Person>();
		listB.add(new Person("kim","23","game"));//0
		listB.add(new Person("nakamura","45","cycle"));//1

		
		List<Person> listX = new ArrayList<Person>();//a
		List<Person> listY = new ArrayList<Person>();//a+b
		List<Person> listZ = new ArrayList<Person>();//b
		
		for (Person a : listA) {
				
			boolean flag = false;
			String aname = a.getName();
			String aage = a.getAge();
			String ahobby = a.getHobby();
			for (Person b : listB) {
				String bname = b.getName();
				
			}
			
			
		}
		
	
	
	
	
	}
	
}

