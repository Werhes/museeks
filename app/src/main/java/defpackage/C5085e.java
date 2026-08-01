package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eْؗۖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5085e {
    public final C4361e ad;
    public final boolean adcel;
    public final int appmetrica;
    public final int[] billing;
    public final int[] license;
    public final long[] metrica;
    public final long[] purchase;
    public final long startapp;
    public final int vip;
    public final int[] yandex;

    public C5085e(C4361e c4361e, long[] jArr, int[] iArr, int i, long[] jArr2, int[] iArr2, int[] iArr3, boolean z, long j, int i2) {
        AbstractC2301e.billing(iArr.length == jArr2.length);
        AbstractC2301e.billing(jArr.length == jArr2.length);
        AbstractC2301e.billing(iArr2.length == jArr2.length);
        this.ad = c4361e;
        this.metrica = jArr;
        this.license = iArr;
        this.appmetrica = i;
        this.purchase = jArr2;
        this.billing = iArr2;
        this.yandex = iArr3;
        this.adcel = z;
        this.startapp = j;
        this.vip = i2;
        if (iArr2.length > 0) {
            int length = iArr2.length - 1;
            iArr2[length] = iArr2[length] | 536870912;
        }
    }

    public final int ad(long j) {
        boolean z = this.adcel;
        int i = 0;
        long[] jArr = this.purchase;
        if (z) {
            return AbstractC9413e.purchase(jArr, j, false);
        }
        int[] iArr = this.yandex;
        int length = iArr.length - 1;
        int i2 = -1;
        while (i <= length) {
            int smaato = AbstractC8703e.smaato(length, i, 2, i);
            if (jArr[iArr[smaato]] <= j) {
                i = smaato + 1;
                i2 = smaato;
            } else {
                length = smaato - 1;
            }
        }
        if (i2 == -1) {
            return -1;
        }
        long j2 = jArr[iArr[i2]];
        if (j2 == j) {
            while (i2 > 0 && jArr[iArr[i2 - 1]] == j2) {
                i2--;
            }
        }
        return iArr[i2];
    }

    public final int vip(long j) {
        boolean z = this.adcel;
        long[] jArr = this.purchase;
        if (z) {
            return AbstractC9413e.vip(jArr, j, true);
        }
        int[] iArr = this.yandex;
        int length = iArr.length - 1;
        int i = 0;
        int i2 = -1;
        while (i <= length) {
            int smaato = AbstractC8703e.smaato(length, i, 2, i);
            if (jArr[iArr[smaato]] >= j) {
                length = smaato - 1;
                i2 = smaato;
            } else {
                i = smaato + 1;
            }
        }
        if (i2 == -1) {
            return -1;
        }
        long j2 = jArr[iArr[i2]];
        if (j2 == j) {
            while (i2 < iArr.length - 1) {
                int i3 = i2 + 1;
                if (jArr[iArr[i3]] != j2) {
                    break;
                }
                i2 = i3;
            }
        }
        return iArr[i2];
    }
}
