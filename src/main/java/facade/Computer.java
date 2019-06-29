package facade;

public class Computer {
    private Cpu cpu;
    private Memory memory;
    private Disk disk;

    Computer(){
        cpu = new Cpu();
        memory = new Memory();
        disk = new Disk();
    }

    public void startup(){
        System.out.println("computer startup begin");

        cpu.startup();
        memory.startup();
        disk.startup();

        System.out.println("computer startup end");
    }

    public void shutdown(){
        System.out.println("computer shutdown begin");

        cpu.shutdown();
        memory.shutdown();
        disk.shutdown();

        System.out.println("computer shutdown end");
    }
}
