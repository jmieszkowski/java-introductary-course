package pl.com.empas.java_introductory_course.collections.tasks.task4_WordCounter;

import java.util.*;

public class WordCounter {

    static String loremIpsum = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Proin nibh augue, suscipit a," +
            " scelerisque sed, lacinia in, mi. Cras vel lorem. Etiam pellentesque aliquet tellus. Phasellus pharetra " +
            "nulla ac diam. Quisque semper justo at risus. Donec venenatis, turpis vel hendrerit interdum, dui ligula " +
            "ultricies purus, sed posuere libero dui id orci. Nam congue, pede vitae dapibus aliquet, elit magna " +
            "vulputate arcu, vel tempus metus leo non est. Etiam sit amet lectus quis est congue mollis. Phasellus " +
            "congue lacus eget neque. Phasellus ornare, ante vitae consectetuer consequat, purus sapien ultricies " +
            "dolor, et mollis pede metus eget nisi. Praesent sodales velit quis augue. Cras suscipit, urna at aliquam " +
            "rhoncus, urna quam viverra nisi, in interdum massa nibh nec erat.";

    static String hamlet = "To be, or not to be? That is the question—\n" +
            "Whether ’tis nobler in the mind to suffer\n" +
            "The slings and arrows of outrageous fortune,\n" +
            "Or to take arms against a sea of troubles,\n" +
            "And, by opposing, end them? To die, to sleep—\n" +
            "No more—and by a sleep to say we end\n" +
            "The heartache and the thousand natural shocks\n" +
            "That flesh is heir to—’tis a consummation\n" +
            "Devoutly to be wished! To die, to sleep.\n" +
            "To sleep, perchance to dream—ay, there’s the rub,\n" +
            "For in that sleep of death what dreams may come\n" +
            "When we have shuffled off this mortal coil,\n" +
            "Must give us pause. There’s the respect\n" +
            "That makes calamity of so long life.";


    public Map<String, Integer> getTop5WordsCount(String text) {
        Map<String, Integer> wordCount = new HashMap<>();
        //ugly
//        text = text.replace(",","");
//        text = text.replace(".", "");
//        text = text.replace(":","");
//        text = text.replace(";","");
//        text = text.replace("\n","");
//        text = text.replace("(","");
//        text = text.replace(")","");
//        String [] words = text.toLowerCase().split((" "));
        //neat
        String [] words = text.replaceAll("[^a-zA-Z ]", "").toLowerCase().split("\\s+");

        for(String w : words) {
            if(!wordCount.containsKey(w)) {
                wordCount.put(w, 0);
            }
            wordCount.put(w, wordCount.get(w) + 1);
        }

        Map<String, Integer> top5  = new TreeMap<>();
        List<Map.Entry<String, Integer>> mapEntryList = new ArrayList<>(wordCount.entrySet());
        mapEntryList.sort(new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return o1.getValue() == o2.getValue() ? 0 :
                        o1.getValue() > o2.getValue() ? -1 : 1;
            }
        });

        int occurencesCount = 1;
        int currentCount = mapEntryList.get(0).getValue();
        ListIterator<Map.Entry<String, Integer>> iterator = mapEntryList.listIterator();
        while(iterator.hasNext()) {
            Map.Entry<String, Integer> entry = iterator.next();
            if(entry.getValue() < currentCount) {
                if(occurencesCount++ >=5)
                    break;
                currentCount = entry.getValue();
            }
            top5.put(entry.getKey(), entry.getValue());
        }


        return top5;

    }

    public static void main(String [] args) {
        WordCounter counter = new WordCounter();

        System.out.println("Top 5 words count for Hamlet is: " + counter.getTop5WordsCount(hamlet));
        System.out.println("Top 5 words count for LoremIpsum is: " + counter.getTop5WordsCount(loremIpsum));
    }

}
