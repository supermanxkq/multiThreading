package com.thread;
/**
 * @ClassName: WashThread
 * @Description: 洗杯子线程
 * @author Administrator
 * @date 2016年11月4日 下午1:42:58
 * @modifier
 * @modify-date 2016年11月4日 下午1:42:58
 * @version 1.0
 */

public class WashThread extends Thread {
	@Override
	public void run() {
		try {
			for (int i = 0; i < 100; i++) {
				System.out.println("开始洗第" + i + "个杯子。。。。。");
				Thread.sleep(1500);
				System.out.println("第" + i + "个杯子已经洗干净了。。");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
