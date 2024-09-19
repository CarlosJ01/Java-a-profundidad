package excercies.excercie2;

public class Contador implements Runnable{
	private int initial;
	private Detector detector;
	
	public Contador(int initial, Detector detector) {
		super();
		this.initial = initial;
		this.detector = detector;
	}

	@Override
	public void run() {
		for (int i = initial; i >= 0; i--) {
			System.out.printf("Contador [%s]: %d \n", Thread.currentThread().getName(), i);
			
			if (i == 0 ) {
				System.out.printf("CONTADOR [%s] TERMINO \n", Thread.currentThread().getName());
				detector.setGanador(Thread.currentThread().getName());
			} else {
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
		
	}

}
