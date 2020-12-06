package grigorev.mikhail.iterators;

import grigorev.mikhail.data.Employee;
import grigorev.mikhail.data.TreeNode;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class LeafsOnlyIterator implements Iterator<TreeNode> {

    private List<TreeNode> leafs = new ArrayList<>();
    private int pointer = 0;

    public LeafsOnlyIterator(TreeNode collection) {
        filterCollection(collection);
    }

    private void filterCollection(TreeNode collection) {
        if (collection == null)
            return;
        if (collection.getChildren() == null || collection.getChildren().size() == 0) {
            leafs.add(collection);
            return;
        }
        for (TreeNode elem: (List<TreeNode>)collection.getChildren()) {
            filterCollection(elem);
        }
    }

    public boolean hasNext() {
        return pointer < leafs.size();
    }

    public TreeNode<Employee> next() {
        pointer++;
        return leafs.get(pointer - 1);
    }
}
