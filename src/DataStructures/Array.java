package DataStructures;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

/**
 * A clone of java.util.ArrayList
 *
 */
public class Array<E> {
	
	ArrayList<E> dataStruct;
	
	//Constructors
	public Array()
	{
		dataStruct = new ArrayList<E>();
	}
	public Array(Collection<? extends E> c)
	{
		dataStruct = new ArrayList<E>(c);
	}
	public Array(int initialCapacity)
	{
		dataStruct = new ArrayList<E>(initialCapacity);
	}
	
	/**
	 * Appends the specified element to the end of this list.
	 * @param e
	 * @return
	 */
	public boolean add(E e)
	{
		return dataStruct.add(e);
	}
	
	/**
	 * Inserts the specified element at the specified position in this list.
	 * @param index
	 * @param element
	 */
	public void add(int index, E element)
	{
		dataStruct.add(index, element);
	}
	
	/**
	 * Appends all of the elements in the specified collection to the end of this list, in the order that they are
	 * returned by the specified collection's Iterator.
	 * @param c
	 * @return
	 */
	public boolean addAll(Collection<? extends E> c)
	{
		return dataStruct.addAll(c);
	}
	
	/**
	 * Inserts all of the elements in the specified collection into this list, starting at the specified position.
	 * @param index
	 * @param c
	 * @return
	 */
	public boolean addAll(int index, Collection<? extends E> c)
	{
		return dataStruct.addAll(index, c);
	}
	
	/**
	 * Removes all of the elements from this list.
	 */
	public void clear()
	{
		dataStruct.clear();
	}
	
	/**
	 * Returns a shallow copy of this ArrayList instance.
	 */
	public Object clone()
	{
		return dataStruct.clone();
	}
	
	/**
	 * Returns true if this list contains the specified element.
	 * @param o
	 * @return
	 */
	public boolean contains(Object o)
	{
		return dataStruct.contains(o);
	}
	
	/**
	 * Increases the capacity of this ArrayList instance, if necessary, to ensure that it can hold at least the number
	 * of elements specified by the minimum capacity argument.
	 * @param minCapacity
	 */
	public void ensureCapacity(int minCapacity)
	{
		dataStruct.ensureCapacity(minCapacity);
	}
	
	/**
	 * Performs the given action for each element of the Iterable until all elements have been processed or the action throws an exception.
	 * @param action
	 */
	public void forEach(Consumer<? super E> action)
	{
		dataStruct.forEach(action);
	}
	
	/**
	 * Returns the element at the specified position in this list.
	 * @param index
	 * @return
	 */
	public E get(int index)
	{
		return dataStruct.get(index);
	}
	
	/**
	 * Returns the index of the first occurrence of the specified element in this list, or -1 if this list does not contain the element.
	 * @param o
	 * @return
	 */
	public int indexOf(Object o)
	{
		return dataStruct.indexOf(o);
	}
	
	/**
	 * Returns true if this list contains no elements.
	 * @return
	 */
	public boolean isEmpty()
	{
		return dataStruct.isEmpty();
	}
	
	/**
	 * Returns an iterator over the elements in this list in proper sequence.
	 * @return
	 */
	public Iterator<E> iterator()
	{
		return dataStruct.iterator();
	}
	
	/**
	 * Returns the index of the last occurrence of the specified element in this list, or -1 if this list does not contain the element.
	 * @param o
	 * @return
	 */
	public int lastIndexOf(Object o)
	{
		return dataStruct.lastIndexOf(o);
	}
	
	/**
	 * Returns a list iterator over the elements in this list (in proper sequence).
	 * @return
	 */
	public ListIterator<E> listIterator()
	{
		return dataStruct.listIterator();
	}
	
	/**
	 * Returns a list iterator over the elements in this list (in proper sequence), starting at the specified position in the list.
	 * @param index
	 * @return
	 */
	public ListIterator<E> listIterator(int index)
	{
		return dataStruct.listIterator(index);
	}
	
	/**
	 * Removes the element at the specified position in this list.
	 * @param index
	 * @return
	 */
	public E remove(int index)
	{
		return dataStruct.remove(index);
	}
	
	/**
	 * Removes the first occurrence of the specified element from this list, if it is present.
	 * @param o
	 * @return
	 */
	public boolean remove(Object o)
	{
		return dataStruct.remove(o);
	}
	
	/**
	 * Removes from this list all of its elements that are contained in the specified collection.
	 * @param c
	 * @return
	 */
	public boolean removeAll(Collection<?> c)
	{
		return dataStruct.removeAll(c);
	}
	
	/**
	 * Removes all of the elements of this collection that satisfy the given predicate.
	 * @param filter
	 * @return
	 */
	public boolean removeIf(Predicate<? super E> filter)
	{
		return dataStruct.removeIf(filter);
	}
	
	/**
	 * Replaces each element of this list with the result of applying the operator to that element.
	 * @param operator
	 */
	public void replaceAll(UnaryOperator<E> operator)
	{
		dataStruct.replaceAll(operator);
	}
	
	/**
	 * Retains only the elements in this list that are contained in the specified collection.
	 * @param c
	 * @return
	 */
	public boolean retainAll(Collection<?> c)
	{
		return dataStruct.retainAll(c);
	}
	
	/**
	 * Replaces the element at the specified position in this list with the specified element.
	 * @param index
	 * @param element
	 * @return
	 */
	public E set(int index, E element)
	{
		return dataStruct.set(index, element);
	}
	
	/**
	 * Returns the number of elements in this list.
	 * @return
	 */
	public int size()
	{
		return dataStruct.size();
	}
	
	/**
	 * Sorts this list according to the order induced by the specified Comparator.
	 * @param c
	 */
	public void sort(Comparator<? super E> c)
	{
		dataStruct.sort(c);
	}
	
	/**
	 * Creates a late-binding and fail-fast Spliterator over the elements in this list.
	 * @return
	 */
	public Spliterator<E> spliterator()
	{
		return dataStruct.spliterator();
	}
	
	/**
	 * Returns a view of the portion of this list between the specified fromIndex, inclusive, and toIndex, exclusive.
	 * @param fromIndex
	 * @param toIndex
	 * @return
	 */
	public List<E> subList(int fromIndex, int toIndex)
	{
		return dataStruct.subList(fromIndex, toIndex);
	}
	
	/**
	 * Returns an array containing all of the elements in this list in proper sequence (from first to last element).
	 * @return
	 */
	public Object[] toArray()
	{
		return dataStruct.toArray();
	}
	
	/**
	 * Returns an array containing all of the elements in this list in proper sequence (from first to last element); the runtime
	 * type of the returned array is that of the specified array.
	 * @param <T>
	 * @param a
	 * @return
	 */
	public <T> T[] toArray(T[] a)
	{
		return dataStruct.toArray(a);
	}
	
	/**
	 * Trims the capacity of this ArrayList instance to be the list's current size.
	 */
	public void trimToSize()
	{
		dataStruct.trimToSize();
	}
	
}
