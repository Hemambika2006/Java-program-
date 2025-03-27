public class BSTnode
{
	class Node {
    int key;
    BSTnode left, right;

    public BSTnode(int item) {
        data = item;
        left = right = null;
    }
}

public class BSTsearch {
    BSTnode root;

    public BSTsearch() {
        root = null;
    }

    public void insert(int key) {
        root = insertRec(root, key);
    }

    private BSTnode insertRec(BSTnode root, int key) {
        if (root == null) {
            root = new BSTnode(key);
            return root;
        }
        if (key < root.data) {
            root.left = insertRec(root.left, key);
        } else if (key > root.data) {
            root.right = insertRec(root.right, key);
        }
        return root;
    }

    public boolean search(int key) {
        return searchRec(root, key);
    }

    private boolean searchRec(BSTnode root, int key) {
        if (root == null) {
            return false;
        }
        if (root.data == key) {
            return true;
        }
        return key < root.data ? searchRec(root.left, key) : searchRec(root.right, key);
    }

    public static void main(String[] args) {
        BSTsearch tree = new BSTsearch();

        tree.insert(50);
        tree.insert(30);
        tree.insert(70);
        tree.insert(20);
        tree.insert(40);
        tree.insert(60);
        tree.insert(80);

        int key = 40;
        System.out.println("Searching for key " + key + " in the BST...");
        if (tree.search(key)) {
            System.out.println("Key " + key + " is present in the BST.");
        } else {
            System.out.println("Key " + key + " is not present in the BST.");
        }

        key = 90;
        System.out.println("Searching for key " + key + " in the BST...");
        if (tree.search(key)) {
            System.out.println("Key " + key + " is present in the BST.");
        } else {
            System.out.println("Key " + key + " is not present in the BST.");
        }
    }
}
