package assessment;
import java.util.Scanner;

public class GrosSalary 
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		for (int t = 0; t < T; t++) {
			int salary = sc.nextInt();

			System.out.println(solve(salary));
		}

		sc.close();
	}

	static double solve(int salary) {
		double hra;
		double da;
		if (salary < 1500) {
			hra = 0.1 * salary;
			da = 0.9 * salary;
		} else {
			hra = 500;
			da = 0.98 * salary;
		}

		return salary + hra + da;
	}
}
