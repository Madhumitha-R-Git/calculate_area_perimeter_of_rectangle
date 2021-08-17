public class Rectangle {
    int length;
    int breadth;

    public Rectangle(int length,int breadth)
    {
        this.length = length;
        this.breadth = breadth;
    }

    int area()
    {
        return length * breadth;
    }

    int perimeter()
    {
        return 2*(length+breadth);
    }


}
