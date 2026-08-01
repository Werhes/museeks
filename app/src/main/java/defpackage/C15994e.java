package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٖؖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C15994e extends AbstractC4579e {
    public static final C15994e metrica = new AbstractC4579e(C2512e.ad);

    @Override // defpackage.AbstractC4579e
    public final void Signature(InterfaceC11845e interfaceC11845e, Object obj, int i) {
        char[] cArr = (char[]) obj;
        for (int i2 = 0; i2 < i; i2++) {
            char c = cArr[i2];
            AbstractC15920e abstractC15920e = (AbstractC15920e) interfaceC11845e;
            abstractC15920e.tapsense(this.vip, i2);
            abstractC15920e.advert(c);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, eٕٕؑ] */
    @Override // defpackage.AbstractC16956e
    public final Object advert(Object obj) {
        char[] cArr = (char[]) obj;
        ?? obj2 = new Object();
        obj2.ad = cArr;
        obj2.vip = cArr.length;
        obj2.vip(10);
        return obj2;
    }

    @Override // defpackage.AbstractC4579e
    public final Object loadAd() {
        return new char[0];
    }

    @Override // defpackage.AbstractC15168e, defpackage.AbstractC16956e
    public final void mopub(InterfaceC2043e interfaceC2043e, int i, Object obj) {
        C15474e c15474e = (C15474e) obj;
        char startapp = interfaceC2043e.startapp(this.vip, i);
        c15474e.vip(c15474e.license() + 1);
        char[] cArr = c15474e.ad;
        int i2 = c15474e.vip;
        c15474e.vip = i2 + 1;
        cArr[i2] = startapp;
    }

    @Override // defpackage.AbstractC16956e
    public final int startapp(Object obj) {
        return ((char[]) obj).length;
    }
}
