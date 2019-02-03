package encapsulamento.exercicio3;

public class Account
{
    public Account ( int numberAccount)
    {
        setNumberAccount(numberAccount);
    }

    private int numberAccount;
    private float balance;

    public void setNumberAccount ( int numberAccount)
    {
        this.numberAccount = numberAccount;
    }

    public int getNumberAccount()
    {
        return numberAccount;
    }

    public float getBalance()
    {
        return balance;
    }

    private boolean validCashWithdrawal ( float value )
    {
        return balance >= this.balance;
    }

    private boolean validAccount (int number)
    {
        return this.numberAccount == number;
    }

    public void deposit ( int number, float value)
    {

        if ( validAccount(number))
        {
            this.balance += value;
        }
    }

    public void cashWithdrawal ( int number, float value)
    {
        if ( validAccount(number) && validCashWithdrawal(value))
        {
            this.balance -= value;
        }
    }
}