import java.util.*;
public class Main {
	public static void main(String[] args) {
		int trout = 0;
		Scanner sc = new Scanner(System.in);
		// 文字列の標準入力
		String s = sc.next();
		// 1文字ずつ加算
		for(int i = 0; i < s.length(); i++) {
			trout += Character.getNumericValue(s.charAt(i));
		}
		// 結果出力
		System.out.println(trout);
	}
}
