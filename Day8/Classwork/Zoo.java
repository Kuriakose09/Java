class Zoo{
    public static void main(String[] args){
        Dog dog = new Dog();
        Bird bird = new Bird();
        bird.makeSound();
        bird.move();
        dog.makeSound();
        dog.move();
    }
}


interface Animal{
    public void makeSound();
    public void move();
}

class Bird implements Animal{
    public void makeSound(){
        System.out.println("Bird Chirp");
    }
    public void move(){
        System.out.println("Bird Fly");
    }
}

class Dog implements Animal{
    public void makeSound(){
        System.out.println("Dog Bark");
    }
    public void move(){
        System.out.println("Dog Run");
    }
}

