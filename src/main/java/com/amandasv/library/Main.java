package com.amandasv.library;

public class Main {

    public static void main(String[] args) {
        Welcome welcome = new Welcome();
        Printer printer = new Printer();

        printer.print(welcome.showMessage());
    }
}
