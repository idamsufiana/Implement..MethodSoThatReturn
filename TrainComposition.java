
import java.util.List;
import java.util.LinkedList;

public class TrainComposition {
    
    private LinkedList<Integer> train;
    
    public TrainComposition() {
        this.train = new LinkedList<>();
    }
    
    public void attachWagonFromLeft(int wagonId) {
        this.train.addFirst(wagonId);
    }

    public void attachWagonFromRight(int wagonId) {
        this.train.addLast(wagonId);
    }

    public int detachWagonFromLeft() {
        if (!train.isEmpty()) {
            return this.train.removeFirst();
        }
        return -1;
    }

    public int detachWagonFromRight() {
        if (!train.isEmpty()) {
            return this.train.removeLast();
        }
        return -1;
    }

    public static void main(String[] args) {
        TrainComposition tree = new TrainComposition();
        tree.attachWagonFromLeft(7);
        tree.attachWagonFromLeft(13);
        System.out.println(tree.detachWagonFromRight()); // 7 
        System.out.println(tree.detachWagonFromLeft()); // 13
    }
}
