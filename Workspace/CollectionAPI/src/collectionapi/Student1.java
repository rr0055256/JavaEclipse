package collectionapi;

public class Student1 {
	int id;
	String name;
	public Student1(int id, String name)
	{
		this.id=id;
		this.id=id;
	}
	
	public int hashCode()
	{
		return this.id;
	}
	
	public boolean equals(Object arg)
	{
		Student1 s1 = (Student1) arg;
		
		return this.hashCode()==s1.hashCode();
		
	}
	
	public String toString(){
		return "Student[id"+id+"name="+name+"]";
	}
}
