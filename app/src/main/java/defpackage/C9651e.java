package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍٟۘ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9651e implements InterfaceC5823e {
    public final AbstractC16904e ad;

    public C9651e(AbstractC16904e abstractC16904e) {
        this.ad = abstractC16904e;
    }

    @Override // defpackage.InterfaceC5823e
    public final int ad() {
        return this.ad.advert();
    }

    @Override // defpackage.InterfaceC5823e
    public final int appmetrica() {
        return Math.max(0, this.ad.appmetrica);
    }

    @Override // defpackage.InterfaceC5823e
    public final boolean license() {
        return !this.ad.mopub().ad.isEmpty();
    }

    @Override // defpackage.InterfaceC5823e
    public final int metrica() {
        int i;
        AbstractC16904e abstractC16904e = this.ad;
        if (abstractC16904e.mopub().ad.size() == 0) {
            return 0;
        }
        int metrica = AbstractC10653e.metrica(abstractC16904e.mopub());
        int i2 = abstractC16904e.mopub().vip + abstractC16904e.mopub().metrica;
        if (i2 != 0 && (i = metrica / i2) >= 1) {
            return i;
        }
        return 1;
    }

    @Override // defpackage.InterfaceC5823e
    public final int vip() {
        return Math.min(r0.advert() - 1, ((C8518e) AbstractC13480e.m3570break(this.ad.mopub().ad)).ad);
    }
}
