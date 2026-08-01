package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eُۤؔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11368e implements InterfaceC5825e, InterfaceC6347e {
    public final long ad;
    public final int adcel;
    public final boolean advert;
    public final int appmetrica;
    public final boolean billing;
    public final long license;
    public final int metrica;
    public final int mopub;
    public final long purchase;
    public final long smaato;
    public final long startapp;
    public final long vip;
    public final boolean yandex;

    public C11368e(long j, long j2, int i, int i2, boolean z, boolean z2) {
        this.ad = j;
        this.vip = j2;
        this.metrica = i2 == -1 ? 1 : i2;
        this.appmetrica = i;
        this.billing = z;
        this.yandex = z2;
        if (j == -1) {
            this.license = -1L;
            this.purchase = -9223372036854775807L;
        } else {
            long j3 = j - j2;
            this.license = j3;
            this.purchase = (Math.max(0L, j3) * 8000000) / i;
        }
        this.startapp = j2;
        this.adcel = i;
        this.mopub = i2;
        this.advert = z;
        this.smaato = j == -1 ? -1L : j;
    }

    @Override // defpackage.InterfaceC5825e
    public final long ad() {
        return this.smaato;
    }

    @Override // defpackage.InterfaceC6347e
    public final C13178e appmetrica(long j) {
        long j2 = this.license;
        long j3 = this.vip;
        if (j2 == -1 && !this.billing) {
            C7278e c7278e = new C7278e(0L, j3);
            return new C13178e(c7278e, c7278e);
        }
        int i = this.appmetrica;
        long j4 = this.metrica;
        long j5 = (((i * j) / 8000000) / j4) * j4;
        if (j2 != -1) {
            j5 = Math.min(j5, j2 - j4);
        }
        long max = Math.max(j5, 0L) + j3;
        long max2 = (Math.max(0L, max - j3) * 8000000) / i;
        C7278e c7278e2 = new C7278e(max2, max);
        if (j2 != -1 && max2 < j) {
            long j6 = max + j4;
            if (j6 < this.ad) {
                return new C13178e(c7278e2, new C7278e((Math.max(0L, j6 - j3) * 8000000) / i, j6));
            }
        }
        return new C13178e(c7278e2, c7278e2);
    }

    @Override // defpackage.InterfaceC6347e
    public final long billing() {
        return this.purchase;
    }

    @Override // defpackage.InterfaceC6347e
    public final boolean license() {
        return this.yandex;
    }

    @Override // defpackage.InterfaceC5825e
    public final long metrica(long j) {
        return (Math.max(0L, j - this.vip) * 8000000) / this.appmetrica;
    }

    @Override // defpackage.InterfaceC5825e
    public final int purchase() {
        return this.adcel;
    }

    @Override // defpackage.InterfaceC6347e
    public final boolean vip() {
        return this.license != -1 || this.billing;
    }
}
