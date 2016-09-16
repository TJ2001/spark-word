import org.junit.*;
import static org.junit.Assert.*;

public class WordTest{
  private Word mWord;

  @Before
  public void initialize(){
    mWord = new Word ("Drive", "Verb", "drahyv");
  }

  @After
  public void virginize(){
    Word.clear();
  }

  @Test
  public void Word_instantiatesCorrectly_true() {
    assertEquals(true, mWord instanceof Word);
  }

  @Test
  public void getTerm_returnsTerm_Drive(){
    assertEquals("Drive", mWord.getTerm());
  }

  @Test
  public void getPartsOfSpeech_returnsPartsOfSpeech_Verb(){
    assertEquals("Verb", mWord.getPartsOfSpeech());
  }

  @Test
  public void getPronunciation_returnsPronunciation_drahyv(){
    assertEquals("drahyv", mWord.getPronunciation());
  }

  @Test
  public void all_returnsAllInstancesOfWord_true(){
    Word anotherWord = new Word("Apex", "Noun", "ey-peks");
    assertEquals(true, Word.all().contains(mWord));
    assertEquals(true, Word.all().contains(anotherWord));
  }

  @Test
  public void clear_emptiesAllWordsFromList_0() {
    Word.clear();
    assertEquals(0, Word.all().size());
  }

  @Test
  public void getId_wordInstantiatesWithId_1() {
    assertEquals(1, mWord.getId());
  }

  @Test
  public void find_returnsDefinitionWithSameId_anotherWord() {
    Word anotherWord = new Word("Apex", "Noun", "ey-peks");
    assertEquals(anotherWord, Word.find(anotherWord.getId()));
  }

  @Test
  public void getDefinition_initiallyReturnsEmptyList_ArrayList(){
    assertEquals(0, mWord.getDefinitions().size());
  }

  @Test
  public void addDefinition_addDefinitionToList_true(){
    Word.clear();
    Definition testDefinition = new Definition("to keep going.");
    mWord.addDefinition(testDefinition);
    assertTrue(mWord.getDefinitions().contains(testDefinition));
  }
}
