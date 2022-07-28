package classes;

import java.lang.*;
import interfaces.*;

public class HotelRoom extends Guest
{
	protected Guest guest[]=new Guest[100];

	String hotelRoomType[]=new hotelRoomType[4];

	hotelRoomType[0]="Royal Suite";
	hotelRoomType[1]="King size Bed";
	hotelRoomType[2]="Twin Bed";
	hotelRoomType[3]="Standard";

    int hotelRoomTypePrice[] =new hotelRoomTypePrice[6];

    hotelRoomTypePrice[0]=20,000;//Royal suite price
    hotelRoomTypePrice[1]=15,000;//King size bed price
    hotelRoomTypePrice[2]=12,000;//Twin bed AC
    hotelRoomTypePrice[3]=10,000;//Twin bed Non-AC
    hotelRoomTypePrice[4]=7,000;//Standard AC
    hotelRoomTypePrice[5]=6,000;//Standard Non-AC

	String hotelRoomAirConditionType[]-=new hotelRoomAirConditionType[2];

	hotelRoomAirConditionType[0]="AC";
	hotelRoomAirConditionType[1]="Non AC"

	public void addGuest(Guest g)
	{
		int flag=0;

		for(int i=0;i<guest.length;i++)
		{
			if(guest[i]==null)
			{
				guest[i]=g;
				flag=1;
				break;
			}
		}
		if(flag==1)
		{
			System.out.println("Guest Added");
		}
		else 
		{
			System.out.println("Could not add guest");
		}
	}

	public void removeGuest(Guest g)
	{
		int flag=0;

		for(int i=0;i<guest.length;i++)
		{
			if(guest[i]==a)
			{
				guest[i]=null;
				break;
			}
		}
		if(flag==1)
		{
			System.out.println("Guest Removed");
		}
		else 
		{
			System.out.println("Could not remove guest");
		}
	}

	public void showAllGuests()
	{
		for(Guest g: guest)
		{
			if(g!=null)
			{	
				System.out.println("**********************************");
     			System.out.println("Guest Name: "+ g.getGuestName());
				System.out.println("Guest Phone Number: "+ g.getGuestPhoneNumber());
				System.out.println("Guest Gender: "+ g.getGuestGender());
				System.out.println("Guest Age Type: "+ g.getGuestAgeType());
				System.out.println("Guest Address: "+ g.getGuestAddress());
				System.out.println("----------------------------------");

			}
		}
	}

	public Guest getGuest(String guestName,int guestPhoneNumber)
	{
	  Guest g = null;

	  for(int i=0;i<guest.length;i++)
	  {
	  	if(guest[i]!=null)
	  	{
	  		if(guest[i].getGuestName().equals(guestName) && guest[i].getGuestPhoneNumber().equals(guestPhoneNumber))
	  		{
	  			g=guest[i];
	  			break;
	  		}
	  	}
	  }

	  if(g!=null)
	  {
	  	System.out.println(g);
	  }
	  else 
	  {
	  	System.out.println("Guest not found!");
	  }

	}


	public abstract void hotelRoomCost();


}