package in.Thread;

public class MyDeadlock {
	String str1 = "Java";
	String str2 = "UNIX";
	
	// Thread one 
	Thread trd1 = new Thread(){
		public void run(){
			while(true){
				synchronized(str1){
					synchronized(str2){
					System.out.println(str1+str2);
					}
				}
			}
		}
	};
	// Thread two
	Thread trd2 = new Thread(){
		public void run(){
			while(true){
				synchronized(str2){
					synchronized((str1)){
					System.out.println(str2+str1);
					}
				}
			}
		}
	};
	public static void main(String[] args) {
		System.out.println("DeadLock");
		MyDeadlock mdl = new MyDeadlock();
		mdl.trd1.start();
		mdl.trd2.start();
	}
}