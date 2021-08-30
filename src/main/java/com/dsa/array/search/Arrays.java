package com.dsa.array.search;

/**
 * This class contains various methods for manipulating arrays (such as sorting
 * and searching).
 *
 * <p>
 * The methods in this class all throw a {@code NullPointerException}, if the
 * specified array reference is null.
 *
 *
 * @author Ajay Kushwaha
 * @since 1.0
 */
public interface Arrays {

	/**
	 * Searches the specified array of Integers for the specified value using the
	 * linear search algorithm. If the array contains multiple elements with the
	 * specified value, first element index will be returned as result
	 *
	 * @param a   the array to be searched
	 * @param key the value to be searched for
	 * @return index of the search key, if it is contained in the array; otherwise,
	 *         <code>(-(<i>insertion point</i>) - 1)</code>. The <i>insertion
	 *         point</i> is defined as the point at which the key would be inserted
	 *         into the array: the index of the first element greater than the key,
	 *         or {@code a.length} if all elements in the array are less than the
	 *         specified key. Note that this guarantees that the return value will
	 *         be &gt;= 0 if and only if the key is found.
	 */
	Integer linearSearch(Integer[] a, Integer key);

	/**
	 * Searches the specified array of Long for the specified value using the linear
	 * search algorithm. If the array contains multiple elements with the specified
	 * value, first element index will be returned as result
	 *
	 * @param a   the array to be searched
	 * @param key the value to be searched for
	 * @return index of the search key, if it is contained in the array; otherwise,
	 *         <code>(-(<i>insertion point</i>) - 1)</code>. The <i>insertion
	 *         point</i> is defined as the point at which the key would be inserted
	 *         into the array: the index of the first element greater than the key,
	 *         or {@code a.length} if all elements in the array are less than the
	 *         specified key. Note that this guarantees that the return value will
	 *         be &gt;= 0 if and only if the key is found.
	 */

	Integer linearSearch(Long[] a, Long key);

	/**
	 * Searches the specified array of Byte for the specified value using the linear
	 * search algorithm. If the array contains multiple elements with the specified
	 * value, first element index will be returned as result
	 *
	 * @param a   the array to be searched
	 * @param key the value to be searched for
	 * @return index of the search key, if it is contained in the array; otherwise,
	 *         <code>(-(<i>insertion point</i>) - 1)</code>. The <i>insertion
	 *         point</i> is defined as the point at which the key would be inserted
	 *         into the array: the index of the first element greater than the key,
	 *         or {@code a.length} if all elements in the array are less than the
	 *         specified key. Note that this guarantees that the return value will
	 *         be &gt;= 0 if and only if the key is found.
	 */
	Integer linearSearch(Byte[] a, Byte key);

	/**
	 * Searches the specified array of Object for the specified value using the
	 * linear search algorithm. If the array contains multiple elements with the
	 * specified value, first element index will be returned as result
	 *
	 * @param a   the array to be searched
	 * @param key the value to be searched for
	 * @return index of the search key, if it is contained in the array; otherwise,
	 *         <code>(-(<i>insertion point</i>) - 1)</code>. The <i>insertion
	 *         point</i> is defined as the point at which the key would be inserted
	 *         into the array: the index of the first element greater than the key,
	 *         or {@code a.length} if all elements in the array are less than the
	 *         specified key. Note that this guarantees that the return value will
	 *         be &gt;= 0 if and only if the key is found.
	 */
	Integer linearSearch(Object[] a, Object key);

}
