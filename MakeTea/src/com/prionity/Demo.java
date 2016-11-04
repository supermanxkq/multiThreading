package com.prionity;

/**
 * @ClassName: Demo
 * @Description: 线程优先级
 * @author Administrator
 * @date 2016年11月4日 下午3:30:08
 * @modifier
 * @modify-date 2016年11月4日 下午3:30:08
 * @version 1.0
 */

public class Demo {
	public static void main(String[] args) {
		Thread t1=new Thread(new MyThread());
		Thread t2=new Thread(new MyThread());
		Thread t3=new Thread(new MyThread());
		t1.setName("第一个线程");
		t2.setName("第二个线程");
		t3.setName("第三个线程");
		t2.setPriority(Thread.MAX_PRIORITY);//10  最后为2先执行完毕
		t1.start();
		t2.start();
		t3.start();
	}
}
