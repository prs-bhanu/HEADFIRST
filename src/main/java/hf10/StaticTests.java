package hf10;

 class Super {
        static {
            System.out.println("super static block");
        }
        void StaticSuper () {
            System.out.println("super constructor");
        }
    }
    public class StaticTests extends Super {
        static int rand;
        static {
            rand = (int) (Math.random() * 6);
            System.out.println("static block " + rand);
        }
        StaticTests() {
            System.out.println("constructor");
        }
        public static void main(String[] args) {
            System.out.println("in main");
            StaticTests st = new StaticTests();
        }
    }

