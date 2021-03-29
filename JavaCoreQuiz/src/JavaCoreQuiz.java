import java.util.Scanner;

class JavaCore {
    public static void main(String[] args) {
        // 1.Hãy nói ra sự khác biệt giữa JDK và JRE?
        /*
         * JRE (môi trường thời gian chạy Java):
         *
         * Đây là một triển khai của Máy ảo Java * thực sự thực thi các chương trình
         * Java. Môi trường chạy thi hành Java là một trình cắm thêm cần thiết để chạy
         * các chương trình java. JRE nhỏ hơn JDK nên cần ít không gian đĩa hơn. Nó bao
         * gồm các thư viện JVM, Core và các thành phần bổ sung khác để chạy các ứng
         * dụng và tiểu dụng được viết bằng Java. JDK (Bộ phát triển Java)
         *
         * Nó là một gói phần mềm mà bạn có thể sử dụng để phát triển các ứng dụng dựa
         * trên Java. Bộ phát triển Java là cần thiết để phát triển các ứng dụng java.
         * JDK cần nhiều không gian đĩa hơn vì nó chứa JRE cùng với các công cụ phát
         * triển khác nhau. Nó bao gồm JRE, tập hợp các lớp API, trình biên dịch Java,
         * Webstart và các tệp bổ sung cần thiết để viết các ứng dụng và ứng dụng Java.
         */

        // 2. Java Virtual Machine là gì? có tác dụng gì?
        /*
         * JVM (Java Virtual Machine) là 1 máy ảo java – nó được dùng để thực thi các
         * chương trình Java hay hiểu nôm na là trình thông dịch của Java. Nó cung cấp
         * môi trường để code java có thể được thực thi. Chương trình Java khi biên dịch
         * sẽ tạo ra các mã máy gọi là bytecodes, mỗi hệ điều hành chạy chương
         * trình của nó ứng với một mã máy khác nhau.
         */

        // 3. Kết quả in ra màn hình
        // The local variable i may not have been initialized
        // Cần khởi tạo giá trị cho i

        // 4. So sánh 2 vòng lặp
        /*
         * Vòng lặp sử dụng biến i mặc dù dài hơn nhưng lại có thể kiểm soát theo từng
         * vị trí của các phần tử đồng thời vòng lặp sẽ chạy lần lượt thay vì ngẫu nhiên
         * các phần tử như foreach
         */
        // 5.Cho một mảng các số tự nhiên [1, 2, 0, 8, 5, 3, 9, 7] hãy viết hàm để dồn
        // tất cả số lẻ sang bên trái, số chẵn sang bên phải
        Scanner sc = new Scanner(System.in);
        int[] arr = {1, 2, 0, 8, 5, 3, 9, 7};
        System.out.print("Dãy số trước khi sắp xếp chẵn lẻ: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
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
        System.out.print("\nDãy số sau khi sắp xếp chẵn lẻ: ");
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

        try {
            System.out.println("\nNhập vào dãy số: ");
            String input = sc.next();
            int n = Integer.parseInt(input);
            String[] inputs = input.split("");
            while (inputs.length % 2 == 0) {
                System.out.println("Độ dài là chẵn, hãy nhập lại!");
                input = sc.next();
                inputs = input.split("");
            }

            int a = (int) inputs.length / 2;
            int result = Integer.parseInt(inputs[a]);
            for (int i = 1; i <= a; i++) {
                result = (result + Integer.parseInt(inputs[a - i])) * Integer.parseInt(inputs[a + i]);
            }
            System.out.println(result);
        } catch (Exception e) {
            System.out.println("Giá trị không hợp lệ!");
        }

        sc.close();

        /*
         * 7. Lỗi barcode có thể do các nguyên nhân:
         * - Do mạng chập chờn, ko tải hết nội dung hình ảnh
         * - Do trình duyệt lỗi plugin về hiển thị hình ảnh
         * Các bước để khảo sát lỗi:
         * 1. Tải lại trang web -> nếu hình ảnh hiển thị bình thường thì ko do kết nối mạng
         * 2. Cài đặt hoặc update phiên bản mới nhất trình duyệt -> nếu hình ảnh hiển thị bình thường thì ko do trình duyệt
         * 3. Nhờ bên CGV gửi lại email khác với nội dung tương tự để kiểm tra lại
         */
    }
}
