import java.util.*;

import jdk.nashorn.internal.parser.Scanner;

public class JavaCore {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 5.Cho một mảng các số tự nhiên [1, 2, 0, 8, 5, 3, 9, 7] hãy viết hàm để dồn
        // tất cả số lẻ sang bên trái, số chẵn sang bên phải
        int[] arr = { 1, 2, 0, 8, 5, 3, 9, 7 };
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                for (int j = arr.length - 1; j >= 0; j--) {
                    if (arr[j] % 2 != 0 && i < j) {
                        int temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                    }
                }
            }

        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        /*
         * 6.Cho một dãy có số lượng các chữ số là lẻ 2N + 1, ví dụ "123", "32567" hãy
         * viết hàm lấy chữ số ở chính giữa, cộng với số bên trái, rồi nhân với số bên
         * phải, tiếp tục cho đến hết dãy số. "123" -> (2 + 1) * 3 "32567" -> ((5 + 2) *
         * 6 + 3) * 7
         * 
         */
        String input = sc.next();
        try {
            int n = Integer.parseInt(input);
            String[] inputs = input.split("");
            while (inputs.length % 2 != 0) {
                System.out.println("Độ dài là lẻ, hãy nhập lại!");
                input = sc.next();
            }
            System.out.println();
        } catch (Exception e) {
            System.out.println("Giá trị không hợp lệ!");
        }
        sc.close();
    }
}
