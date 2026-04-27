public class Tester extends Employee implements Payable, Workable {

    public Tester(String name, int skill) {
        super(name, skill);
    }

    @Override
    public double calculateSalary() {
        return skill * 800;
    }

    @Override
    public int work() {
        return skill;
    }
}