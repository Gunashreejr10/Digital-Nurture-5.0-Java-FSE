
class Computer {
    private String cpu;
    private String ram;

    private Computer(Builder builder) {
        this.cpu = builder.cpu;
        this.ram = builder.ram;
    }

    public String toString() {
        return "Computer [CPU=" + cpu + ", RAM=" + ram + "]";
    }

    static class Builder {
        private String cpu;
        private String ram;

        public Builder setCpu(String cpu) { this.cpu = cpu; return this; }
        public Builder setRam(String ram) { this.ram = ram; return this; }

        public Computer build() { return new Computer(this); }
    }
}

public class Main {
    public static void main(String[] args) {
        Computer pc = new Computer.Builder()
                .setCpu("Intel i7")
                .setRam("16GB")
                .build();

        System.out.println(pc);
    }
}
