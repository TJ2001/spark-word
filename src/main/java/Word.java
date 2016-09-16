import java.util.List;
import java.util.ArrayList;

public class Word {
  private String mTerm;
  private String mPartsOfSpeech;
  private String mPronunciation;
  private static ArrayList<Word> instances = new ArrayList<Word>();
  private int mId;
  private List<Definition> mDefinitions;

  public Word(String term, String partsOfSpeech, String pronunciation) {
    mTerm = term;
    mPartsOfSpeech = partsOfSpeech;
    mPronunciation = pronunciation;
    instances.add(this);
    mId = instances.size();
    mDefinitions = new ArrayList<Definition>();
  }

  public String getTerm() {
    return mTerm;
  }

  public String getPartsOfSpeech() {
    return mPartsOfSpeech;
  }

  public String getPronunciation() {
    return mPronunciation;
  }

  public static ArrayList<Word> all() {
    return instances;
  }

  public static void clear() {
    instances.clear();
  }

  public int getId() {
    return mId;
  }

  public static Word find(int id) {
    return instances.get(id - 1);
  }

  public List<Definition> getDefinitions() {
    return mDefinitions;
  }

  public void addDefinition(Definition definition) {
    mDefinitions.add(definition);
  }
}
