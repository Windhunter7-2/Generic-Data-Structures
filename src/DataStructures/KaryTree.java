package DataStructures;

public class KaryTree <T> {

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
	
	private void removeNode ()
	{
		synchronized (universalLock)
		{
			//TO DO
		}
	}
	
	public KaryTree (T root)
	{
		//TO DO
	}
	
	public void goToSubtree (int index)
	{
		synchronized (universalLock)
		{
			//TO DO
		}
	}
	
	public void addSubtree (int index, T data)
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
