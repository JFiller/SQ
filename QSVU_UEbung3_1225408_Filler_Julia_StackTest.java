import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.EmptyStackException;
import java.util.Stack;

import static org.junit.Assert.*;
public class QSVU_UEbung3_1225408_Filler_Julia_StackTest {
	
	private Stack<Integer> stack;
	private int i1 = 1;
	private int i2 = 2;
	private int i3 = 3;
	private int i4 = 4;
	
	@Before
	public void setUp() throws Exception{
		stack = new Stack<Integer>();
	}
	@After
	public void setDown() throws Exception{
		stack = null;
	}
	@Test
	public void isEmptyMustBeTrue() throws Exception{
		assertTrue(stack.isEmpty());
	}
	@Test
	public void pushElements() throws Exception{
		stack.push(i1);
		stack.push(i2);
		assertFalse(stack.isEmpty());
		assertTrue(stack.contains(i1) && stack.contains(i2));
	}
	@Test
	public void testingPeek() throws Exception{
		stack.push(i1);
		stack.push(i2);
		assertTrue(stack.peek() == i2);
		assertFalse(stack.peek() == i1);
	}
	@Test
	public void push3Elements(){
		stack.push(i1);
		stack.push(i2);
		stack.push(i3);
		assertTrue(stack.size() == 3);
	}
	@Test
	public void push4Elements() throws Exception{
		stack.push(i1);
		stack.push(i2);
		stack.push(i3);
		stack.push(i4);
		assertTrue(stack.contains(i3));
		assertTrue(stack.contains(i4));
	}
	@Test
	public void popElements() throws Exception{
		stack.push(i1);
		stack.push(i2);
		stack.push(i3);
		stack.push(i4);
		stack.pop();
		assertTrue(stack.peek() == i3);
	}
	@Test
	public void searchElement() throws Exception{
		stack.push(i1);
		stack.push(i2);
		stack.push(i3);
		stack.push(i4);
		stack.pop();
		int n = stack.search(i2);
		assertTrue(n == 2);
	}
	@Test
	public void pop2Elements(){
		stack.push(i1);
		stack.push(i2);
		stack.push(i3);
		stack.push(i4);
		stack.pop();
		stack.pop();
		assertTrue(stack.peek() == i2);
	}
	@Test
	public void pop3Elements(){
		stack.push(i1);
		stack.push(i2);
		stack.push(i3);
		stack.push(i4);
		stack.pop();
		stack.pop();
		stack.pop();
		assertTrue(stack.peek() == i1);
	}
	@Test
	public void isEmptyStack(){
		stack.push(i1);
		stack.push(i2);
		stack.push(i3);
		stack.push(i4);
		stack.pop();
		stack.pop();
		stack.pop();
		stack.pop();
		assertTrue(stack.isEmpty());
	}
	@Test(expected = EmptyStackException.class)
	public void testingRightException(){
		stack.peek();
	}
	@Test
	public void search1Element(){
		stack.push(i3);
		assertEquals(1,stack.search(i3));
	}
	@Test
	public void searchRemovedElement(){
		stack.push(i3);
		stack.push(i2);
		stack.push(i4);
		stack.pop();
		assertEquals(-1,stack.search(i4));
	}
	@Test
	public void searchInEmptyStack(){
		assertEquals(-1,stack.search(i2));
	}
	@Test
	public void peekShouldNotDeleteElement(){
		stack.push(i3);
		stack.push(i2);
		stack.push(i4);
		assertTrue(stack.peek() == i4);
		assertTrue(stack.contains(i4));
	}
	
	
	

	
	
	
	
}
