package dsa;
import java.util.*;

public class Person {
	private String identifier;
	private String name;
	private ArrayList<String> surnames;
	private ArrayList<Integer> birthdate;
	private String birthplace;
	private String home;
	private ArrayList<String> studiedAt;
	private ArrayList<String> workedAt;
	private ArrayList<String> movies;
	private String groupCode = "G611630";
	
	
	public Person(String Identifier, String Name,
			ArrayList<String> Surnames,
			ArrayList<Integer> Birthdate, String Birthplace, String Home, ArrayList<String> StudiedAt, 
			ArrayList<String> WorkedAt, ArrayList<String> Movies, String GroupCode) {
		Identifier = identifier;
		Name = name;
		Surnames = surnames;
		Birthdate = birthdate;
		Birthplace = birthplace;
		Home = home;
		StudiedAt = studiedAt;
		WorkedAt = workedAt;
		Movies = movies;
		GroupCode = groupCode;
	}
	
	public String getIdentifier() {
		return identifier;
	}
	public void setIdentifier(String identifier) {
		this.identifier = identifier;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public ArrayList<String> getSurnames() {
		return surnames;
	}
	public void setSurnames(ArrayList<String> surnames) {
		this.surnames = surnames;
	}
	public ArrayList<Integer> getBirthdate() {
		return birthdate;
	}
	public void setBirthdate(ArrayList<Integer> birthdate) {
		this.birthdate = birthdate;
	}
	public String getBirthplace() {
		return birthplace;
	}
	public void setBirthplace(String birthplace) {
		this.birthplace = birthplace;
	}
	public String getHome() {
		return home;
	}
	public void setHome(String home) {
		this.home = home;
	}
	public ArrayList<String> getStudiedAt() {
		return studiedAt;
	}
	public void setStudiedAt(ArrayList<String> studiedAt) {
		this.studiedAt = studiedAt;
	}
	public ArrayList<String> getWorkedAt() {
		return workedAt;
	}
	public void setWorkedAt(ArrayList<String> workedAt) {
		this.workedAt = workedAt;
	}
	public ArrayList<String> getMovies() {
		return movies;
	}
	public void setMovies(ArrayList<String> movies) {
		this.movies = movies;
	}
	public String getGroupCode() {
		return groupCode;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (birthdate == null) {
			if (other.birthdate != null)
				return false;
		} else if (!birthdate.equals(other.birthdate))
			return false;
		if (birthplace == null) {
			if (other.birthplace != null)
				return false;
		} else if (!birthplace.equals(other.birthplace))
			return false;
		if (groupCode == null) {
			if (other.groupCode != null)
				return false;
		} else if (!groupCode.equals(other.groupCode))
			return false;
		if (home == null) {
			if (other.home != null)
				return false;
		} else if (!home.equals(other.home))
			return false;
		if (identifier != other.identifier)
			return false;
		if (movies == null) {
			if (other.movies != null)
				return false;
		} else if (!movies.equals(other.movies))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (studiedAt == null) {
			if (other.studiedAt != null)
				return false;
		} else if (!studiedAt.equals(other.studiedAt))
			return false;
		if (surnames == null) {
			if (other.surnames != null)
				return false;
		} else if (!surnames.equals(other.surnames))
			return false;
		if (workedAt == null) {
			if (other.workedAt != null)
				return false;
		} else if (!workedAt.equals(other.workedAt))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Person [identifier=" + identifier + ", name=" + name + ", surnames=" + surnames + ", birthdate="
				+ birthdate + ", birthplace=" + birthplace + ", home=" + home + ", studiedAt=" + studiedAt
				+ ", workedAt=" + workedAt + ", movies=" + movies + ", groupCode=" + groupCode + "]";
		
	}
	
}
