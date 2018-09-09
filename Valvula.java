
public class Valvula {
	private EnumValvula state;

	public Valvula() {
		state = EnumValvula.closed;
	}

	public void open() {
		state = EnumValvula.open;
	}

	public void close() {
		state = EnumValvula.closed;
	}

	public boolean isOpen() {
		return state==EnumValvula.open;
	}
	
}
