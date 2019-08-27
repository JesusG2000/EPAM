package by.etc.programming_with_class.aggregation_and_composition.task_one;

public class TextTest {
    public static void main(String[] args) {
        Sentence[] sentences = new Sentence[3];
        for (int i = 0; i < sentences.length; i++) {
            Word[] words = new Word[5];
            for (int y = 0; y < words.length; y++) {
                words[y] = new Word("Test");
            }
            sentences[i] = new Sentence(words);
        }
        Text text = new Text(sentences,"Something");
        text.add("ky");
        System.out.println(text.getHead());
        System.out.println(text.getFullText());
    }
}
