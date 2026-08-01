package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eِٖۡ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C16563e extends AbstractC4579e {
    public static final C16563e metrica = new AbstractC4579e(C7094e.ad);

    @Override // defpackage.AbstractC4579e
    public final void Signature(InterfaceC11845e interfaceC11845e, Object obj, int i) {
        short[] sArr = ((C5901e) obj).f12448e;
        for (int i2 = 0; i2 < i; i2++) {
            ((AbstractC15920e) interfaceC11845e).isVip(this.vip, i2).billing(sArr[i2]);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [eؚِٖ, java.lang.Object] */
    @Override // defpackage.AbstractC16956e
    public final Object advert(Object obj) {
        short[] sArr = ((C5901e) obj).f12448e;
        ?? obj2 = new Object();
        obj2.ad = sArr;
        obj2.vip = sArr.length;
        obj2.vip(10);
        return obj2;
    }

    @Override // defpackage.AbstractC4579e
    public final Object loadAd() {
        return new C5901e(new short[0]);
    }

    @Override // defpackage.AbstractC15168e, defpackage.AbstractC16956e
    public final void mopub(InterfaceC2043e interfaceC2043e, int i, Object obj) {
        C16057e c16057e = (C16057e) obj;
        short subs = interfaceC2043e.license(this.vip, i).subs();
        c16057e.vip(c16057e.license() + 1);
        short[] sArr = c16057e.ad;
        int i2 = c16057e.vip;
        c16057e.vip = i2 + 1;
        sArr[i2] = subs;
    }

    @Override // defpackage.AbstractC16956e
    public final int startapp(Object obj) {
        return ((C5901e) obj).f12448e.length;
    }
}
