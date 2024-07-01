import Shapes.*;
class ShapeImplement {
    public static void main(String arg[]){
        System.out.println("PROGRAM TO IMPLEMENT CLASSE OF SHAPES PACKAGE-");
        // Creating an object of Square class
        Square sq = new Square();
        sq.area(5.0f);
        sq.peri(6.0f);

        // Creating an object of Rectangle class
        Rectangle rect = new Rectangle();
        rect.area(5.0f,6.0f);
        rect.peri(6.0f,7.0f);
        
        // Creating an object of RightTriangle class
        RightTriangle rt = new RightTriangle();
        rt.area(5.0f,6.0f);
        rt.peri(6.0f,8.0f);

    }
}