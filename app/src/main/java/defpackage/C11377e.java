package defpackage;

import java.util.Map;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eُۥؘ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C11377e implements Map.Entry, Comparable {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ C12745e f22903e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public Object f22904e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final Comparable f22905e;

    public C11377e(C12745e c12745e, Comparable comparable, Object obj) {
        this.f22903e = c12745e;
        this.f22905e = comparable;
        this.f22904e = obj;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return this.f22905e.compareTo(((C11377e) obj).f22905e);
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                Comparable comparable = this.f22905e;
                if (comparable == null ? key == null : comparable.equals(key)) {
                    Object obj2 = this.f22904e;
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
        return this.f22905e;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f22904e;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Comparable comparable = this.f22905e;
        int hashCode = comparable == null ? 0 : comparable.hashCode();
        Object obj = this.f22904e;
        return (obj != null ? obj.hashCode() : 0) ^ hashCode;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        this.f22903e.purchase();
        Object obj2 = this.f22904e;
        this.f22904e = obj;
        return obj2;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f22905e);
        String valueOf2 = String.valueOf(this.f22904e);
        return AbstractC8647e.ads(new StringBuilder(valueOf.length() + 1 + valueOf2.length()), valueOf, "=", valueOf2);
    }
}
