public class TestingTask extends Task {

    public TestingTask(String title) {
        super(title);
    }

    @Override
    public void execute() {
        System.out.println(title + ": Testing application...");
    }
}