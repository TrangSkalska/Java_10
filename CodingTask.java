public class CodingTask extends Task {

    public CodingTask(String title) {
        super(title);
    }

    @Override
    public void execute() {
        System.out.println(title + ": Writing code...");
    }
}