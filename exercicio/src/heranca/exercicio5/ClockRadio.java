package heranca.exercicio5;

public abstract class ClockRadio implements Radio, Clock
{

    private String time;
    private String awakening;
    private String alarmTime;
    private String station;
    private String typeStation;
    private int radioVolume;
    private int clockVolume;

    public String getAlarme()
    {
        return awakening;
    }

    @Override
    public void setStation (String station, String typeStation)
    {
        this.station = station;
        this.typeStation = typeStation;
    }

    @Override
    public String getStation ()
    {
        return station;
    }

    @Override
    public String getTypeStation ()
    {
        return typeStation;
    }

    @Override
    public void setRadioVolume (int radioVolume)
    {
        this.radioVolume = radioVolume;
    }

    @Override
    public int getRadioVolume ()
    {
        return radioVolume;
    }

    @Override
    public void setTime (String time)
    {
        this.time = time;
    }

    @Override
    public String getTime ()
    {
        return time;
    }

    @Override
    public void setAlarmTime (String alarmTime)
    {
        this.alarmTime = alarmTime;
    }

    @Override
    public String getAlarmTime ()
    {
        return alarmTime;
    }

    @Override
    public void AlarmOn()
    {
        this.awakening = "Ligado";
    }

    @Override
    public void AlarmOff()
    {
        this.awakening = "Desligado";
    }

    @Override
    public void setClockVolume (int clockVolume)
    {
        this.clockVolume = clockVolume;
    }

    @Override
    public int getClockVolume()
    {
        return clockVolume;
    }

}