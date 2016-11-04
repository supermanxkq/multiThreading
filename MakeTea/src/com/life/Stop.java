package com.life;


/**
 * @ClassName: Stop
 * @Description: 线程停止
 * @author Administrator
 * @date 2016年11月4日 下午3:57:49
 * @modifier
 * @modify-date 2016年11月4日 下午3:57:49
 * @version 1.0
*/
	
public class Stop implements Runnable{

	private  int i=0;
	
	@Override
	public void run() {
		while(true){
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			if(i==2){
				Thread.currentThread().interrupt();
				Thread.currentThread().stop();
			}
			
			System.out.println(Thread.currentThread().getName()+"....run");
		}
	}
}
