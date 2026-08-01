package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٖؑٚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C15921e implements InterfaceC16490e {
    public final C13119e ad;
    public final C0583e license;
    public final C0576e metrica = AbstractC14533e.startapp(new C12729e(0));
    public InterfaceC8079e vip;

    public C15921e(C13119e c13119e, InterfaceC8079e interfaceC8079e) {
        this.ad = c13119e;
        this.vip = interfaceC8079e;
        long[] jArr = AbstractC12981e.ad;
        this.license = new C0583e();
    }

    @Override // defpackage.InterfaceC16490e
    public final Object ad() {
        return this.ad.purchase().ad();
    }

    @Override // defpackage.InterfaceC16490e
    public final Object metrica() {
        return this.ad.purchase().metrica();
    }

    @Override // defpackage.InterfaceC16490e
    public final boolean vip(Object obj, Object obj2) {
        return obj.equals(ad()) && obj2.equals(metrica());
    }
}
