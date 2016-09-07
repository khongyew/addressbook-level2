package seedu.addressbook.data.tag;

import seedu.addressbook.data.person.Person;
import seedu.addressbook.data.tag.Tag;

public class Tagging {
	
	private final Tag tag;
	private final Person person;
	
	private enum Status{
		ADDED, DELETED
	}
	
	private Status status;
	
	public Tagging(Tag tag, Person person, Status status){
		this.tag = tag;
		this.person = person;
		this.status = status;
	}
	
	public Tag getTag(){
		return this.tag;
	}
	
	public Person getPerson(){
		return this.person;
	}
	
	public Status getStatus(){
		return this.status;
	}
	
	public String toString(){
		if(this.status == Status.ADDED){
			return "+ " + this.person.getName().toString() + " [" + this.tag.toString() + "]";
		}
		else{
			return "- " + this.person.getName().toString() + " [" + this.tag.toString() + "]";
		}
			
	}
}
