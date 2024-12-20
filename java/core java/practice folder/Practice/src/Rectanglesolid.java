public class Rectanglesolid extends Shape{
    private int f;
    Rectanglesolid(int l,int b, int f){
        super(l,b);
        this.f=f;
        System.out.println(f);
    }
    public static void main(String[] args){
        Rectanglesolid rs = new Rectanglesolid(20,30,17);
        rs.g();
    }
}
