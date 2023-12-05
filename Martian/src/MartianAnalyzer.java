public class MartianAnalyzer {
    public static void main(String[] args) {
        // Create a GenomeSeriesAnalyzer with the input file
        GenomeSeriesAnalyzer analyzer = new GenomeSeriesAnalyzer("martian.txt");

        // Add detectors for Genius, Gastro Disease, and Repeater
        analyzer.addDetector(new GeniusDetector());
        analyzer.addDetector(new GastroDiseaseDetector());
        analyzer.addDetector(new RepeaterDetector(5));

        // Run the tests
        analyzer.run();
    }
}