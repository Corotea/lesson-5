public class Task3 {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Аргументов нет");
        }
        int sum = 0;
        for (String arg : args) {
            sum += Integer.parseInt(arg);
        }
        System.out.println(sum);
    }
}
