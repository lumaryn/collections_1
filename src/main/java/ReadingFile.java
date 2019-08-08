import java.util.*;

public class ReadingFile {

        public static void main(String[] args) {
            int j;
            List <String> list = new ArrayList <String>();
            ReadingFunc rf = new ReadingFunc();
            list = rf.getList("C:\\Users\\admin\\Desktop\\test.txt");
            j=rf.getI();
           // System.out.println(list);
            System.out.println("Всего слов "+j);
    }
}


