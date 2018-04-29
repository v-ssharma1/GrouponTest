package Groupon;

import java.util.Stack;

public class PalindromeLinkedList {
	public Node head;

	public class Node {
		char data;
		Node next;

		Node(char d) {
			data = d;
			next = null;
		}
	}

	// Palindrome function--> Code is linear but will take some extra space as a
	// Stack is used to store node data.
	public boolean checkPelindrome(Node n) {
		Node slow = n;
		Node fast = n;
		if (n == null) {
			System.out.print("This list has no element hence, ");
		}else {

		Stack<Character> comp = new Stack<Character>();
		if (fast != null && fast.next != null) {
			while (fast != null && fast.next != null) {
				// insert first half of the list in a stack.
				comp.push(slow.data);
				slow = slow.next;
				fast = fast.next.next;
			}
			// Adjust the slow pointer in case of even number of nodes in the list.
			if (fast != null) {
				slow = slow.next;
			}
			// Comparison between list data and stack data.
			while (slow != null) {
				if (comp.pop() != slow.data) {
					return false;
				}
				slow = slow.next;
			}
			return true;
		}
		System.out.print("This list has only one element hence, ");
		}
		return false;
		
	}

	// Print linked list.
	public void printLinkedListValues() {
		Node n = head;
		while (n != null) {
			System.out.print(n.data);
			n = n.next;
		}
		System.out.print("\n");
	}

	// ------------------------------Testing------------------//

	// Test_01-> valid list with even number of nodes.
	public void testValidScenario_01() {
		head = new Node('T');
		head.next = new Node('E');
		// head.next.next = new Node('S');
		head.next.next = new Node('E');
		head.next.next.next = new Node('T');
		System.out.print("Test list is: ");
		printLinkedListValues();
		// check list for Palindromes.
		if (checkPelindrome(head) == true) {
			System.out.println("It is a Palindrome.\n");
		} else {
			System.out.println("It is not a Palindrome.\n");
		}
	}

	// Test_07-> valid list with odd number of nodes.
	public void testValidScenario_07() {
		head = new Node('T');
		head.next = new Node('E');
		head.next.next = new Node('S');
		head.next.next.next = new Node('E');
		head.next.next.next.next = new Node('T');
		System.out.print("Test list is: ");
		printLinkedListValues();
		// check list for Palindromes.
		if (checkPelindrome(head) == true) {
			System.out.println("It is a Palindrome.\n");
		} else {
			System.out.println("It is not a Palindrome.\n");
		}
	}

	// Test_02-> Single letter list.
	public void testInValidScenario_02() {
		head = new Node('T');
		System.out.print("Test list is: ");
		printLinkedListValues();
		// check list for Palindromes.
		if (checkPelindrome(head) == true) {
			System.out.println("It is a Palindrome.\n");
		} else {
			System.out.println("It is not a Palindrome.\n");
		}
	}

	// Test_03-> Empty list.
	public void testInValidScenario_03() {
		head = null;
		System.out.print("Test list is: ");
		printLinkedListValues();
		// check list for Palindromes.
		if (checkPelindrome(head) == true) {
			System.out.println("It is a Palindrome.\n");
		} else {
			System.out.println("It is not a Palindrome.\n");
		}
	}

	// Test_04-> Special char
	public void testValidScenario_04() {
		head = new Node('@');
		head.next = new Node('#');
		head.next.next = new Node('$');
		head.next.next.next = new Node('#');
		head.next.next.next.next = new Node('@');
		System.out.print("Test String is: ");
		printLinkedListValues();
		// check list for Palindromes.
		if (checkPelindrome(head) == true) {
			System.out.println("It is a Palindrome.\n");
		} else {
			System.out.println("It is not a Palindrome.\n");
		}
	}

	// Test_05 -> 2 letter list.
	public void testValidScenario_05() {
		head = new Node('w');
		head.next = new Node('w');
		System.out.println("Test String is: ");
		printLinkedListValues();
		// check list for Palindrome.
		if (checkPelindrome(head) == true) {
			System.out.println("It is a Palindrome.\n");
		} else {
			System.out.println("It is not a Palindrome.\n");
		}
	}

	// Test_06-> case insensitivity.
	public void testValidScenario_06() {
		head = new Node('w');
		head.next = new Node('W');
		System.out.println("Test String is: ");
		printLinkedListValues();
		// check list for Palindrome.
		if (checkPelindrome(head) == true) {
			System.out.println("It is a Palindrome.\n");
		} else {
			System.out.println("It is not a Palindrome.\n");
		}
	}

	// main method
	public static void main(String[] args) {
		PalindromeLinkedList ltr = new PalindromeLinkedList();
		ltr.testValidScenario_01();
		ltr.testValidScenario_07();
		ltr.testInValidScenario_02();
		try {
			ltr.testInValidScenario_03();
		} catch (Exception e) {
			System.out.println("Please provide valid list.\n");
		}
		ltr.testValidScenario_04();
		ltr.testValidScenario_05();
		ltr.testValidScenario_06();
	}
}
