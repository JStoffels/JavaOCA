package mobilephone;

public class Nokia extends MobilePhone implements USBCharger{
	
	@Override
	public
	//public void charge(){System.out.println("Ik laad op!");}
	String charge(){return "Ik laad op!";}
	String getOS(){return "Symbian";}
}
