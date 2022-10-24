public class Main {
    public static void main(String[] args) {
        int i = 0;
        int u = 11;

        while (i < 10) {
            i++;
            System.out.print(i);
        }
        System.out.println("\n");
        while (u > 0) {
            u--;
            System.out.print(u);
        }
        System.out.println("\n");



        int friday = 7;
        System.out.println("Сегодня пятница, " + friday + "-е число. Необходимо подготовить отчет.");
        while (friday < 28) {
            friday = friday + 7;

            System.out.println("Сегодня пятница, " + friday + "-е число. Необходимо подготовить отчет.");
        }
        System.out.println("\n");



        int yearPost = 2121;
        int yearNow = 1821;

        while (yearNow < yearPost) {
            yearNow++;
            int yearFall = yearNow % 79;
            if (yearFall == 0) {
                System.out.println(yearNow);


            }
        }
    }
}
