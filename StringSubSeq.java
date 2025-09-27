import java.util.ArrayList;

public class StringSubSeq {
    public static void main(String[] args) {
        String str = "ABCD";
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i); // A , B , C
            if (list.isEmpty()) {
                list.add("");
                list.add(ch + "");
                continue;
            }
            int listSize = list.size();
            for (int j = 0; j < listSize; j++) {
                String temp = list.get(j) + ch;
                list.add(temp);
            }
        }
        System.out.println(list);
    }
}