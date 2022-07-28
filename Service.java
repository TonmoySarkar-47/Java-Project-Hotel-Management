package classes;

import java.lang.*;
import interfaces.*;

public class Service 
{
	String[] service=new String[4];
	
	service[0]="Room Service";
	service[1]="Foom Service";
	service[2]="Laundry Service";
	service[3]="Transportation Service";

	protected String roomService;
	protected String foodService;
	protected String laundryService;
	protected String transportationService;

	public abstract void showAllServices();
	public abstract void serviceCost();

}