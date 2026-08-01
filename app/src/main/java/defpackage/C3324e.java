package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eّؕٝ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3324e extends AbstractC13616e implements InterfaceC1683e, InterfaceC17303e, InterfaceC0479e {

    /* renamed from: eؙؕ, reason: contains not printable characters */
    public C1839e f7497e;

    /* renamed from: eٍؗٚ, reason: contains not printable characters */
    public boolean f7498e;

    /* renamed from: eؙِۛ, reason: contains not printable characters */
    public int f7499e;

    /* renamed from: eؚٕؒ, reason: contains not printable characters */
    public C1839e f7500e;

    /* renamed from: eًؕۙ, reason: contains not printable characters */
    public int f7501e;

    /* renamed from: eَٕٞ, reason: contains not printable characters */
    public InterfaceC1966e f7502e;

    /* renamed from: eٍُٝ, reason: contains not printable characters */
    public int f7503e;

    /* renamed from: eٗۥۚ, reason: contains not printable characters */
    public int f7504e;

    @Override // defpackage.InterfaceC17303e
    public final /* synthetic */ int ad(AbstractC9292e abstractC9292e, InterfaceC16719e interfaceC16719e, int i) {
        return AbstractC0869e.appmetrica(this, abstractC9292e, interfaceC16719e, i);
    }

    @Override // defpackage.InterfaceC17303e
    public final /* synthetic */ int billing(AbstractC9292e abstractC9292e, InterfaceC16719e interfaceC16719e, int i) {
        return AbstractC0869e.billing(this, abstractC9292e, interfaceC16719e, i);
    }

    @Override // defpackage.AbstractC13616e
    /* renamed from: eؚؚؓ */
    public final boolean mo293e() {
        return false;
    }

    @Override // defpackage.AbstractC13616e
    /* renamed from: eُۘٙ */
    public final void mo713e() {
        this.f7498e = true;
        AbstractC1599e.purchase(this);
    }

    @Override // defpackage.AbstractC13616e
    /* renamed from: eّْٝ */
    public final void mo228e() {
        this.f7497e = null;
        this.f7502e = null;
        this.f7498e = false;
    }

    /* renamed from: eٌٔٗ, reason: contains not printable characters */
    public final C1839e m1338e() {
        C1839e c1839e = this.f7497e;
        if (c1839e != null) {
            return c1839e;
        }
        throw AbstractC5087e.m1749interface("Resolved style is not set.");
    }

    @Override // defpackage.AbstractC13616e
    /* renamed from: eؘٖؗ, reason: contains not printable characters */
    public final void mo1339e() {
        this.f7497e = AbstractC15890e.license(this.f7500e, AbstractC5851e.mopub(this).f27610e);
        this.f7498e = true;
        AbstractC1599e.purchase(this);
    }

    @Override // defpackage.AbstractC13616e
    /* renamed from: e٘ٔ٘ */
    public final void mo229e() {
        InterfaceC2141e interfaceC2141e = (InterfaceC2141e) AbstractC10432e.vip(this, AbstractC11473e.mopub);
        this.f7497e = AbstractC15890e.license(this.f7500e, AbstractC5851e.mopub(this).f27610e);
        AbstractC16845e abstractC16845e = m1338e().ad.purchase;
        C1812e c1812e = m1338e().ad.metrica;
        if (c1812e == null) {
            c1812e = C1812e.f4893e;
        }
        C6277e c6277e = m1338e().ad.license;
        int i = c6277e != null ? c6277e.ad : 0;
        C5208e c5208e = m1338e().ad.appmetrica;
        this.f7502e = ((C1773e) interfaceC2141e).vip(abstractC16845e, c1812e, i, c5208e != null ? c5208e.ad : 65535);
        AbstractC16425e.purchase(this, new C13930e(this, 0));
        this.f7498e = true;
    }

    @Override // defpackage.InterfaceC0479e
    /* renamed from: for */
    public final void mo343for() {
        if (this.f7502e != null) {
            AbstractC16425e.purchase(this, new C13930e(this, 1));
        }
        this.f7498e = true;
        AbstractC1599e.purchase(this);
    }

    @Override // defpackage.InterfaceC17303e
    public final InterfaceC17242e license(InterfaceC13158e interfaceC13158e, InterfaceC16719e interfaceC16719e, long j) {
        if (this.f7498e) {
            C1839e m1338e = m1338e();
            InterfaceC2141e interfaceC2141e = (InterfaceC2141e) AbstractC10432e.vip(this, AbstractC11473e.mopub);
            String str = AbstractC15605e.ad;
            int ad = (int) (AbstractC15605e.ad(m1338e, interfaceC13158e, interfaceC2141e, str, 1) & 4294967295L);
            int ad2 = ((int) (AbstractC15605e.ad(m1338e, interfaceC13158e, interfaceC2141e, AbstractC0869e.tapsense('\n', str, str), 2) & 4294967295L)) - ad;
            int i = this.f7501e;
            this.f7503e = i == 1 ? -1 : ((i - 1) * ad2) + ad;
            int i2 = this.f7499e;
            this.f7504e = i2 == Integer.MAX_VALUE ? -1 : ((i2 - 1) * ad2) + ad;
            this.f7498e = false;
        }
        int i3 = this.f7503e;
        int metrica = i3 != -1 ? AbstractC3062e.metrica(i3, C5602e.startapp(j), C5602e.billing(j)) : C5602e.startapp(j);
        int i4 = this.f7504e;
        AbstractC2832e admob = interfaceC16719e.admob(C5602e.ad(0, 0, metrica, i4 != -1 ? AbstractC3062e.metrica(i4, C5602e.startapp(j), C5602e.billing(j)) : C5602e.billing(j), 3, j));
        return interfaceC13158e.ads(admob.f6806e, admob.f6804e, C9139e.f18290e, new C4889e(admob, 6));
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
