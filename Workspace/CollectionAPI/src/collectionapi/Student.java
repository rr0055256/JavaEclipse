package collectionapi;

public class Student implements Comparable
{
	int id,age;
	String name;
	
	public Student(int id, String name, int age) {
		this.id = id;
		this.name = name;
		this.age=age;
	}

	@Override
	public int compareTo(Object o) {
		Student s1 = (Student)o;
		return this.id=s1.id;
	}
	
	public boolean equals(Object o)
	{
		Student s1 = (Student)o;
		return this.hashCode()==s1.hashCode();
	}
	
	public int hashCode()
	{
		return this.id;
	}
	
	public String toString()
	{
		return "Student[id "+id+"]"+" name "+name+"]";
	}

}
