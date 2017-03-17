package HeadFirstJava;

/*
Создание массива и переопределение в нем индексов
 */

public class TestArrays {

    static int ref;

    public static void main(String[] args) {
        
	// Создаем и описываем массив строк
        String[] islands = new String[4];

        islands[0] = "Бермуды";
        islands[1] = "Фиджи";
        islands[2] = "Азорские острова";
        islands[3] = "Косумель";

        // Создаем и описываем массив индексов
        int[] index = new int[4];

        index[0] = 1;
        index[1] = 3;
        index[2] = 0;
        index[3] = 2;

        // C помощью цикла выводим массив на экран
        int y = 0;
        while (y < 4){
            ref = index[y];
            System.out.print("острова = ");
            System.out.println(islands[ref]);
            y += 1;
        }
    }
}
