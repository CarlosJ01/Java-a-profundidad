package producers_consumers;

import java.util.Random;

public class Consumer extends Thread{
	private Resource resource;

	public Consumer(Resource resource, String name) {
		super(name);
		this.resource = resource;
	}

	@Override
	public void run() {
		while (true) {
			int value = 0;
			value = resource.consume();
			System.out.printf("%s consumed %d \n", getName(), value);
			try {
				Thread.sleep(new Random().nextInt(200));
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
