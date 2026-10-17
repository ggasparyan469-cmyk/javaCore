package newjavacourse;

public class While {
        public static void main(String args[]) {
            int n = 10;

            while (n > 0) {
                System.out.println("տակտ " + n);
                n--;
            }
            System.out.println();
          int i,j;
            i=100;
            j=200;

            while(++i < --i);
            System.out.println("Միջին արժեքը հավասար է " + i);
        }
    }
