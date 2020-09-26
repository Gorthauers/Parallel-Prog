//Класс для получения рандомных значений
import java.util.Random;

//Основной класс, где описываем операции над матрицей
public class Matrix {

    //Сами элементы
    int[][] m;
    //Размер матрицы
    int S;

    //Конструктор квадратной матрицы
    public Matrix(int Size){
        this.S = Size;
        m = new int[Size][Size];
    }

    //Заполняем матрицу элементами от 1 до Range
    public void Fill(int Range){
        Random rand = new Random();
        for (int i=0; i<this.S; i++){
            for (int j=0; j<this.S; j++)
                m[i][j] = rand.nextInt(Range) + 1;
        }
    }

    //Построчный вывод матрицы в консоль
    public void Output(){
        String Str= new String();
        for (int i=0; i<this.S; i++){
            Str="";
            for (int j=0; j<this.S; j++) {
                Str = Str + " " + m[i][j];
            }
            System.out.println(Str);
        }
    }

    //Ищем количество элементов текущей матрицы, равных хотя бы одному элементу из полученной в качестве аргумента матрицы B
    public int Equal(Matrix B){
        int Result=0;
        for (int i=0; i<this.S; i++){
            //Метка out нужна для правильного выхода из внутреннего цикла
            out:       for (int j=0; j<this.S; j++){
                for (int k=0; k<B.S; k++){
                    for (int l=0; l<B.S; l++){
                        if (this.m[i][j]==B.m[k][l]){
                            Result++;
                            continue out;
                        }
                    }
                }
            }
        }
        return Result;
    }

}
