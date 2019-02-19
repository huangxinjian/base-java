package container.my_custom_collection;

/**
 * @Author: huangxinjian
 * @Description:  LinkedList的节点对象 Node，LinkedList的核心
 * @Date: Created in 10:20 2019/2/18
 * @Modified By:
 */
public class Node {

    private Object element;  //我们的数据
    private Node next;  //下一个节点
    private Node previous; //上一个节点

    public Node(Object element) {
        this.element = element;
    }

    public Object getElement() {
        return element;
    }

    public Node getNext() {
        return next;
    }

    public Node getPrevious() {
        return previous;
    }

    public void setElement(Object element) {
        this.element = element;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public void setPrevious(Node previous) {
        this.previous = previous;
    }
}
