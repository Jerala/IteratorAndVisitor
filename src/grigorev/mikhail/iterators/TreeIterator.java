package grigorev.mikhail.iterators;

import grigorev.mikhail.data.Employee;
import grigorev.mikhail.data.TreeNode;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TreeIterator implements Iterator {
    private List<TreeNode> elems = new ArrayList<>();
    private int pointer = 0;

    public TreeIterator(TreeNode collection) {
        filterCollection(collection);
    }

    private void filterCollection(TreeNode<Employee> collection) {
        if (collection == null)
            return;
        elems.add(collection);
        if (collection.getChildren() != null) {
            for (TreeNode<Employee> elem : collection.getChildren()) {
                filterCollection(elem);
            }
        }
    }

    public boolean hasNext() {
        return pointer < elems.size();
    }

    public TreeNode<Employee> next() {
        pointer++;
        return elems.get(pointer - 1);
    }
}
