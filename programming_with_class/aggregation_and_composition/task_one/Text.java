package by.etc.programming_with_class.aggregation_and_composition.task_one;

 class Text {
    private String head;
    private String fullText;
    private Sentence[] sentences;

     Text(Sentence[] sentences, String head) {
        this.head = head;
        this.sentences = sentences;
        makeHead();
        makeText();
    }

  private   void makeText() {
        for (Sentence s : sentences) {
            fullText += s.getSentence();
        }
    }

   private void makeHead() {
        fullText = "\t" + getHead() + "\n";
    }

    void add(String sentence) {
        fullText += sentence;
    }

    String getHead() {
        return head;
    }

    String getFullText() {
        return fullText;
    }

}
