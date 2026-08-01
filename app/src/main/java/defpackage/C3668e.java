package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؕ۟ۦ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3668e extends AbstractC4579e {
    public static final C3668e metrica = new AbstractC4579e(C6266e.ad);

    @Override // defpackage.AbstractC4579e
    public final void Signature(InterfaceC11845e interfaceC11845e, Object obj, int i) {
        boolean[] zArr = (boolean[]) obj;
        for (int i2 = 0; i2 < i; i2++) {
            ((AbstractC15920e) interfaceC11845e).signatures(this.vip, i2, zArr[i2]);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [eًؙُ, java.lang.Object] */
    @Override // defpackage.AbstractC16956e
    public final Object advert(Object obj) {
        boolean[] zArr = (boolean[]) obj;
        ?? obj2 = new Object();
        obj2.ad = zArr;
        obj2.vip = zArr.length;
        obj2.vip(10);
        return obj2;
    }

    @Override // defpackage.AbstractC4579e
    public final Object loadAd() {
        return new boolean[0];
    }

    @Override // defpackage.AbstractC15168e, defpackage.AbstractC16956e
    public final void mopub(InterfaceC2043e interfaceC2043e, int i, Object obj) {
        C6320e c6320e = (C6320e) obj;
        boolean applovin = interfaceC2043e.applovin(this.vip, i);
        c6320e.vip(c6320e.license() + 1);
        boolean[] zArr = c6320e.ad;
        int i2 = c6320e.vip;
        c6320e.vip = i2 + 1;
        zArr[i2] = applovin;
    }

    @Override // defpackage.AbstractC16956e
    public final int startapp(Object obj) {
        return ((boolean[]) obj).length;
    }
}
