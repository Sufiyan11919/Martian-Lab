public class MartianAnalyzerLab9 {
    public static void main(String[] args) {
        GenomeSeriesAnalyzerLab9 gSequencer = new GenomeSeriesAnalyzerLab9("martian_genomes.txt");
        GeniusDetectorLab9 geniusDetector = new GeniusDetectorLab9();
        GastroDiseaseDetectorLab9 gastroDiseaseDetector = new GastroDiseaseDetectorLab9();
        RepeaterDetectorLab9 repeaterDetector = new RepeaterDetectorLab9("G");

        gSequencer.addDetector(geniusDetector);
        gSequencer.addDetector(gastroDiseaseDetector);
        gSequencer.addDetector(repeaterDetector);

        gSequencer.run();
    }
}