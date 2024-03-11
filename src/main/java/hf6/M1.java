package hf6;

public class M1{
        int ivar = 7;

        void m1() {
            System.out.println("A's  m1, ");
        }

        void m2() {
            System.out.println("A's m2,");
        }

        void m3() {
            System.out.println("A's m3, ");
        }
    }

    class N1 extends M1 {
        @Override
        void m1() {
            System.out.println("B's m1, ");
        }

    }

    class N2 extends N1 {
        void m3() {
            System.out.println("C's m3 " + (ivar + 6));
        }
    }

     class Mixed2 {

        public static void main(String[] args) {
            M1 a = new M1();
            N1 b = new N1();
            N2 c = new N2();
            M1 a2 = new N2();
            b.m1();
            c.m2();
            a.m3();
        }
    }






