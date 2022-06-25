package src.main.java.tutorials.thread;

//Inherit Thread class
class Runner extends Thread{

	@Override
	public void run() {
		for(int i=0; i<5; i++){
			System.out.println("Thread "+i);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
}
//Implementing Runnable interface
class Runner2 implements Runnable{

	@Override
	public void run() {
		for(int i=0; i<5; i++){
			System.out.println("Thread "+i);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
}
public class Application {

	public static void main(String[] args) {
		Runner runner = new Runner();
		runner.start();
		
		Thread thread = new Thread(new Runner2());
		thread.start();
	}

}
