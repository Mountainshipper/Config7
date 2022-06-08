package at.fhj.msd;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

// there's some Bugs included, try to debug the code and fix the Bugs
// there are different Bugs, wrong implementation, typos, ...
// write Test-Cases (read Queue Interface for understanding methods) and use Debugging possibilies of your IDE


/**
 *Create object StringQueue. Fill with StringQueue.
 */
public class StringQueue implements IQueue {

  private List<String> elements = new ArrayList<String>();
  private int maxSize = 5;

  public StringQueue(int maxSize) {
    this.maxSize = maxSize;
  }

  /**
   * @param obj
   * @return
   */
  @Override
  public boolean offer(String obj) {
    if (elements.size() != maxSize)
      elements.add(obj);
    else
      return false;

    return true;
  }

  /**
   * @return
   */
  @Override
  public String poll() {
    String element = peek();

    if (elements.size() == 0) {
      return "Wrong size of elements-list";
    }

    return element;
  }

  /**
   *
   * @return
   */
  @Override
  public String remove() {
    String element = poll();
    if (element == null)
      throw new NoSuchElementException("there's no element any more");

    return element;
  }

  @Override
  public String peek() {
    String element;
    if (elements.size() > 0)
      element = elements.get(0);
    else
      element = null;

    return element;
  }

  /**
   * 
   * @return
   */
  @Override
  public String element() {
    String element = peek();

    if (element == null)
      throw new NoSuchElementException("there's no element any more");

    return element;
  }

}