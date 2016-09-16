import org.junit.*;
import static org.junit.Assert.*;

public class DefinitionTest {
  private Definition mDefinition;

  @Before
  public void initialize() {
    mDefinition = new Definition("to keep going.");
  }

  @After
  public void virginize() {
    Definition.clear();
  }

  @Test
  public void Definition_instantiatesCorrectly_true(){
    assertEquals(true, mDefinition instanceof Definition);
  }

  @Test
  public void getAnnotation_returnsAnnotation_toKeepGoing(){
    String expected = "to keep going.";
    assertEquals(expected, mDefinition.getAnnotation());
  }

  @Test
  public void all_returnsAllInstancesOfDefinition_true(){
    Definition anotherDefinition = new Definition("to cause and guide the movement of a vehicle.");
    assertEquals(true, Definition.all().contains(mDefinition));
    assertEquals(true, Definition.all().contains(anotherDefinition));
  }

  @Test
  public void clear_emptiesAllDefinitionFromList_0(){
    Definition.clear();
    assertEquals(0, Definition.all().size());
  }

  @Test
  public void getId_returnsInstantiateWithAnId_1(){
    assertEquals(1, mDefinition.getId());
  }

  @Test
  public void find_returnsDefinitionWithSameId_AnotherDefinition(){
    Definition anotherDefinition = new Definition("to cause and guide the movement of a vehicle.");
    assertEquals(anotherDefinition, Definition.find(anotherDefinition.getId()));
  }
}
