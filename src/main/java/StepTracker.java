public class StepTracker {
    private int minActiveSteps;
    private int totalSteps;
    private int activeDaysCount;
    private int totalDays;

    public StepTracker(int minActiveSteps) {
        this.minActiveSteps = minActiveSteps;
        this.totalSteps = 0;
        this.activeDaysCount = 0;
        this.totalDays = 0;
    }

    public void addDailySteps(int steps) {
        totalSteps += steps;
        totalDays++;
        if (steps >= minActiveSteps) {
            activeDaysCount++;
        }
    }

    public int activeDays() {
        return activeDaysCount;
    }

    public double averageSteps() {
        return totalDays == 0 ? 0.0 : (double) totalSteps / totalDays;
    }

    public String summary() {
        return String.format("Total Steps: %d, Active Days: %d, Average Steps: %.2f",
                totalSteps, activeDaysCount, averageSteps());
    }

    public static void main(String[] args) {
        StepTracker tr = new StepTracker(10000);
        System.out.print("Expected: 0       ");
        System.out.println("Result: " + tr.activeDays());
        System.out.print("Expected: 0.0     ");
        System.out.println("Result: " + tr.averageSteps());
        
        tr.addDailySteps(9000);
        tr.addDailySteps(5000);
        System.out.print("Expected: 0       ");
        System.out.println("Result: " + tr.activeDays());
        System.out.print("Expected: 7000.0  ");
        System.out.println("Result: " + tr.averageSteps());

        tr.addDailySteps(13000);
        System.out.print("Expected: 1       ");
        System.out.println("Result: " + tr.activeDays());
        System.out.print("Expected: 9000.0  ");
        System.out.println("Result: " + tr.averageSteps());
        System.out.println(tr.summary());
    }
}
