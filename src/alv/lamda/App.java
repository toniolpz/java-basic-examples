package alv.lamda;

import java.util.Comparator;

import javafx.scene.text.Text;

public class App {
    public static void main(String[] args) {
        Comparator<String> stringComparatorLambda = (String str1, String str2) -> {
            return str1.compareTo(str2);
        };

        int comparison = stringComparatorLambda.compare("Hola", "Perros");
        System.out.println(comparison);

        MyFunction myFunction = text -> {
            System.out.print(text);
        };

        myFunction.apply("Que onda Perros");
    }
}