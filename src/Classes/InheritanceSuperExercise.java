package Classes;


class Rectangle
{
    private int length;
    private int width;

    public Rectangle()
    {
        this(1, 1);
    }

    public Rectangle(int l, int w)
    {
        length = l;
        width = w;
    }

    public void draw()
    {
        for(int i=0; i < length; i++)
        {
            for(int j=0; j < width; j++)
                System.out.print("* ");
            System.out.println();
        }
        System.out.println();
    }

    public int area() {
        return length * width;
    }

}

class LongRectangle extends Rectangle {

    public LongRectangle() {
        super(1, 2);
    }

    public LongRectangle(int height) {
        super(height, height*2);
    }
}

class Square extends Rectangle {

    public Square() {
        super(1, 1);
    }

    public Square(int side_len) {
        super(side_len, side_len);
    }
}

public class InheritanceSuperExercise {
    public static void main(String[] args)
    {
        Rectangle r = new Rectangle(3,5);
        r.draw();
        // 4. Uncomment these to test
        Square s1 = new Square();
        s1.draw();
        Square s = new Square(3);
        s.draw();
        System.out.println(s.area());

        LongRectangle lr1 = new LongRectangle();
        lr1.draw();
        LongRectangle lr = new LongRectangle(3);
        lr.draw();
        System.out.println(lr.area());
    }
}
