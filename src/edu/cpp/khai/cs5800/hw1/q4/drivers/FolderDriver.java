package edu.cpp.khai.cs5800.hw1.q4.drivers;

import edu.cpp.khai.cs5800.hw1.q4.models.Folder;

public class FolderDriver {
    public static void main(String[] args) {
        Folder phpDemo1 = new Folder("php_demo1");
        Folder SourceFiles = phpDemo1.createSubFolder("Source Files");
        SourceFiles.createSubFolder(".phalcon");

        Folder app = SourceFiles.createSubFolder("app");
        app.createSubFolder("config");
        app.createSubFolder("controller");
        app.createSubFolder("library");
        app.createSubFolder("migration");
        app.createSubFolder("models");
        app.createSubFolder("views");

        SourceFiles.createSubFolder("cache");
        SourceFiles.createSubFolder("public");

        SourceFiles.addFile(".htaccess");
        SourceFiles.addFile(".htrouter.php");
        SourceFiles.addFile("index.html");

        phpDemo1.createSubFolder("Include Path");
        phpDemo1.createSubFolder("Remote Files");
        phpDemo1.print();
        System.out.println("-------------------------");

        SourceFiles.deleteSubFolder("app");
        phpDemo1.print();
        System.out.println("-------------------------");

        SourceFiles.deleteSubFolder("public");
        phpDemo1.print();
    }
}
