public class Main {
    public static void main(String[] args) {

        // Задача 1
        System.out.println();
        System.out.println("Задача 1");

        int[] monthSpences1 = {12560, 10480, 14275, 11320, 13640};
        int sum = 0;
        for (int element : monthSpences1) {
            sum = sum + element;
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей.");

        // Задача 2
        System.out.println();
        System.out.println("Задача 2");

        int[] monthSpences2 = {23900, 14890, 16520, 24750, 14740};
        int maxMonthSpence = -1;

        for (int i = 0; i < monthSpences2.length; i++) {
            if (monthSpences2[i] > maxMonthSpence) {
                maxMonthSpence = monthSpences2[i];
            }
        }
        System.out.println("Максимальная сумма трат за неделю составила " + maxMonthSpence + " рублей.");

        int minMonthSpence = 50000;
        for (int i = 0; i < monthSpences2.length; i++) {
            if (monthSpences2[i] < minMonthSpence) {
                minMonthSpence = monthSpences2[i];
            }
        }
        System.out.println("Минимальная сумма трат за неделю составила " + minMonthSpence + " рублей.");

        // Задача 3
        System.out.println();
        System.out.println("Задача 3");

        int[] monthSpences3 = {2390, 1890, 2620, 4750, 4740};
        int totalMonthSpence3 = 0;
        for (int i = 0; i < monthSpences3.length; i++) {
            totalMonthSpence3 = (totalMonthSpence3 + monthSpences3[i]);
        }
        int averageMonthSpence3 = totalMonthSpence3 / 4;
        System.out.println("Средняя сумма трат за месяц составила " + averageMonthSpence3 + " рублей.");

        // Задача 4
        System.out.println();
        System.out.println("Задача 4");

        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >=0; i=i-1) {
            System.out.print(reverseFullName[i]);
        }
    }
}