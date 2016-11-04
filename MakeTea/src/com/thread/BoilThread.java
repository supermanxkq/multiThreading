package com.thread;

/**
 * @ClassName: BoilThread
 * @Description: 烧开水的线程
 * @author Administrator
 * @date 2016年11月4日 下午1:39:13
 * @modifier
 * @modify-date 2016年11月4日 下午1:39:13
 * @version 1.0
*/
	
public class BoilThread extends Thread {
	@Override
	public void run() {
		try {
			System.out.println("开始烧水。。。。。");
			Thread.sleep(10000);
			System.out.println("水烧开了。");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
