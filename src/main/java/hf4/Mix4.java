package hf4;

public class Mix4 {
    /* instance variable is decleared */
    int counter =0;
    /* main method */
    public static void main (String[] args) {
        int count = 0;
        /* created an array of an object size */
        Mix4[] mixes = new Mix4[20];
        int i = 0;
        /* while loop */
        while (i < 9) {
            mixes[i] = new Mix4();
            mixes[i].counter = mixes[i].counter + 1;
            count = count + 1;
            count = count + mixes[i].maybeNew(i);
            i = i + 1;
        }
        System.out.println(count + " " + mixes[1].counter);
    }
    public int maybeNew(int index){
        if(index<5){
            Mix4 mix = new Mix4();
            mix.counter = mix.counter  +  1 ;
            return 1;
        }
        return 0;
    }
}
