package CS5103;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Unit tests for GrepLine feature to find matching lines of a keyword.
 */
public class GrepLineTest {
    private GrepLine grepLine;

    @Before
    public void setup() {
        grepLine = new GrepLine();
    }

    @Test
    public void testBasic() {
        List<String> inputList = new ArrayList<>();
        inputList.add("hello there how are you");
        inputList.add("hello to you as well");
        inputList.add("bye now");

        List<String> matchedLines = grepLine.getMatchedLines(inputList, "hello");
        Assert.assertEquals(2, matchedLines.size());
        Assert.assertEquals("hello there how are you", matchedLines.get(0));
    }

    @Test
    public void tesNoMatch() {
        List<String> inputList = new ArrayList<>();
        inputList.add("hello there how are you");
        inputList.add("hello to you as well");
        inputList.add("bye now");

        List<String> matchedLines = grepLine.getMatchedLines(inputList, "something");
        Assert.assertEquals(0, matchedLines.size());
    }
}
