package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eّٖؐ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C16152e extends AbstractC4579e {
    public static final C16152e metrica = new AbstractC4579e(C12736e.ad);

    @Override // defpackage.AbstractC4579e
    public final void Signature(InterfaceC11845e interfaceC11845e, Object obj, int i) {
        short[] sArr = (short[]) obj;
        for (int i2 = 0; i2 < i; i2++) {
            short s = sArr[i2];
            AbstractC15920e abstractC15920e = (AbstractC15920e) interfaceC11845e;
            abstractC15920e.tapsense(this.vip, i2);
            abstractC15920e.billing(s);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, eؙۥ۟] */
    @Override // defpackage.AbstractC16956e
    public final Object advert(Object obj) {
        short[] sArr = (short[]) obj;
        ?? obj2 = new Object();
        obj2.ad = sArr;
        obj2.vip = sArr.length;
        obj2.vip(10);
        return obj2;
    }

    @Override // defpackage.AbstractC4579e
    public final Object loadAd() {
        return new short[0];
    }

    @Override // defpackage.AbstractC15168e, defpackage.AbstractC16956e
    public final void mopub(InterfaceC2043e interfaceC2043e, int i, Object obj) {
        C6782e c6782e = (C6782e) obj;
        short loadAd = interfaceC2043e.loadAd(this.vip, i);
        c6782e.vip(c6782e.license() + 1);
        short[] sArr = c6782e.ad;
        int i2 = c6782e.vip;
        c6782e.vip = i2 + 1;
        sArr[i2] = loadAd;
    }

    @Override // defpackage.AbstractC16956e
    public final int startapp(Object obj) {
        return ((short[]) obj).length;
    }
}
