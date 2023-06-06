package practices.day28_practices;

public class Square {


    private double side;

    public Square(double side) {
      setSide(side);
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        if(side<=0){
            System.err.println(side+" is invalid side number");
        }
        this.side = side;
    }

    public double calcArea(){
        return side *side;
    }

    public double calcPerimeter(){
        return side *4;
    }


    public String toString() {
        return "Square{" +
                "side=" + side+"\t"+
                "area=" + calcArea()+"\t"+
                "perimeter=" + calcPerimeter()+
                '}';
    }
}
