package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Author chukovsky = new Author("Корней","Чуковский");
        Author pushkin = new Author("Александр","Пушкин");
        Book muha = new Book("Муха-Цокотуха",chukovsky,1923);
        Book dochka = new Book("Капитанская дочка", pushkin, 1839);
        dochka.setYear(1841);
    }
}
