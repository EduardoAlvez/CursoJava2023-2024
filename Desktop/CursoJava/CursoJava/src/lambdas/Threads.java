package lambdas;

public class Threads {

	public static void main(String[] args) {

		Runnable tarefa02 = new Tarefa();
		Runnable tarefa01 = new Runnable() {
			@Override
			public void run() {
				for (int a = 0; a <= 101; a++) {
					System.out.println("Tarefa 01 #" + a);
					try {
						Thread.sleep(100);
					} catch (Exception e) {
						// TODO: handle exception
					}
				}
			}
		};

//		Runnable tarefa03 = () -> {
//			for (int a = 0; a <= 101; a++) {
//				System.out.println("Tarefa 03 #" + a);
//				try {
//					Thread.sleep(100);
//				} catch (Exception e) {
//					// TODO: handle exception
//				}
//			}
//		};
		Runnable tarefa03 = Threads::tarefa03; 
		new Thread(tarefa01).start();
		new Thread(tarefa02).start();
		new Thread(tarefa03).start();

	}
	static void tarefa03() {
		for (int a = 0; a <= 101; a++) {
			System.out.println("Tarefa 03 #" + a);
			try {
				Thread.sleep(100);
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}
}
