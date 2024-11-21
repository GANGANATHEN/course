//--------- normal constructor ----------
//public class Constructor {
//    Constructor(int a,int b){
//        int c = a+b;
//        System.out.println(c);
//    }
//    public static void main(String[] args){
//        System.out.println("Hello god");
//        Constructor c = new Constructor(2,8);
//    }
//}

// ------ super() method using constructor

class Super{
   public Super(){
       super();
        System.out.println("hello");
    }
}
public class Constructor extends Super{
    Constructor(int a,int b){
        super();
        int c = a+b;
        System.out.println(c);
    }
    public static void main(String[] args){
        System.out.println("Hello god");
        Constructor c = new Constructor(2,8);
    }
}