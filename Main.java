class LRUCache {
    HashMap<Integer, LinkNode> map;
    LinkNode head;
    LinkNode last;
    int capacity;

    public LRUCache(int capacity) {
        map = new HashMap<>();
        head = new LinkNode();
        last = new LinkNode();
        head.next = last; // connect head and last node
        last.prev = head;
        this.capacity = capacity;
    }

    public int get(int key) {
        LinkNode current = map.get(key);

        if (current == null)
            return -1;

        moveToTop(current);
        return current.val;
    }

    public void put(int key, int value) {
        LinkNode current = map.get(key);

        if (current != null) {
            current.val = value;
            moveToTop(current);
            return;
        }

        current = new LinkNode(key, value);
        map.put(key, current);
        addToTop(current);

        if (capacity <= 0) // full
            map.remove(disconnect(last.prev).key); // remove the last node
        else
            capacity--;
    }

    void moveToTop(LinkNode node) {
        addToTop(disconnect(node));
    }

    void addToTop(LinkNode node) {
        node.prev = head;
        node.next = head.next;
        head.next.prev = node;
        head.next = node;
    }

    LinkNode disconnect(LinkNode node) {
        node.prev.next = node.next;
        node.next.prev = node.prev;
        return node;
    }
}

class LinkNode {
    int key;
    int val;
    LinkNode prev;
    LinkNode next;

    public LinkNode() {
    }

    public LinkNode(int key, int val) {
        this.key = key;
        this.val = val;
    }
}