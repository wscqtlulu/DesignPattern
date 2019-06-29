package composite;

/**
 * @author taotao
 */
public class Test {
    public static void main(String[] args) {
        TreeNode root = new TreeNode("root", null);
        TreeNode a = new TreeNode("a", root);
        TreeNode b = new TreeNode("b", root);
        root.addTreeNode(a);
        root.addTreeNode(b);
        TreeNode c = new TreeNode("c", a);
        a.addTreeNode(c);
    }
}
