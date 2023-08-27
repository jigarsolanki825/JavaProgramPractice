package ErrorEx;

import java.util.ArrayList;
import java.util.List;

public class OutOfMemErrEx {

        public static void main(String[] args) {
            List<Integer> list = new ArrayList<>();
            while (true) {
                list.add(1);
                System.out.println(list);
            }
        }

}
