package pl.com.empas.java_introductory_course.io.examples;

import java.io.IOException;
import java.nio.file.*;
import java.util.ArrayList;
import java.util.List;

public class FileCopyExample {
    public static void main(String[] args) throws IOException {

        //tutaj wstaw np. "C:\" zamiast "/"
        List<Path> paths = getChildrenFilesFlat(Paths.get("/Volumes/DATA/Projects"));
        //tutaj zamiast "/Volumes/DATA/" wstaw katalog do któ®ego masz dostęp, a zawiera pliki .class
        Path target = Paths.get("/Volumes/DATA/CopyTest");
        //Stwórz jeżeli katalog nie istnieje
        if(!Files.exists(target))
            Files.createDirectory(target);

        //wyfiltruj pliki .class
        paths.stream().filter(x -> x.toString().endsWith(".class"))
                //i dla każdego z nich skopiuj do katalogu docelowego
                //a następnie skasuj źródło
                //!!! UWAGA dobieraj katalogi ostrożnie
                .forEach(x -> {
                    copy(x, target);
                    delete(x);
                });

    }


    //Metoda rekurencyjna getChildrenFilesFlat
    //Dla każdego z podkatalogów katalogu wskazanego przez Path, wykonaj metodę getChildrenFilesFlat
    //jeżeli nie ma podkatalogów, dodaj wszystkie pliki

    //ta metoda zwróci płaską listę ścieżek do wszystkich plików, ale już nie katalogów
    public static List<Path> getChildrenFilesFlat(Path path) throws IOException {

        //Pobierz strumień katalogów
        DirectoryStream<Path> stream = Files.newDirectoryStream(path);
        List<Path> list = new ArrayList<>();
        for(Path p : stream) {
            if(Files.isDirectory(p)) {
                list.addAll(getChildrenFilesFlat(p));
            } else {
                list.add(p);
            }
        }

        return list;
    }


    //Unchecked exc copy wrapper
    //Ponieważ w lambdzie nie możemy użyć metody, która rzuca wyjątek (bez obsłużenia go)
    //opakowujemy
    public static void copy(Path source, Path target) {
        try {
            //ścieżka target wskazuje na katalog, my potrzebujemy konkretnego pliku
            //tworzymy ze ścieżki target ścieżkę do konkretnego pliku pobierając nazwę samego pliku źródłowego
            Path targetFile = Paths.get(target.toAbsolutePath().toString(), source.getFileName().toString());
            Files.copy(source, targetFile,
                    StandardCopyOption.REPLACE_EXISTING); //Zastępujemy już istniejące pliki
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void delete(Path source) {
        try {
            Files.delete(source);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
