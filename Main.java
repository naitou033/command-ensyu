import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
	int i = 0;
	while(i <= 1){
		System.out.println("身長を入力(例：1.75)");
		double n = Double.parseDouble(sc.nextLine());
		System.out.println("体重を入力(例：65.5)");
		double x = Double.parseDouble(sc.nextLine());

		double j = (x / (n * n));
		System.out.println((String.format("%.2f", j)));
		System.out.println("");
		i++;
	}
    }
}
