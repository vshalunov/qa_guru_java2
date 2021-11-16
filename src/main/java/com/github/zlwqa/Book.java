package com.github.zlwqa;

public class Book {

    String nameBook;
    int totalCountOfPages; // Общее кол-во страниц
    int countOfPagesRead; // Кол-во прочитанных страниц

    public void sayNameBook() {
        System.out.println(nameBook);
    }

    public void readToLeft() {
        int countOfPagesRemaining = totalCountOfPages - countOfPagesRead;
        if (countOfPagesRemaining == 0) {
            System.out.println("Поздравляем книга " + nameBook + " прочитана!");
        } else {
            System.out.println("В книге " + nameBook + " осталось прочитать " + countOfPagesRemaining + " страниц");
        }
    }
}
