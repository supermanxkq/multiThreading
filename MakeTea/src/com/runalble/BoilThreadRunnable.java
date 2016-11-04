package com.runalble;


/**
 * @ClassName: BoilThreadRunnable
 * @Description: 烧开水
 * @author Administrator
 * @date 2016年11月4日 下午1:55:55
 * @modifier
 * @modify-date 2016年11月4日 下午1:55:55
 * @version 1.0
*/
	
public class BoilThreadRunnable implements Runnable {

	@Override
	public void run() {
		try {
			System.out.println("----开始烧开水-------");
			Thread.sleep(10000);
			System.out.println("----水烧开了，可以泡茶了。-------");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
