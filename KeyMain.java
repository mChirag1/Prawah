Public class KeyMain {

  private Scanner keyboard = new Scanner(System.in);

    public void run() {
        Generator generator = new Generator(keyboard);
        generator.mainLoop();
        keyboard.close();
    }

    public static void main(String[] args) {
        KeyMain main = new Main();
        main.run();
    }
}
