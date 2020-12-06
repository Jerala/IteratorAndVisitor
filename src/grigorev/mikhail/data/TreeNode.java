package grigorev.mikhail.data;

import grigorev.mikhail.iterators.LeafsOnlyIterator;
import grigorev.mikhail.iterators.TreeIterator;

import java.util.Iterator;
import java.util.List;

public class TreeNode<T> implements Iterable<TreeNode> {

    public TreeNode(T elem) {
        this.elem = elem;
    }

    public TreeNode(T elem, List<TreeNode<T>> children) {
        this.elem = elem;
        this.children = children;
    }

    private T elem;
    private List<TreeNode<T>> children;

    public Iterator<TreeNode> iterator() {
        return new TreeIterator(this);
    }

    public Iterator<TreeNode> leafOnlyIterator() {
        return new LeafsOnlyIterator(this);
    }

    public T getElem() {
        return elem;
    }

    public void setElem(T elem) {
        this.elem = elem;
    }

    public List<TreeNode<T>> getChildren() {
        return children;
    }

    public void setChildren(List<TreeNode<T>> children) {
        this.children = children;
    }

}
