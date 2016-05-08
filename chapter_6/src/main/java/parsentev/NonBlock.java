package parsentev;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * TODO: comment
 * @author parsentev
 * @since 07.04.2016
 */
public class NonBlock {

	private volatile boolean blockCustomer = true; // thread stack

	public void doSomething() throws InterruptedException {
		while (this.blockCustomer) {
			System.out.println(String.format("%s userfull work", Thread.currentThread().getId()));
		}
	}

	public void changeBlock(boolean enable) {
		// one more producer
		System.out.println(String.format("%s enable", Thread.currentThread().getId()));
		this.blockCustomer = enable;
	}

	public static void main(String[] args) {
		new Thread() {
			@Override
			public void run() {
				/*
				1. read
				2. increament
				3. write
				 */
			}
		}.start();

		new Thread() {
			@Override
			public void run() {
			}
		}.start();

		List<String> syncList = Collections.synchronizedList(new ArrayList<String>());
		CopyOnWriteArrayList<String> copyOnWriteArrayList = new CopyOnWriteArrayList<String>();
	}
}
