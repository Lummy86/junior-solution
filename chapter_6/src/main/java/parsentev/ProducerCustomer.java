package parsentev;


/**
 * TODO: comment
 * @author parsentev
 * @since 07.04.2016
 */
public class ProducerCustomer {

	private final Object lock = new Object();
	private boolean blockCustomer = true; // thread stack

	public void doSomething() throws InterruptedException {
		synchronized (this.lock) {
			while (this.blockCustomer) {
				System.out.println(String.format("%s wait", Thread.currentThread().getId()));
				//lock.wait();
				//Thread.sleep(1l);
			}
			System.out.println(String.format("%s userfull work", Thread.currentThread().getId()));
			//todo some usefull things
		}
	}

	public void changeBlock(boolean enable) {
		// one more producer
		synchronized (this.lock) {
			System.out.println(String.format("%s enable", Thread.currentThread().getId()));
			this.blockCustomer = enable;
			this.lock.notify();
		}
	}



	public static void main(String[] args) throws InterruptedException {
		final ProducerCustomer blockingWork = new ProducerCustomer();

		//producer
		Thread producer =  new Thread() {
			@Override
			public void run() {
				blockingWork.changeBlock(false);
			}
		};

		//customer
		Thread customer = new Thread() {
			@Override
			public void run() {
				try {
					blockingWork.doSomething();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		};

		producer.start();
		customer.start();
	}
}
