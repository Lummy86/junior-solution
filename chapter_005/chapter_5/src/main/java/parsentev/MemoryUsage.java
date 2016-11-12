package parsentev;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;

/**
 * TODO: comment
 * @author parsentev
 * @since 22.03.2016
 */
public class MemoryUsage {
	private static final Logger log = LoggerFactory.getLogger(MemoryUsage.class);

	public static void main(String[] args) {
		System.out.println("start");
		info();
		User user = new User("test");
		System.out.println(user);
		user = null;
		System.gc();
		System.out.println("finish");
		info();

	}

	public static void info() {
		int mb = 1024*1024;

		//Getting the runtime reference from system
		Runtime runtime = Runtime.getRuntime();

		System.out.println("##### Heap utilization statistics [MB] #####");

		//Print used memory
		System.out.println("Used Memory:"
		                   + (runtime.totalMemory() - runtime.freeMemory()) / mb);

		//Print free memory
		System.out.println("Free Memory:"
		                   + runtime.freeMemory() / mb);

		//Print total available memory
		System.out.println("Total Memory:" + runtime.totalMemory() / mb);

		//Print Maximum available memory
		System.out.println("Max Memory:" + runtime.maxMemory() / mb);
	}
}
