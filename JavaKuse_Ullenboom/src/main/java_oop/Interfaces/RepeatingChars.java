package Interfaces;

import org.jetbrains.annotations.NotNull;

import java.util.stream.IntStream;

public class RepeatingChars implements CharSequence {
    int length;
    char c;

    RepeatingChars(int length, char c) {
        this.length = length;
        this.c = c;
    }

    @Override
    public int length() {
        return this.length;
    }

    @Override
    public char charAt(int index) {
        return c;
    }

    @Override
    public boolean isEmpty() {
        return CharSequence.super.isEmpty();
    }

    @NotNull
    @Override
    public CharSequence subSequence(int start, int end) {
        return null;
    }

    @NotNull
    @Override
    public IntStream chars() {
        return CharSequence.super.chars();
    }

    @NotNull
    @Override
    public IntStream codePoints() {
        return CharSequence.super.codePoints();
    }
}
