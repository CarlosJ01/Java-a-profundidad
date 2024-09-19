package producers_consumers;

import java.util.LinkedList;

public class Resource {
	private LinkedList<Integer> resources = new LinkedList<>();
	
	public synchronized int consume() {
		while(resources.size() <= 0) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		return resources.poll();
	}
	
	public synchronized void produce(int value) {
		resources.offer(value);
		notifyAll();
	}
}
