package CS5103;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
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


        System.out.println("Output lines with keyword " + keyword + " are:");
        System.out.println();
        List<String> matchedLines = getMatchedLines(lines, keyword);
        System.out.println(matchedLines);
    }

    public List<String> getMatchedLines(final List<String> inputList, final String keyword) {
        List<String> output = new ArrayList<>();
        for (String line : inputList) {
            String[] s = line.split(" ");
            for (String words : s) {
                if (words.matches("\\b" + keyword + "\\b")) {
                    output.add(line);
                    break;
                }
            }
        }

        return output;
    }
}
