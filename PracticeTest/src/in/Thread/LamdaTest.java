package in.Thread;

public class LamdaTest {

	public static void main(String[] args) {
		Thread t1 = new Thread(new Runnable(){
			public void run(){
				System.out.println("Inner thread running..");
				
			}
			
		});
		Thread t2 = new Thread(()->System.out.println("Lamda thread running.."));
		
		t1.start();
		t2.start();
	}

}
