import java.util.Scanner;

public class diamondStarPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int str_count = 1;
        int sp_count = N;
        for (int i=0; i<N; i++){
            for (int sp =0; sp<sp_count; sp++)
                System.out.print(" ");
            for(int j=0; j<str_count; j++)
                System.out.print("*");
            System.out.println(""); 
            str_count += 2;
            sp_count -= 1;
        }
        for (int i=0; i<N-1; i++){
            for (int sp =0; sp<sp_count+2; sp++)
                System.out.print(" ");
            for(int j=0; j<str_count-4; j++)
                System.out.print("*");
            System.out.println(""); 
            str_count -= 2;
            sp_count += 1;
        }
    }
}
