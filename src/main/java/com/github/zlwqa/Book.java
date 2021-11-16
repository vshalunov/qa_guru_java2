package com.github.zlwqa;

public class Book {
    public static String commonName = "Книга";
    private String nameBook;
    private String nameAuthor;
    private int totalCountOfPages; // Общее кол-во страниц
    private int countOfPagesRead; // Кол-во прочитанных страниц
    Cover cover;

    public Book(String nameBook, String nameAuthor, int totalCountOfPages, int countOfPagesRead) {
        this.nameAuthor = nameAuthor;
        this.nameBook = nameBook;
        this.totalCountOfPages = totalCountOfPages;
        this.countOfPagesRead = countOfPagesRead;

    }


    public String getNameBook() {
        return nameBook;
    }

    public void setNameBook(String nameBook) {
        this.nameBook = nameBook;
    }

    public String getNameAuthor() {
        return nameAuthor;
    }

    public void setNameAuthor(String nameAuthor) {
        this.nameAuthor = nameAuthor;
    }

    public int getTotalCountOfPages() {
        return totalCountOfPages;
    }

    public void setTotalCountOfPages(int totalCountOfPages) {
        if (totalCountOfPages > 0) {
            this.totalCountOfPages = totalCountOfPages;
        } else {
            System.out.println("В книге должно быть больше чем 0 страниц\n");
        }
    }

    public int getCountOfPagesRead() {
        return countOfPagesRead;
    }

    public void setCountOfPagesRead(int countOfPagesRead) {
        if (countOfPagesRead >= 0 && countOfPagesRead <= totalCountOfPages) {
            this.countOfPagesRead = countOfPagesRead;
        } else {
            System.out.println("Общее кол-во прочитанных страниц должно быть положительным числом " +
                    "\nи меньше или равно кол-ву всех страниц в книге\n");
        }
    }

    public void sayNameBook() {
        System.out.println("Название книги: " + nameBook + " ");
    }

    public void sayNameAuthor() {
        System.out.println("Имя автора: " + nameAuthor);
    }

    public static void sayClassName() {
        System.out.println(Book.class.getName());
    }

    public void readToLeft() {
        int countOfPagesRemaining = totalCountOfPages - countOfPagesRead;
        if (countOfPagesRemaining == 0) {
            System.out.println("Поздравляем книга " + nameBook + " прочитана!\n");
        } else {
            System.out.println("В книге " + nameBook + " осталось прочитать " + countOfPagesRemaining + " страниц\n");
        }
    }

    static class Cover {
        String color;

        public Cover(String color) {
            this.color = color;
        }

        public void sayColorCover() {
            System.out.println("Цвет обложки: " + color);
        }
    }
}
