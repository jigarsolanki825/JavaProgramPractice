package StringExamples;

public class StringEx {

        public static void main(String[] args) {
            String str = "JigarSolanki";
            String str1 = "Rajput";
            System.out.println(str.length());
            System.out.println(str.substring(3));
            System.out.println(str.concat(str1));

            System.out.println("String comparison:  "+str.compareTo(str1));

            char[] chars = str.toCharArray();
            for (int i=0;i<chars.length;i++) {

                System.out.print(chars[i]+",");
            }

            System.out.println();
            StringBuilder sb = new StringBuilder(str);
            System.out.println(sb.reverse());



        }

    }
