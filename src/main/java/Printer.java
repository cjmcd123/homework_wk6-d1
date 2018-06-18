public class Printer {

    private int pagesLeft;
    private int toner;

    public Printer(){
        this.pagesLeft = 100;
        this.toner = 50;
    }

    public int pagesLeft() {
        return this.pagesLeft;
    }

    public void print(int pages, int copies) {
        int total;
        total = pages * copies;
        if (total <= this.pagesLeft()){
            this.pagesLeft = this.pagesLeft - total;
            this.toner = this.toner - total;
        }
    }

    public void fill() {
        this.pagesLeft = 100;
    }

    public int getToner() {
        return this.toner;
    }
}
