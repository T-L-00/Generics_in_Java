package com.example.multipleGenerics;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import java.util.List;

/**
 * Represents synonyms association between words.
 *
 * @param <T> The type of word.
 * @param <U> The type of synonyms list.
 */
@AllArgsConstructor
@NoArgsConstructor
@Slf4j
public class SynonymsAssociation<T, U> {

    private T word;
    private List<U> synonyms;

    public T getWord() {
        return word;
    }

    public List<U> getSynonyms() {
        return synonyms;
    }
}