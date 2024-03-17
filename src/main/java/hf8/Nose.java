package hf8;

public class Nose {
    public static void main(String[] args) {
        abstract class myNose {
            public abstract int iMethod();
        }
        abstract class Picasso extends myNose {
            public int iMethod() {
                return 7;
            }
        }
        class Clowns extends Picasso {
        }
        class Acts extends Picasso {
            public int iMethod() {
                return 5;
            }
        }
        class Of76 extends Clowns {
            public void main(String[] args) {
                myNose[] i = new myNose[3];
                i[0] = new Acts();
                i[1] = new Clowns();
                i[2] = new Of76();
                for (int x = 0; x < 3; x++) {
                    System.out.println(i[x].iMethod() + " " + i[x].getClass());
                }
            }
        }
    }
}
