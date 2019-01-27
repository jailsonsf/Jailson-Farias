package heranca.exercicio5;

public abstract class RadioRelogio implements Radio, Relogio
{

    private String horario;
    private String despertar;
    private String horarioAlarme;
    private String emissora;
    private String tipoEmissora;
    private int volumeRadio;
    private int volumeRelogio;

    public String getAlarme()
    {
        return despertar;
    }

    @Override
    public void setEmissora (String emissora, String tipoEmi)
    {
        this.emissora = emissora;
        this.tipoEmissora = tipoEmi;
    }

    @Override
    public String getEmissora ()
    {
        return emissora;
    }

    @Override
    public String getTipoEmi ()
    {
        return tipoEmissora;
    }

    @Override
    public void setVolumeRadio (int volumeRadio)
    {
        this.volumeRadio = volumeRadio;
    }

    @Override
    public int getVolumeRadio ()
    {
        return volumeRadio;
    }

    @Override
    public void setHorario (String horario)
    {
        this.horario = horario;
    }

    @Override
    public String getHorario ()
    {
        return horario;
    }

    @Override
    public void setHorarioAlarme (String horarioAlarme)
    {
        this.horarioAlarme = horarioAlarme;
    }

    @Override
    public String getHorarioAlarme ()
    {
        return horarioAlarme;
    }

    @Override
    public void ligarAlarme()
    {
        this.despertar = "Ligado";
    }

    @Override
    public void desligarAlarme()
    {
        this.despertar = "Desligado";
    }

    @Override
    public void setVolumeRelogio (int volumeRelogio)
    {
        this.volumeRelogio = volumeRelogio;
    }

    @Override
    public int getVolumeRelogio()
    {
        return volumeRelogio;
    }

}