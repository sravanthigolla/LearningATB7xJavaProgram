package ex_081424.Interface;

public class RunnerInterface1 implements Interface1 {
    @Override
    public void method1() {
        System.out.println("method1");
    }

    public static void main(String[] args) {
        RunnerInterface1 runnerInterface1 = new RunnerInterface1();
        runnerInterface1.method1();
    }
}
