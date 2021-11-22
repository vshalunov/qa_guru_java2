package com.github.zlwqa;

public class  Main {
    public static void main(String[] args) {
        Book.sayClassName();// Для обучения
        System.out.println(Book.commonName); // Для обучения

        Book lagom = new Book("Lagom", "Карлссон Элизабет", 200, 10);
        lagom.cover = new Book.Cover("Голубой");
        lagom.cover.sayColorCover();
        lagom.sayNameBook();
        lagom.sayNameAuthor();
        lagom.readToLeft();
        lagom.setCountOfPagesRead(200);
        lagom.readToLeft();

        lagom.setTotalCountOfPages(0); // Проверка else у setTotalCountOfPages
        lagom.setCountOfPagesRead(-1);//  Проверка else у setCountOfPagesRead

        Book uve = new Book("Uve","Фредрик Бакман", 490, 380);
        uve.cover = new Book.Cover("Серый");
        uve.cover.sayColorCover();
        uve.sayNameBook();
        uve.sayNameAuthor();
        uve.readToLeft();
        uve.setTotalCountOfPages(380);
        uve.readToLeft();

        Book hygge = new Book("Hygge", "Викинг Майк", 288, 103);
        hygge.cover = new Book.Cover("Бежевый");
        hygge.cover.sayColorCover();
        hygge.sayNameBook();
        hygge.sayNameAuthor();
        hygge.readToLeft();
    }
}
