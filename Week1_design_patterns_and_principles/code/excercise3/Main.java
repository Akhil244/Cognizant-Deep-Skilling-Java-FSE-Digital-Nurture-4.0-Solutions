public class Main {
    public static void main(String[] args) {
        // Basic configuration
        Computer basicPC = new Computer.Builder()
            .setCPU("Intel i3")
            .setRAM("8GB")
            .setStorage("256GB SSD")
            .build();

        basicPC.showConfig();

        System.out.println();

        // High-end configuration
        Computer gamingPC = new Computer.Builder()
            .setCPU("Intel i9")
            .setRAM("32GB")
            .setStorage("1TB SSD")
            .setGraphicsCard("NVIDIA RTX 4090")
            .setKeyboard("Mechanical RGB Keyboard")
            .setMouse("Gaming Mouse")
            .build();

        gamingPC.showConfig();
    }
}