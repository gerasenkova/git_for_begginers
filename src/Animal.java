public class Animal {
    public static void main(String[] args) {
        Animal animal = new Animal();
        int c = animal.sum(5, 10);
        System.out.println(c);
    }

    public int sum(int a, int b) {
        return a + b;
    }
}
