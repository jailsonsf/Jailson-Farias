package encapsulamento.exercicio4;

import java.util.ArrayList;

public class SchoolAgenda
{

    ArrayList<Grades> grades;
    private Grades n;

    public void add(String owner, String text)
    {
        n = new Grades (owner, text);
        grades.add(n);
    }

    public boolean remover()
    {
        return grades.remove(n);
    }

    public void atualizar(String dono, String text, int idNota)
    {
        Grades n = grades.get(idNota);

        if ( n.getOwner().equals(dono) )
        {
            n.setOwner(dono);
            n.setText(text);
        }
    }

    public ArrayList<Grades> listarTrue(String owner)
    {
        ArrayList<Grades> EstateTrue = new ArrayList<Grades>();

        for ( Grades n : EstateTrue )
        {
            if ( owner.equals(n.getOwner()) && n.isEstate() )
            {
                EstateTrue.add(n);
            }
        }
        return EstateTrue;
    }

    public ArrayList<Grades> listarFalse(String owner)
    {
        ArrayList<Grades> EstateFalse = new ArrayList<Grades>();

        for ( Grades n : EstateFalse )
        {
            if ( owner.equals(n.getOwner()) && n.isEstate() )
            {
                EstateFalse.add(n);
            }
        }
        return EstateFalse;
    }

    public void finalizar(String owner, int idGrades)
    {
        if ( owner.equals(grades.get(idGrades).getOwner()) )
        {
            grades.get(idGrades).setEstate(false);
        }
    }

}