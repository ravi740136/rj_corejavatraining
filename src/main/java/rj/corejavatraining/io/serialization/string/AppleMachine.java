package rj.corejavatraining.io.serialization.string;

import java.io.Serializable;

public class AppleMachine implements Serializable {

   /**
	* 
    */
	private static final long serialVersionUID = 1L;
	String port1;

	public String getPort1() {
		return port1;
	}

	public void setPort1(String port1) {
		this.port1 = port1;
	}

	public String getPort2() {
		return port2;
	}

	public void setPort2(String port2) {
		this.port2 = port2;
	}

	public String getPort3() {
		return port3;
	}

	public void setPort3(String port3) {
		this.port3 = port3;
	}

	String port2;
	String port3;
	
	@Override
		public String toString() {
			// TODO Auto-generated method stub
			return port1+" "+port2+" "+port3;
		}
}
