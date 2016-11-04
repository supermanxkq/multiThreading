package com.life;

public class Test {
	public static void main(String[] args) {
		Stop s1=new Stop();
		Thread  t1=new Thread(s1);
		Thread  t2=new Thread(s1);
		t1.setName("线程A");
		t2.setName("线程B");
		t1.start();
		t2.start();
		int i=0;
		while (true) {
			System.out.println("i为："+i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		    if(i==10){
		    	t1.stop();//表示停止线程的执行，程序就不执行了
		    	t2.interrupt();//表示线程的中断，程序不会停止，只会抛出一个异常，例如：
		    	break;
		    }
		    i++;
		}
	}
}
