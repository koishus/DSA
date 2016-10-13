package dsa;


import java.util.*;

public class SocialNetwork1 {
	

	Person Yepa;
	private ArrayList<Person> friendList; 
	String fileName = "friends.txt";
	Scanner ole = new Scanner(fileName);
	
	/* Pasar del txt al arraylist
	 * Leemos el primer dato
	 * Los atributos están separados por comas
	 * Por cada linea del txt, creamos una nueva persona
	 * Al ser del tipo Person, las personas creadas las añadimos al arraylist: friendList.add();
	 * */

	public void addPerson() { //adds a person into the list
		
		}
	

	public void removePerson() { //removes somoeone from the list
		friendList.remove(Yepa);
		
	}
	
	public Person findPerson() {
		
		return Yepa;
	}
	

}
