public class Animal {
    private int age;
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
}

public class Lion extends Animal {
    private void roar() {
        System.out.println("The "+getAge()+" year old lion says: Roar!");
    }
}
