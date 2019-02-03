package polimorfismo.exercicio1;

public class Employee
{

    private String name;
    private String cpf;
    private String email;
    private int record;
    private String dateOfBirth;
    private String function;
    private String password;

    public String Login (String email, String password)
    {
        return "Realizando Login com email";
    }

    public String Login (int record, String password)
    {
        return "Realizando Login com registro";
    }

    public Employee (String name, String cpf, String email, 
        int record, String dateOfBirth, 
        String function, String passwprd) {

            setName(name);
            setCPF(cpf);
            setEmail(email);
            setRecord(record);
            setDateOfBirth(dateOfBirth);
            setFunction(function);
            setPassword(password);

    }

    public void setName (String name)
    {
        this.name = name;
    }

    public String getName ()
    {
        return name;
    }

    public void setCPF (String cpf)
    {
        this.cpf = cpf;
    }

    public String getCPF ()
    {
        return cpf;
    }

    public void setEmail (String email)
    {
        this.email = email;
    }

    public String getEmail ()
    {
        return email;
    }

    public void setRecord (int record)
    {
        this.record = record;
    }

    public int getRecord ()
    {
        return record;
    }

    public void setDateOfBirth (String dateOfBirth)
    {
        this.dateOfBirth = dateOfBirth;
    }

    public String getDateOfBirth ()
    {
        return dateOfBirth;
    }

    public void setFunction(String function)
    {
        this.function = function;
    }

    public String getFunction ()
    {
        return function;
    }

    public void setPassword (String password)
    {
        this.password = password;
    }

    public String getPassword ()
    {
        return password;
    }

}