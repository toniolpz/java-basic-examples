package alv.polymorphism;

class Main {
    public static void main(String[] args) {
        Food[] array = new Food[]{new Tuna(), new Potpie()};
        for (Food food : array) {
            food.eat();
        }
    }
}