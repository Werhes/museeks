package defpackage;

import java.util.Iterator;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eُۙۨ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public class C11241e implements Iterable, InterfaceC16555e {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final int f22521e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final int f22522e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final int f22523e;

    public C11241e(int i, int i2, int i3) {
        if (i3 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        }
        if (i3 == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
        this.f22523e = i;
        this.f22522e = AbstractC4340e.license(i, i2, i3);
        this.f22521e = i3;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C11241e)) {
            return false;
        }
        if (isEmpty() && ((C11241e) obj).isEmpty()) {
            return true;
        }
        C11241e c11241e = (C11241e) obj;
        return this.f22523e == c11241e.f22523e && this.f22522e == c11241e.f22522e && this.f22521e == c11241e.f22521e;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (((this.f22523e * 31) + this.f22522e) * 31) + this.f22521e;
    }

    public boolean isEmpty() {
        int i = this.f22521e;
        int i2 = this.f22522e;
        int i3 = this.f22523e;
        return i > 0 ? i3 > i2 : i3 < i2;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C3296e(this.f22523e, this.f22522e, this.f22521e);
    }

    public String toString() {
        StringBuilder sb;
        int i = this.f22522e;
        int i2 = this.f22523e;
        int i3 = this.f22521e;
        if (i3 > 0) {
            sb = new StringBuilder();
            sb.append(i2);
            sb.append("..");
            sb.append(i);
            sb.append(" step ");
            sb.append(i3);
        } else {
            sb = new StringBuilder();
            sb.append(i2);
            sb.append(" downTo ");
            sb.append(i);
            sb.append(" step ");
            sb.append(-i3);
        }
        return sb.toString();
    }
}
