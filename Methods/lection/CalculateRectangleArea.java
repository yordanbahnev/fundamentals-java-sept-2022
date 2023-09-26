package Methods.lection;

import java.util.Scanner;

public class CalculateRectangleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputWidth = Integer.parseInt(scanner.nextLine());
        int inputHeight = Integer.parseInt(scanner.nextLine());
        int rectangleArea = calculateArea(inputWidth, inputHeight);
        System.out.println(rectangleArea);
    }
    public static int calculateArea(int width, int height) {
        return width * height;
    }
}
