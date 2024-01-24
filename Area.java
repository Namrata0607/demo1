
class RectArea {
    float length;
    float breadth;

    void setDim() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length of rectangle:");
        length = sc.nextFloat();
        System.out.println("Enter breadth of rectangle:");
        breadth = sc.nextFloat();
    }
    void getArea() {
        float area = length * breadth;
        System.out.println("Area of rectangle: " + area);
    }
}
public class Area {
    public static void main(String args[]) {
        RectArea obj = new RectArea();
        obj.setDim();
        obj.getArea();
    }
}
