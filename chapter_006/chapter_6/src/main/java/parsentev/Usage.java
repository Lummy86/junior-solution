package parsentev;

/**
 * TODO: comment
 * @author parsentev
 * @since 06.04.2016
 */
public class Usage {
	public static final class Counter {
		long count = 0;
		static String name = "String";
		// lock = this
		public void add(long value) {
			synchronized(this) {
				this.count += value;
			}
		}

		public void sum(final Counter a, final Counter b) {
			synchronized (a) { // a1, thread 1. b1, thread2
				synchronized (b) { // b1, thread 1. a1, thread2
					System.out.println(a.count + " " + b.count);
					a.add(b.count);
				}
			}
		}
	}

	public static final class CounterThread extends Thread {
		protected final Counter counterA; //steak
		protected final Counter counterB;

		public CounterThread(final Counter counterA, final Counter counterB) {
			this.counterA = counterA;
			this.counterB = counterB;
		}

		@Override
		public void run() {
			counterA.sum(counterA, counterB);
		}
	}

	public static void main(String[] args) throws InterruptedException {
		Counter counterA = new Counter(); //heap
		counterA.add(1);
		Counter counterB = new Counter();
		counterB.add(2);
		Thread threadA = new CounterThread(counterA, counterB); //heap
		Thread threadB = new CounterThread(counterB, counterA); //heap

		threadA.start();
		threadB.start();
		threadA.join();
		threadB.join();
		System.out.println(counterA.count); //heap
	}
}
