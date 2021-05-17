package DataStructures;

public class MaxHeap <T> {

	/**
	 * This is to have synchronization built-in, to avoid race conditions.
	 */
	private Object universalLock;

	private void goToRoot()
	{
		synchronized (universalLock)
		{
			//TO DO
		}
	}
	
	private void goParent ()
	{
		synchronized (universalLock)
		{
			//TO DO
		}
	}
	
	private void goLeft ()
	{
		synchronized (universalLock)
		{
			//TO DO
		}
	}
	
	private void goRight ()
	{
		synchronized (universalLock)
		{
			//TO DO
		}
	}
	
	private T getData ()
	{
		synchronized (universalLock)
		{
			//TO DO
			return null;
		}
	}
	
	private void setData (T newData)
	{
		synchronized (universalLock)
		{
			//TO DO
		}
	}
	
	private void addLeft (T data)
	{
		synchronized (universalLock)
		{
			//TO DO
		}
	}
	
	private void addRight (T data)
	{
		synchronized (universalLock)
		{
			//TO DO
		}
	}
	
	private void removeNode ()
	{
		synchronized (universalLock)
		{
			//TO DO
		}
	}
	
	public MaxHeap ()
	{
		//TO DO
	}
	
	public void heapify ()
	{
		synchronized (universalLock)
		{
			//TO DO
		}
	}
	
	public T findMax ()
	{
		synchronized (universalLock)
		{
			//TO DO
			return null;
		}
	}
	
	public void insert (T data)
	{
		synchronized (universalLock)
		{
			//TO DO
		}
	}
	
	public void delete (T data)
	{
		synchronized (universalLock)
		{
			//TO DO
		}
	}
	
	public T extractMax ()
	{
		synchronized (universalLock)
		{
			//TO DO
			return null;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
