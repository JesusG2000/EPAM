package by.etc.basic_oop.task_one;

 class TextFile extends File {
     private String name;
     private String content;
     private Directory directory;

     TextFile(String name, String content, Directory directory) {
         super(name, directory);
         this.name = name;
         this.content = content;
         this.directory = directory;
     }

     static TextFile create(String name, String content, Directory directory) {
         return new TextFile(name, content, directory);
     }

     void add(String content) {
         if (isDeleted()) {
             System.out.println("File is not create");
         } else {
             this.content += content;
         }
     }

     void showContent() {
         if (isDeleted()) {
             System.out.println("File is not create");
         } else {
             System.out.println(content);
         }
     }
 }
