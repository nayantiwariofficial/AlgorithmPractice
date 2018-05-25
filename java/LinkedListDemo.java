class Link {

    int val;
    Link next;

    Link(int x) {
        val = x;
    }

    @Override
    public String toString() {
        return val + "";
    }

    public void display() {
        System.out.println(val + "Next Link: " + next);
    }

    public static void main(String[] args) {
        LinkList theLinkedList = new LinkList();

        theLinkedList.insertFirst(10);
        theLinkedList.insertFirst(20);
        theLinkedList.insertFirst(30);
        theLinkedList.insertFirst(40);
        theLinkedList.insertFirst(50);

        theLinkedList.display();

        theLinkedList.reverse().display();


    }
}

class LinkList {
    public Link firstLink;

    LinkList() {
        firstLink = null;
    }

    public boolean isEmpty() {
        return firstLink == null;
    }

    public void insertFirst(int val) {
        Link newLink = new Link(val);

        newLink.next = firstLink;

        firstLink = newLink;
    }

    public Link removeFirst() {
        Link linkRef = firstLink;

        if (!isEmpty()) {
            firstLink = firstLink.next;
        } else {
            System.out.println("Empty Link List");
        }

        return linkRef;
    }

    public void display() {
        Link theLink = firstLink;

        while (theLink != null) {
            theLink.display();
            theLink = theLink.next;
        }
    }

    public Link search(int val) {
        Link searchLink = firstLink;

        if (!isEmpty()) {

            while (searchLink.val != val) {
                if (searchLink.next == null) {
                    return null;
                } else {
                    searchLink = searchLink.next;
                }
            }
        } else {
            System.out.println("Empty LinkedList");
        }

        return searchLink;
    }

    public LinkList reverse() {

        Link currentLink = firstLink;
        LinkList newLinkList = new LinkList();

        if (!isEmpty()) {
            while (currentLink != null) {
                newLinkList.insertFirst(currentLink.val);
                currentLink = currentLink.next;
            }
        }

        return newLinkList;
    }

    public Link remove(int val) {
        Link currentLink = firstLink;
        Link previousLink = firstLink;
        if (!isEmpty()) {
            while (currentLink.val != val) {

                if (currentLink.next == null) {
                    System.out.println("Couldn't find element to remove");
                    return null;
                } else {
                    previousLink = currentLink;
                    currentLink = currentLink.next;
                }
            }

            if (currentLink == firstLink) {
                firstLink = firstLink.next;
            } else {
                previousLink.next = currentLink.next;
            }

        }
        return currentLink;
    }


}