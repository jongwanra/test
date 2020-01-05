import java.util.Scanner;

public class Gugudan {

	static void calculate(int front, int back) {
		int[] arr = new int[back];
		for (int j = 2; j <= front; j++) {
			for (int i = 0; i < back; i++) {
				arr[i] = j * (i + 1);
				System.out.println(j + " * " + (i + 1) + " : " + arr[i]);
			}
		}

	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("몇단 몇단 을 출력?? : ");
		String tmp = scan.nextLine();
		String[] getTmp = tmp.split(",");
		
		int front = Integer.parseInt(getTmp[0]);
		int back = Integer.parseInt(getTmp[1]);
		
		calculate(front, back);
	}
}