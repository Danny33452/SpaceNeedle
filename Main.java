import java.util.Objects;
import java.util.Scanner;
import static java.lang.System.out;
public class Main {
    public static void main(String[] args){
        int i = 0;
        Scanner prompt = new Scanner(System.in);
        out.println("This is as far as i got with the scalable space needle");
        SpaceNeedle.top(7);
        out.println("Tell me when to continue (Press enter to continue)");
        String answerOne = prompt.nextLine();
        while(i<25){
            out.println(" ");
            i++;
        }
        BareMinimum.spaceNeedle();
        out.println("Do you wanna see my ASCII Art?: ");
        String answerTwo = prompt.nextLine();
        if(Objects.equals(answerTwo, "yes")){
            ASCIIArt.art();
        }
    }
}
