package hf7;

public class Rowboat extends Boat {
    public void rowTheBoat(){
        System.out.println("stroke natasha");
    }
}
public class Boat{
    private int length;
    public void setLength( int len){
        length = len;

    }
    public int getLength(){
        return length;
    }
    public void move(){
        System.out.println("drift");
    }
}
public class TestBoats{
    public static  void main (Srting[] args){
        Boat b1 =new Boat();
        SailBoat b2=new Boat();
        RowBoat b3 = new Rowboat();
        b2.setLength(32);
        b1.move();
        b2.move();
        b3.move();
    }
}
public class sailboat extends Boat{
    public void move(){
        System.out.println(("hoist sail"));
    }
}

