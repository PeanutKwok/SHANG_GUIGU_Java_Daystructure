package package_a;

public class Car {
    private String owner;
    private String model;
    private int miles;

    public Car(String owner,String model){
        this.owner = owner;
        this.model = model;

    }
    public void start(){
        System.out.println("starting.....");
    }
}
