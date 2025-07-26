
public class MyPrinterThread extends Thread {
	public void run() {
		for(int i=0;i<5;i++)
		{
			System.out.println("Hello From Thread");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	public static void main(String[] args)
	{
		MyPrinterThread obj = new MyPrinterThread();
		obj.start();
		
	}

}
