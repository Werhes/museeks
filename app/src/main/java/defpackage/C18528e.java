package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eۨؔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C18528e extends AbstractC4579e {
    public static final C18528e metrica = new AbstractC4579e(C11703e.ad);

    @Override // defpackage.AbstractC4579e
    public final void Signature(InterfaceC11845e interfaceC11845e, Object obj, int i) {
        int[] iArr = ((C16770e) obj).f32858e;
        for (int i2 = 0; i2 < i; i2++) {
            ((AbstractC15920e) interfaceC11845e).isVip(this.vip, i2).loadAd(iArr[i2]);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [eّٜؖ, java.lang.Object] */
    @Override // defpackage.AbstractC16956e
    public final Object advert(Object obj) {
        int[] iArr = ((C16770e) obj).f32858e;
        ?? obj2 = new Object();
        obj2.ad = iArr;
        obj2.vip = iArr.length;
        obj2.vip(10);
        return obj2;
    }

    @Override // defpackage.AbstractC4579e
    public final Object loadAd() {
        return new C16770e(new int[0]);
    }

    @Override // defpackage.AbstractC15168e, defpackage.AbstractC16956e
    public final void mopub(InterfaceC2043e interfaceC2043e, int i, Object obj) {
        C4064e c4064e = (C4064e) obj;
        int amazon = interfaceC2043e.license(this.vip, i).amazon();
        c4064e.vip(c4064e.license() + 1);
        int[] iArr = c4064e.ad;
        int i2 = c4064e.vip;
        c4064e.vip = i2 + 1;
        iArr[i2] = amazon;
    }

    @Override // defpackage.AbstractC16956e
    public final int startapp(Object obj) {
        return ((C16770e) obj).f32858e.length;
    }
}
