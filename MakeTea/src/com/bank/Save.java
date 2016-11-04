package com.bank;

/**
 * @ClassName: Account
 * @Description: 存钱
 * @author Administrator
 * @date 2016年11月4日 下午3:06:40
 * @modifier
 * @modify-date 2016年11月4日 下午3:06:40
 * @version 1.0
 */
public class Save implements Runnable {

	// 银行
	private Bank bank = new Bank();

	@Override
	public void run() {
		for (int i = 0; i < 400; i++) {
			bank.add(100);
		}
	}

}
