package classes;

import java.lang.*;
import interfaces.*;

public class Guest implements GuestFunctions
{
	

	protected String guestName;
	protected int guestPhoneNumber;
	protected String guestGender;
	protected String guestAddress;
	protected String guestAgeType;

	public void setGuestName(String guestName)
	{
		this.guestName=guestName;
	}
	public String getGuestName()
	{
		return guestName;
	}

	public void setGuestPhoneNumber(int guestPhoneNumber)
	{
		this.guestPhoneNumber=guestPhoneNumber;
	}
	public int getGuestPhoneNumber()
	{
		return guestPhoneNumber;
	}

	public void setGuestGender(String guestGender)
	{
		this.guestGender=guestGender;
	}
	public String getGuestGender()
	{
		return guestGender;
	}

	public void setGuestAdress(String guestAddress)
	{
		this.guestAddress=guestAddress;
	}
	public String getGuestAddress()
	{
		return getGuestAddress;
	}
	public void setGuestAgeType(String guestAgeType)
	{
		this.guestAgeType=guestAgeType;
	}
	public String guestAgeType()
	{
		return guestAgeType;
	}

	public abstract void showGuestDetails(String guestName,int guestPhoneNumber);
	public abstract void showAllGuests();
	
}