package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؙؒؐ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC6126e extends AbstractC13616e {

    /* renamed from: eؚٕؒ, reason: contains not printable characters */
    public final int f12872e = AbstractC5180e.appmetrica(this);

    /* renamed from: eًؕۙ, reason: contains not printable characters */
    public AbstractC13616e f12873e;

    /* renamed from: eؒٚۨ, reason: contains not printable characters */
    public final void m2042e(InterfaceC5077e interfaceC5077e) {
        AbstractC13616e abstractC13616e = null;
        for (AbstractC13616e abstractC13616e2 = this.f12873e; abstractC13616e2 != null; abstractC13616e2 = abstractC13616e2.f27024e) {
            if (abstractC13616e2 == interfaceC5077e) {
                boolean z = abstractC13616e2.f27016e;
                if (z) {
                    C17866e c17866e = AbstractC5180e.ad;
                    if (!z) {
                        AbstractC14070e.metrica("autoInvalidateRemovedNode called on unattached node");
                    }
                    AbstractC5180e.ad(abstractC13616e2, -1, 2);
                    abstractC13616e2.mo2046e();
                    abstractC13616e2.mo2044e();
                }
                abstractC13616e2.mo2048e(abstractC13616e2);
                abstractC13616e2.f27020e = 0;
                if (abstractC13616e == null) {
                    this.f12873e = abstractC13616e2.f27024e;
                } else {
                    abstractC13616e.f27024e = abstractC13616e2.f27024e;
                }
                abstractC13616e2.f27024e = null;
                abstractC13616e2.f27011e = null;
                int i = this.f27014e;
                int purchase = AbstractC5180e.purchase(this);
                m2047e(purchase, true);
                if (this.f27016e && (i & 2) != 0 && (purchase & 2) == 0) {
                    C14742e c14742e = AbstractC5851e.mopub(this).f27592e;
                    this.f27022e.mo2043e(null);
                    c14742e.smaato();
                    return;
                }
                return;
            }
            abstractC13616e = abstractC13616e2;
        }
        throw new IllegalStateException(("Could not find delegate: " + interfaceC5077e).toString());
    }

    @Override // defpackage.AbstractC13616e
    /* renamed from: eٍؖۙ, reason: contains not printable characters */
    public final void mo2043e(AbstractC17732e abstractC17732e) {
        this.f27018e = abstractC17732e;
        for (AbstractC13616e abstractC13616e = this.f12873e; abstractC13616e != null; abstractC13616e = abstractC13616e.f27024e) {
            abstractC13616e.mo2043e(abstractC17732e);
        }
    }

    @Override // defpackage.AbstractC13616e
    /* renamed from: eؘٕۚ, reason: contains not printable characters */
    public final void mo2044e() {
        for (AbstractC13616e abstractC13616e = this.f12873e; abstractC13616e != null; abstractC13616e = abstractC13616e.f27024e) {
            abstractC13616e.mo2044e();
        }
        super.mo2044e();
    }

    @Override // defpackage.AbstractC13616e
    /* renamed from: eٍۢؒ, reason: contains not printable characters */
    public final void mo2045e() {
        super.mo2045e();
        for (AbstractC13616e abstractC13616e = this.f12873e; abstractC13616e != null; abstractC13616e = abstractC13616e.f27024e) {
            abstractC13616e.mo2045e();
        }
    }

    @Override // defpackage.AbstractC13616e
    /* renamed from: eؙِۡ, reason: contains not printable characters */
    public final void mo2046e() {
        super.mo2046e();
        for (AbstractC13616e abstractC13616e = this.f12873e; abstractC13616e != null; abstractC13616e = abstractC13616e.f27024e) {
            abstractC13616e.mo2046e();
        }
    }

    /* renamed from: eّّۚ, reason: contains not printable characters */
    public final void m2047e(int i, boolean z) {
        AbstractC13616e abstractC13616e;
        int i2 = this.f27014e;
        this.f27014e = i;
        if (i2 != i) {
            AbstractC13616e abstractC13616e2 = this.f27022e;
            if (abstractC13616e2 == this) {
                this.f27020e = i;
            }
            if (this.f27016e) {
                AbstractC13616e abstractC13616e3 = this;
                while (abstractC13616e3 != null) {
                    i |= abstractC13616e3.f27014e;
                    abstractC13616e3.f27014e = i;
                    if (abstractC13616e3 == abstractC13616e2) {
                        break;
                    } else {
                        abstractC13616e3 = abstractC13616e3.f27011e;
                    }
                }
                if (z && abstractC13616e3 == abstractC13616e2) {
                    i = AbstractC5180e.purchase(abstractC13616e2);
                    abstractC13616e2.f27014e = i;
                }
                int i3 = i | ((abstractC13616e3 == null || (abstractC13616e = abstractC13616e3.f27024e) == null) ? 0 : abstractC13616e.f27020e);
                while (abstractC13616e3 != null) {
                    i3 |= abstractC13616e3.f27014e;
                    abstractC13616e3.f27020e = i3;
                    abstractC13616e3 = abstractC13616e3.f27011e;
                }
            }
        }
    }

    @Override // defpackage.AbstractC13616e
    /* renamed from: eْۢؕ, reason: contains not printable characters */
    public final void mo2048e(AbstractC13616e abstractC13616e) {
        this.f27022e = abstractC13616e;
        for (AbstractC13616e abstractC13616e2 = this.f12873e; abstractC13616e2 != null; abstractC13616e2 = abstractC13616e2.f27024e) {
            abstractC13616e2.mo2048e(abstractC13616e);
        }
    }

    @Override // defpackage.AbstractC13616e
    /* renamed from: eٍٓۢ, reason: contains not printable characters */
    public final void mo2049e() {
        for (AbstractC13616e abstractC13616e = this.f12873e; abstractC13616e != null; abstractC13616e = abstractC13616e.f27024e) {
            abstractC13616e.mo2049e();
        }
        super.mo2049e();
    }

    /* renamed from: eٌٔٗ, reason: contains not printable characters */
    public final InterfaceC5077e m2050e(InterfaceC5077e interfaceC5077e) {
        AbstractC13616e abstractC13616e = ((AbstractC13616e) interfaceC5077e).f27022e;
        if (abstractC13616e != interfaceC5077e) {
            AbstractC13616e abstractC13616e2 = interfaceC5077e instanceof AbstractC13616e ? (AbstractC13616e) interfaceC5077e : null;
            AbstractC13616e abstractC13616e3 = abstractC13616e2 != null ? abstractC13616e2.f27011e : null;
            if (abstractC13616e != this.f27022e || !AbstractC7890e.billing(abstractC13616e3, this)) {
                throw new IllegalStateException("Cannot delegate to an already delegated node");
            }
        } else {
            if (abstractC13616e.f27016e) {
                AbstractC14070e.metrica("Cannot delegate to an already attached node");
            }
            abstractC13616e.mo2048e(this.f27022e);
            int i = this.f27014e;
            int purchase = AbstractC5180e.purchase(abstractC13616e);
            abstractC13616e.f27014e = purchase;
            int i2 = this.f27014e;
            int i3 = purchase & 2;
            if (i3 != 0 && (i2 & 2) != 0 && !(this instanceof InterfaceC17303e)) {
                AbstractC14070e.metrica("Delegating to multiple LayoutModifierNodes without the delegating node implementing LayoutModifierNode itself is not allowed.\nDelegating Node: " + this + "\nDelegate Node: " + abstractC13616e);
            }
            abstractC13616e.f27024e = this.f12873e;
            this.f12873e = abstractC13616e;
            abstractC13616e.f27011e = this;
            m2047e(purchase | this.f27014e, false);
            if (this.f27016e) {
                if (i3 == 0 || (i & 2) != 0) {
                    mo2043e(this.f27018e);
                } else {
                    C14742e c14742e = AbstractC5851e.mopub(this).f27592e;
                    this.f27022e.mo2043e(null);
                    c14742e.smaato();
                }
                abstractC13616e.mo2051e();
                abstractC13616e.mo2049e();
                if (!abstractC13616e.f27016e) {
                    AbstractC14070e.metrica("autoInvalidateInsertedNode called on unattached node");
                }
                AbstractC5180e.ad(abstractC13616e, -1, 1);
            }
        }
        return interfaceC5077e;
    }

    @Override // defpackage.AbstractC13616e
    /* renamed from: eٕؓٝ, reason: contains not printable characters */
    public final void mo2051e() {
        super.mo2051e();
        for (AbstractC13616e abstractC13616e = this.f12873e; abstractC13616e != null; abstractC13616e = abstractC13616e.f27024e) {
            abstractC13616e.mo2043e(this.f27018e);
            if (!abstractC13616e.f27016e) {
                abstractC13616e.mo2051e();
            }
        }
    }
}
