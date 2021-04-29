
import org.junit.Test;
import static org.junit.Assert.*;


public class linkedListTest {
    LinkedList singly = new LinkedList();

    @Test
    public void searchDataInLinkedList(){
        singly.insertDataInToLinkedList(56);
        singly.insertDataInToLinkedList(30);
        singly.insertDataInToLinkedList(70);

        assertEquals(true,singly.search(30));
        singly.addData(40,30);
        assertEquals(4,singly.size());
        singly.pop(40);
        assertEquals(3,singly.size());

    }


}