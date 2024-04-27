package ru.liga.dcs.lesson01;
//DONE
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Класс FolderTree02 представляет собой структуру дерева папок.
 * Этот класс предоставляет методы для работы с деревом папок, включая поиск папок по заданному критерию.
 */
public class FolderTree02 {

    static class Folder {
        private final String name;
        private final List<Folder> children;

        Folder(String name) {
            this.name = name;
            this.children = new ArrayList<>();
        }

        void addChild(Folder child) {
            children.add(child);
        }

        public String getName() {
            return name;
        }

        public List<Folder> getChildren() {
            return children;
        }
    }

    /**
     * Возвращает список имен папок, содержащих подстроку "pron".
     *
     * @param folder Корневая папка для поиска.
     * @return Список имен папок.
     */
    public List<String> findFoldersContainingPron(Folder folder) {
        return folder.getChildren().stream().map(Folder::getName).filter(name -> name.contains("pron")).collect(Collectors.toList());
    }

}
