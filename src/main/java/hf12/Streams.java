package hf12;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Streams {
    public static void main (String[]args){

    }
     public List<Stream> getStreams(){

                 List<String>strings =List.of("I","am", "a", "list","of","strings");
                 List<String>result = strings.stream()
                         .sorted((s1,s2)-> s1.compareToIgnoreCase(s2))
                         .skip(2)
                         .limit(4)
                         .collect(Collectors.toList());
         return null;
     }
}