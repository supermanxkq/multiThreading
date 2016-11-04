package com.prionity;


/**
 * @ClassName: MyThread
 * @Description:线程的优先级
 * @author Administrator
 * @date 2016年11月4日 下午3:38:14
 * @modifier
 * @modify-date 2016年11月4日 下午3:38:14
 * @version 1.0
*/
	
public class MyThread implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i < 1000; i++) {
			System.out.println(Thread.currentThread().getName() +"="+ i);
		}
	}

}
