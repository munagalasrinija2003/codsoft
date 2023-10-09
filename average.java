import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.println("ENTER NUMBER OF SUBJECTS: ");
		n = sc.nextInt();

		int a[] = new int[n];
		int i;
		long total = 0;
		float avg;

		for (i = 0; i < n; i++) {
			System.out.println("ENTER SUBJECT " + (i + 1) + " MARKS");

			a[i] = sc.nextInt();
			total = total + a[i];

		}
		avg = total / n;
		if (avg >= 90 && avg < 100) {
			System.out.println("TOTAL MARKS ARE :" + total);
			System.out.println("AVERAGE PERCENTAGE IS :" + avg);
			System.out.println("GRADE IS: A");
		} else if (avg >= 80 && avg < 90) {
			System.out.println("TOTAL MARKS ARE :" + total);
			System.out.println("AVERAGE PERCENTAGE IS :" + avg);
			System.out.println("GRADE IS: B");
		} else if (avg >= 70 && avg < 80) {
			System.out.println("TOTAL MARKS ARE :" + total);
			System.out.println("AVERAGE PERCENTAGE IS :" + avg);
			System.out.println("GRADE IS: C");
		} else if (avg >= 60 && avg < 70) {
			System.out.println("TOTAL MARKS ARE :" + total);
			System.out.println("AVERAGE PERCENTAGE IS :" + avg);
			System.out.println("GRADE IS: D");
		}

		else if (avg >= 30 && avg < 60) {
			System.out.println("TOTAL MARKS ARE :" + total);
			System.out.println("AVERAGE PERCENTAGE IS :" + avg);
			System.out.println("GRADE IS: PASS");
		} else {
			System.out.println("TOTAL MARKS ARE :" + total);
			System.out.println("AVERAGE PERCENTAGE IS :" + avg);
			System.out.println("GRADE IS: FAIL");
		}
	}

}
