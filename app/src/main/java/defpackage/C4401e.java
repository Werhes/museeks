package defpackage;

import java.math.RoundingMode;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؖۜ۟, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4401e implements InterfaceC6347e {
    public final C18437e ad;
    public final long appmetrica;
    public final long license;
    public final long metrica;
    public final int vip;

    public C4401e(C18437e c18437e, int i, long j, long j2) {
        this.ad = c18437e;
        this.vip = i;
        this.metrica = j;
        long j3 = (j2 - j) / c18437e.metrica;
        this.license = j3;
        this.appmetrica = yandex(j3);
    }

    @Override // defpackage.InterfaceC6347e
    public final C13178e appmetrica(long j) {
        C18437e c18437e = this.ad;
        long j2 = this.license;
        long mopub = AbstractC9413e.mopub((c18437e.vip * j) / (this.vip * 1000000), 0L, j2 - 1);
        long j3 = this.metrica;
        long yandex = yandex(mopub);
        C7278e c7278e = new C7278e(yandex, (c18437e.metrica * mopub) + j3);
        if (yandex >= j || mopub == j2 - 1) {
            return new C13178e(c7278e, c7278e);
        }
        long j4 = mopub + 1;
        return new C13178e(c7278e, new C7278e(yandex(j4), (c18437e.metrica * j4) + j3));
    }

    @Override // defpackage.InterfaceC6347e
    public final long billing() {
        return this.appmetrica;
    }

    @Override // defpackage.InterfaceC6347e
    public final /* synthetic */ boolean license() {
        return false;
    }

    @Override // defpackage.InterfaceC6347e
    public final boolean vip() {
        return true;
    }

    public final long yandex(long j) {
        long j2 = j * this.vip;
        long j3 = this.ad.vip;
        String str = AbstractC9413e.ad;
        return AbstractC9413e.m2555import(j2, 1000000L, j3, RoundingMode.DOWN);
    }
}
