package hf12;

import java.util.List;

public class mixForLoops {
    public static void main(String[] args) {

        String output = "";
        List<Integer> nums = List.of(1, 2, 3, 4, 5, 6);

        /* we will be getting different out puts as we un comment them and run*/

        for (int i=1 ; i<nums.size();i++)
        output +=nums.get(i) +"";


       // for (int i=0 ; i<nums.size();i++)
            //output +=nums.get(i) +"";



        //for (int i=1 ; i<=nums.length();i++)
        //output+=nums.get(i) +""; /compilation error

        //for (Integer num : nums) {
            //output += nums + "";
            System.out.println(output);


        }
    }


