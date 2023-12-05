import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GastroDiseaseDetector implements PatternDetector {
    @Override
    public int detect(GenomeAnalyzer analyzer) {
        String buffer = analyzer.getBuffer();
        for (int i = 0; i < buffer.length() - 2; i++) {
            if (buffer.charAt(i) == 'G' && buffer.charAt(i + 1) == 'T' && buffer.charAt(i + 2) == 'G') {
                return i;
            }
        }
        return -1;
    }

    @Override
    public String labelString() {
        return "Gastro Disease Detection";
    }
}