package by.andervyd.design_patterns.structural.bridge;

public class StockExchange extends Program {

    protected StockExchange(Developer developer) {
        super(developer);
    }

    @Override
    public void developProgram() {
        System.out.println("Stock Exchange developments is progress...");
        developer.writeCode();
    }
}
