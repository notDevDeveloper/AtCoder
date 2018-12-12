import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// スペース区切りの整数の入力
		int a = sc.nextInt();
		int b = sc.nextInt();
		// 奇遇判定
		if(a * b % 2 == 0) {
			// 偶数の時
			System.out.println("Even");
		} else {
			// 奇数の時
			System.out.println("Odd");
		}
	}
}
