package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: e٘ؐؐ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C17452e extends AbstractC4579e {
    public static final C17452e metrica = new AbstractC4579e(C13257e.ad);

    @Override // defpackage.AbstractC4579e
    public final void Signature(InterfaceC11845e interfaceC11845e, Object obj, int i) {
        int[] iArr = (int[]) obj;
        for (int i2 = 0; i2 < i; i2++) {
            ((AbstractC15920e) interfaceC11845e).inmobi(i2, iArr[i2], this.vip);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [eًٍۖ, java.lang.Object] */
    @Override // defpackage.AbstractC16956e
    public final Object advert(Object obj) {
        int[] iArr = (int[]) obj;
        ?? obj2 = new Object();
        obj2.ad = iArr;
        obj2.vip = iArr.length;
        obj2.vip(10);
        return obj2;
    }

    @Override // defpackage.AbstractC4579e
    public final Object loadAd() {
        return new int[0];
    }

    @Override // defpackage.AbstractC15168e, defpackage.AbstractC16956e
    public final void mopub(InterfaceC2043e interfaceC2043e, int i, Object obj) {
        C7837e c7837e = (C7837e) obj;
        int remoteconfig = interfaceC2043e.remoteconfig(this.vip, i);
        c7837e.vip(c7837e.license() + 1);
        int[] iArr = c7837e.ad;
        int i2 = c7837e.vip;
        c7837e.vip = i2 + 1;
        iArr[i2] = remoteconfig;
    }

    @Override // defpackage.AbstractC16956e
    public final int startapp(Object obj) {
        return ((int[]) obj).length;
    }
}
