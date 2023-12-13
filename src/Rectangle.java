//класс принимает два аргумента и инициализирует переменные экземпляра
//Метод pr() для печати значений ab через System.out.println()
//Метод per() выч-т периметр прямоуг-а через сложения длин всех сторон
//Метод pl() выч-т площадь прямоуг-ка через умножения длины и ширины
public class Rectangle {
    int a,b; //обьяв переменные
    public Rectangle(int a,int b){ //для инициализации
        this.a = a; /// присваивание
        this.b = b;
    }
    public void pr(){ //метод для печати значения
        System.out.println("a = "+a+"\n"+"b = " + b);
    }
    public int per(){ // метод для вычисления периметра прямоугольника
        return ((a+b)*2);
    }
    public double pl(){ //метод для вычисления площади прямоугольника
        return (a*b);
    }
    public static void main(String[] args){ //создание экземпляра класса Rectangle
        Rectangle rc = new Rectangle(3,4);
        rc.pr(); //вызов метода 'pr' для печати
        System.out.println("Площадь = "+rc.pl() + "\n" + "Периметр = "+rc.per());
    }
}
