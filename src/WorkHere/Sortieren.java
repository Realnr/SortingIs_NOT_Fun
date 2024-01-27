package WorkHere;

public class Sortieren {

    public static void main(String[] args) {
        int[] array=new int[20];
        Help.generateArray(array);//Array mit Zufallszahlen füllen
        Help.print(array);                      //Array in der Konsole ausgeben lassen

        for (int i = 0; i < 10; i++) {
            bubbleSort(array);
            Help.print(array);                      //Array in der Konsole ausgeben lassen
            Help.generateArray(array);              //Array mit Zufallszahlen füllen
        }
        for (int i = 0; i < 10; i++) {
            insertionSort(array);
            Help.print(array);                      //Array in der Konsole ausgeben lassen
            Help.generateArray(array);              //Array mit Zufallszahlen füllen
        }
        for (int i = 0; i < 10; i++) {
            selectionSort(array);
            Help.print(array);                      //Array in der Konsole ausgeben lassen
            Help.generateArray(array);              //Array mit Zufallszahlen füllen
        }
        Help.print(array);
    }

    public static void insertionSort(int[] array){
        System.out.println("insertionSort");
        int vergleichsAnzahl = 0;
        int vertauschungsAnzahl = 0;
        for (int i = 1; i < array.length; i++) {
            int j = i;
            while(j>0 && array[j-1]>array[j] ){
                Help.swap(array,j,j-1);
                vertauschungsAnzahl++;
                vergleichsAnzahl++;
                j--;
            }
            vergleichsAnzahl++;
        }
        System.out.println("vergleichsAnzahl: " + vergleichsAnzahl);
        System.out.println("vertauschungsAnzahl: " + vertauschungsAnzahl);
    }

    public static void selectionSort(int[] array){
        System.out.println("selectionSort");
        int vergleichsAnzahl = 0;
        int vertauschungsAnzahl = 0;
        for (int i = 0; i < array.length - 1; i++) {
            int min = i;
            for (int j = i+1; j < array.length; j++) {
                if(array[j]<array[min]){
                    min = j;
                }
                vergleichsAnzahl++;
            }
            Help.swap(array,i,min);
            vertauschungsAnzahl++;
        }
        System.out.println("vergleichsAnzahl: " + vergleichsAnzahl);
        System.out.println("vertauschungsAnzahl: " + vertauschungsAnzahl);
    }

    public static void bubbleSort(int[] array){
        System.out.println("bubbleSort");
        int vergleichsAnzahl = 0;
        int vertauschungsAnzahl = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length-1-i; j++) {
                if(array[j]>array[j+1]){
                    Help.swap(array,j,j+1);
                    vertauschungsAnzahl++;
                }
                vergleichsAnzahl++;
            }
        }
        System.out.println("vergleichsAnzahl: " + vergleichsAnzahl);
        System.out.println("vertauschungsAnzahl: " + vertauschungsAnzahl);
    }


}