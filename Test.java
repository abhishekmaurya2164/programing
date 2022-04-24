package learning;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;


public class Test {
	
	
	public static void main(String[] args) {
		
	Runnable th=()->{
		
		for(int i=1;i<10; i++) {
			System.out.println("hello");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	};
Runnable th1=()->{
		
		for(int i=1;i<10; i++) {
			System.out.println("hi");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	};
	
	Thread t= new Thread(th);
	t.setName("hi");
	t.start();
	Thread t2= new Thread(th1);
	t2.setName("hi");
	t2.start();
			
		
	}

}
