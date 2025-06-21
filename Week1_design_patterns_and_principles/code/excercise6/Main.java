public class Main {
    public static void main(String[] args) {
        Image image1 = new ProxyImage("dog.png");
        Image image2 = new ProxyImage("cat.png");

        // First time loading
        image1.display();
        System.out.println();

        // Cached load
        image1.display();
        System.out.println();

        // First time loading another image
        image2.display();
    }
}
