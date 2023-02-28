package 백준801;

public class LinkedListTest {

	static class LinkedList {
		int data;
		LinkedList before;
		LinkedList next;

		public LinkedList(int data) {
			this.data = data;
		}
	}

	static LinkedList start;

	public static void main(String[] args) {
		start = null;

		insert(1);
		insert(2);
		insert(3);
		insert(4);
		insert(1, 2);
		print();
	}

	static void insert(int data) {
		LinkedList temp = start;
		LinkedList node = new LinkedList(data);
		if (start == null) {
			start = new LinkedList(data);
		} else {
			while (temp.next != null) {
				temp = temp.next;
			}

			temp.next = node;
			node.before = temp;

		}

	}

	static void insert(int data, int idx) {
		LinkedList node = new LinkedList(data);

		LinkedList temp = start;

		while (temp.data != idx) {
			temp = temp.next;
		}

		node.next = temp.next;
		node.before = temp.before;
		temp.next.before = node;
		temp.next = node;

	}

	static void search(int data) {
		LinkedList temp = start;

		while (temp.data != data) {
			temp = temp.next;
			if (temp.next == null) {
				return;
			}
		}
		System.err.println(temp.data);
	}

	static void drop(int data) {
		LinkedList temp = start;

		while (temp.data != data) {
			temp = temp.next;
		}
		if (temp.next == null) {
			temp.before.next = null;
		} else {
			if (temp.before == null) {
				start = temp.next;
				temp = null;
			} else {
				temp.before.next = temp.next;
				temp.next.before = temp.before;
			}
		}
		temp = null;

	}

	static void print() {
		LinkedList temp = start;

		while (temp.next != null) {
			System.out.println(temp.data);
			temp = temp.next;
		}
		System.out.println(temp.data);

	}

}
