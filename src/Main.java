import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner month = new Scanner(System.in);
        System.out.println("Nhập tháng bạn muốn tính : ");
        int Month = month.nextInt();
        switch (Month){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("Tháng "+Month + "có : 31 ngày");
                break;
            case 2:
                System.out.println("Tháng "+Month + "có : 28 hoặc 29 ngày");
                break;
            default:
                System.out.println("Tháng "+Month + "có : 30 ngày");
        }

    }
}