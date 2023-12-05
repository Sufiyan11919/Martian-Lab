import java.util.ArrayList;

public class GenomeSeriesAnalyzer extends GenomeAnalyzer {
    private ArrayList<PatternDetector> detectors = new ArrayList<>();

    /**
     * just get the input
     *
     * @param fileName
     */
    public GenomeSeriesAnalyzer(String fileName) {
        super(fileName);
    }

    public void addDetector(PatternDetector detector) {
        detectors.add(detector);
    }

    public void run() {
        for (PatternDetector detector : detectors) {
            int index = detector.detect(this);
            System.out.println(detector.labelString() + " detected at index: " + index);
            if (index != -1) {
                String additionalInfo = detector.additionalInfo();
                if (!additionalInfo.isEmpty()) {
                    System.out.println("Additional Info: " + additionalInfo);
                }
            }
        }
    }

}