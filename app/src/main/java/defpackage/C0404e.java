package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؑٚۢ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0404e extends AbstractC13616e implements InterfaceC8501e, InterfaceC4238e, InterfaceC0479e, InterfaceC1683e, InterfaceC17303e {

    /* renamed from: eٍؗٚ, reason: contains not printable characters */
    public C16446e f2443e;

    /* renamed from: eؙِۛ, reason: contains not printable characters */
    public C16223e f2444e;

    /* renamed from: eؚٕؒ, reason: contains not printable characters */
    public C0763e f2445e;

    /* renamed from: eًؕۙ, reason: contains not printable characters */
    public boolean f2446e;

    /* renamed from: eٍُٝ, reason: contains not printable characters */
    public final C8322e f2447e;

    public C0404e(C16223e c16223e) {
        this.f2444e = c16223e;
        this.f2443e = (C16446e) c16223e.f31874e.getValue();
        C15816e c15816e = AbstractC3691e.ad;
        C8322e c8322e = new C8322e(c15816e);
        c8322e.yandex(c15816e, c16223e);
        this.f2447e = c8322e;
    }

    @Override // defpackage.InterfaceC17303e
    public final /* synthetic */ int ad(AbstractC9292e abstractC9292e, InterfaceC16719e interfaceC16719e, int i) {
        return AbstractC0869e.appmetrica(this, abstractC9292e, interfaceC16719e, i);
    }

    @Override // defpackage.InterfaceC17303e
    public final /* synthetic */ int billing(AbstractC9292e abstractC9292e, InterfaceC16719e interfaceC16719e, int i) {
        return AbstractC0869e.billing(this, abstractC9292e, interfaceC16719e, i);
    }

    @Override // defpackage.InterfaceC8501e
    /* renamed from: case */
    public final /* synthetic */ void mo292case() {
    }

    @Override // defpackage.AbstractC13616e
    /* renamed from: eَؑۨ, reason: contains not printable characters */
    public final void mo338e() {
        this.f2445e = null;
        C16446e c16446e = this.f2443e;
        if (c16446e != null) {
            AbstractC5851e.startapp(this).ad(c16446e);
        }
        m340e(AbstractC5851e.startapp(this).metrica());
    }

    /* renamed from: eؒٚۨ, reason: contains not printable characters */
    public final InterfaceC0043e m339e() {
        InterfaceC0043e interfaceC0043e = this.f2444e.appmetrica().vip.f26999e;
        if (interfaceC0043e != null) {
            return interfaceC0043e;
        }
        throw new IllegalArgumentException("Error: Uninitialized LayoutCoordinates. Please make sure when using the SharedTransitionScope composable function, the modifier passed to the child content is being used, or use SharedTransitionLayout instead.");
    }

    @Override // defpackage.InterfaceC8501e
    /* renamed from: eُؚٕ */
    public final void mo294e(C4017e c4017e) {
        C7589e appmetrica = this.f2444e.appmetrica();
        C0763e metrica = appmetrica.metrica.pro().metrica();
        C16223e c16223e = this.f2444e;
        C17985e c17985e = null;
        if (c16223e.billing() && metrica != null) {
            C14613e c14613e = (C14613e) this.f2444e.f31879e.getValue();
            C9185e c9185e = (C9185e) this.f2444e.f31882e.getValue();
            c4017e.getLayoutDirection();
            InterfaceC14388e interfaceC14388e = AbstractC5851e.mopub(this).f27604e;
            c14613e.getClass();
            C16223e c16223e2 = (C16223e) c9185e.metrica.getValue();
            if (c16223e2 == null) {
                throw new IllegalArgumentException("Error: SharedContentState has not been added to a sharedElement/sharedBoundsmodifier yet. Therefore the internal state has not been initialized.");
            }
            C16223e c16223e3 = c16223e2.f31880e;
            C9185e c9185e2 = c16223e3 != null ? (C9185e) c16223e3.f31882e.getValue() : null;
            if (c9185e2 != null) {
                C16223e c16223e4 = (C16223e) c9185e2.metrica.getValue();
                if (c16223e4 == null) {
                    throw new IllegalArgumentException("Error: SharedContentState has not been added to a sharedElement/sharedBoundsmodifier yet. Therefore the internal state has not been initialized.");
                }
                c17985e = c16223e4.f31877e;
            }
        }
        c16223e.f31877e = c17985e;
        C16446e c16446e = (C16446e) this.f2444e.f31874e.getValue();
        if (c16446e == null) {
            throw new IllegalArgumentException(("Error: Layer is null when accessed for shared bounds/element : " + appmetrica.ad + ",target: " + this.f2444e.license().vip() + ", is attached: " + this.f27016e).toString());
        }
        c4017e.remoteconfig(AbstractC8116e.yandex(c4017e.yandex()), c16446e, new C10570e(c4017e, metrica, appmetrica));
        C16223e c16223e5 = this.f2444e;
        if (!c16223e5.appmetrica().metrica.pro().license() || (!c16223e5.billing() && c16223e5.purchase())) {
            C17138e.metrica(c4017e, c16446e);
        }
    }

    /* renamed from: eّّۚ, reason: contains not printable characters */
    public final void m340e(C16446e c16446e) {
        if (c16446e == null) {
            C16446e c16446e2 = this.f2443e;
            if (c16446e2 != null) {
                AbstractC5851e.startapp(this).ad(c16446e2);
            }
        } else {
            this.f2444e.f31874e.setValue(c16446e);
        }
        this.f2443e = c16446e;
    }

    @Override // defpackage.AbstractC13616e
    /* renamed from: eّْٝ */
    public final void mo228e() {
        InterfaceC0043e interfaceC0043e = this.f2444e.appmetrica().vip.f26999e;
        if (interfaceC0043e != null) {
            this.f2445e = (interfaceC0043e.billing() && this.f2446e) ? AbstractC18489e.billing(C2152e.yandex(AbstractC5851e.adcel(this).mo211this(0L), interfaceC0043e.mo211this(0L)), AbstractC8116e.startapp(AbstractC5851e.adcel(this).f6803e)) : null;
        }
        m340e(null);
        C16223e c16223e = this.f2444e;
        c16223e.f31880e = null;
        c16223e.f31875e = null;
        c16223e.f31883e.setValue(Boolean.FALSE);
        this.f2446e = false;
    }

    /* renamed from: eٌٔٗ, reason: contains not printable characters */
    public final InterfaceC17242e m341e(InterfaceC11289e interfaceC11289e, InterfaceC16719e interfaceC16719e, long j) {
        long j2;
        C0763e metrica = this.f2444e.license().metrica();
        if (metrica == null) {
            C11224e c11224e = this.f2444e.appmetrica().metrica;
            c11224e.tapsense();
            metrica = c11224e.pro().purchase((C7589e) c11224e.license);
        }
        if (metrica != null) {
            long purchase = AbstractC8116e.purchase(metrica.billing());
            int i = (int) (purchase >> 32);
            int i2 = (int) (purchase & 4294967295L);
            if (i == Integer.MAX_VALUE || i2 == Integer.MAX_VALUE) {
                throw new IllegalArgumentException(("Error: Infinite width/height is invalid. animated bounds: " + this.f2444e.license().metrica() + ", current bounds: " + this.f2444e.appmetrica().metrica.pro().metrica()).toString());
            }
            if (i < 0) {
                i = 0;
            }
            if (i2 < 0) {
                i2 = 0;
            }
            if (!((i2 >= 0) & (i >= 0))) {
                AbstractC15805e.ad("width and height must be >= 0");
            }
            j = AbstractC2278e.yandex(i, i, i2, i2);
        }
        AbstractC2832e admob = interfaceC16719e.admob(j);
        if (this.f2444e.appmetrica().metrica.pro().license()) {
            InterfaceC11288e interfaceC11288e = (InterfaceC11288e) this.f2444e.f31885e.getValue();
            j2 = this.f2444e.appmetrica().vip.f27004e.ad(AbstractC5851e.adcel(this)).advert();
            interfaceC11288e.ad(j2, (admob.f6806e << 32) | (admob.f6804e & 4294967295L));
        } else {
            j2 = (admob.f6806e << 32) | (admob.f6804e & 4294967295L);
        }
        return interfaceC11289e.ads((int) (j2 >> 32), (int) (4294967295L & j2), C9139e.f18290e, new C1546e(this, admob));
    }

    /* renamed from: eٖٔۧ, reason: contains not printable characters */
    public final void m342e() {
        C15816e c15816e = AbstractC3691e.ad;
        C16223e c16223e = this.f2444e;
        C5454e c5454e = C5454e.metrica;
        C8322e c8322e = this.f2447e;
        if (c8322e == c5454e) {
            AbstractC14070e.ad("In order to provide locals you must override providedValues: ModifierLocalMap");
        }
        if (!c8322e.ad(c15816e)) {
            AbstractC14070e.ad("Any provided key must be initially provided in the overridden providedValues: ModifierLocalMap property. Key " + c15816e + " was not found.");
        }
        c8322e.yandex(c15816e, c16223e);
        this.f2444e.f31880e = (C16223e) AbstractC5087e.license(this, c15816e);
        m340e(AbstractC5851e.startapp(this).metrica());
        this.f2446e = false;
        this.f2444e.f31875e = this;
    }

    @Override // defpackage.AbstractC13616e
    /* renamed from: e٘ٔ٘ */
    public final void mo229e() {
        AbstractC16425e.purchase(this, this.f2444e.appmetrica().startapp);
        m342e();
        this.f2444e.f31883e.setValue(Boolean.TRUE);
    }

    @Override // defpackage.InterfaceC0479e
    /* renamed from: for, reason: not valid java name */
    public final void mo343for() {
        this.f2444e.appmetrica().appmetrica();
        AbstractC16425e.purchase(this, this.f2444e.appmetrica().startapp);
    }

    @Override // defpackage.InterfaceC17303e
    public final InterfaceC17242e license(InterfaceC13158e interfaceC13158e, InterfaceC16719e interfaceC16719e, long j) {
        AbstractC2832e admob = interfaceC16719e.admob(j);
        return interfaceC13158e.ads(admob.f6806e, admob.f6804e, C9139e.f18290e, new C1546e(admob, this));
    }

    @Override // defpackage.InterfaceC4238e
    /* renamed from: private, reason: not valid java name */
    public final AbstractC16982e mo344private() {
        return this.f2447e;
    }

    @Override // defpackage.InterfaceC17303e
    public final /* synthetic */ int purchase(AbstractC9292e abstractC9292e, InterfaceC16719e interfaceC16719e, int i) {
        return AbstractC0869e.metrica(this, abstractC9292e, interfaceC16719e, i);
    }

    @Override // defpackage.InterfaceC4238e
    /* renamed from: return, reason: not valid java name */
    public final /* synthetic */ Object mo345return(C15816e c15816e) {
        return AbstractC5087e.license(this, c15816e);
    }

    @Override // defpackage.InterfaceC17303e
    public final /* synthetic */ int startapp(AbstractC9292e abstractC9292e, InterfaceC16719e interfaceC16719e, int i) {
        return AbstractC0869e.startapp(this, abstractC9292e, interfaceC16719e, i);
    }
}
