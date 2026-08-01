package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَٟؕ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10429e extends AbstractC4134e {

    /* renamed from: eؙؕ, reason: contains not printable characters */
    public final /* synthetic */ C9157e f20606e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10429e(C9157e c9157e) {
        super(c9157e);
        this.f20606e = c9157e;
    }

    @Override // defpackage.InterfaceC16719e
    public final AbstractC2832e admob(long j) {
        m1210strictfp(j);
        C5602e c5602e = new C5602e(j);
        C9157e c9157e = this.f20606e;
        c9157e.f18321e = c5602e;
        AbstractC4134e.m1460e(this, c9157e.f18322e.license(this, c9157e.f34777e.mo2526e(), j));
        return this;
    }

    @Override // defpackage.InterfaceC16719e
    public final int loadAd(int i) {
        C9157e c9157e = this.f20606e;
        return c9157e.f18322e.ad(this, c9157e.f34777e.mo2526e(), i);
    }

    @Override // defpackage.InterfaceC16719e
    public final int metrica(int i) {
        C9157e c9157e = this.f20606e;
        return c9157e.f18322e.purchase(this, c9157e.f34777e.mo2526e(), i);
    }

    @Override // defpackage.InterfaceC16719e
    public final int smaato(int i) {
        C9157e c9157e = this.f20606e;
        return c9157e.f18322e.startapp(this, c9157e.f34777e.mo2526e(), i);
    }

    @Override // defpackage.AbstractC9292e
    /* renamed from: static */
    public final int mo2528static(AbstractC17016e abstractC17016e) {
        int ad = AbstractC5546e.ad(this, abstractC17016e);
        this.f9112e.billing(ad, abstractC17016e);
        return ad;
    }

    @Override // defpackage.InterfaceC16719e
    /* renamed from: while */
    public final int mo2529while(int i) {
        C9157e c9157e = this.f20606e;
        return c9157e.f18322e.billing(this, c9157e.f34777e.mo2526e(), i);
    }
}
