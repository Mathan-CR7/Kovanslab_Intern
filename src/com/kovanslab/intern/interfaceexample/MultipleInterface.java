interface Camera
{
    void start();
}

interface MusicPlayer
{
    void start();
}

interface Phone
{
    void call();
}

class SmartPhone implements Camera,MusicPlayer,Phone
{
    public void start()
    {
        System.out.println("Smartphone Open Camera or Music player");
    }
    public void call()
    {
        System.out.println("SmartPhone is used for Call");
    }
}

public class MultipleInterface {
    public static void main(String[] args)
    {
        SmartPhone s= new SmartPhone();
        s.start();
        s.call();
    }
}

