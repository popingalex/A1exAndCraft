package org.a1exworks.parcel;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@SuppressWarnings("unchecked")
public class Parcel implements Hole {
    private Map<String, Object> map = new ConcurrentHashMap<String, Object>();

    @Override
    public <V> V save(String key, V value) {
        map.put(key, value);
        return value;
    }

    @Override
    public <V> V read(String key) {
        return (V) map.get(key);
    }

    @Override
    public <V> V read(String key, V defaultValue) {
        V value = read(key);
        return null == value ? defaultValue : value;
    }

    @Override
    public <V> V drop(String key) {
        return (V) map.remove(key);
    }
}
