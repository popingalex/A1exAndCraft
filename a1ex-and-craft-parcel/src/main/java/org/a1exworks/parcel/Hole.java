package org.a1exworks.parcel;

public interface Hole {
    <V> V save(String key, V value);

    <V> V read(String key);

    <V> V read(String key, V defaultValue);

    <V> V drop(String key);
}
