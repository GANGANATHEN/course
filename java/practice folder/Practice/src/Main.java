//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    int k = 10; //can't not print k value becase this varible is not a static
    static float g = 22.4f;

    static void add(){ // void you don't return any value
        System.out.println("normal return type");
    }
    static int a(){ //return type is int means you must return the integer
        System.out.println("must return int");
        return 1;
    }
    int b(){
        System.out.println("create object to print");
        return 0;
    }
    static void c(){
        System.out.println("print normal way");
    }
    float d(){ //typecaete
        System.out.println("type casting");
        return 0;
    }
    public static void main(String[] args) {
        int d = (int)new Main().d(); //type casting float to int
//        int b = new Main().b(); //single line object
//        System.out.println(b); // this is not compalsery to print single line object
//        Main q = new Main();
//        int b_1 = q.b();
//        System.out.println(b_1);
//        c();
        //        add();
//        System.out.println(g);
//        a();
    }
}