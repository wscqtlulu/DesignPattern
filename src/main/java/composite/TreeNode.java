package composite;

import java.util.List;

public class TreeNode {
    private String name;
    private TreeNode parent;
    private List<TreeNode> child;

    public TreeNode(String name, TreeNode parent) {
        this.name = name;
        this.parent = parent;
    }

    public List<TreeNode> getChild() {
        return child;
    }

    public void setChild(List<TreeNode> child) {
        this.child = child;
    }

    public TreeNode getParent() {
        return parent;
    }

    public void setParent(TreeNode parent) {
        this.parent = parent;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addTreeNode(TreeNode treeNode){
        child.add(treeNode);
    }

    public void removeTreeNode(TreeNode treeNode){
        child.remove(treeNode);
    }
}
