package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٗٔٓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C17007e extends AbstractC4579e {
    public static final C17007e metrica = new AbstractC4579e(C13058e.ad);

    @Override // defpackage.AbstractC4579e
    public final void Signature(InterfaceC11845e interfaceC11845e, Object obj, int i) {
        long[] jArr = (long[]) obj;
        for (int i2 = 0; i2 < i; i2++) {
            ((AbstractC15920e) interfaceC11845e).isPro(this.vip, i2, jArr[i2]);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [eٌٟؗ, java.lang.Object] */
    @Override // defpackage.AbstractC16956e
    public final Object advert(Object obj) {
        long[] jArr = (long[]) obj;
        ?? obj2 = new Object();
        obj2.ad = jArr;
        obj2.vip = jArr.length;
        obj2.vip(10);
        return obj2;
    }

    @Override // defpackage.AbstractC4579e
    public final Object loadAd() {
        return new long[0];
    }

    @Override // defpackage.AbstractC15168e, defpackage.AbstractC16956e
    public final void mopub(InterfaceC2043e interfaceC2043e, int i, Object obj) {
        C8871e c8871e = (C8871e) obj;
        long firebase = interfaceC2043e.firebase(this.vip, i);
        c8871e.vip(c8871e.license() + 1);
        long[] jArr = c8871e.ad;
        int i2 = c8871e.vip;
        c8871e.vip = i2 + 1;
        jArr[i2] = firebase;
    }

    @Override // defpackage.AbstractC16956e
    public final int startapp(Object obj) {
        return ((long[]) obj).length;
    }
}
