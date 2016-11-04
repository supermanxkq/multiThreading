package com.runalble;

/**
 * @ClassName: MakeTea
 * @Description: 做茶主线程，使用实现Runnable实现
 * @author Administrator
 * @date 2016年11月4日 下午1:40:41
 * @modifier
 * @modify-date 2016年11月4日 下午1:40:41
 * @version 1.0
 */

public class MakeTea {
	public static void main(String[] args) {
		// 创建烧开水的线程
		BoilThreadRunnable boilThreadRunnable = new BoilThreadRunnable();
		Thread boilThread = new Thread(boilThreadRunnable);
		boilThread.start();
		// 创建洗杯子的线程
		WashThreadRunnalble washThreadRunnalble = new WashThreadRunnalble();
		Thread washThread = new Thread(washThreadRunnalble);
		washThread.start();
	}
}
