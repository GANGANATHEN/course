
public class Inheritance extends Aa{
    public static void main(String[] args){
        System.out.println("Inheritance");
        Inheritance i = new Inheritance();
        i.a1();
        i.a2();
        i.a3(12,'h');
    }
}
class Aa extends Ab{
    int a1(){
        System.out.println("Aa");
        return 0;
    }
}
class Ab extends Ac{
    void a2(){
        System.out.println("Ab");
    }
}
class Ac{
    void a3(int z,char y){
        int k = z;
        char l = y;
        int c =(int)32.5f;
        System.out.println(c);
        System.out.println(k);
        System.out.println(l);
//        System.out.println(z);
//        System.out.println(y);
        System.out.println("Ac");
    }
}