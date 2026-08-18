package Cap4.Questions.CreditLimit;

public class CreditAccount
{
    private int num;
    private int initialBalance;
    private int monthlyBilling;
    private int appliedCredit;
    private int limitCredit;

    public CreditAccount(int num, int initialBalance, int monthlyBilling,
                         int appliedCredit, int limitCredit)
    {
        this.num = num;
        if (initialBalance >= 0)
            this.initialBalance = initialBalance;
        if (monthlyBilling >= 0)
            this.monthlyBilling = monthlyBilling;
        if (appliedCredit >= 0)
            this.appliedCredit = appliedCredit;
        if (limitCredit >= 0)
            this.limitCredit = limitCredit;
    }

    public void setNum(int num)
    {
        this.num = num;
    }

    public int getNum()
    {
        return num;
    }

    public void setInitialBalance(int initialBalance)
    {
        if (initialBalance >= 0)
            this.initialBalance = initialBalance;
    }

    public int getInitialBalance()
    {
        return initialBalance;
    }

    public void setMonthlyBilling(int monthlyBilling)
    {
        if (monthlyBilling >= 0)
            this.monthlyBilling = monthlyBilling;
    }

    public int getMonthlyBilling()
    {
        return monthlyBilling;
    }

    public void setAppliedCredit(int appliedCredit)
    {
        if (appliedCredit >= 0)
            this.appliedCredit = appliedCredit;
    }

    public int getAppliedCredit()
    {
        return appliedCredit;
    }

    public void setLimitCredit(int limitCredit)
    {
        if (limitCredit >= 0)
            this.limitCredit = limitCredit;
    }

    public int getLimitCredit()
    {
        return limitCredit;
    }
}
