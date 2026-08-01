package defpackage;

import java.util.Map;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًؚۘ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7399e implements Map.Entry, Comparable {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ C9062e f15160e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public Object f15161e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final Comparable f15162e;

    public C7399e(C9062e c9062e, Comparable comparable, Object obj) {
        this.f15160e = c9062e;
        this.f15162e = comparable;
        this.f15161e = obj;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f15162e.compareTo(((C7399e) obj).f15162e);
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                Comparable comparable = this.f15162e;
                if (comparable == null ? key == null : comparable.equals(key)) {
                    Object obj2 = this.f15161e;
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
    public final Object getKey() {
        return this.f15162e;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f15161e;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Comparable comparable = this.f15162e;
        int hashCode = comparable == null ? 0 : comparable.hashCode();
        Object obj = this.f15161e;
        return (obj != null ? obj.hashCode() : 0) ^ hashCode;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        this.f15160e.vip();
        Object obj2 = this.f15161e;
        this.f15161e = obj;
        return obj2;
    }

    public final String toString() {
        return this.f15162e + "=" + this.f15161e;
    }
}
