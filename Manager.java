public class Manager extends Employee implements Workable {

    public Manager(String name, int skill) {
        super(name, skill);
    }

    @Override
    public int work() {
        return skill + 5;
    }
}