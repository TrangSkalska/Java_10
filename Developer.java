public class Developer extends Employee implements Payable, Workable {

    public Developer(String name, int skill) {
        super(name, skill);
    }

    @Override
    public double calculateSalary() {
        return skill * 1000;
    }

    @Override
    public int work() {
        return skill * 2;
    }
}