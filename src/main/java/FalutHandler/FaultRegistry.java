package FalutHandler;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class FaultRegistry implements Iterable<Fault> {

    private ArrayList<Fault> registry;

    public FaultRegistry() {
        this.registry = new ArrayList<Fault>();
    }


    public void add(Fault fault) {
        registry.add(fault);
    }

    public Fault get(int i){
        return registry.get(i);
    }

    /**
     * sorts the registry by parameters spesifyd in comperTo in Fault class.
     */
    public void sort() {
        Collections.sort(this.registry);
    }


    /**
     * returns the iterator of teh registry
     * @return returns the iterator of teh registry
     */
    public Iterator<Fault> iterator() {
        return registry.iterator();
    }
}
