import java.util.ArrayList;

public class Divider {
    public static void main(String[] args) {
        long input = 12700L;
        ArrayList<Long> list = new ArrayList<>();
        while(input>2000) {
            input = input-2000;
            list.add(2000L);
        }
        list.add(input);
        System.out.println(list);
    }
}
