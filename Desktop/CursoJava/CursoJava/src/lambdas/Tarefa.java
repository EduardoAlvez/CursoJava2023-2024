package lambdas;

public class Tarefa implements Runnable {

	@Override
	public void run() {
		for (int a = 0 ; a<=101; a++) {
			System.out.println("Tarefa 02 #"+a);
			try {
				Thread.sleep(100);
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}
}
