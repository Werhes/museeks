package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَؚٝ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10127e extends AbstractC13616e implements InterfaceC8501e, InterfaceC0479e, InterfaceC17453e {

    /* renamed from: eؙؕ, reason: contains not printable characters */
    public AbstractC14073e f20024e;

    /* renamed from: eٍؗٚ, reason: contains not printable characters */
    public InterfaceC16154e f20025e;

    /* renamed from: eؙِۛ, reason: contains not printable characters */
    public float f20026e;

    /* renamed from: eؚٕؒ, reason: contains not printable characters */
    public long f20027e;

    /* renamed from: eًؕۙ, reason: contains not printable characters */
    public AbstractC4457e f20028e;

    /* renamed from: eَٕٞ, reason: contains not printable characters */
    public InterfaceC16154e f20029e;

    /* renamed from: eٍُٝ, reason: contains not printable characters */
    public long f20030e;

    /* renamed from: eّٜۦ, reason: contains not printable characters */
    public AbstractC14073e f20031e;

    /* renamed from: eٗۥۚ, reason: contains not printable characters */
    public EnumC7792e f20032e;

    @Override // defpackage.InterfaceC17453e
    public final void adcel(InterfaceC15671e interfaceC15671e) {
        AbstractC14594e.amazon(interfaceC15671e, this.f20025e);
    }

    @Override // defpackage.InterfaceC17453e
    /* renamed from: break */
    public final /* synthetic */ boolean mo358break() {
        return false;
    }

    @Override // defpackage.InterfaceC8501e
    /* renamed from: case */
    public final /* synthetic */ void mo292case() {
    }

    @Override // defpackage.InterfaceC17453e
    /* renamed from: eؒۖۗ */
    public final /* synthetic */ boolean mo359e() {
        return false;
    }

    @Override // defpackage.InterfaceC8501e
    /* renamed from: eُؚٕ */
    public final void mo294e(C4017e c4017e) {
        AbstractC14073e abstractC14073e;
        if (this.f20025e == AbstractC10432e.ad) {
            if (!C3618e.metrica(this.f20027e, C3618e.adcel)) {
                AbstractC4653e.subscription(c4017e, this.f20027e, 0L, 0L, 0.0f, null, null, 0, 126);
            }
            AbstractC4457e abstractC4457e = this.f20028e;
            if (abstractC4457e != null) {
                AbstractC4653e.admob(c4017e, abstractC4457e, 0L, 0L, this.f20026e, null, null, 0, 118);
            }
        } else {
            C14434e c14434e = c4017e.f8940e;
            if (C2108e.vip(c14434e.f28537e.m4560try(), this.f20030e) && c4017e.getLayoutDirection() == this.f20032e && AbstractC7890e.billing(this.f20029e, this.f20025e)) {
                abstractC14073e = this.f20024e;
            } else {
                AbstractC16425e.purchase(this, new Celse(this, c4017e, 16));
                abstractC14073e = this.f20031e;
                this.f20031e = null;
            }
            this.f20024e = abstractC14073e;
            this.f20030e = c14434e.f28537e.m4560try();
            this.f20032e = c4017e.getLayoutDirection();
            this.f20029e = this.f20025e;
            if (!C3618e.metrica(this.f20027e, C3618e.adcel)) {
                AbstractC18268e.appmetrica(c4017e, abstractC14073e, this.f20027e);
            }
            AbstractC14073e abstractC14073e2 = abstractC14073e;
            AbstractC4457e abstractC4457e2 = this.f20028e;
            if (abstractC4457e2 != null) {
                AbstractC18268e.license(c4017e, abstractC14073e2, abstractC4457e2, this.f20026e, null, 56);
            }
        }
        c4017e.ad();
    }

    @Override // defpackage.InterfaceC0479e
    /* renamed from: for */
    public final void mo343for() {
        this.f20030e = 9205357640488583168L;
        this.f20032e = null;
        this.f20024e = null;
        this.f20029e = null;
        AbstractC12640e.advert(this);
    }

    @Override // defpackage.InterfaceC17453e
    public final boolean smaato() {
        return false;
    }
}
