package act4.ltts;
import act4.ltts.*;
import java.util.*;

public abstract class Shape {
	int value;
	
	public abstract void calculateArea(int value);

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}


}