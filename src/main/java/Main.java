public class Main {
    public static void main(String[] args) {
        final Salon salon = new Salon();

        new Thread(salon::buyCar, "1. Ivan").start();
        new Thread(salon::buyCar, "2. John").start();
        new Thread(salon::buyCar, "3. Josh").start();
        new Thread(salon::buyCar, "4. Ann").start();
        new Thread(salon::buyCar, "5. Boris").start();
        new Thread(salon::buyCar, "6. Denis").start();
        new Thread(salon::buyCar, "7. Martin").start();
        new Thread(salon::buyCar, "8. Bob").start();
        new Thread(salon::buyCar, "9. Fill").start();
        new Thread(salon::buyCar, "10. Anton").start();
        new Thread(salon::produceCar, "1. Toyota").start();
        new Thread(salon::produceCar, "2. Nissan").start();
        new Thread(salon::produceCar, "3. BMV").start();
        new Thread(salon::produceCar, "4. Mazda").start();
        new Thread(salon::produceCar, "5. Mercedes").start();
        new Thread(salon::produceCar, "6. VAZ").start();
        new Thread(salon::produceCar, "7. GAZ").start();
        new Thread(salon::produceCar, "8. Lamborghini").start();
        new Thread(salon::produceCar, "9. Renault").start();
        new Thread(salon::produceCar, "10. Volkswagen").start();
    }
}
