import java.util.Scanner;
public class Main {
        public static void main(String[] args){
                Scanner sc = new Scanner(System.in);
                // 整数の入力
                int a = sc.nextInt();
                int b = sc.nextInt();
                int c = sc.nextInt();
                int x = sc.nextInt();
                int method = 0;
                // 整数xを入力硬貨枚数で表せるかの検査
                for(int i = 0; i <= a; i++) {
                	for(int j = 0; j <= b; j++) {
                		for(int k = 0; k <= c; k++) {
                			if(500 * i + 100 * j + 50 * k == x) {
                				method++;
                			}
                		}
                	}
                }
                // 結果出力
                System.out.println(method);
                sc.close();
        }
}
