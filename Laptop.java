package DZ;

import java.io.PrintStream;
import java.util.Objects;
import java.util.Scanner;

public class Laptop {
    private String manufacturer; // производитель
    private int ramGb; // объем оперативной памяти
    private int totalVolumeOfSSDdrives; // общий объем накопителей SSD
    private double screenDiagonal; // диагональ
    private String processor; // процессор
    private int numberOfProcessorCores; // Количество ядер процессора
    private String operationSystem; // операционная система
    private int amountOfVideoMemory; // объем видеопамяти
    private String color; // цвет

    public Laptop(String manufacturer, int ramGb, int totalVolumeOfSSDdrives,
            double screenDiagonal, String processor, int numberOfProcessorCores,
            String operationSystem, int amountOfVideoMemory, String color) {
        this.manufacturer = manufacturer;
        this.ramGb = ramGb;
        this.totalVolumeOfSSDdrives = totalVolumeOfSSDdrives;
        this.screenDiagonal = screenDiagonal;
        this.processor = processor;
        this.numberOfProcessorCores = numberOfProcessorCores;
        this.operationSystem = operationSystem;
        this.amountOfVideoMemory = amountOfVideoMemory;
        this.color = color;
    }

    /********* GET */
    public String getManufacturer() {
        return manufacturer;
    }

    public int getRamGb() {
        return ramGb;
    }

    public int getTotalVolumeOfSSDdrives() {
        return totalVolumeOfSSDdrives;
    }

    public double getScreenDiagonal() {
        return screenDiagonal;
    }

    public String getProcessor() {
        return processor;
    }

    public int getNumberOfProcessorCores() {
        return numberOfProcessorCores;
    }

    public String getOperationSystem() {
        return operationSystem;
    }

    public int getAmountOfVideoMemory() {
        return amountOfVideoMemory;
    }

    public String getColor() {
        return color;
    }

    /******** SET* */
    public String setManufacturer() {
        return manufacturer;
    }

    public int setRamGb() {
        return ramGb;
    }

    public int setTotalVolumeOfSSDdrives() {
        return totalVolumeOfSSDdrives;
    }

    public double setScreenDiagonal() {
        return screenDiagonal;
    }

    public String setProcessor() {
        return processor;
    }

    public int setNumberOfProcessorCores() {
        return numberOfProcessorCores;
    }

    public String setOperationSystem() {
        return operationSystem;
    }

    public int setAmountOfVideoMemory() {
        return amountOfVideoMemory;
    }

    public String setColor() {
        return color;
    }

    /*********** */

    public String toString() {
        return manufacturer + ", " +
                "RAM: " + ramGb + " Gb, " +
                "SSD: " + totalVolumeOfSSDdrives + " Gb, " +
                screenDiagonal + "', " +
                processor + ", " +
                "Cores: " + numberOfProcessorCores + ", " +
                operationSystem + ", " +
                "VideoKart: " + amountOfVideoMemory + " Gb, " +
                color;
    }

    @Override
    public int hashCode() {
        return Objects.hash(manufacturer, ramGb, totalVolumeOfSSDdrives, screenDiagonal, processor,
                numberOfProcessorCores, operationSystem, amountOfVideoMemory, color);
    }

    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        Laptop laptopt = (Laptop) obj;

        return manufacturer.equals(laptopt.manufacturer) &&
                ramGb == laptopt.ramGb &&
                totalVolumeOfSSDdrives == laptopt.totalVolumeOfSSDdrives &&
                screenDiagonal == laptopt.screenDiagonal &&
                processor.equals(laptopt.processor) &&
                numberOfProcessorCores == laptopt.numberOfProcessorCores &&
                operationSystem.equals(laptopt.operationSystem) &&
                amountOfVideoMemory == laptopt.amountOfVideoMemory &&
                color.equals(laptopt.color);
    }
}
