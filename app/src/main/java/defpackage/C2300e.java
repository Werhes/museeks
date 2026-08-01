package defpackage;

import java.util.ConcurrentModificationException;
import java.util.Map;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؔؑؔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2300e implements Map.Entry, InterfaceC6514e {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final int f5817e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final int f5818e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final C1239e f5819e;

    public C2300e(C1239e c1239e, int i) {
        this.f5819e = c1239e;
        this.f5818e = i;
        this.f5817e = c1239e.f3914e;
    }

    public final void ad() {
        if (this.f5819e.f3914e != this.f5817e) {
            throw new ConcurrentModificationException("The backing map has been modified after this entry was obtained.");
        }
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        return AbstractC7890e.billing(entry.getKey(), getKey()) && AbstractC7890e.billing(entry.getValue(), getValue());
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        ad();
        return this.f5819e.f3918e[this.f5818e];
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        ad();
        return this.f5819e.f3913e[this.f5818e];
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Object key = getKey();
        int hashCode = key != null ? key.hashCode() : 0;
        Object value = getValue();
        return hashCode ^ (value != null ? value.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        ad();
        C1239e c1239e = this.f5819e;
        c1239e.metrica();
        Object[] objArr = c1239e.f3913e;
        if (objArr == null) {
            int length = c1239e.f3918e.length;
            if (length < 0) {
                throw new IllegalArgumentException("capacity must be non-negative.");
            }
            objArr = new Object[length];
            c1239e.f3913e = objArr;
        }
        int i = this.f5818e;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        return obj2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getKey());
        sb.append('=');
        sb.append(getValue());
        return sb.toString();
    }
}
