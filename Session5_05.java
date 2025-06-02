public class Session5_05 {
    public static void main(String[] args) {
        int N = 100000; //100.000 lần ghép chữ
        String appendText = " World";

        //String
        String str = "Hello";
        long start1 = System.currentTimeMillis();
        for (int i = 0; i < N; i++) {
            str += appendText;
        }
        long end1 = System.currentTimeMillis();
        System.out.println("Thời gian với String: " + (end1 - start1) + " ms");

        //StringBuilder
        StringBuilder sb = new StringBuilder("Hello");
        long start2 = System.currentTimeMillis();
        for (int i = 0; i < N; i++) {
            sb.append(" World");
        }
        long end2 = System.currentTimeMillis();
        System.out.println("Thời gian với StringBuilder: " + (end2 - start2) + " ms");

        //StringBuffer
        StringBuffer sbf = new StringBuffer("Hello");
        long start3 = System.currentTimeMillis();
        for (int i = 0; i < N; i++) {
            sbf.append(" World");
        }
        long end3 = System.currentTimeMillis();
        System.out.println("Thời gian với StringBuffer: " + (end3 - start3) + " ms");

        //Nhận xét
        System.out.println("________NHẬN XÉT_______");
        System.out.println(" - String: Không hiệu quả cho phép nối chuỗi nhiều lần do tạo ra nhiều đối tượng mới.");
        System.out.println(" - StringBuilder: Hiệu quả và nhanh chóng, thích hợp cho nhiều thao tác nối chuỗi trong một luồng.");
        System.out.println(" - StringBuffer: Tương tự như StringBuilder nhưng an toàn với đa luồng nhưng có thể chậm đôi chút do đồng bộ hóa.");
    }
}
