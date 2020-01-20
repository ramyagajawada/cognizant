package emp;
import java.util.*;
class Student {
	public int eId;
	public String eName;
	public int age;
	public Student(int eId, String eName, int age) {
		super();
		this.eId = eId;
		this.eName = eName;
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "Student [eId=" + eId + ", eName=" + eName + ", age=" + age + "]";
	}
	
	public int geteId() {
		return eId;
	}
	public void seteId(int eId) {
		this.eId = eId;
	}
	public String geteName() {
		return eName;
	}
	public void seteName(String eName) {
		this.eName = eName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
}



