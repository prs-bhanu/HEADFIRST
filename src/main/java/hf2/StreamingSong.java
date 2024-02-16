package hf2;
public class StreamingSong {
        String title;
        String artist;
        int duration;
        void play() {
            System.out.println("Playing song");
        }
        void printDetails() {
            System.out.println("This is " + title + " by " + artist);
        }
    }
    //test code//
    class StreamingSongTestDrive {
    // main method //
    public static void main(String[] args) {
            StreamingSong song=new StreamingSong();
            song.artist = "The Beatles";
            song.title = "Come Together";
            // method calling is done//
            song.play();
            song.printDetails();
        }
    }




