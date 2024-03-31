import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //long long int = 8
        //long long long int = 12
        //long long long long int= 16

        //입력받는수가 4의배수면 기본적으로 뒤에 int 붙음
        /*            String def = "=int";*/

        //결과 문자열인 result (자료형 이름)
        String result;

        Scanner sc = new Scanner(System.in);

        //입력받는 수 
        int N = sc.nextInt()/4;

        //long을 몇 번 써야 하는지.

        //8이면 2번 써야 하므로 N/4


        for (int i = 0; i < N; i++) {
            System.out.print("long ");
        }
        System.out.print("int");

    }
}