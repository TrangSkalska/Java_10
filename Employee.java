public abstract class Employee {
    protected String name;
    protected int skill;

    public Employee(String name, int skill) {
        this.name = name;
        this.skill = skill;
    }

    public void introduce() {
        System.out.println("I am " + name);
    }
}