import java.io.*;
import java.util.*;

public class ReadingFun {

    private List<String> list = new ArrayList<String>();
    private HashMap<String, String> hm = new HashMap<>();
    private int j;
    private List<String[]> lll = new ArrayList<String[]>();
    private String line;

    List getList(String fileName) {
        String s;
        int i;
        String[] sws = null;


        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(fileName)));


            while ((line = br.readLine()) != null) {
                lll.add(line.split("\\s+"));}
           for (i = 0; i < lll.size(); i++){
            System.out.println("Found duplicate ... handle logic  "+lll);}


            while ((s = br.readLine()) != null) {
                s = s.replaceAll("\\s+", " ");
                //list.add(s);
                    sws = s.split("\\s");


                j++;
                if (hm.containsKey(sws[0])) {
                    System.out.println("Found duplicate ... handle logic");
                }
                hm.put(sws[j], sws[j]); //if index==0 is ur key
            }
            System.out.println(hm+" rjy");








/*        for (i = 0; i < sws.length; i++) {
            list.add(sws[i]);
        }*/
        Collections.sort(list);

    }



            catch(IOException e){
                    System.out.println("error" + e);
                }

                return list;
            }
            public int getJ () {
                return j;
            }}



