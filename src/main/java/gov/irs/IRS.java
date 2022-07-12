package gov.irs;

class IRS {

    private TaxPayer[] taxPayers = new TaxPayer[100];
    private int currentIndex = 0; // for dealing with the array

    void register(TaxPayer taxPayer){
        taxPayers[currentIndex] = taxPayer;
        currentIndex++;
    }
    double computeTotalMonthlyTaxToCollect(){
        double employeeTaxTotal = 0;
        for (int i = 0; i <currentIndex ; i++) {
            employeeTaxTotal += taxPayers[i].computeMonthlyTaxToPay();
        }
         return employeeTaxTotal;
    }

    public int getCurrentIndex() {
        return currentIndex;
    }
}