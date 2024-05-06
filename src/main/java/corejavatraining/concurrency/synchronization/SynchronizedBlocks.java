package corejavatraining.concurrency.synchronization;

public class SynchronizedBlocks {
	private int count;
	private static int staticCount;

	public static void performStaticSynchronized() {
		//System.out.println(Thread.currentThread().getName());
		synchronized (SynchronizedBlocks.class) {
			setStaticCount(getStaticCount() + 1);
			//System.out.println(getStaticCount());
		}
	}

	public static void performStaticNonSynchronized() {
		//System.out.println(Thread.currentThread().getName());
		// synchronized (SynchronizedBlocks.class) {
		setStaticCount(getStaticCount() + 1);
		//System.out.println(getStaticCount());
		// }
	}

	public void performSynchronized() {
		synchronized (this) {
			setCount(getCount() + 1);
		}
	}

	public void performNonSynchronized() {
		//synchronized (this) {
			setCount(getCount() + 1);
		//}
	}
	public static int getStaticCount() {

		return staticCount;

	}

	public void setCount(int value) {

		count = value;

	}

	public int getCount() {

		return count;

	}

	public static void setStaticCount(int count) {
		staticCount = count;
	}
}
