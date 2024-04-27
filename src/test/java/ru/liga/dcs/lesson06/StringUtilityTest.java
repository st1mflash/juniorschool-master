package ru.liga.dcs.lesson06;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class StringUtilityTest {

    @Test
    public void testCanFormString_validCase() {
        assertThat(StringUtility02.canFormString("abcd", "dcba")).isTrue();
    }

    @Test
    public void testCanFormString_invalidCase() {
        assertThat(StringUtility02.canFormString("abcd", "abce")).isFalse();
    }

    @Test
    public void testCanFormString_emptyStrings() {
        assertThat(StringUtility02.canFormString("", "")).isTrue();
    }

    @Test
    public void testCanFormString_nullInput() {
        assertThrows(NullPointerException.class, () -> {
            StringUtility02.canFormString(null, "abc");
        });
    }

    // Можно добавить дополнительные тесты для проверки других сценариев
}
