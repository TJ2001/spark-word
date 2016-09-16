import java.util.ArrayList;
import java.util.List;

public class Definition {

  private String mAnnotation;
  private static List<Definition> instances = new ArrayList<Definition>();
  private int mId;

  public Definition(String annotation) {
    mAnnotation = annotation;
    instances.add(this);
    mId = instances.size();
  }

  public String getAnnotation(){
    return mAnnotation;
  }

  public static List<Definition>all(){
    return instances;
  }

  public static void clear(){
    instances.clear();
  }

  public int getId(){
    return mId;
  }

  public static Definition find(int id){
    return instances.get(id-1);
  }
}
