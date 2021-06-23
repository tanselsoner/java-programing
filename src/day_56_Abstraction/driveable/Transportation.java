package day_56_Abstraction.driveable;

public abstract class Transportation {
    public abstract void transportPeople();
    public abstract void cost(double mile);
    public void start() {
        System.out.println("Starting the engine");
    }
    public void stop() {
        System.out.println("Shut off the engine");
    }



    }

