import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GeniusDetector implements PatternDetector {
    @Override
    public int detect(GenomeAnalyzer analyzer) {
        return analyzer.findSimpleSequence("GAGA");
    }

    @Override
    public String labelString() {
        return "Genius Detection";
    }
}