package parsentev;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;

/**
 * TODO: comment
 * @author parsentev
 * @since 31.03.2016
 */
public class Cache {
	private static final Logger log = LoggerFactory.getLogger(Cache.class);

	public static void main(String[] args) {
		WeakReference<User> weakUser = new WeakReference<User>(new User("test"));
		SoftReference<User> softUser = new SoftReference<User>(new User("test"));
		//System.gc();
		System.out.println(weakUser.get());
		System.out.println(softUser.get());
	}
}
