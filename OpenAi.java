import java.net.HttpURLConnection;
import java.net.URL;

public class OpenAi {
    public static String ChatPT(String text) {
        String url = "https://api.openai.com/v1/chat/completions";
        String apiKey = "YOUR API KEY HERE";
        String model = "gpt-3.5-turbo";

        try{
            URL obj = new URL(url);
            HttpURLConnection con = (HttpURLConnection) obj.openConnection();
            con.setRequestMethod("POST");
        }
    }
}
