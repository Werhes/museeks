package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٗۨۗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C17445e implements InterfaceC6347e {
    public final long ad;
    public final int metrica;
    public final C1485e[] vip;

    public C17445e(long j, C1485e[] c1485eArr, int i) {
        this.ad = j;
        this.vip = c1485eArr;
        this.metrica = i;
    }

    @Override // defpackage.InterfaceC6347e
    public final C13178e appmetrica(long j) {
        long j2;
        long j3;
        long j4;
        long j5;
        long j6;
        int vip;
        long j7 = j;
        C1485e[] c1485eArr = this.vip;
        int length = c1485eArr.length;
        C7278e c7278e = C7278e.metrica;
        if (length == 0) {
            return new C13178e(c7278e, c7278e);
        }
        int i = this.metrica;
        int i2 = -1;
        if (i != -1) {
            C5085e c5085e = c1485eArr[i].vip;
            int ad = c5085e.ad(j7);
            if (ad == -1) {
                ad = c5085e.vip(j7);
            }
            long[] jArr = c5085e.metrica;
            long[] jArr2 = c5085e.purchase;
            if (ad == -1) {
                return new C13178e(c7278e, c7278e);
            }
            long j8 = jArr2[ad];
            j2 = jArr[ad];
            if (j8 >= j7 || ad >= c5085e.vip - 1 || (vip = c5085e.vip(j7)) == -1 || vip == ad) {
                j6 = -1;
                j4 = -9223372036854775807L;
            } else {
                j4 = jArr2[vip];
                j6 = jArr[vip];
            }
            j3 = j6;
            j7 = j8;
        } else {
            j2 = Long.MAX_VALUE;
            j3 = -1;
            j4 = -9223372036854775807L;
        }
        int i3 = 0;
        long j9 = j2;
        while (i3 < c1485eArr.length) {
            if (i3 != i) {
                C5085e c5085e2 = c1485eArr[i3].vip;
                long[] jArr3 = c5085e2.metrica;
                int ad2 = c5085e2.ad(j7);
                if (ad2 == i2) {
                    ad2 = c5085e2.vip(j7);
                }
                if (ad2 == i2) {
                    j5 = j4;
                } else {
                    j5 = j4;
                    j9 = Math.min(jArr3[ad2], j9);
                }
                if (j5 != -9223372036854775807L) {
                    long j10 = j5;
                    int ad3 = c5085e2.ad(j10);
                    if (ad3 == -1) {
                        ad3 = c5085e2.vip(j10);
                    }
                    if (ad3 == -1) {
                        j5 = j10;
                    } else {
                        j5 = j10;
                        j3 = Math.min(jArr3[ad3], j3);
                    }
                }
            } else {
                j5 = j4;
            }
            i3++;
            j4 = j5;
            i2 = -1;
        }
        long j11 = j4;
        C7278e c7278e2 = new C7278e(j7, j9);
        return j11 == -9223372036854775807L ? new C13178e(c7278e2, c7278e2) : new C13178e(c7278e2, new C7278e(j11, j3));
    }

    @Override // defpackage.InterfaceC6347e
    public final long billing() {
        return this.ad;
    }

    @Override // defpackage.InterfaceC6347e
    public final /* synthetic */ boolean license() {
        return false;
    }

    @Override // defpackage.InterfaceC6347e
    public final boolean vip() {
        return true;
    }
}
