package emp;

public class AddVariableExample {
	static void add(int... values){
		int sum=0;
		System.out.println("add method invoked");
		for(int i:values){
			sum=sum+i;
			System.out.println(sum);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		add(1,3,7,89);
	}

}
