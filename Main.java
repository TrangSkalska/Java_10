public class Main {
    public static void main(String[] args) {

        System.out.println("Exercise 1: Payable");
        Developer dev = new Developer("Anna", 8);
        Tester tester = new Tester("Mark", 6);

        System.out.println("Developer salary: " + dev.calculateSalary());
        System.out.println("Tester salary: " + tester.calculateSalary());

        System.out.println();

        System.out.println("Exercise 2: Project works with Workable");
        Project project = new Project();
        project.doWork(dev);
        project.doWork(tester);

        System.out.println();

        System.out.println("Exercise 3: Abstract Task");
        Task task1 = new CodingTask("Backend Feature");
        Task task2 = new TestingTask("Bug Testing");

        task1.execute();
        task2.execute();

        System.out.println();

        System.out.println("Exercise 4: Abstract class + Interface");
        Manager manager = new Manager("John", 7);
        manager.introduce();
        System.out.println("Manager work output: " + manager.work());
    }
}