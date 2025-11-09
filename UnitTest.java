
public class UnitTest {

	public static void main(String[] args) {
		URHeap<Integer> heap = new URHeap<Integer>(2);
		heap.insert(10);
		heap.insert(1);
		
		System.out.println("SIZE: " + heap.size());
		heap.printHeap();
		
		heap.insert(2);
		heap.insert(3);
		heap.insert(4);
		
		System.out.println("\n");
		heap.printHeap();
		
		Integer minVal = heap.deleteMin();
		System.out.println("\n\n" + minVal + ", SIZE: " + heap.size());
		heap.printHeap();
		
		for (int i = 0; i > -6; i--) {
			heap.insert(i);
		}
		System.out.println("\n");
		heap.printHeap();
		for (int i = 0; i < 9; i++) {
			heap.deleteMin();
			System.out.println("\n");
			heap.printHeap();
		}
		
		System.out.println("\n\nEMPTY: " + heap.isEmpty());
		System.out.println(heap.deleteMin());
		System.out.println("EMPTY: " + heap.isEmpty());
	}

}
