package defpackage;

import kotlin.Unit;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَۥً, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10646e implements InterfaceC5495e {
    public final /* synthetic */ AbstractC16904e ad;
    public final /* synthetic */ boolean vip;

    public C10646e(AbstractC16904e abstractC16904e, boolean z) {
        this.ad = abstractC16904e;
        this.vip = z;
    }

    @Override // defpackage.InterfaceC5495e
    public final int ad() {
        AbstractC16904e abstractC16904e = this.ad;
        return (int) (abstractC16904e.mopub().appmetrica == EnumC17426e.f34146e ? abstractC16904e.mopub().purchase() & 4294967295L : abstractC16904e.mopub().purchase() >> 32);
    }

    @Override // defpackage.InterfaceC5495e
    public final float appmetrica() {
        AbstractC16904e abstractC16904e = this.ad;
        return (float) AbstractC1742e.ad(abstractC16904e.mopub(), abstractC16904e.advert());
    }

    @Override // defpackage.InterfaceC5495e
    public final int license() {
        AbstractC16904e abstractC16904e = this.ad;
        return (-abstractC16904e.mopub().purchase) + abstractC16904e.mopub().license;
    }

    @Override // defpackage.InterfaceC5495e
    public final Object metrica(int i, C11143e c11143e) {
        AbstractC16904e abstractC16904e = this.ad;
        abstractC16904e.getClass();
        Object vip = abstractC16904e.vip(EnumC6955e.f14256e, new C16813e(abstractC16904e, i, null, 0), c11143e);
        EnumC2821e enumC2821e = EnumC2821e.f6782e;
        if (vip != enumC2821e) {
            vip = Unit.INSTANCE;
        }
        return vip == enumC2821e ? vip : Unit.INSTANCE;
    }

    @Override // defpackage.InterfaceC5495e
    public final C6517e purchase() {
        boolean z = this.vip;
        AbstractC16904e abstractC16904e = this.ad;
        return z ? new C6517e(abstractC16904e.advert(), 1) : new C6517e(1, abstractC16904e.advert());
    }

    @Override // defpackage.InterfaceC5495e
    public final float vip() {
        return (float) AbstractC15203e.billing(this.ad);
    }
}
