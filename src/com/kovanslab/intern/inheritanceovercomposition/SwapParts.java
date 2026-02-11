package com.kovanslab.intern.inheritanceovercomposition;
class Processor
{
    void pro()
    {
        System.out.println("The computer has a processor");
    }
}
class Rams
{
    private int capacity;

    Rams(int capacity)
    {
        this.capacity=capacity;
    }
    int getRam()
    {
        return capacity;
    }
    void oldRam()
    {
        System.out.println("RAM "+ capacity + "GB");
    }
}
class Storage
{
    void space()
    {
        System.out.println("The Computer has a Storage ");
    }
}
class Computer
{
    Processor processor;
    Rams ram;
    Storage storage;

    Computer(Processor processor , Rams ram ,Storage storage)
    {
        this.processor =processor;
        this.ram=ram;
        this.storage=storage;
    }
    void upgradeRam(Rams newRam) {
        System.out.println(
                "Upgrading RAM from " + ram.getRam() +
                        "GB to " + newRam.getRam() + "GB"
        );
        this.ram = newRam;
    }
    void complete()
    {
        processor.pro();
        ram.oldRam();
        storage.space();
        System.out.println("The computer is Ready");
    }
}

public class SwapParts {
    public static void main(String[] args) {
        {
            Processor processor = new Processor();
            Rams ram=new Rams(8);
            Storage storage =new Storage();
            Computer c =new Computer(processor,ram,storage);
            c.complete();
            Rams n = new Rams(16);
            c.upgradeRam(n);
        }
    }
}
