/*
    @author Daniel Nelson
    @version v0 Initial 11/15/22
    Slapped together code that met the requirements so my grade doesn't suck as bad
 */
public class BareMinimum {
    public static void main(String[] args){
        spaceNeedle();
    }
    public static void spaceNeedle(){
        pole();
        top();
        bowl();
        pole();
        poleTwo();
        top();
    }
    public static void pole(){
        for (int i = 0; i < 4; i++) {
            System.out.print(" ".repeat(12));
            System.out.println("||");
        }
    }
    public static void top() {
        for(int i = 0; i<4;i++){
            System.out.print(" ".repeat(9-(i*3)));
            System.out.print("__/");
            System.out.print(":::".repeat(i));
            System.out.print("||");
            System.out.print(":::".repeat(i));
            System.out.println("\\__");
        }
        System.out.print("|");
        for(int i = 0;i<24;i++){
            System.out.print('"');
        }
        System.out.println("|");
    }
    public static void bowl(){
        for(int i = 0; i < 4; i++){
            System.out.print(" ".repeat(i*2));
            System.out.print("\\_");
            System.out.print("/\\".repeat(11-(2*i)));
            System.out.println("_/");
        }
    }
    public static void poleTwo(){
        for(int i = 0; i < 16; i++) {
            System.out.print(" ".repeat(9));
            System.out.print("|");
            System.out.print("%%");
            System.out.print("||");
            System.out.print("%%");
            System.out.println("|");
        }
    }
}
