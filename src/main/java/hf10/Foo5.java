package hf10;

public class Foo5 {
   /*
        int x = 12;

        public static void go(final int x) {
            System.out.println(x);
        }
    }*/
  /* static final int x = 12;

    public void go(final int x) {
        System.out.println(x);
    }
}*/
  /* static final int x = 12;

    public void go() {
        System.out.println(x);
    }
}*/
  /* static int x;

    public void go() {
        System.out.println(x);
    }
}*/
   /*static int x;

    public void go() {
        System.out.println(x);
    }
}*/

    //this code won't compile//
    //*final/*
  /* int x;
    public void go() {
        System.out.println(x);
    }
}*/
    //main method
    public static void main(String[] args) {
        int a = 4;
        int b = 1;
        while (a != b) {
            System.out.println(b);
            b = b + 1;
        }
    }
}
