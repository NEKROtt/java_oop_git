package ex_1_cw;

public class Animal {
    protected String name;

    
    public Animal(String name) {
        this.name = name;
    }
    
    public Animal() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    protected void animalInfo(){
        System.out.println("имя животного - " + name);
    }

    protected void voice(){
        System.out.println(" животное издает звук! ");
    }

    protected void jump(){
        System.out.println("животное прыгает");
    }

    @Override
    public String toString() {
        return "Animal [name=" + name + "]";
    }
}


