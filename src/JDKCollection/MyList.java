package JDKCollection;

import java.util.Collection;

public interface MyList<E> extends Collection<E> {
    int size();
    boolean isEmpty();
    boolean contains(Object obj);

}
