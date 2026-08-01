package defpackage;

import java.util.Map;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٕؒۙ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC1075e implements Map.Entry {

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f3606e;

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        switch (this.f3606e) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                return AbstractC13328e.metrica(getKey(), entry.getKey()) && AbstractC13328e.metrica(getValue(), entry.getValue());
            default:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry2 = (Map.Entry) obj;
                return AbstractC6437e.license(getKey(), entry2.getKey()) && AbstractC6437e.license(getValue(), entry2.getValue());
        }
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        switch (this.f3606e) {
            case 0:
                Object key = getKey();
                Object value = getValue();
                return (key == null ? 0 : key.hashCode()) ^ (value != null ? value.hashCode() : 0);
            default:
                Object key2 = getKey();
                Object value2 = getValue();
                return (key2 == null ? 0 : key2.hashCode()) ^ (value2 != null ? value2.hashCode() : 0);
        }
    }

    @Override // java.util.Map.Entry
    public Object setValue(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final String toString() {
        switch (this.f3606e) {
            case 0:
                return getKey() + "=" + getValue();
            default:
                return AbstractC4653e.isPro(String.valueOf(getKey()), "=", String.valueOf(getValue()));
        }
    }
}
