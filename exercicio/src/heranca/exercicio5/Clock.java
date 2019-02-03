package heranca.exercicio5;

public interface Clock
{
    public void setTime (String time);
    public String getTime ();

    public void setAlarmTime (String time);
    public String getAlarmTime ();

    public void AlarmOn ();
    public void AlarmOff ();

    public void setClockVolume (int vol);
    public int getClockVolume ();
}