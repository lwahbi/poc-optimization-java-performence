package chapter6.memory.exercice1;

public class Ex1Lancer {

	public static void main(String args[]) {
		Ex1Lancer main = new Ex1Lancer();
		main.start();
	}
	
	public void start() {
		String last = "Z";
		Container container = new Container();
		container.setInitial("C");
		another(container,last);
		System.out.print(container.getInitial());
	}
	
	public void another(Container initialHolder, String newInitial) {
		newInitial.toLowerCase();
		initialHolder.setInitial("B");
		Container initial2 = new Container();
		initialHolder=initial2;
		System.out.print(initialHolder.getInitial());
		System.out.print(newInitial);
	}
}
