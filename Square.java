public class Square extends Shape{
    private double side;

    public Square(){}

    public Square(double side){
        this.side = side;
    }

    public Square(double side,String color, boolean filled){
        super(color,filled);
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }
    public double getArea(){
        return side*side;
    }
    @Override
    public String toString() {
        return "Square " +
                "side=" + side + super.toString()
                + ", Area = " +getArea()+ "\n";
    }

    @Override
    public void resize(double percent) {
        side*=(percent/200);
    }
}
