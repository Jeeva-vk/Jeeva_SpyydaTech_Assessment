import java.util.*;

public class URLShortener {

    static HashMap<String, String> codeToUrl = new HashMap<>();
    static HashMap<String, String> urlToCode = new HashMap<>();
    static Random rnd = new Random();

    static final String chars = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
    static final int CODE_LEN = 6;

    public static String generateCode() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < CODE_LEN; i++) {
            sb.append(chars.charAt(rnd.nextInt(chars.length())));
        }
        return sb.toString();
    }

    public static String shorten(String url) {
        if (urlToCode.containsKey(url)) return urlToCode.get(url);

        String code;
        do {
            code = generateCode();
        } while (codeToUrl.containsKey(code));

        codeToUrl.put(code, url);
        urlToCode.put(url, code);

        return code;
    }

    public static String redirect(String code) {
        return codeToUrl.getOrDefault(code, null);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter URL:");
        String url = sc.nextLine();

        String code = shorten(url);
        System.out.println("Short Code: " + code);
        System.out.println("Redirect: " + redirect(code));
    }
}
