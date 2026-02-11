package com.kovanslab.intern.inheritanceovercomposition;
class Room
{
    void show()
    {
        System.out.println("2BHK room");
    }
}
class House
{
    private Room room;

    void setRoom(Room room)
    {
        this.room =room;
    }
    void display()
    {
        room.show();
        System.out.println("House Price is 50 L");
    }
}
public class DependencyInjection {
    public static void main(String[] args)
    {
        Room room=new Room();
        House h= new House();
        h.setRoom(room);
        h.display();
    }
}
