
public interface IBoiler {
	boolean isEmpty();

	void fillBoiler();

	void turnOffHeater();

	void turnOnHeater();

	void OpenValve();

	void CloseValve();

	boolean IsValveOpen();

	void emptyBoiler();
}
