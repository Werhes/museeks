package defpackage;

import java.util.Map;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eِؕ۟, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3311e implements Map.Entry {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public C3311e f7470e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public C3311e f7471e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public C3311e f7472e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public Object f7473e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public C3311e f7474e;

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public int f7475e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public C3311e f7476e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final int f7477e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final Object f7478e;

    public C3311e() {
        this.f7478e = null;
        this.f7477e = -1;
        this.f7470e = this;
        this.f7474e = this;
    }

    public C3311e(C3311e c3311e, Object obj, int i, C3311e c3311e2, C3311e c3311e3) {
        this.f7476e = c3311e;
        this.f7478e = obj;
        this.f7477e = i;
        this.f7475e = 1;
        this.f7474e = c3311e2;
        this.f7470e = c3311e3;
        c3311e3.f7474e = this;
        c3311e2.f7470e = this;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object obj2 = this.f7478e;
            if (obj2 != null ? obj2.equals(entry.getKey()) : entry.getKey() == null) {
                Object obj3 = this.f7473e;
                if (obj3 == null) {
                    if (entry.getValue() == null) {
                        return true;
                    }
                } else if (obj3.equals(entry.getValue())) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f7478e;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f7473e;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Object obj = this.f7478e;
        int hashCode = obj == null ? 0 : obj.hashCode();
        Object obj2 = this.f7473e;
        return (obj2 != null ? obj2.hashCode() : 0) ^ hashCode;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        Object obj2 = this.f7473e;
        this.f7473e = obj;
        return obj2;
    }

    public final String toString() {
        return this.f7478e + "=" + this.f7473e;
    }
}
