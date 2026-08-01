package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَٕٝ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10404e extends C5759e {
    public final C14093e appmetrica;
    public final float[] billing;
    public final C14093e purchase;

    public C10404e(C14093e c14093e, C14093e c14093e2) {
        super(c14093e2, c14093e, c14093e2, null);
        float[] billing;
        this.appmetrica = c14093e;
        this.purchase = c14093e2;
        float[] fArr = C9444e.metrica.vip;
        C4574e c4574e = c14093e.license;
        float[] fArr2 = c14093e.startapp;
        C4574e c4574e2 = c14093e2.license;
        float[] fArr3 = c14093e2.adcel;
        if (AbstractC16852e.license(c4574e, c4574e2)) {
            billing = AbstractC16852e.billing(fArr3, fArr2);
        } else {
            float[] ad = c4574e.ad();
            float[] ad2 = c4574e2.ad();
            C4574e c4574e3 = AbstractC15365e.vip;
            billing = AbstractC16852e.billing(AbstractC16852e.license(c4574e2, c4574e3) ? fArr3 : AbstractC16852e.purchase(AbstractC16852e.billing(AbstractC16852e.metrica(fArr, ad2, new float[]{0.964212f, 1.0f, 0.825188f}), c14093e2.startapp)), AbstractC16852e.license(c4574e, c4574e3) ? fArr2 : AbstractC16852e.billing(AbstractC16852e.metrica(fArr, ad, new float[]{0.964212f, 1.0f, 0.825188f}), fArr2));
        }
        this.billing = billing;
    }

    @Override // defpackage.C5759e
    public final long ad(long j) {
        float yandex = C3618e.yandex(j);
        float billing = C3618e.billing(j);
        float appmetrica = C3618e.appmetrica(j);
        float license = C3618e.license(j);
        C14910e c14910e = this.appmetrica.Signature;
        float mopub = (float) c14910e.mopub(yandex);
        float mopub2 = (float) c14910e.mopub(billing);
        float mopub3 = (float) c14910e.mopub(appmetrica);
        float[] fArr = this.billing;
        float f = (fArr[6] * mopub3) + (fArr[3] * mopub2) + (fArr[0] * mopub);
        float f2 = (fArr[7] * mopub3) + (fArr[4] * mopub2) + (fArr[1] * mopub);
        float f3 = (fArr[8] * mopub3) + (fArr[5] * mopub2) + (fArr[2] * mopub);
        C14093e c14093e = this.purchase;
        float mopub4 = (float) c14093e.smaato.mopub(f);
        C14910e c14910e2 = c14093e.smaato;
        return AbstractC6532e.ad(mopub4, (float) c14910e2.mopub(f2), (float) c14910e2.mopub(f3), license, c14093e);
    }
}
