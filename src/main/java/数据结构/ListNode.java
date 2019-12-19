package 数据结构;

/**
 * @Description:
 * @Author: boolean 单链表的实现
 * @Date: 2019/12/14 18:20
 */
public class ListNode {
    private ListNode node;
    private int value;

    public ListNode( int value){
        this.value = value;
    }

    public static void main(String[] args) {
//        ListNode listNode = new ListNode( 1);
//        listNode.node = new ListNode(2);
//        listNode.node.node = new ListNode(3);
//        while (listNode.node != null){
//            System.out.println(listNode.value);
//        }

        ListNode listNode = new ListNode(1);
        listNode.node = new ListNode(2);
        listNode.node.node = new ListNode(5);
        listNode.node.node.node = new ListNode(4);
        while (listNode != null){
            System.out.println(listNode.value+":"+listNode);
            listNode = listNode.node;
        }
    }
}



