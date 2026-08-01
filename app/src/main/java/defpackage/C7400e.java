package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؚْۘ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C7400e extends AbstractC4579e {
    public static final C7400e metrica = new AbstractC4579e(C16164e.ad);

    @Override // defpackage.AbstractC4579e
    public final void Signature(InterfaceC11845e interfaceC11845e, Object obj, int i) {
        byte[] bArr = (byte[]) obj;
        for (int i2 = 0; i2 < i; i2++) {
            byte b = bArr[i2];
            AbstractC15920e abstractC15920e = (AbstractC15920e) interfaceC11845e;
            abstractC15920e.tapsense(this.vip, i2);
            abstractC15920e.yandex(b);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [eَؗٔ, java.lang.Object] */
    @Override // defpackage.AbstractC16956e
    public final Object advert(Object obj) {
        byte[] bArr = (byte[]) obj;
        ?? obj2 = new Object();
        obj2.ad = bArr;
        obj2.vip = bArr.length;
        obj2.vip(10);
        return obj2;
    }

    @Override // defpackage.AbstractC4579e
    public final Object loadAd() {
        return new byte[0];
    }

    @Override // defpackage.AbstractC15168e, defpackage.AbstractC16956e
    public final void mopub(InterfaceC2043e interfaceC2043e, int i, Object obj) {
        C10074e c10074e = (C10074e) obj;
        byte advert = interfaceC2043e.advert(this.vip, i);
        c10074e.vip(c10074e.license() + 1);
        byte[] bArr = c10074e.ad;
        int i2 = c10074e.vip;
        c10074e.vip = i2 + 1;
        bArr[i2] = advert;
    }

    @Override // defpackage.AbstractC16956e
    public final int startapp(Object obj) {
        return ((byte[]) obj).length;
    }
}
