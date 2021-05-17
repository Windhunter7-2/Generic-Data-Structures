package DataStructures;

import java.util.ArrayList;

public class Matrix <T> {
	
	/**
	 * This is to have synchronization built-in, to avoid race conditions.
	 */
	private Object universalLock;
	
	public Matrix (int width, int height)
	{
		//TO DO
	}
	
	public void setMatrix (ArrayList<ArrayList<T>> matrix)
	{
		synchronized (universalLock)
		{
			//TO DO
		}
	}
	
	public ArrayList<ArrayList<T>> getMatrix ()
	{
		synchronized (universalLock)
		{
			//TO DO
			return null;
		}
	}
	
	public void identity ()
	{
		synchronized (universalLock)
		{
			//TO DO
		}
	}
	
	public void setItem (int x, int y, T element)
	{
		synchronized (universalLock)
		{
			//TO DO
		}
	}
	
	public T getItem (int x, int y)
	{
		synchronized (universalLock)
		{
			//TO DO
			return null;
		}
	}
	
	public void addColumn (ArrayList<T> column)
	{
		synchronized (universalLock)
		{
			//TO DO
		}
	}
	
	public void insertColumn (ArrayList<T> column, int x)
	{
		synchronized (universalLock)
		{
			//TO DO
		}
	}
	
	public void removeColumn (int x)
	{
		synchronized (universalLock)
		{
			//TO DO
		}
	}
	
	public void addRow (ArrayList<T> row)
	{
		synchronized (universalLock)
		{
			//TO DO
		}
	}
	
	public void insertRow (ArrayList<T> row, int y)
	{
		synchronized (universalLock)
		{
			//TO DO
		}
	}
	
	public void removeRow (int y)
	{
		synchronized (universalLock)
		{
			//TO DO
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
