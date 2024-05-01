package ex_1_cw;

public class Cat extends Animal{
    private String color;
    private Integer age;
    
    public Cat(String name, String color, Integer age) {
        super(name);
        this.color = color;
        this.age = age;
    }

    public Cat(String color, Integer age) {
        this.color = color;
        this.age = age;
    }

    public Cat(){
        
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    protected void animalInfo() {
        System.out.println("Инфо о коте: \n" + toString());
    }

    @Override
    protected void jump() {
        System.out.println("Кот издает звук!");   
    }
    
    @Override
    protected void voice() {
        System.out.println("Кот прыгнул!");
    }

    @Override
    public String toString() {
        return "Cat [ name = " + name + ", color = " + color + ", age = " + age + " ]";
    }

    

    
}


