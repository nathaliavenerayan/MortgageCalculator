//THIS IS THE MODEL
//COMMS WITH THE OUTSIDE THRU STRINGS
//PERFORMS ITS CALCS IN DOUBLE FOR p/i AND INT FOR a

package ca.yorku.eecs.mcalc;

public class MortgageModel
{
    private double principle;
    private double interest;
    private int amortization;

    public MortgageModel(String p, String a, String i)
    {
        //code
        this.principle = Double.parseDouble(p);
        this.amortization = Integer.parseInt(a);
        this.interest = Double.parseDouble(i);
    }

    public String computePayment()
    {
        //code
        double r = this.interest / 1200;
        int n = this.amortization * 12;
        double computation = (r * this.principle) / (1 - Math.pow(1 + r,-n));
        String result = String.format("$%,.2f", computation);
        return result;
    }

    public static void main(String[] args)
    {
        MortgageModel myModel = new MortgageModel("700000", "25", "2.75");
        System.out.println(myModel.computePayment());

        myModel = new MortgageModel("300000", "20", "4.50");
        System.out.println(myModel.computePayment());
    }
}
