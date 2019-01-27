package encapsulamento.exercicio4;

import java.util.ArrayList;

public class Agenda
{

    ArrayList<Nota> notas;
    private Nota n;

    public void adicionar(String dono, String texto)
    {
        n = new Nota (dono, texto);
        notas.add(n);
    }

    public boolean remover()
    {
        return notas.remove(n);
    }

    public void atualizar(String dono, String texto, int idNota)
    {
        Nota n = notas.get(idNota);

        if ( n.getDono().equals(dono) )
        {
            n.setDono(dono);
            n.setTexto(texto);
        }
    }

    public ArrayList<Nota> listarTrue(String dono)
    {
        ArrayList<Nota> EstadoTrue = new ArrayList<Nota>();

        for ( Nota n : EstadoTrue )
        {
            if ( dono.equals(n.getDono()) && n.isEstado() )
            {
                EstadoTrue.add(n);
            }
        }
        return EstadoTrue;
    }

    public ArrayList<Nota> listarFalse(String dono)
    {
        ArrayList<Nota> EstadoFalse = new ArrayList<Nota>();

        for ( Nota n : EstadoFalse )
        {
            if ( dono.equals(n.getDono()) && n.isEstado() )
            {
                EstadoFalse.add(n);
            }
        }
        return EstadoFalse;
    }

    public void finalizar(String dono, int idNota)
    {
        if ( dono.equals(notas.get(idNota).getDono()) )
        {
            notas.get(idNota).setEstado(false);
        }
    }

}