import java.io.*;
import java.util.*;

public class ReadingFunc {

    private List<String> list = new ArrayList<String>();
    private int j;
    private String line;
    String n="";
    String maxRepeated = "";
    List getList(String fileName) {
        String s;

        int i;
        String[] sws;


        try {
            BufferedReader br = new BufferedReader(new FileReader(fileName));

            while ((s = br.readLine()) != null) {
                s = s.replaceAll("\\s+", " ");
                s = s.replaceAll("\uFEFF", "");

                n=n+s;
                j++;
            }

            sws = n.split("\\s");
            list=new ArrayList(Arrays.asList(sws));
            Collections.sort(list);
            System.out.println(list);
            for (String word : list) {
                System.out.print("hhh "+word + ": " + Collections.frequency(list, word)+" "+"/n");
            }



            int sbs = 0;
            Map<String, Integer> counterMap = new HashMap<>();
                for (String word : list) {
                    if(!word.isEmpty()) {
                        Integer count = counterMap.get(word);
                        if(count == null) {
                            count = 0;
                        }
                        counterMap.put(word, ++count);
                    }
                }

                for(String word : counterMap.keySet()) {
                    System.out.println(word + ": " + counterMap.get(word));
                }



            Map<String, Integer> mp= new HashMap<String, Integer>();
                int count=0;

            for(i=0;i<list.size();i++){
                count=0;

                for(int j=0;j<list.size();j++){
                    if(list.get(i).equals(list.get(j))){
                        count++;
                    }
                }

                mp.put(list.get(i), count);
            }

            System.out.println("мож это "+mp);





            Set<String> uniqueWords = new HashSet<String>(list);
            for (String word : uniqueWords) {
                System.out.println("g "+word + ": " + Collections.frequency(list, word)+"/n");
            }




            List<String> listString = Arrays.asList(sws);
            Set<String> setString = new HashSet<String>(listString);

            int maxCount = 1;


            for(String inp: setString){
                count = Collections.frequency(listString, inp);
                if(count > maxCount){
                    maxCount = count;
                    maxRepeated = inp;

                }
            }
            System.out.println("финал  "+maxRepeated+" "+maxCount);










        }



        catch(IOException e){
            System.out.println("error" + e);
        }

        return list;
    }
    public int getJ () {
        return j;
    }}



