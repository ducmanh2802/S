import java.util.ArrayList;
import java.util.Scanner;

public class Bai2TongHaiSo {
    /*
     * 02: Tìm tổng hai số trong một mảng có giá trị gần nhất một số đã cho Nhập vào
     * một số N nguyên dương > 8 và < 14 Sinh ra một mảng gồm N phần tử là các số tự
     * nhiên ngẫu nhiên có giá trị từ -10 đến 10 In các phần tử mảng ra màn hình
     * Nhập vào một số X trong khoảng từ -10 đến 10 Hãy liệt kê tất cả các cặp 2 số
     * trong mảng có tổng gần với số X nhất. Hướng dẫn các làm bài này:
     *
     * Hãy viết thành các phương thức, mỗi phương thức chỉ tập trung làm một việc,
     * tham số hoá chứ không nên dùng biến toàn cục. Quy tắc Clean Code Có thể tạo
     * sẵn một mảng khoảng 10 phần tử để kiểm tra khi chạy cho dễ dàng.
     */
    ArrayList<Integer> arr = new ArrayList<>();

    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws Exception {

        Bai2TongHaiSo t = new Bai2TongHaiSo();
        t.input();
        t.display();
        t.tongGanNhat();
    }

    public void input() {
        try {
            System.out.println("Nhập vào N trong khoảng từ 8 đến 14");
            int n = sc.nextInt();
            while (n < 8 || n > 14) {
                System.out.println("Giá trị chưa đúng, vui lòng nhập lại!");
                n = sc.nextInt();
            }
            for (int i = 0; i < n; i++) {
                arr.add((int) (Math.random() * 21 - 10));
            }

        } catch (Exception e) {
            System.out.println("Giá trị nhập vào không hợp lệ!");
        }
    }

    public void display() {
        System.out.println("Mảng các phần tử:");
        for (int i = 0; i < arr.size(); i++) {
            System.out.print(arr.get(i) + " ");
        }
    }

    public void tongGanNhat() {
        System.out.println("\nNhập vào X trong khoảng tử -10 đến 10");
        int x = sc.nextInt();
        while (x < -10 || x > 10) {
            System.out.println("X là giá trị trong khỏang -10 đến 10, vui lòng nhập lại!");
            x = sc.nextInt();
        }
        int minSum = 100;// Gán 1 giá trị mặc định

//        
        //vòng lặp tìm tổng gần nhất
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if ((Math.abs(arr.get(i) + arr.get(j) - x)) < minSum && (Math.abs(arr.get(i) + arr.get(j) - x) != 0)) {
                    minSum = Math.abs(arr.get(i) + arr.get(j) - x);
                    System.out.println("minSum: "+minSum);

                }
            }
        }

        //hiển thị
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if ((Math.abs(arr.get(i) + arr.get(j) - x)) == minSum) {
                    System.out.println("Tổng 2 số gần " + x + " nhất tại vị trí " + i + " " + j + " là: " + arr.get(i)
                            + " " + arr.get(j));
                }
            }
        }
        sc.close();
    }
}
