package CS5103;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

/**
 * Program to perform grepline.
 */
public class GrepLine {
    public void execute() throws IOException {
        //Taking the text file as Input
        List<String> lines = Files.readAllLines(Paths.get("./Inputfile"));

        Scanner sc = new Scanner(System.in);
        //Taking keyword as Input from user
        System.out.println("Enter a keyword: ");
        String keyword = sc.nextLine();


        System.out.println("Output lines with keyword "+keyword+ " are:");
        System.out.println();
        for(String line:lines){
            String[] s = line.split(" ");
            for(String words:s){
                if(words.matches("\\b"+keyword+"\\b")) {
                    System.out.println(line);
                    break;
                }
            }
        }

    }

    /**
     * Replaces all the occurrences of the string represented by "source" with "target"
     * in the input string.
     *
     * @param input input string.
     * @param source word to be replaced.
     * @param target word to be replaced with.
     * @return a new string with all the replacements of source with target.
     */

}
