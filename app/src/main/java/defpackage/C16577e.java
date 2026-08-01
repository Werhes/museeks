package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًٖۢ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C16577e extends AbstractC4579e {
    public static final C16577e metrica = new AbstractC4579e(C5719e.ad);

    @Override // defpackage.AbstractC4579e
    public final void Signature(InterfaceC11845e interfaceC11845e, Object obj, int i) {
        double[] dArr = (double[]) obj;
        for (int i2 = 0; i2 < i; i2++) {
            double d = dArr[i2];
            AbstractC15920e abstractC15920e = (AbstractC15920e) interfaceC11845e;
            abstractC15920e.tapsense(this.vip, i2);
            abstractC15920e.purchase(d);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, eّؒ۠] */
    @Override // defpackage.AbstractC16956e
    public final Object advert(Object obj) {
        double[] dArr = (double[]) obj;
        ?? obj2 = new Object();
        obj2.ad = dArr;
        obj2.vip = dArr.length;
        obj2.vip(10);
        return obj2;
    }

    @Override // defpackage.AbstractC4579e
    public final Object loadAd() {
        return new double[0];
    }

    @Override // defpackage.AbstractC15168e, defpackage.AbstractC16956e
    public final void mopub(InterfaceC2043e interfaceC2043e, int i, Object obj) {
        C12202e c12202e = (C12202e) obj;
        double premium = interfaceC2043e.premium(this.vip, i);
        c12202e.vip(c12202e.license() + 1);
        double[] dArr = c12202e.ad;
        int i2 = c12202e.vip;
        c12202e.vip = i2 + 1;
        dArr[i2] = premium;
    }

    @Override // defpackage.AbstractC16956e
    public final int startapp(Object obj) {
        return ((double[]) obj).length;
    }
}
