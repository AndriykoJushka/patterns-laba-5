class Printer {
    void print(String document) {
        System.out.println("Printing: " + document);
    }
}

class SecurePrinter extends Printer {
    void printSecurely(String document) {
        System.out.println("Printing securely: " + document);
        print(document);
    }
}
