import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RepeaterDetector implements PatternDetector {
    private int repeatLength;

    public RepeaterDetector(int repeatLength) {
        this.repeatLength = repeatLength;
    }
    @Override
    public int detect(GenomeAnalyzer analyzer) {
        String sequenceToFind = "G".repeat(repeatLength);
        return analyzer.findSimpleSequence(sequenceToFind);
    }

    @Override
    public String labelString() {
        return "Repeater Detection (Repeat length: " + repeatLength + ")";
    }
}