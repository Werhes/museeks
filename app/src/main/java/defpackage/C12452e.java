package defpackage;

import java.util.Arrays;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eّْۖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C12452e {
    public int[] ad;
    public int vip;

    public /* synthetic */ C12452e() {
        this(16);
    }

    public C12452e(int i) {
        this.ad = i == 0 ? AbstractC3864e.ad : new int[i];
    }

    public final void ad(int i) {
        vip(this.vip + 1);
        int[] iArr = this.ad;
        int i2 = this.vip;
        iArr[i2] = i;
        this.vip = i2 + 1;
    }

    public final int appmetrica(int i) {
        int i2;
        if (i < 0 || i >= (i2 = this.vip)) {
            AbstractC14783e.yandex("Index must be between 0 and size");
            throw null;
        }
        int[] iArr = this.ad;
        int i3 = iArr[i];
        if (i != i2 - 1) {
            AbstractC1660e.advert(i, i + 1, iArr, iArr, i2);
        }
        this.vip--;
        return i3;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C12452e) {
            C12452e c12452e = (C12452e) obj;
            int i = c12452e.vip;
            int i2 = this.vip;
            if (i == i2) {
                int[] iArr = this.ad;
                int[] iArr2 = c12452e.ad;
                C15926e admob = AbstractC3062e.admob(0, i2);
                int i3 = admob.f22523e;
                int i4 = admob.f22522e;
                if (i3 > i4) {
                    return true;
                }
                while (iArr[i3] == iArr2[i3]) {
                    if (i3 == i4) {
                        return true;
                    }
                    i3++;
                }
                return false;
            }
        }
        return false;
    }

    public final int hashCode() {
        int[] iArr = this.ad;
        int i = this.vip;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            i2 += iArr[i3] * 31;
        }
        return i2;
    }

    public final int license() {
        int i = this.vip;
        if (i != 0) {
            return this.ad[i - 1];
        }
        AbstractC14783e.startapp("IntList is empty.");
        throw null;
    }

    public final int metrica(int i) {
        if (i >= 0 && i < this.vip) {
            return this.ad[i];
        }
        AbstractC14783e.yandex("Index must be between 0 and size");
        throw null;
    }

    public final void purchase(int i, int i2) {
        if (i < 0 || i >= this.vip) {
            AbstractC14783e.yandex("Index must be between 0 and size");
            throw null;
        }
        int[] iArr = this.ad;
        int i3 = iArr[i];
        iArr[i] = i2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "[");
        int[] iArr = this.ad;
        int i = this.vip;
        int i2 = 0;
        while (true) {
            if (i2 >= i) {
                sb.append((CharSequence) "]");
                break;
            }
            int i3 = iArr[i2];
            if (i2 == -1) {
                sb.append((CharSequence) "...");
                break;
            }
            if (i2 != 0) {
                sb.append((CharSequence) ", ");
            }
            sb.append(i3);
            i2++;
        }
        return sb.toString();
    }

    public final void vip(int i) {
        int[] iArr = this.ad;
        if (iArr.length < i) {
            this.ad = Arrays.copyOf(iArr, Math.max(i, (iArr.length * 3) / 2));
        }
    }
}
