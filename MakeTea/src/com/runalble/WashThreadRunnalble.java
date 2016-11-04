package com.runalble;


/**
 * @ClassName: WashThreadRunnalble
 * @Description: 洗茶杯的线程
 * @author Administrator
 * @date 2016年11月4日 下午1:58:25
 * @modifier
 * @modify-date 2016年11月4日 下午1:58:25
 * @version 1.0
*/
	
public class WashThreadRunnalble implements Runnable {

	@Override
	public void run() {
		try {
			for (int i = 0; i < 100; i++) {
				System.out.println("开始洗第" + i + "个茶杯。");
				Thread.sleep(1500);
				System.out.println("第" + i + "个茶杯洗好了。");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
