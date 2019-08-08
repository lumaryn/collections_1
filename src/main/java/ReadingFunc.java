import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

class ReadingFunc extends InputFileName{

    void getList() {
        String first;
        StringBuilder last= new StringBuilder();
        String maxRepeated = "";
        String[] arrayString;

        try {
            BufferedReader br = new BufferedReader(new FileReader(fileName));

            while ((first = br.readLine()) != null) {
                first += " ";
                first = first.replaceAll("\\s+", " ");
                first = first.replaceAll("\uFEFF", "");
                last.append(first);
            }
            br.close();

            arrayString = last.toString().split("\\s");
            List<String> list = new ArrayList(Arrays.asList(arrayString));
            Collections.sort(list);
            System.out.println("Всего слов "+ list.size()+": "+ list);

            Set<String> set=new LinkedHashSet<>(list);
            System.out.println("Уникальные слова "+set.size()+": "+set);
            int count;
            int maxCount = 1;
            for(String inp: set){
                count = Collections.frequency(list, inp);
                if(count > maxCount){
                    maxCount = count;
                    maxRepeated = inp;
                }
            }
            System.out.println("Самое часто встречающееся слово "+maxRepeated+": "+maxCount);

            Map<String, Integer> counterMap = new TreeMap<>();
                for (String word : list) {
                    if(!word.isEmpty()) {
                        Integer coun = counterMap.get(word);
                        if(coun == null) {
                            coun = 0;
                        }
                        counterMap.put(word, ++coun);
                    }
                }
                System.out.println("Cколько раз каждое слово встречается в файле: ");
                for(String word : counterMap.keySet()) {
                    System.out.println(word + ":" + counterMap.get(word)+" ");
                }
        }
        catch(IOException e){
            System.out.println("error" + e);
        }
    }
}



