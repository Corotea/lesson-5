public class task3 {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Аргументов нет");
        }
        int sum = 0;
        for (String arg : args) {
            int number = Integer.parseInt(arg);
            sum += number;

        }
        System.out.println(sum);
    }
}
