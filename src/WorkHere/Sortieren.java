package WorkHere;

public class Sortieren {

    public static int quickVertausche = 0;
    public static int quickVergleiche = 0;

    public static void main(String[] args) {
        int[] array=new int[4000];

        Help.generateArray(array);//Array mit Zufallszahlen füllen
        Help.print(array);

        //Array in der Konsole ausgeben lassen



        for (int i = 0; i < 10; i++) {
            bubbleSort(array);//Array in der Konsole ausgeben lassen
            Help.generateArray(array);              //Array mit Zufallszahlen füllen
        }
        for (int i = 0; i < 10; i++) {
            selectionSort(array);//Array in der Konsole ausgeben lassen
            Help.generateArray(array);              //Array mit Zufallszahlen füllen
        }
        for (int i = 0; i < 10; i++) {
            quickVertausche = 0;
            quickVergleiche = 0;
            System.out.println("quickSort");
            quickSort(array,0, array.length-1);//Array in der Konsole ausgeben lassen
            System.out.println((quickVergleiche+quickVertausche));
            Help.generateArray(array);              //Array mit Zufallszahlen füllen
        }
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
        System.out.println("AAAAAAAA: " + (vergleichsAnzahl + vertauschungsAnzahl));
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
        System.out.println("AAAAAAAA: " + (vergleichsAnzahl + vertauschungsAnzahl));
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
        System.out.println("AAAAAAAA: " + (vergleichsAnzahl + vertauschungsAnzahl));
    }
    public static void quickSort(int[] array, int start, int end){

        int i = start;
        int j = end;
        int middle = (j+i)/2;
        int pivot = array[middle];
        while(i<=j){
            quickVergleiche++;
            while(array[i] < pivot){
                i++;
                quickVergleiche++;
            }
            quickVergleiche++;
            while(array[j] > pivot){
                j--;
                quickVergleiche++;
            }
            quickVergleiche++;
            if(i<=j){
                Help.swap(array,i,j);
                quickVertausche++;
                i++;
                j--;
            }
            quickVergleiche++;


        }
        quickVergleiche++;
        if (i<end){
            quickSort(array,i,end);
        }
        if(start < j){
            quickSort(array,start,j);
        }
    }
}