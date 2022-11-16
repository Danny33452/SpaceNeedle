import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        int i = 0;
        Scanner prompt = new Scanner(System.in);
        System.out.println("This is as far as i got with the scalable space needle");
        SpaceNeedle.top(7);
        System.out.println("Tell me when to continue (Press enter to continue)");
        String answer = prompt.nextLine();
        while(i<25){
            System.out.println(" ");
            i++;
        }
        BareMinimum.spaceNeedle();
    }
}
