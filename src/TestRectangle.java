import java.util.Scanner;

public class TestRectangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("nhap chieu dai:");
        double width = scanner.nextDouble();

        System.out.println("nhap chieu rong:");
        double height = scanner.nextDouble();

        Rectangle rectangle = new Rectangle(width, height);
        System.out.println("hien thi:" + rectangle.display());
        System.out.println("dien tich:" + rectangle.getArea());
        System.out.println("chu vi:" + rectangle.getPerimeter());

    }
}