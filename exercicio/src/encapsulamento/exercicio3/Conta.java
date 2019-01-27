package encapsulamento.exercicio3;

public class Conta
{
    public Conta ( int NumeroConta)
    {
        setNumeroConta(NumeroConta);
    }

    private int NumeroConta;
    private float saldo;

    public void setNumeroConta ( int NumeroConta)
    {
        this.NumeroConta = NumeroConta;
    }

    public int getNumeroConta()
    {
        return NumeroConta;
    }

    public float getSaldo()
    {
        return saldo;
    }

    private boolean validarSaque ( float valor )
    {
        return saldo >= this.saldo;
    }

    private boolean validarConta (int numero)
    {
        return this.NumeroConta == numero;
    }

    public void deposito ( int numero, float valor)
    {

        if ( validarConta(numero))
        {
            this.saldo += valor;
        }
    }

    public void saque ( int numero, float valor)
    {
        if ( validarConta(numero) && validarSaque(valor))
        {
            this.saldo -= valor;
        }
    }

}