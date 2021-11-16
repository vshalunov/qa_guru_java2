package com.github.zlwqa;

public class Main {
    public static void main(String[] args) {

        Book lagom = new Book();
        lagom.nameBook = "Lagom";
        lagom.totalCountOfPages = 200;
        lagom.countOfPagesRead = 200;
        lagom.sayNameBook();
        lagom.readToLeft();

        Book uve = new Book();
        uve.nameBook = "Uve";
        uve.totalCountOfPages = 490;
        uve.countOfPagesRead = 380;
        uve.sayNameBook();
        uve.readToLeft();
    }

}
