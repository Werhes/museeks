package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؖٗؐ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4149e extends AbstractC4579e {
    public static final C4149e metrica = new AbstractC4579e(C4437e.ad);

    @Override // defpackage.AbstractC4579e
    public final void Signature(InterfaceC11845e interfaceC11845e, Object obj, int i) {
        byte[] bArr = ((C0282e) obj).f2284e;
        for (int i2 = 0; i2 < i; i2++) {
            ((AbstractC15920e) interfaceC11845e).isVip(this.vip, i2).yandex(bArr[i2]);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, eًٞؐ] */
    @Override // defpackage.AbstractC16956e
    public final Object advert(Object obj) {
        byte[] bArr = ((C0282e) obj).f2284e;
        ?? obj2 = new Object();
        obj2.ad = bArr;
        obj2.vip = bArr.length;
        obj2.vip(10);
        return obj2;
    }

    @Override // defpackage.AbstractC4579e
    public final Object loadAd() {
        return new C0282e(new byte[0]);
    }

    @Override // defpackage.AbstractC15168e, defpackage.AbstractC16956e
    public final void mopub(InterfaceC2043e interfaceC2043e, int i, Object obj) {
        C8089e c8089e = (C8089e) obj;
        byte ads = interfaceC2043e.license(this.vip, i).ads();
        c8089e.vip(c8089e.license() + 1);
        byte[] bArr = c8089e.ad;
        int i2 = c8089e.vip;
        c8089e.vip = i2 + 1;
        bArr[i2] = ads;
    }

    @Override // defpackage.AbstractC16956e
    public final int startapp(Object obj) {
        return ((C0282e) obj).f2284e.length;
    }
}
