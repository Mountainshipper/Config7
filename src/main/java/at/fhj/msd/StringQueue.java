package at.fhj.msd;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

// there's some Bugs included, try to debug the code and fix the Bugs
// there are different Bugs, wrong implementation, typos, ...
// write Test-Cases (read Queue Interface for understanding methods) and use Debugging possibilies of your IDE


/**
 *  Create class StringQueue
 *  Create ArrayList elements
 *  Create integer maxsize
 */
public class StringQueue implements IQueue {


  private List<String> elements = new ArrayList<String>();
  private int maxSize = 5;



  /**
   * constructor
   * set int maxSize
   * @param maxSize
   */
  public StringQueue(int maxSize) {
    this.maxSize = maxSize;
  }

  /**
   * As long as maxSize is not full, we fill it with objects
   * @param obj values for ArrayList
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
   * @return element // If element size is 0, we return "Wrong size of elements-list" (Error List)
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
   * @return element // If element == null, we return "there's no element any more"
   */
  @Override
  public String remove() {
    String element = poll();
    if (element.equals("Wrong size of elements-list"))
      throw new NoSuchElementException("there's no element any more");

    return element;
  }

  /**
   * if elements.size() > 0  -> element = elements.get(0); else element = null;
   * @return element
   */
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
   * element = peek() / if element = null -> throw NoSuchElementException("there's no element any more")
   * @return element
   */
  @Override
  public String element() {
    String element = peek();

    if (element == null)
      throw new NoSuchElementException("there's no element any more");

    return element;
  }




  public void setMaxSize(int maxSize) {
    this.maxSize = maxSize;
  }

}