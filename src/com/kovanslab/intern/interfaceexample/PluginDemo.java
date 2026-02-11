package com.kovanslab.intern.interfaceexample;

interface Plugin
{
    void execute();
}

class CoreSystem
{
    private Plugin[] plugins;

    CoreSystem(Plugin[] plugins)
    {
        this.plugins=plugins;
    }

    void runPlugins()
    {
        for(Plugin p : plugins)
        {
            p.execute();
        }
    }
}


public class PluginDemo
{
    public static void main(String[] args)
    {
        Plugin login =new Plugin()
        {
            public void execute()
            {
                System.out.println("Logging Plugin Executed");
            }
        };

        Plugin secure =new Plugin() {
            public void execute()
            {
                System.out.println("Secure Plugin Executed");
            }
        };
        Plugin[] plugins = {login ,secure};
        CoreSystem c = new CoreSystem(plugins);
        c.runPlugins();
    }
}

