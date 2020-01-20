package thread;
public class MyThread extends Thread
{
	
	
	public void run()
	{
		super.run();
		for(int i=0;i<=10;i++){
			MyThread t=new MyThread();
			t.start();
		
			try
			{
				Thread.sleep(10000);
			}
			catch(InterruptedException e)
			{
				Syso
				e.printStackTrace();
			}
			
			
		}
		
	}
	public static void main(String ar[]){
		MyThread t=new MyThread();
		t.start();
		System.out.println("hi");
		
}


}