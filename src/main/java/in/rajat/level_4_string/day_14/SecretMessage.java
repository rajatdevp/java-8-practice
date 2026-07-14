package in.rajat.level_4_string.day_14;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.util.HashMap;
import java.util.Map;

public class SecretMessage {

    public static void decodeSecretMessage(String url) throws Exception {

        Document doc = Jsoup.connect(url).get();

        Elements rows = doc.select("table tr");

        Map<String, Character> grid = new HashMap<>();

        int maxX = 0;
        int maxY = 0;

        // Skip header row
        for (int i = 1; i < rows.size(); i++) {

            Elements cols = rows.get(i).select("td");

            if (cols.size() != 3)
                continue;

            int x = Integer.parseInt(cols.get(0).text().trim());
            char ch = cols.get(1).text().charAt(0);
            int y = Integer.parseInt(cols.get(2).text().trim());

            grid.put(x + "," + y, ch);

            maxX = Math.max(maxX, x);
            maxY = Math.max(maxY, y);
        }

        for (int y = 0; y <= maxY; y++) {

            StringBuilder sb = new StringBuilder();

            for (int x = 0; x <= maxX; x++) {
                sb.append(grid.getOrDefault(x + "," + y, ' '));
            }

            System.out.println(sb);
        }
    }

    public static void main(String[] args) throws Exception {

        decodeSecretMessage(
                "https://docs.google.com/document/d/e/2PACX-1vSvM5gDlNvt7npYHhp_XfsJvuntUhq184By5xO_pA4b_gCWeXb6dM6ZxwN8rE6S4ghUsCj2VKR21oEP/pub"
        );

    }
}