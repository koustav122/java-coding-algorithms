
import java.util.*;
public class replace {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.nextLine();
        for(int i=0; i<N; i++) {
            String str = sc.nextLine();
            str = str.replace("pi", "3.14");
            System.out.println(str);
        }
    }
}