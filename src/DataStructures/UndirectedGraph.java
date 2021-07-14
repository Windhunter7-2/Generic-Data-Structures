package DataStructures;

import java.util.ArrayList;
import java.util.LinkedHashMap;

public class UndirectedGraph <T> {

	/**
	 * This is to have synchronization built-in, to avoid race conditions.
	 */
	private Object universalLock;
	private LinkedHashMap<T, ArrayList<T>> vertices;

	public UndirectedGraph ()
	{
		//TO DO
		vertices = new LinkedHashMap<T, ArrayList<T>>();
	}

	public boolean adjacent (T valA,T valB)
	{
		synchronized (universalLock)
		{
			//DONE
			for(T vertex : vertices.keySet()){
				if((vertex == valA ||vertex == valB) &&
						(vertices.get(valA).contains(valB)||
								vertices.get(valB).contains(valA))){
					return true;
				}
			}
			return false;
		}
	}

	public ArrayList<T> neighbors (T val)
	{
		synchronized (universalLock)
		{
			//DONE
			return vertices.get(val);
		}
	}

	public int add_vertex (T val)
	{
		synchronized (universalLock)
		{
			//DONE
			int count = 0;
			for(T vertex : vertices.keySet()){
				count ++;
				if(vertex == val){
					return count;
				}
			}
			vertices.put(val, new ArrayList<T>());
			return vertices.size()-1;
		}
	}

	public boolean remove_vertex (T val)
	{
		synchronized (universalLock) {
			//DONE
			if(vertices.containsKey(val)){
				vertices.remove(val);
				return true;
			}
			return false;

		}
	}

	public int add_edge (T valA, T valB, T edgeVal)
	{
		synchronized (universalLock)
		{
			//MORE TO DO (GIVE THE EDGE A VALUE)
			vertices.get(valA).add(valB);
			vertices.get(valB).add(valB);
			return 0;
		}
	}

	public boolean remove_edge (T valA, T valB)
	{
		synchronized (universalLock)
		{
			//DONE
			if(vertices.containsKey(valA) && vertices.containsKey(valB)){
				if(vertices.get(valA).contains(valB)&&vertices.get(valB).contains(valA)){
					vertices.get(valA).remove(valB);
					vertices.get(valA).remove(valB);
					return true;
				}
			}
			return false;
		}
	}

	public T get_vertex_value (int index)
	{
		synchronized (universalLock)
		{
			//DONE
			int count = 0;
			for(T vertex : vertices.keySet()){
				count ++;
				if(count == index){
					return vertex;
				}
			}
			return null;
		}
	}

	public void set_vertex_value (int index, T newVal)
	{
		synchronized (universalLock)
		{
			//DONE
			vertices.put(newVal, vertices.get(get_edge_value(index)));
			vertices.remove(get_edge_value(index));
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
			//DONE
			if(vertices.containsKey(valA) && vertices.containsKey(valB)){
				if(vertices.get(valA).contains(valB)&&vertices.get(valB).contains(valA)){
					return true;
				}
			}
			return false;

		}
	}

	public boolean isPresent (T val)
	{
		synchronized (universalLock)
		{
			//DONE
			return vertices.containsKey(val);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
