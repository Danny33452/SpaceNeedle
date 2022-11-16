public class LoopsTest {
    public static void main(String[] args){
        for(int line = 0; line<4;line++){
            System.out.print(" ".repeat(line*2));
            System.out.print("\\_");
            System.out.print("/\\".repeat(11-2*line));
            System.out.println("_/");
        }

    }
}
