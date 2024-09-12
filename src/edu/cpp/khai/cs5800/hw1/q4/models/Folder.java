package edu.cpp.khai.cs5800.hw1.q4.models;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Folder {
    private String name;
    private List<File> files;
    private List<Folder> subFolders;

    public Folder(String name) {
        this.name = name;
        this.files = new ArrayList<>();
        this.subFolders = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<File> getFiles() {
        return files;
    }

    public File addFile(String name) {
        File file = new File(name);
        this.files.add(file);
        return file;
    }

    public List<Folder> getSubFolders() {
        return subFolders;
    }

    public Folder createSubFolder(String name) {
        Folder folder = new Folder(name);
        this.subFolders.add(folder);
        return folder;
    }

    public boolean deleteFile(String name) {
        Iterator<File> iterator = this.files.iterator();
        while (iterator.hasNext()) {
            File file = iterator.next();
            if (file.getName().equals(name)) {
                iterator.remove();
                return true;
            }
        }

        return false;
    }

    public boolean deleteSubFolder(String name) {
        Iterator<Folder> iterator = this.subFolders.iterator();
        while (iterator.hasNext()) {
            Folder folder = iterator.next();
            if (folder.getName().equals(name)) {
                String folderName = folder.getName();
                iterator.remove();
                System.out.println("Deleted: " + folderName);
                return true;
            }
        }

        return false;
    }

    public void print(int level) {
        for (int i = 0; i < level; i++) {
            System.out.print("|--");
        }
        System.out.println(name);
        for (Folder folder : this.subFolders) {
            folder.print(level + 1);
        }

        for (File file : this.files) {
            file.print(level + 1);
        }
    }
}
