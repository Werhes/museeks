package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eْٔؐ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C14426e extends AbstractC13616e implements InterfaceC17303e {

    /* renamed from: eؙؕ, reason: contains not printable characters */
    public float f28520e;

    /* renamed from: eٍؗٚ, reason: contains not printable characters */
    public boolean f28521e;

    /* renamed from: eؙِۛ, reason: contains not printable characters */
    public InterfaceC6512e f28522e;

    /* renamed from: eؚٕؒ, reason: contains not printable characters */
    public C15274e f28523e;

    /* renamed from: eًؕۙ, reason: contains not printable characters */
    public boolean f28524e;

    /* renamed from: eَٕٞ, reason: contains not printable characters */
    public float f28525e;

    /* renamed from: eٍُٝ, reason: contains not printable characters */
    public C7558e f28526e;

    /* renamed from: eٗۥۚ, reason: contains not printable characters */
    public C7558e f28527e;

    @Override // defpackage.InterfaceC17303e
    public final /* synthetic */ int ad(AbstractC9292e abstractC9292e, InterfaceC16719e interfaceC16719e, int i) {
        return AbstractC0869e.appmetrica(this, abstractC9292e, interfaceC16719e, i);
    }

    @Override // defpackage.InterfaceC17303e
    public final /* synthetic */ int billing(AbstractC9292e abstractC9292e, InterfaceC16719e interfaceC16719e, int i) {
        return AbstractC0869e.billing(this, abstractC9292e, interfaceC16719e, i);
    }

    @Override // defpackage.AbstractC13616e
    /* renamed from: eَؑۨ */
    public final void mo338e() {
        this.f28526e = null;
        this.f28527e = null;
        this.f28525e = Float.NaN;
        this.f28520e = Float.NaN;
    }

    @Override // defpackage.AbstractC13616e
    /* renamed from: eؚؚؓ */
    public final boolean mo293e() {
        return false;
    }

    @Override // defpackage.AbstractC13616e
    /* renamed from: e٘ٔ٘ */
    public final void mo229e() {
        AbstractC5336e.purchase(m3623e(), null, 0, new C17071e(this, null, 1), 3);
    }

    @Override // defpackage.InterfaceC17303e
    public final InterfaceC17242e license(InterfaceC13158e interfaceC13158e, InterfaceC16719e interfaceC16719e, long j) {
        float mo497instanceof = interfaceC13158e.mo497instanceof(this.f28521e ? AbstractC14463e.ad : ((interfaceC16719e.metrica(C5602e.yandex(j)) != 0 && interfaceC16719e.loadAd(C5602e.billing(j)) != 0) || this.f28524e) ? AbstractC8844e.ad : AbstractC8844e.vip);
        C7558e c7558e = this.f28527e;
        int floatValue = (int) (c7558e != null ? ((Number) c7558e.license()).floatValue() : mo497instanceof);
        if (!((floatValue >= 0) & (floatValue >= 0))) {
            AbstractC15805e.ad("width and height must be >= 0");
        }
        AbstractC2832e admob = interfaceC16719e.admob(AbstractC2278e.yandex(floatValue, floatValue, floatValue, floatValue));
        float mo497instanceof2 = interfaceC13158e.mo497instanceof((AbstractC8844e.license - interfaceC13158e.mo498new(mo497instanceof)) / 2.0f);
        float mo497instanceof3 = interfaceC13158e.mo497instanceof((AbstractC8844e.metrica - AbstractC8844e.ad) - AbstractC8844e.appmetrica);
        boolean z = this.f28521e;
        if (z && this.f28524e) {
            mo497instanceof2 = mo497instanceof3 - interfaceC13158e.mo497instanceof(AbstractC14463e.appmetrica);
        } else if (z && !this.f28524e) {
            mo497instanceof2 = interfaceC13158e.mo497instanceof(AbstractC14463e.appmetrica);
        } else if (this.f28524e) {
            mo497instanceof2 = mo497instanceof3;
        }
        C7558e c7558e2 = this.f28527e;
        InterfaceC5083e interfaceC5083e = null;
        Float f = c7558e2 != null ? (Float) c7558e2.appmetrica.getValue() : null;
        if (f == null || f.floatValue() != mo497instanceof) {
            AbstractC5336e.purchase(m3623e(), null, 0, new C13163e(this, mo497instanceof, interfaceC5083e, 0), 3);
        }
        C7558e c7558e3 = this.f28526e;
        Float f2 = c7558e3 != null ? (Float) c7558e3.appmetrica.getValue() : null;
        if (f2 == null || f2.floatValue() != mo497instanceof2) {
            AbstractC5336e.purchase(m3623e(), null, 0, new C13163e(this, mo497instanceof2, interfaceC5083e, 1), 3);
        }
        if (Float.isNaN(this.f28525e) && Float.isNaN(this.f28520e)) {
            this.f28525e = mo497instanceof;
            this.f28520e = mo497instanceof2;
        }
        return interfaceC13158e.ads(floatValue, floatValue, C9139e.f18290e, new C1893e(admob, this, mo497instanceof2, 4));
    }

    @Override // defpackage.InterfaceC17303e
    public final /* synthetic */ int purchase(AbstractC9292e abstractC9292e, InterfaceC16719e interfaceC16719e, int i) {
        return AbstractC0869e.metrica(this, abstractC9292e, interfaceC16719e, i);
    }

    @Override // defpackage.InterfaceC17303e
    public final /* synthetic */ int startapp(AbstractC9292e abstractC9292e, InterfaceC16719e interfaceC16719e, int i) {
        return AbstractC0869e.startapp(this, abstractC9292e, interfaceC16719e, i);
    }
}
