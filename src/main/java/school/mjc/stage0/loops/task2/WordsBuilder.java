package school.mjc.stage0.loops.task2;

public class WordsBuilder {
    public void buildPhrase(char... chars) {
        StringBuilder phrase = new StringBuilder();
        for (char ch : chars) {
            phrase.append(ch);
        }
        System.out.println(phrase.toString());
    }
}
