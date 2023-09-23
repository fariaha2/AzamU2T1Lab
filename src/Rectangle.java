public class Rectangle {
    private int length;
    private int width;
    public Rectangle(int len, int wid) {
        length = len;
        width = wid;
    }
    public void printArea() {
        int area = length * width;
        System.out.println("My area is " + area);
    }
    public void printPerimeter() {
        int perimeter = (2*length)+(2*width);
        System.out.println("My perimeter is " + perimeter);
    }
}
