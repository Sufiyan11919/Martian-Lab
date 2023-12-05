import java.util.ArrayList;

public interface PatternDetector {
    //int detect(GenomeAnalyzer analyzer);
    int detect(GenomeAnalyzer analyzer);
    String labelString();
    default String additionalInfo() {
        return "";
    }
}