import java.io.*;
import java.util.*;

public class ReadingFunc {

    private List<String> list = new ArrayList<String>();
    private int j;
    private String line;
    String n="";
    List getList(String fileName) {
        String s;

        int i;
        String[] sws = null;


        try {
            BufferedReader br = new BufferedReader(new FileReader(fileName));

            while ((s = br.readLine()) != null) {
                s = s.replaceAll("\\s+", " ");
                s = s.replaceAll("\uFEFF", "");

                n=n+s;
                j++;


/*        for (i = 0; i < sws.length; i++) {
            list.add(sws[i]);
        }*/
            //Collections.sort(list);

        } sws = n.split("\\s");
            //List<String>  list =new ArrayList<String>(Arrays.asList(sws));
                list=new ArrayList(Arrays.asList(sws));
            Collections.sort(list);
            System.out.println(list);


        }



        catch(IOException e){
            System.out.println("error" + e);
        }

        return list;
    }
    public int getJ () {
        return j;
    }}



