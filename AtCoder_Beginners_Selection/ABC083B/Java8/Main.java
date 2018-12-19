import java.util.Scanner;
public class Main {
        public static void main(String[] args){
                Scanner sc = new Scanner(System.in);
                // 整数の入力
                int n = sc.nextInt();
                int a = sc.nextInt();
                int b = sc.nextInt();
                // 総和
                int sum = 0;
                // 1からnまでの処理
                for(int i = 1; i <= n; i++) {
                    int temp = i;
                    int digits = 0;
                    // iの各桁の和を求める
                	for(int j = 0; j < String.valueOf(i).length(); j++) {
                		digits += temp % 10;
                		temp /= 10;
                	}
                	// 条件を満たすiを加算
                	if(a <= digits && digits <= b) {
                		sum += i;
                	}
                }
                // 結果出力
                System.out.println(sum);
                sc.close();
        }
}
