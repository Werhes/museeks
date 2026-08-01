package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؓٗۛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1873e implements InterfaceC6347e {
    public final C12214e ad;
    public long metrica;
    public final C12214e vip;

    public C1873e(long j, long[] jArr, long[] jArr2) {
        AbstractC2301e.billing(jArr.length == jArr2.length);
        int length = jArr2.length;
        if (length <= 0 || jArr2[0] <= 0) {
            this.ad = new C12214e(length);
            this.vip = new C12214e(length);
        } else {
            int i = length + 1;
            C12214e c12214e = new C12214e(i);
            this.ad = c12214e;
            C12214e c12214e2 = new C12214e(i);
            this.vip = c12214e2;
            c12214e.ad(0L);
            c12214e2.ad(0L);
        }
        this.ad.vip(jArr);
        this.vip.vip(jArr2);
        this.metrica = j;
    }

    @Override // defpackage.InterfaceC6347e
    public final C13178e appmetrica(long j) {
        C12214e c12214e = this.vip;
        if (c12214e.vip == 0) {
            C7278e c7278e = C7278e.metrica;
            return new C13178e(c7278e, c7278e);
        }
        int metrica = AbstractC9413e.metrica(c12214e, j);
        long license = c12214e.license(metrica);
        C12214e c12214e2 = this.ad;
        C7278e c7278e2 = new C7278e(license, c12214e2.license(metrica));
        if (license == j || metrica == c12214e.vip - 1) {
            return new C13178e(c7278e2, c7278e2);
        }
        int i = metrica + 1;
        return new C13178e(c7278e2, new C7278e(c12214e.license(i), c12214e2.license(i)));
    }

    @Override // defpackage.InterfaceC6347e
    public final long billing() {
        return this.metrica;
    }

    @Override // defpackage.InterfaceC6347e
    public final /* synthetic */ boolean license() {
        return false;
    }

    @Override // defpackage.InterfaceC6347e
    public final boolean vip() {
        return this.vip.vip > 0;
    }
}
