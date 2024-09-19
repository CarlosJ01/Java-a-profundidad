package producers_consumers;

public class Test {
	public static void main(String[] args) {
		Resource resource =  new Resource();
		
		Consumer consumer1 = new Consumer(resource, "Consumer 1");
		Consumer consumer2 = new Consumer(resource, "Consumer 2");
		
		Producer producer1 = new Producer(resource, "Producer 1");
		Producer producer2 = new Producer(resource, "Producer 2");
		
		producer1.start();
		producer2.start();
		
		consumer1.start();
		consumer2.start();
	}
}
