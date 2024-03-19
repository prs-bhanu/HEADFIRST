package hf9;
//multiple classes are added in same proram

import java.util.ArrayList;

public class V2Radiator {
    public V2Radiator(ArrayList<SimUnit> lglist) {
    }

    public static class SimUnit {

        public SimUnit(String v3Radiator) {

        }

        public static void main(String[] args) {

        }

        void V2Radiator(ArrayList<SimUnit> list) {
            for (int x = 0; x < 5; x++) {
                list.add(new SimUnit("V2Radiator"));
            }
        }
    }

    class V3Radiator extends V2Radiator {
        V3Radiator(ArrayList<SimUnit> lglist) {
            super(lglist);
            for (int g = 0; g < 10; g++) {
                lglist.add(new SimUnit("V3Radiator"));
            }
        }
    }

    class RetentionBot {
        RetentionBot(ArrayList<SimUnit> rlist) {
            rlist.add(new SimUnit("Retention"));
        }

    }
}


