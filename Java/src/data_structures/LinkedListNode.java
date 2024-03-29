package data_structures;

/**
 * ClassName: data_structures.LinkedListNode
 * Package: PACKAGE_NAME
 * Description:
 *
 * @Author Shiqiang Ren
 * @Create 16/1/2024 09:00
 * @Version 1.0
 */
public class LinkedListNode {

    public int value;
    public LinkedListNode next;
    public LinkedListNode previous;

    public LinkedListNode(int value) {
        this.value = value;
        this.next = null;
        this.previous = null;
    }

}
