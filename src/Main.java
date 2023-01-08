public class Main {
    public static void main(String[] args) {
        System.out.println("Перевернуть массив");


        int[] box = new int[10];
        for (int i = 0, j = box.length; i < box.length; i++, j--) {
            box[i] = j;
            System.out.println(box[i]);
        }
    }
}