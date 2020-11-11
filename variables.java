public class variables {
   
	public string name;	
	public int age;

	public variables(name,age){
	this.name = name;
	this.age = age;
	}
	
	public string getName(){
	return name;
	}

	public int getAge(){
	return age;
	}

	public void setName(String name){
	this.name = name;
	}

	public void setAge(int age){
	this.age = age;
	}
}
