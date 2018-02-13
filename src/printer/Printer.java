package printer;

public class Printer {
    private int tonerLevel = 25;
    private boolean isDuplex = false;
    private int pagesPrinted = 0;

    public Printer(){}

    public Printer(int tonerLevel, boolean isDuplex) {
        if(tonerLevel > 0 && tonerLevel <= 100){
            this.tonerLevel = tonerLevel;
        }

        this.isDuplex = isDuplex;
    }

    public int fillToner(int amount){
        if(amount + tonerLevel <= 100){
            return amount + tonerLevel;
        }
        return -1;
    }

    public void tonerLevel(){
        System.out.println("Toner: "+ tonerLevel);
    }
    public void printPage(){
        System.out.println("Number of pages printed "+ pagesPrinted);
        pagesPrinted++;
        tonerLevel = tonerLevel- 5;
    }
}
