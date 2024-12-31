class Mammal extends Animal {
    private int Speed;

    public Mammal(String name, int age, String uniqueCharacteristic, int speed) {
        super(name, age, uniqueCharacteristic);
        Speed = speed;
    }
}
