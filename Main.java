import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str;
        System.out.print("Nhập vào chuỗi bất kỳ: ");
        str = sc.nextLine();
        char kyTu = 'a';
        int count = 0;
        try {
            System.out.println("Nhập ký tự cần đếm: ");
            kyTu = (char) System.in.read();
        } catch(Exception e) {
            System.out.println("Nhập lỗi!");
        }
        for(int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == kyTu) {
                count++;
            }
        }
        System.out.println("Số lần xuất hiện của ký tự " + kyTu + " trong chuỗi " + str + " là: " +count);
    }
}
