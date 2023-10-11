import java.util.Scanner;

public class DepositCalculator {
    double CalculateComplexPercent(double amount, double yearRate, int timeStorage) {
        double payment = amount * Math.pow((1 + yearRate / 12), 12 * timeStorage);
        return getRandom(payment, 2);
    }

    double CalculateSimplePercent(double amount, double yearRate, int depositPeriod) {
        return getRandom(amount + amount * yearRate * depositPeriod, 2);
    }

    double getRandom(double base, int degree) {
        double expression = Math.pow(10, degree);
        return Math.round(base * expression) / expression;
    }

    void doImportantJob() {
        int timeStorage, action;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите сумму вклада в рублях:");
        int amountDeposit = scanner.nextInt();
        System.out.println("Введите срок вклада в годах:");
        timeStorage = scanner.nextInt();
        System.out.println("Выберите тип вклада, 1 - вклад с обычным процентом, 2 - вклад с капитализацией:");
        action = scanner.nextInt();
        double outDoubleVar = 0;
        if (action == 1) {
            outDoubleVar = CalculateSimplePercent(amountDeposit, 0.06, timeStorage);
        } else if (action == 2) {
            outDoubleVar = CalculateComplexPercent(amountDeposit, 0.06, timeStorage);
        }
        System.out.println("Результат вклада: " + amountDeposit + " за " + timeStorage +
                " лет превратятся в " + outDoubleVar);
    }

    public static void main(String[] args) {
        new DepositCalculator().doImportantJob();
    }


}
