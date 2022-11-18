public class Bigbike
{
	private String color;
	private Engine engine;
	private Killswitch killswitch;
	
	public Bigbike(String color){
		this.color = color;
		engine = new Engine();
		killswitch = new Killswitch();
	}
	public void setColor(String color){
		this.color = color;
	}
	public String start(){
		return engine.startEngine();
	}
}
