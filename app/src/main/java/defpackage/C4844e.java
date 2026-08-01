package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eّؗۜ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4844e extends AbstractC4579e {
    public static final C4844e metrica = new AbstractC4579e(C13852e.ad);

    @Override // defpackage.AbstractC4579e
    public final void Signature(InterfaceC11845e interfaceC11845e, Object obj, int i) {
        float[] fArr = (float[]) obj;
        for (int i2 = 0; i2 < i; i2++) {
            float f = fArr[i2];
            AbstractC15920e abstractC15920e = (AbstractC15920e) interfaceC11845e;
            abstractC15920e.tapsense(this.vip, i2);
            abstractC15920e.mopub(f);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [eؙٟؗ, java.lang.Object] */
    @Override // defpackage.AbstractC16956e
    public final Object advert(Object obj) {
        float[] fArr = (float[]) obj;
        ?? obj2 = new Object();
        obj2.ad = fArr;
        obj2.vip = fArr.length;
        obj2.vip(10);
        return obj2;
    }

    @Override // defpackage.AbstractC4579e
    public final Object loadAd() {
        return new float[0];
    }

    @Override // defpackage.AbstractC15168e, defpackage.AbstractC16956e
    public final void mopub(InterfaceC2043e interfaceC2043e, int i, Object obj) {
        C5067e c5067e = (C5067e) obj;
        float adcel = interfaceC2043e.adcel(this.vip, i);
        c5067e.vip(c5067e.license() + 1);
        float[] fArr = c5067e.ad;
        int i2 = c5067e.vip;
        c5067e.vip = i2 + 1;
        fArr[i2] = adcel;
    }

    @Override // defpackage.AbstractC16956e
    public final int startapp(Object obj) {
        return ((float[]) obj).length;
    }
}
