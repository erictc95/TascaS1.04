package nivel2.ejercicio1234567;

import nivel2.ejercicio1234567.assertj.ExampleData;
import org.junit.jupiter.api.Test;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import static org.assertj.core.api.Assertions.*;

public class ExampleDataTest {

    @Test
    void integers_whenCompared_shouldBeEqualOrNotEqualCorrectly() {
        int a = 1;
        int b = 1;
        int c = 2;

        assertThat(a).isEqualTo(b);
        assertThat(a).isNotEqualTo(c);
    }

    @Test
    void objects_whenSameReference_shouldBeSameAndDifferentInstancesNotSame() {
        String s1 = "Hola";
        String s2 = s1;
        String s3 = new String("Hola");

        assertThat(s1).isSameAs(s2);
        assertThat(s1).isNotSameAs(s3);
    }

    @Test
    void getList_whenCalled_shouldContainExpectedElements() {
        ExampleData data = new ExampleData();
        List<Object> list = data.getList();

        assertThat(list).containsExactly("Hola", 42, 3.14);
        assertThat(list).containsExactlyInAnyOrder(3.14, "Hola", 42);
        assertThat(list).containsOnlyOnce("Hola");
        assertThat(list).doesNotContain("Adios");
    }

    @Test
    void getMap_whenCalled_shouldContainExpectedEntries() {
        ExampleData data = new ExampleData();
        Map<String, String> map = data.getMap();

        assertThat(map).containsKey("key1");
        assertThat(map).containsValue("value1");
        assertThat(map).containsEntry("key2", "value2");
    }

    @Test
    void arrayAccess_whenIndexIsOutOfBounds_shouldThrowException() {
        int[] arr = {1, 2, 3};

        assertThatThrownBy(() -> {
            int x = arr[5];
        }).isInstanceOf(ArrayIndexOutOfBoundsException.class);
    }

    @Test
    void getEmptyOptional_whenCalled_shouldReturnEmptyOptional() {
        ExampleData data = new ExampleData();
        Optional<String> optional = data.getEmptyOptional();

        assertThat(optional).isEmpty();
    }

}
