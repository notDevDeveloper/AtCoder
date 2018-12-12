import java.util.*;
public class Main {
	public static void main(String[] args) {
		int operation = 0;
		boolean oddNumberFlag = false;
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> a = new ArrayList<Integer>();
		// 回数の入力
		int n = sc.nextInt();
		// 整数の標準入力をn回繰り返す
		for(int i = 0; i < n; i++) {
			a.add(sc.nextInt());
		}
		while(true) {
			// 入力値の数だけ繰り返す
			for(int j = 0; j < a.size(); j++) {
				// 奇数の時
				if(a.get(j) % 2 == 1) {
					oddNumberFlag = true;
					break;
				}
				// 2で除算
				a.set(j, a.get(j) / 2);
			}
			// 奇数が出現したら終了
			if(oddNumberFlag == true) {
				break;
			}
			operation++;
		}
		// 結果出力
		System.out.println(operation);
		sc.close();
	}
}
