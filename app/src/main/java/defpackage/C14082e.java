package defpackage;

import java.util.Map;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٓٚٙ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C14082e implements Comparable, Map.Entry {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ C15497e f27842e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public Object f27843e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final Comparable f27844e;

    public C14082e(C15497e c15497e, Comparable comparable, Object obj) {
        this.f27842e = c15497e;
        this.f27844e = comparable;
        this.f27843e = obj;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f27844e.compareTo(((C14082e) obj).f27844e);
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                Comparable comparable = this.f27844e;
                if (comparable == null ? key == null : comparable.equals(key)) {
                    Object obj2 = this.f27843e;
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
        return this.f27844e;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f27843e;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Comparable comparable = this.f27844e;
        int hashCode = comparable == null ? 0 : comparable.hashCode();
        Object obj = this.f27843e;
        return (obj != null ? obj.hashCode() : 0) ^ hashCode;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        this.f27842e.vip();
        Object obj2 = this.f27843e;
        this.f27843e = obj;
        return obj2;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f27844e);
        String valueOf2 = String.valueOf(this.f27843e);
        return AbstractC8647e.ads(new StringBuilder(valueOf2.length() + valueOf.length() + 1), valueOf, "=", valueOf2);
    }
}
