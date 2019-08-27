package by.etc.basic_oop.task_one;

public class File {
 private String name;
 private boolean isDeleted;
 private Directory directory;

    public File(String name ,Directory directory) {
        isDeleted=false;
        this.name=name;
        this.directory = directory;
    }


    static File create(String name ,Directory directory){
     return new File(name,directory);
 }

    void rename(String name) {
        if (isDeleted()) {
            System.out.println("File is not create");
        } else {
            this.name = name;
        }
    }
    void delete(){
        setDeleted(true);
    }

    public String getName() {
        return name;
    }

     boolean isDeleted() {
        return isDeleted;
    }

     void setDeleted(boolean deleted) {
        isDeleted = deleted;
    }
}
