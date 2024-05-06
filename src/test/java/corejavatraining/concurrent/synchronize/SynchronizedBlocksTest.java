package corejavatraining.concurrent.synchronize;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.stream.IntStream;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import corejavatraining.concurrency.synchronization.SynchronizedBlocks;

public class SynchronizedBlocksTest {
	/* 
	 * beforegroups will run only once for the group and beforemethod
	 * will run only once for the test method, if we run groups then
	 * only config methods belonging to the groups will be executed
	 */
	@BeforeMethod(groups = "static")
	public void initialize() {
		System.out.println("initializing static fields..");
		SynchronizedBlocks.setStaticCount(0);
	}

	@Test(groups = "static")
	public void testStaticSynchronizedCounter() throws InterruptedException {
		ExecutorService service = Executors.newFixedThreadPool(3);
		IntStream.range(0, 1000).forEach(count -> service.submit(SynchronizedBlocks::performStaticSynchronized));
		service.awaitTermination(500, TimeUnit.MILLISECONDS);
		try {
		Assert.assertEquals(SynchronizedBlocks.getStaticCount(),1000);
		}
		catch(AssertionError e) {
			System.out.println(SynchronizedBlocks.getStaticCount());
			throw new AssertionError(e);
		}
	}
	
	@Test(groups = "static")
	public void testStaticNonSynchronizedCounter() throws InterruptedException {
		ExecutorService service = Executors.newFixedThreadPool(3);
		IntStream.range(0, 1000).forEach(count -> service.submit(SynchronizedBlocks::performStaticNonSynchronized));
		service.awaitTermination(500, TimeUnit.MILLISECONDS);
		//Assert.assertNotEquals(SynchronizedBlocks.getStaticCount(), 1000);
		//sometimes count will not reach 1000
		System.out.println(SynchronizedBlocks.getStaticCount());
	}
	
	@Test
	public void testSynchronizedCounter() throws InterruptedException {
		SynchronizedBlocks sb = new SynchronizedBlocks();
		ExecutorService service = Executors.newFixedThreadPool(3);
		IntStream.range(0, 1000).forEach(count -> service.submit(sb::performSynchronized));
		service.awaitTermination(500, TimeUnit.MILLISECONDS);
		try {
		Assert.assertEquals(sb.getCount(), 1000);
	}
	catch(AssertionError e) {
		System.out.println(SynchronizedBlocks.getStaticCount());
		throw new AssertionError(e);
	}
	}
	
	@Test
	public void testNonSynchronizedCounter() throws InterruptedException {
		SynchronizedBlocks sb = new SynchronizedBlocks();
		ExecutorService service = Executors.newFixedThreadPool(3);
		IntStream.range(0, 1000).forEach(count -> service.submit(sb::performNonSynchronized));
		service.awaitTermination(500, TimeUnit.MILLISECONDS);
		
		//sometimes count will not reach 1000
		System.out.println(sb.getCount());
	}
}
