public class RepeaterDetectorLab9 extends PatternDetectorLab9 {
    private String repeatSequence;

    public RepeaterDetectorLab9(String repeatSequence) {
        this.repeatSequence = repeatSequence;
    }

    @Override
    public int detect(String buffer) {
        String sequenceToFind = repeatSequence + repeatSequence + repeatSequence + repeatSequence + repeatSequence;
        return findSimpleSequence(buffer, sequenceToFind);
    }

    @Override
    public String labelString() {
        return "Repeater";
    }
}