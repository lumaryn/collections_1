import java.util.Scanner;

public class InputFileName {

    static String fileName;

    void setFileName(){
        System.out.println("Укажите путь к файлу. Пример: C:\\\\Users\\\\admin\\\\Desktop\\\\test.txt");
        Scanner sc = new Scanner(System.in);
        fileName = sc.nextLine();
        sc.close();
    }

    public static String getFileName(){
        return fileName;
    }
}
