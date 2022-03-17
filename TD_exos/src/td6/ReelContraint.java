package td6;

public class ReelContraint {


    public ReelContraint (double minPropose, double maxPropose)
    {
           if(minPropose>maxPropose)
           {
               this.min=maxPropose;
               this.max=minPropose;
           }
           else
           {
               this.min=minPropose;
               this.max=maxPropose;
           }

           this.val= (this.min+this.max)/2;
    }


    public ReelContraint(double minPropose, double maxPropose, double valProposee)
    {
            if(minPropose>maxPropose)
            {
                this.min=maxPropose;
                this.max=minPropose;
            }
            else
            {
                this.min=minPropose;
                this.max=maxPropose;
            }

            if(valProposee > this.max || valProposee < this.min)
            {
                this.val= (this.min+this.max)/2;
            }
            else
            {
                this.val=valProposee;
            }
    }


    public void afficheValeur()
    {
        System.out.println(this.val);
    }



    public double getVal (){
        return val;
    }

    public double getMax() {
        return max;
    }

    public double getMin() {
        return min;
    }

    public void setVal (double valProposee)
    {
        if(valProposee <= this.max && valProposee >= this.min)
        {
            this.val=valProposee;
        }
        else if(valProposee > max)
        {
            this.val=this.max;
        }
        else
        {
            this.val=this.min;
        }

    }



    private final double min;
    private final double max;
    private double val;

}