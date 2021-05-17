package DataStructures;

import java.util.ArrayList;

public class DirectedGraph <T> {

	/**
	 * This is to have synchronization built-in, to avoid race conditions.
	 */
	private Object universalLock;
	
	public DirectedGraph ()
	{
		//TO DO
	}
	
	public boolean adjacent (T valA, T valB)
	{
		synchronized (universalLock)
		{
			//TO DO
			return true;
		}
	}
	
	public ArrayList<T> neighbors (T val)
	{
		synchronized (universalLock)
		{
			//TO DO
			return null;
		}
	}
	
	public int add_vertex (T val)
	{
		synchronized (universalLock)
		{
			//TO DO
			return 0;
		}
	}
	
	public boolean remove_vertex (T val)
	{
		synchronized (universalLock)
		{
			//TO DO
			return true;
		}
	}
	
	public int add_edge (T valA, T valB, T edgeVal)
	{
		synchronized (universalLock)
		{
			//TO DO
			return 0;
		}
	}
	
	public boolean remove_edge (T valA, T valB)
	{
		synchronized (universalLock)
		{
			//TO DO
			return true;
		}
	}
	
	public T get_vertex_value (int index)
	{
		synchronized (universalLock)
		{
			//TO DO
			return null;
		}
	}
	
	public void set_vertex_value (int index, T newVal)
	{
		synchronized (universalLock)
		{
			//TO DO
		}
	}
	
	public T get_edge_value (int index)
	{
		synchronized (universalLock)
		{
			//TO DO
			return null;
		}
	}
	
	public void set_edge_value (int index, T newVal)
	{
		synchronized (universalLock)
		{
			//TO DO
		}
	}
	
	public boolean path (T valA, T valB)
	{
		synchronized (universalLock)
		{
			//TO DO
			return true;
		}
	}
	
	public boolean isPresent (T val)
	{
		synchronized (universalLock)
		{
			//TO DO
			return true;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
