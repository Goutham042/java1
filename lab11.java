

class MyRunnable implements Runnable{
	@Override
	public void run() {
            //for(int i = 1; i<=5;i++){
		try {
			Thread.sleep(5);
			System.out.println("Thread " +Thread.currentThread().getId() + "running");
		}
		catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
        }
}
public class lab11 {

	public static void main(String[] args) {
		System.out.println("Runnable");
		MyRunnable mr1=new MyRunnable();
		Thread t1=new Thread(mr1);
		Thread t2=new Thread(mr1);
		Thread t3=new Thread(mr1);
		t1.start();
		t2.start();
		t3.start();

	}

}