public class GastroDiseaseDetectorLab9 extends PatternDetectorLab9 {
    @Override
    public int detect(String buffer) {
        int startIndex = buffer.indexOf("G");
        if (startIndex == -1) {
            return -1;
        }

        int endIndex = buffer.indexOf("G", startIndex + 1);
        if (endIndex == -1) {
            return -1;
        }

        String subsequence = buffer.substring(startIndex, endIndex + 1);
        if (subsequence.matches("G[T]+G")) {
            return startIndex;
        } else {
            return -1;
        }
    }

    @Override
    public String labelString() {
        return "GastroDisease";
    }
}