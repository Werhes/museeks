package defpackage;

import java.io.Serializable;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍٕٛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C15574e implements Serializable {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public static final C15574e f30741e = new C15574e(new int[0]);

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final int f30742e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final int[] f30743e;

    public C15574e(int[] iArr) {
        int length = iArr.length;
        this.f30743e = iArr;
        this.f30742e = length;
    }

    public final boolean ad(int i) {
        int i2 = 0;
        while (true) {
            if (i2 >= this.f30742e) {
                i2 = -1;
                break;
            }
            if (this.f30743e[i2] == i) {
                break;
            }
            i2++;
        }
        return i2 >= 0;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C15574e) {
            C15574e c15574e = (C15574e) obj;
            int i = c15574e.f30742e;
            int i2 = this.f30742e;
            if (i2 == i) {
                for (int i3 = 0; i3 < i2; i3++) {
                    if (vip(i3) == c15574e.vip(i3)) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f30742e; i2++) {
            i = (i * 31) + this.f30743e[i2];
        }
        return i;
    }

    public final String toString() {
        int i = this.f30742e;
        if (i == 0) {
            return "[]";
        }
        StringBuilder sb = new StringBuilder(i * 5);
        sb.append('[');
        int[] iArr = this.f30743e;
        sb.append(iArr[0]);
        for (int i2 = 1; i2 < i; i2++) {
            sb.append(", ");
            sb.append(iArr[i2]);
        }
        sb.append(']');
        return sb.toString();
    }

    public final int vip(int i) {
        AbstractC2301e.mopub(i, this.f30742e);
        return this.f30743e[i];
    }
}
