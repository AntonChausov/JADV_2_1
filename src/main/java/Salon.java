import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Salon {

    List<String> cars = new ArrayList<>();

    public synchronized void buyCar() {
        try {
            String buyerName = Thread.currentThread().getName();
            System.out.printf("%s зашел в автосалон\n", buyerName);
            while (getCarsCount() == 0) {
                System.out.println("Машин нет\n");
                wait();
            }
            Thread.sleep(500);
            String car = getCar();
            System.out.printf("%s уехал на новеньком авто от %s\n", buyerName, car);
        } catch (InterruptedException err) {
            err.printStackTrace();
        }
    }

    public synchronized void produceCar(){
        String producerName = Thread.currentThread().getName();
        try {
            Thread.sleep(1000);
            addCar(producerName);
            System.out.printf("Производитель %s выпустил 1 авто\n", producerName);
            notify();
        } catch (InterruptedException err) {
            err.printStackTrace();
        }
    }

    private String getCar() {
        Random random = new Random();
        return cars.remove(random.nextInt(getCarsCount()));
    }

    private int getCarsCount() {
        return cars.size();
    }

    private void addCar(String producer) {
        cars.add(producer);
    }
}
