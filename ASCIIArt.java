
import java.util.Arrays;

import static java.lang.System.out;

public class ASCIIArt {
    public static void main(String[] args){
        art();
    }
    public static void art(){
        for (String s : Arrays.asList("   _____           _                              _                _       _    ___ _ _    _      _ _        __          __        _     _ _ _ ___", "  / ____|         | |                            | |              (_)     | |  / ( | ) |  | |    | | |       \\ \\        / /       | |   | | ( | ) \\", " | (___  _   _ ___| |_ ___ _ __ ___    ___  _   _| |_   _ __  _ __ _ _ __ | |_| | V V| |__| | ___| | | ___    \\ \\  /\\  / /__  _ __| | __| | |V V | |", "  \\___ \\| | | / __| __/ _ \\ '_ ` _ \\  / _ \\| | | | __| | '_ \\| '__| | '_ \\| __| |    |  __  |/ _ \\ | |/ _ \\    \\ \\/  \\/ / _ \\| '__| |/ _` | |    | |", "  ____) | |_| \\__ \\ ||  __/ | | | | || (_) | |_| | |_ _| |_) | |  | | | | | |_| |    | |  | |  __/ | | (_) |    \\  /\\  / (_) | |  | | (_| |_|    | |", " |_____/ \\__, |___/\\__\\___|_| |_| |_(_)___/ \\__,_|\\__(_) .__/|_|  |_|_| |_|\\__| |    |_|  |_|\\___|_|_|\\___/      \\/  \\/ \\___/|_|  |_|\\__,_(_)    | |", "          __/ |                                        | |                     \\_\\                                                              /_/", "         |___/                                         |_|")) {
            out.println(s);
        }
    }
}
/*


   _____           _                              _                _       _    ___ _ _    _      _ _        __          __        _     _ _ _ ___
  / ____|         | |                            | |              (_)     | |  / ( | ) |  | |    | | |       \ \        / /       | |   | | ( | ) \
 | (___  _   _ ___| |_ ___ _ __ ___    ___  _   _| |_   _ __  _ __ _ _ __ | |_| | V V| |__| | ___| | | ___    \ \  /\  / /__  _ __| | __| | |V V | |
  \___ \| | | / __| __/ _ \ '_ ` _ \  / _ \| | | | __| | '_ \| '__| | '_ \| __| |    |  __  |/ _ \ | |/ _ \    \ \/  \/ / _ \| '__| |/ _` | |    | |
  ____) | |_| \__ \ ||  __/ | | | | || (_) | |_| | |_ _| |_) | |  | | | | | |_| |    | |  | |  __/ | | (_) |    \  /\  / (_) | |  | | (_| |_|    | |
 |_____/ \__, |___/\__\___|_| |_| |_(_)___/ \__,_|\__(_) .__/|_|  |_|_| |_|\__| |    |_|  |_|\___|_|_|\___/      \/  \/ \___/|_|  |_|\__,_(_)    | |
          __/ |                                        | |                     \_\                                                              /_/
         |___/                                         |_|


 */
