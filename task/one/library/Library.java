package by.etc.task.one.library;

import java.util.ArrayList;

public  class Library {
   public static ArrayList<Catalog> catalogs;

    public Library() {
       catalogs=new ArrayList<>();
    }

    public void addCatalogInLibrary(Catalog catalog, int index){
        catalogs.set(index,catalog);
    }
}
