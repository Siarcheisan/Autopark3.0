import model.Car;
import model.Driver;
import model.enums.Brand;
import model.enums.CategoryOfRights;
import model.enums.Color;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileUtil {

    public static void writeText(String path, String text) throws IOException {

        FileWriter writer = new FileWriter(path, true);
        writer.write(text + "\n");
        writer.flush();

    }

    public static void readText(String path) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(path));
        String line = reader.readLine();
        while (line != null) {
            System.out.println(line);
            line = reader.readLine();
        }
        reader.close();
    }

    public static Car[] parseCarFile(String path) throws IOException {

        Car[] result = new Car[99];

        BufferedReader reader = new BufferedReader(new FileReader(path));
        String line = reader.readLine();
        int count = 0;
        while (line != null) {
            String[] temp = line.split(", ");
            Car newTempCar = new Car();
            newTempCar.setBrand(Brand.valueOf(temp[0]));
            newTempCar.setColor(Color.valueOf(temp[1]));
            newTempCar.setYear(Integer.valueOf(temp[2]));
            result[count] = newTempCar;
            line = reader.readLine();
            count++;
        }
        reader.close();

        return result;
    }

    public static Driver[] parseDriverFile(String path) throws IOException {

        Driver[] result = new Driver[99];

        BufferedReader reader = new BufferedReader(new FileReader(path));
        String line = reader.readLine();
        int count = 0;
        while (line != null) {
            String[] temp = line.split(", ");
            Driver newTempDrivers = new Driver();
            newTempDrivers.setFio(temp[0]);
            newTempDrivers.setAge(Integer.valueOf(temp[1]));
            newTempDrivers.setCategoryOfRights(CategoryOfRights.valueOf(temp[2]));
            result[count] = newTempDrivers;
            line = reader.readLine();
            count++;
        }
        reader.close();

        return result;
    }


    public static void writeFileDriver(String path, Driver[] drivers) throws IOException {
        FileWriter writer = new FileWriter(path, false);
        for (int i = 0; i < drivers.length; i++) {
            if (drivers[i] != null) {
                writer.write(drivers[i].toString() + "\n");
            }
        }
        writer.flush();
        writer.close();
    }

    public static void writeFileAuto(String path, Car[] autoPark) throws IOException {
        FileWriter writer = new FileWriter(path, false);
        for (int i = 0; i < autoPark.length; i++) {
            if (autoPark[i] != null) {
                writer.write(autoPark[i].toString() + "\n");

            }
        }
        writer.flush();
        writer.close();
    }


}
