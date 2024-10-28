import model.*;
import model.enums.Brand;
import model.enums.CategoryOfRights;
import model.enums.Color;

import java.io.IOException;
import java.util.Scanner;

public class Menu {

    public static void menu() throws IOException {
        System.out.println("|    Hello in taxi7788!!!    |");
        Scanner input = new Scanner(System.in);
        int choise;

        Autopark autoparkVederko = new Autopark();
        autoparkVederko.setName("Vederko");
        autoparkVederko.setCars(FileUtil.parseCarFile("auto.txt"));
        autoparkVederko.setDrivers(FileUtil.parseDriverFile("drivers.txt"));


        do {
            System.out.println("для добавления Авто - введите 1; Водителя - 2; Сохранить - 3 ");
            System.out.println("Поиск машины по Vin - введите 4");
            choise = input.nextInt();

            switch (choise) {
                case 1:

                    Passenger newAuto = new Passenger();

                    System.out.println("Введите тип авто:");
                    newAuto.setBrand(Brand.valueOf(input.next()));
                    System.out.println("Введите цвет авто:");
                    newAuto.setColor(Color.valueOf(input.next()));
                    System.out.println("Введите год авто:");
                    newAuto.setYear(input.nextInt());
                    System.out.println("Введите Vin номер:");
                    newAuto.setVinCod(input.next());
                    autoparkVederko.addCar(newAuto);
                    System.out.println("Новое авто успешно добавлено!!!");
                    System.out.println("Сохранить текущий статус автопарка?");

                    break;
                case 2:

                    Man newHuman = new Man();
                    System.out.println("Введите ФИО:");
                    newHuman.setFio(input.next());
                    System.out.println("Введите возраст:");
                    newHuman.setAge(input.nextInt());
                    System.out.println("Введите категорию прав:");
                    newHuman.setCategoryOfRights(CategoryOfRights.valueOf(input.next()));
//                    drivers[Autopark.getFreeIndexDriver(drivers)] = newHuman;
                    System.out.println("Новый водитель принят!!!");
                    break;
                case 3:
                    FileUtil.writeFileAuto("auto.txt", autoparkVederko.getCars());
//                    FileUtil.writeFileDriver("drivers.txt", drivers);
                case 4:
                    System.out.println("Введите Vin:");
                    Car foundedCar = autoparkVederko.getCarByVin(input.next());
                    System.out.println(foundedCar.toString());
            }
        } while (choise != '0');
    }


}
