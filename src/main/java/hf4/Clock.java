package hf4;
public class Clock {
    /* instance variable time is decleared */
    String time;
    /* getters and setters are used to set the values */
    void setTime(String t) {
        time = t;
    }
    String getTime() {
        return time;
    }
}
class ClockTestDrive {
    /* main method is decleared (main method can be decleared only once but as only one main method)*/
    public static void main(String[] args) {
        /* object is created*/
        Clock c = new Clock();
        /* getters and setters method are called */
        c.setTime("0953");
        String tod = c.getTime();

        System.out.println("time: "+tod);
    }

}


