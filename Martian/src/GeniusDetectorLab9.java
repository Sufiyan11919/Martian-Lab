public class GeniusDetectorLab9 extends PatternDetectorLab9 {
    @Override
    public int detect(String buffer) {
        return findSimpleSequence(buffer, "GAGA");
    }

    @Override
    public String labelString() {
        return "Genius";
    }
}