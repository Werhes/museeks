package ealvatag.tag.datatype;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* loaded from: classes3.dex */
public class Pair {
    private String key;
    private String value;

    public Pair(String str, String str2) {
        setKey(str);
        setValue(str2);
    }

    public String getKey() {
        return this.key;
    }

    public String getPairValue() {
        return getKey() + (char) 0 + getValue();
    }

    public String getValue() {
        return this.value;
    }

    public void setKey(String str) {
        this.key = str;
    }

    public void setValue(String str) {
        this.value = str;
    }
}
