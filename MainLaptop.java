package DZ;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class MainLaptop {
    public static void main(String[] args) {
        Laptop laptop1 = new Laptop("Lenovo", 8, 128, 15.6, "Intel", 4, "Linux", 4, "black");
        Laptop laptop2 = new Laptop("Lenovo", 4, 64, 15, "Intel", 2, "Windows", 2, "black");
        Laptop laptop3 = new Laptop("Asus", 6, 256, 15.6, "AMD", 6, "Linux", 4, "red");
        Laptop laptop4 = new Laptop("Apple", 8, 256, 14, "Apple", 2, "macOs", 6, "black");
        Laptop laptop5 = new Laptop("Honor", 8, 512, 15.6, "AMD", 8, "Windows", 8, "grey");
        Laptop laptop6 = new Laptop("Lenovo", 4, 64, 15, "Intel", 2, "Windows", 2, "black");
        Laptop laptop7 = new Laptop("Apple", 4, 64, 15, "Intel", 2, "Windows", 2, "black");
        Laptop laptop8 = new Laptop("Honor", 6, 258, 17, "AMD", 10, "Linux", 6, "green");
        Laptop laptop9 = new Laptop("Honor", 6, 258, 17, "AMD", 8, "Linux", 6, "green");
        Laptop laptop10 = new Laptop("Honor", 6, 512, 17, "AMD", 10, "Linux", 6, "green");
        Laptop laptop11 = new Laptop("Asus", 12, 258, 22, "AMD", 10, "macOs", 6, "grey");
        Set<Laptop> laptops = new HashSet<>(Arrays.asList(laptop1, laptop2, laptop3, laptop4, laptop5, laptop6, laptop7,
                laptop8, laptop9, laptop10, laptop11));
        for (Laptop laptop : laptops) {
            System.out.println(laptop);
        }
        Map<Integer, String> sel = selectCriteria();
        System.out.println(sel.toString());

        sort(sel, laptops);

    }

    public static Map<Integer, String> selectCriteria() {
        Map<Integer, String> filtrCriterias = new HashMap<>();
        System.out.println("Если Вы хотите выбрать критерий фильтрации,то введите 'yes', иначе введите 'no'");
        String question = scanner();
        while (question.equals("yes")) {
            System.out.println("Введите цифру, соответствующую необходимому критерию:" +
                    "\n 1 - Производитель" +
                    "\n 2 - Объем оперативной памяти - RAM Gb" +
                    "\n 3 - Общий объем накопителей SSD" +
                    "\n 4 - Диагональ экрана" +
                    "\n 5 - Процессор" +
                    "\n 6 - Количество ядер процессора" +
                    "\n 7 - Операционная система" +
                    "\n 8 - Объем видеопамяти" +
                    "\n 9 - Цвет");

            String keyString = scanner();
            int key = Integer.parseInt(keyString);
            System.out.println("Введите значение для выбранного критерия: ");
            String value = scanner();
            filtrCriterias.put(key, value);
            System.out.println("Продолжить? (yes/no)");
            question = scanner();
        }
        return filtrCriterias;
    }

    public static void sort(Map<Integer, String> filtrCriterias, Set<Laptop> laptops) {
        Set<Laptop> resultLaptops = new HashSet<>(laptops);
        for (Laptop laptop : laptops) {
            for (Integer keyFiltr : filtrCriterias.keySet()) {
                switch (keyFiltr) {
                    case 1:
                        if (!laptop.getManufacturer().equalsIgnoreCase(filtrCriterias.get(keyFiltr)))
                            resultLaptops.remove(laptop);
                        break;
                    case 2:
                        if (laptop.getRamGb() < Integer.parseInt(filtrCriterias.get(keyFiltr)))
                            resultLaptops.remove(laptop);
                        // if (!String.valueOf(laptop.getRamGb()).equals(filtrCriterias.get(keyFiltr)))
                        // resultLaptops.remove(laptop);
                        break;
                    case 3:
                        if (laptop.getTotalVolumeOfSSDdrives() < Integer.parseInt(filtrCriterias.get(keyFiltr)))
                            resultLaptops.remove(laptop);
                        break;
                    case 4:
                        if (laptop.getScreenDiagonal() < Double.parseDouble(filtrCriterias.get(keyFiltr)))
                            resultLaptops.remove(laptop);
                        break;
                    case 5:
                        if (!laptop.getProcessor().equalsIgnoreCase(filtrCriterias.get(keyFiltr)))
                            resultLaptops.remove(laptop);
                        break;
                    case 6:
                        if (laptop.getNumberOfProcessorCores() < Integer.parseInt(filtrCriterias.get(keyFiltr)))
                            resultLaptops.remove(laptop);
                        break;
                    case 7:
                        if (!laptop.getOperationSystem().equalsIgnoreCase(filtrCriterias.get(keyFiltr)))
                            resultLaptops.remove(laptop);
                        break;
                    case 8:
                        if (laptop.getAmountOfVideoMemory() < Integer.parseInt(filtrCriterias.get(keyFiltr)))
                            resultLaptops.remove(laptop);
                        break;
                    case 9:
                        if (!laptop.getColor().equalsIgnoreCase(filtrCriterias.get(keyFiltr)))
                            resultLaptops.remove(laptop);
                        break;
                    default:
                        break;
                }
            }
        }
        if (resultLaptops.isEmpty()) {
            System.out.println("По введенным критериям ничего не найдено!");
        } else {
            for (Laptop resultLaptop : resultLaptops) {
                System.out.println(resultLaptop);
            }
        }

    }

    // ************************* */
    public static String scanner() {
        Scanner scanner = new Scanner(System.in);
        String scan = scanner.nextLine();
        return scan;
    }

}
