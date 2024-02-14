package hf2;
public class Episode {
    // declaring parameters //
        int seriesNumber;
        int episodeNumber;
        void play(){
            System.out.println("playing episode " + episodeNumber);
        }
        void skipIntro() {
            System.out.println("Skipping intro...");
        }
        void skipToNext() {
            System.out.println("Loading next episode...");
        }
    }
    // test code  by  calling parameters //
    class EpisodeTestDrive {
        public static void main(String[] args) {
            Episode episode = new Episode();
            episode.seriesNumber = 4;
            episode.play();
            episode.skipIntro();
        }
    }