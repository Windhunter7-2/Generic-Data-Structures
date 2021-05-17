package DataStructures;

public class BinaryTree <T> {

	/**
	 * This is to have synchronization built-in, to avoid race conditions.
	 */
	private Object universalLock;
	
	public BinaryTree (T root)
	{
		//TO DO
	}
	
	public void goToRoot()
	{
		synchronized (universalLock)
		{
			//TO DO
		}
	}
	
	public void goParent ()
	{
		synchronized (universalLock)
		{
			//TO DO
		}
	}
	
	public void goLeft ()
	{
		synchronized (universalLock)
		{
			//TO DO
		}
	}
	
	public void goRight ()
	{
		synchronized (universalLock)
		{
			//TO DO
		}
	}
	
	public T getData ()
	{
		synchronized (universalLock)
		{
			//TO DO
			return null;
		}
	}
	
	public void setData (T newData)
	{
		synchronized (universalLock)
		{
			//TO DO
		}
	}
	
	public void addLeft (T data)
	{
		synchronized (universalLock)
		{
			//TO DO
		}
	}
	
	public void addRight (T data)
	{
		synchronized (universalLock)
		{
			//TO DO
		}
	}
	
	public void removeNode ()
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
