import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //구매한 물건의 가격과 개수로 계산한 총 금액이 영수증에 적힌 총 금액과 일치하는지.
         /*  첫째 줄에는 영수증에 적힌 총 금액 X
        둘째 줄에는 영수증에 적힌 구매한 물건의 종류의 수 N
        이후 N개의 줄에는 각 물건의 가격 a와 개수 b가 공백을 사이에 두고 주어진다.*/

        Scanner sc = new Scanner(System.in);

        int X = Integer.parseInt(sc.nextLine()); //총 금액
        int N = Integer.parseInt(sc.nextLine()); //물건 종류의 수
        int sum = 0; // 총합
        //a,b 받는 줄을 물건 종류 수인 N만큼 반복해야 함
        for (int i = 0; i < N; i++) {
            int price = Integer.parseInt(sc.next());    //가격
            int qty = Integer.parseInt(sc.next());        //수량
            //총합은 가격 X 수량
            sum += (price * qty);
        }
        //삼항 연산자를 사용하여 if문을 스킵 그 값을 result로 담음
        // Result와 sum이 같으면 Yes 아니면 No
        String result = sum == X ? "Yes" : "No";
        //결과 값 출력
        System.out.println(result);
    }
}

