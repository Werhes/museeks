package defpackage;

import java.util.Map;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍؖۜ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4392e implements Map.Entry, Comparable {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ C15620e f9570e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public Object f9571e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final Comparable f9572e;

    public C4392e(C15620e c15620e, Comparable comparable, Object obj) {
        this.f9570e = c15620e;
        this.f9572e = comparable;
        this.f9571e = obj;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return this.f9572e.compareTo(((C4392e) obj).f9572e);
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                Comparable comparable = this.f9572e;
                if (comparable == null ? key == null : comparable.equals(key)) {
                    Object obj2 = this.f9571e;
                    Object value = entry.getValue();
                    if (obj2 == null ? value == null : obj2.equals(value)) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.util.Map.Entry
    public final /* synthetic */ Object getKey() {
        return this.f9572e;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f9571e;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Comparable comparable = this.f9572e;
        int hashCode = comparable == null ? 0 : comparable.hashCode();
        Object obj = this.f9571e;
        return (obj != null ? obj.hashCode() : 0) ^ hashCode;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        this.f9570e.billing();
        Object obj2 = this.f9571e;
        this.f9571e = obj;
        return obj2;
    }

    public final String toString() {
        return AbstractC4653e.isPro(String.valueOf(this.f9572e), "=", String.valueOf(this.f9571e));
    }
}
