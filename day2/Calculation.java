public class Calculation {
    public static void main(String[] args) {
        int capital=20000;
        int qty=25;
        int profitPointsMonthly=1000;
        int n=1;
        long profit = 0;
        int i=0;
        int capital1=20000;

        while(i<=n)
        {
            
            if(capital1>=(2*capital))
            {
                capital=capital1;
                i+=1;
                qty =qty+25;
                capital1=capital+(qty*profitPointsMonthly);
            }
            else
            {
                capital=capital1;
                i+=1;
                capital1=capital+(qty*profitPointsMonthly);
                
            }

        }

        System.out.println(capital);
    }
}
