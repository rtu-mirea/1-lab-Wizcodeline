import java.util.Scanner;
import java.util.Random;

public class Array {
    public int n;
    private long x[];

 //Задается размер массиву
    void Array(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        n = in.nextInt();
        this.n = n;
        x = new long[this.n];
        System.out.println("______________________");
    }
//Ввод рандомных значений в массив
    void randInput(int min, int max) {
        for (int i = 0; i < n; i++) {
            this.x[i] = (long)(Math.random() * max + min);
        }
        System.out.println("______________");
        OutputMethod();
    }
//Ввод значений элементов массива с клавиатуры
    void ArrayInput(){
        System.out.println("Enter values of array: ");
        Scanner in = new Scanner(System.in);
        for (int i = 0; i<n; i++){
        x[i]= in.nextInt();
        }
        OutputMethod();
    }
//Вывод массива справо-налево.
    void ArrayOutRight() {
        System.out.println("Array numbers");
        for (int i = n-1; i>=0; i--) {
            System.out.println(" "+ x[i]);
        }
    }
//Обычный вывод массива
    void ArrayOutLeft(){
        System.out.println("______________");
        System.out.println("Array numbers:");
        for (int i = 0; i<n; i++){
            System.out.print(x[i]+" ");
        }
        System.out.println();
        System.out.println("______________");
    }
// мини-консоль для выбора способа вывода.
    void OutputMethod(){
        System.out.println("Choise method output >");
        System.out.println("1. Left to right");
        System.out.println("2. Right to left");
        System.out.println("3. Skip output");
        Scanner in = new Scanner(System.in);
        int number;
        number = in.nextInt();
        if (number == 1) ArrayOutLeft();
        else if (number == 2) ArrayOutRight();
        else if (number == 3) return;
        else System.out.println("You enter unright number");
    }
//Определяет количество элементов массива, у которых цифровой корень меньше заданного значения
    void DigitRoot() {
        int k = 0; long number, root;
        for (int i = 0; i<this.n; i++) {
        number = this.x[i];
        root = (1 + (number - 1) % 9);
        if (root < number)  k++;
    }
        System.out.println("______________________");
        System.out.println(" "+ k);
        System.out.println("______________________");
    }
//Формирует массив из дружественных чисел исходного массива
    void Friends() {
        System.out.println("______________________");
        long number = 0;
        long DigArr[]; //хранит сумму делителей числа.
        DigArr = new long[this.n];

        for (int i = 0; i < this.n; i++) {
            number = x[i];
            long sum = 0; //сумма делителей
            long mod = 0; //остаток
            for (int j = 1; j <= number; j++) {
                mod = number % j;
                if (mod == 0) sum = sum + j;
            }
            DigArr[i] = sum;

        }
        long FriendArr[]; // массив из дружественных чисел.
        FriendArr = new long[this.n];
        int f = 0;
        //Уродливый алгоритм для перебора элементов с одинкавой суммой делителей.
        for (int i = 0; i < this.n; i++) {
            int b = i+1;
            for (int j = b; j < this.n; j++){
                if (DigArr[i] == DigArr[j]){
                    FriendArr[f] = x[i];
                    FriendArr[f+1] = x[j];
                    f=f+2;
                }
                b++;
            }
        }
        if (f == 0) System.out.println("Friendly numbers not found");
        for (int i = 0; i < this.n; i++) System.out.print(FriendArr[i] + " ");
        System.out.println();
        System.out.println("______________________");
    }

}