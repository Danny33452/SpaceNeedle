/*
    @author Daniel Nelson
    @version v0 Initial 11/15/22
    Unfinished Code for the scalable space needle
 */
public class SpaceNeedle {
    public static void main(String[] args){
        final int SIZE = 7;
        top(SIZE);
    }
    public static void top(int size){
        for(int i = 0; i<size;i++) {
            System.out.print(" ".repeat(size*3));
            System.out.println("||");
        }
        for(int i = 0;i<size;i++) {
            if (i != size - 1) {
                System.out.print(" ".repeat((size * 3 - i * 3) - 3));
            }
            System.out.print("__/");
            System.out.print(":::".repeat(i));
            System.out.print("||");
            System.out.print(":::".repeat(i));
            System.out.println("\\__");
        }
        System.out.print("|");
        System.out.print("\"".repeat(6*size));
        System.out.println("|");
        // Size 4 """""""""""""""""""""""" 24
        // Size 3 """""""""""""""""" 18
        // Size 2 """""""""""" 12
        for(int i = 0;i<size;i++) {
            if (i>0) {
                System.out.print(" ".repeat(i*2));
            }
            System.out.print("\\_");
            if(i==size-1){
                System.out.print("/\\".repeat(size+1));
            }else{
                System.out.print("/\\".repeat((size + 1) * 3 - i*2));
            }
            System.out.println("_/");
            /*
             Size 2 /\/\/\
             Size 3 /\/\/\/\
             Size 4 /\/\/\/\/\
             Size 7 /\/\/\/\/\/\/\/\
            */
        }
    }
}
