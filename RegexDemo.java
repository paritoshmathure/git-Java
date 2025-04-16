import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("coding",Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher("I love codinG") ;
        boolean matchfound = matcher.find();

        if(matchfound){
            System.out.println("Word found");
        }else{
            System.out.println("Word not found");
        }
    }
}
