
public class RunnableCounter implements Runnable {
	public void run()
	{
		for(int i=1;i<10;i++)
		{
			System.out.println("Thread is running");
		}
	}
	public static void main(String[] args)
	{
		RunnableCounter obj = new RunnableCounter();
		Thread t1 = new Thread(obj);
		t1.start();
	}
	

}
