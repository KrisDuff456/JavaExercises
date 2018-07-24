package exercise_2;

public class Person {
	
	private String sName;
	private int ageNum;
	private String jobTitle;
	
	public Person(String name, int age, String title) 
	{
	this.sName = name;
	this.ageNum = age;
	this.jobTitle = title;
	}
	
	public String getName() {
		return sName;
	}
	public int getAge() { 
		return ageNum;
	}
	
	public String getTitle() {
		return jobTitle;
	}

	


}
	