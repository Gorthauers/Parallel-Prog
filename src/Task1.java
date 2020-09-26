//Класс для считывания данных
import java.util.Scanner;

public class Task1 {

    //Основная процедура программы
    public static void main(String[] args) {

        //Создаем квадратные матрицы размеров 3 и 5, соответственно
        Matrix M1= new Matrix(3);
        Matrix M2= new Matrix(5);

        //Создаем объект для считывания данных с консоли
        Scanner in = new Scanner(System.in);

        System.out.println("Введите максимальное значение для матрицы 1");
        //Считываем целое число a с консоли
        int a = in.nextInt();
        //Заполняем матрицу M1 Значениями
        M1.Fill(a);
        //Выводим матрицу M1
        M1.Output();

        //Повторяем для M2
        System.out.println("Введите максимальное значение для матрицы 2");
        int b = in.nextInt();
        M2.Fill(b);
        M2.Output();

        //Ищем количество элементов матрицы 1, равных хотя бы одному элементу из матрицы 2
        int EqualNumber = M1.Equal(M2);
        System.out.println("Number of Equal Elements " + EqualNumber);
    }

}
