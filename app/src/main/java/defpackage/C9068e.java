package defpackage;

import android.util.Pair;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌۢ۟, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9068e implements InterfaceC5825e {
    public final long[] ad;
    public final long metrica;
    public final long[] vip;

    public C9068e(long j, long[] jArr, long[] jArr2) {
        this.ad = jArr;
        this.vip = jArr2;
        this.metrica = j == -9223372036854775807L ? AbstractC9413e.m2546case(jArr2[jArr2.length - 1]) : j;
    }

    public static Pair yandex(long j, long[] jArr, long[] jArr2) {
        int purchase = AbstractC9413e.purchase(jArr, j, true);
        long j2 = jArr[purchase];
        long j3 = jArr2[purchase];
        int i = purchase + 1;
        if (i == jArr.length) {
            return Pair.create(Long.valueOf(j2), Long.valueOf(j3));
        }
        return Pair.create(Long.valueOf(j), Long.valueOf(((long) ((jArr[i] == j2 ? 0.0d : (j - j2) / (r6 - j2)) * (jArr2[i] - j3))) + j3));
    }

    @Override // defpackage.InterfaceC5825e
    public final long ad() {
        return -1L;
    }

    @Override // defpackage.InterfaceC6347e
    public final C13178e appmetrica(long j) {
        Pair yandex = yandex(AbstractC9413e.m2567switch(AbstractC9413e.mopub(j, 0L, this.metrica)), this.vip, this.ad);
        C7278e c7278e = new C7278e(AbstractC9413e.m2546case(((Long) yandex.first).longValue()), ((Long) yandex.second).longValue());
        return new C13178e(c7278e, c7278e);
    }

    @Override // defpackage.InterfaceC6347e
    public final long billing() {
        return this.metrica;
    }

    @Override // defpackage.InterfaceC6347e
    public final /* synthetic */ boolean license() {
        return false;
    }

    @Override // defpackage.InterfaceC5825e
    public final long metrica(long j) {
        return AbstractC9413e.m2546case(((Long) yandex(j, this.ad, this.vip).second).longValue());
    }

    @Override // defpackage.InterfaceC5825e
    public final int purchase() {
        return -2147483647;
    }

    @Override // defpackage.InterfaceC6347e
    public final boolean vip() {
        return true;
    }
}
