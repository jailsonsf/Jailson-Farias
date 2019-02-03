package encapsulamento.exercicio4;

public class Grades
{
    private String owner;
	private String text;
	private boolean estate;
	
	public Grades(String owner,String text) {

		this.owner = owner;
		this.text = text;
		this.estate = true;
	}

	public String getOwner() {return owner;}

	public void setOwner(String owner) {this.owner = owner;}

	public String getText() {return text;}

	public void setText(String text) {this.text = text;}

	public boolean isEstate() {return estate;}

	public void setEstate(boolean estate) {this.estate = estate;}

}