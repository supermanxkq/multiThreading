package com.thread;

/**
 * @ClassName: MakeTea
 * @Description: 做茶主线程，使用继承Thread实现
 * @author Administrator
 * @date 2016年11月4日 下午1:40:41
 * @modifier
 * @modify-date 2016年11月4日 下午1:40:41
 * @version 1.0
 */

public class MakeTea {
	public static void main(String[] args) {
		// 创建烧开水的线程
		BoilThread boilThread = new BoilThread();
		// 设置线程名称
		boilThread.setName("烧开水");
		// 启动线程
		boilThread.start();

		// 创建洗杯子的线程
		WashThread washThread = new WashThread();
		// 设置线程名称
		washThread.setName("洗杯子");
		washThread.start();
	}
}
