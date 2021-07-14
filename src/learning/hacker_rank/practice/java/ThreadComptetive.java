package learning.hacker_rank.practice.java;

public class ThreadComptetive {
	
	public static void main(String[] args) {
		
		SampleDemo a = new SampleDemo("A");
		SampleDemo b = new SampleDemo("B");
		b.start();
		a.start();
	}

}


class SampleDemo implements Runnable {

	private Thread t;
	private String threadName ;
	
	
	
	public SampleDemo(String threadName) { 
		this.threadName = threadName;
	}

	@Override
	public void run() {
		while(true)
			System.out.println(threadName);
		
	}
	
	public void start() {
		if(t==null) {
			t = new Thread(this, threadName);
			t.start();
		}
	}
	
}