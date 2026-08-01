package defpackage;

import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؚۣٕ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7556e extends AbstractC13616e implements InterfaceC6459e, InterfaceC13418e, InterfaceC18105e {

    /* renamed from: eٍؗٚ, reason: contains not printable characters */
    public long f15383e;

    /* renamed from: eؙِۛ, reason: contains not printable characters */
    public InterfaceC13418e f15384e;

    /* renamed from: eؚٕؒ, reason: contains not printable characters */
    public final Function1 f15385e;

    /* renamed from: eًؕۙ, reason: contains not printable characters */
    public C7556e f15386e;

    public C7556e(C5337e c5337e, int i) {
        this.f15385e = (i & 2) != 0 ? null : c5337e;
        this.f15383e = 0L;
    }

    @Override // defpackage.InterfaceC18105e
    public final /* synthetic */ void Signature(InterfaceC0043e interfaceC0043e) {
    }

    @Override // defpackage.InterfaceC6459e
    public final Object admob() {
        return C17354e.f34052e;
    }

    @Override // defpackage.InterfaceC13418e
    /* renamed from: continue */
    public final void mo2052continue(C6057e c6057e) {
        InterfaceC13418e interfaceC13418e = this.f15384e;
        if (interfaceC13418e != null) {
            interfaceC13418e.mo2052continue(c6057e);
            return;
        }
        C7556e c7556e = this.f15386e;
        if (c7556e != null) {
            c7556e.mo2052continue(c6057e);
        }
    }

    @Override // defpackage.InterfaceC13418e
    /* renamed from: eؚۜؑ */
    public final boolean mo2053e(C6057e c6057e) {
        C7556e c7556e = this.f15386e;
        if (c7556e != null) {
            return c7556e.mo2053e(c6057e);
        }
        InterfaceC13418e interfaceC13418e = this.f15384e;
        if (interfaceC13418e != null) {
            return interfaceC13418e.mo2053e(c6057e);
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [eّؖٝ, java.lang.Object] */
    @Override // defpackage.InterfaceC13418e
    /* renamed from: eًًؓ */
    public final void mo2054e(C6057e c6057e) {
        InterfaceC6459e interfaceC6459e;
        C7556e c7556e;
        C7556e c7556e2 = this.f15386e;
        if (c7556e2 == null || !AbstractC7844e.ad(c7556e2, AbstractC0882e.license(c6057e))) {
            if (this.f27022e.f27016e) {
                ?? obj = new Object();
                AbstractC14114e.mopub(this, new C7314e(4, obj, this, c6057e));
                interfaceC6459e = (InterfaceC6459e) obj.f9318e;
            } else {
                interfaceC6459e = null;
            }
            c7556e = (C7556e) interfaceC6459e;
        } else {
            c7556e = c7556e2;
        }
        if (c7556e != null && c7556e2 == null) {
            c7556e.inmobi(c6057e);
            c7556e.mo2054e(c6057e);
            InterfaceC13418e interfaceC13418e = this.f15384e;
            if (interfaceC13418e != null) {
                interfaceC13418e.mo2056static(c6057e);
            }
        } else if (c7556e == null && c7556e2 != null) {
            InterfaceC13418e interfaceC13418e2 = this.f15384e;
            if (interfaceC13418e2 != null) {
                interfaceC13418e2.inmobi(c6057e);
                interfaceC13418e2.mo2054e(c6057e);
            }
            c7556e2.mo2056static(c6057e);
        } else if (!AbstractC7890e.billing(c7556e, c7556e2)) {
            if (c7556e != null) {
                c7556e.inmobi(c6057e);
                c7556e.mo2054e(c6057e);
            }
            if (c7556e2 != null) {
                c7556e2.mo2056static(c6057e);
            }
        } else if (c7556e != null) {
            c7556e.mo2054e(c6057e);
        } else {
            InterfaceC13418e interfaceC13418e3 = this.f15384e;
            if (interfaceC13418e3 != null) {
                interfaceC13418e3.mo2054e(c6057e);
            }
        }
        this.f15386e = c7556e;
    }

    @Override // defpackage.AbstractC13616e
    /* renamed from: eّْٝ */
    public final void mo228e() {
        this.f15384e = null;
        this.f15386e = null;
    }

    @Override // defpackage.InterfaceC13418e
    /* renamed from: goto */
    public final void mo2055goto(C6057e c6057e) {
        C17097e c17097e = new C17097e(15, c6057e);
        if (c17097e.invoke(this) != EnumC9253e.f18468e) {
            return;
        }
        AbstractC14114e.mopub(this, c17097e);
    }

    @Override // defpackage.InterfaceC13418e
    public final void inmobi(C6057e c6057e) {
        InterfaceC13418e interfaceC13418e = this.f15384e;
        if (interfaceC13418e != null) {
            interfaceC13418e.inmobi(c6057e);
            return;
        }
        C7556e c7556e = this.f15386e;
        if (c7556e != null) {
            c7556e.inmobi(c6057e);
        }
    }

    @Override // defpackage.InterfaceC12415e
    public final void signatures(long j) {
        this.f15383e = j;
    }

    @Override // defpackage.InterfaceC13418e
    /* renamed from: static */
    public final void mo2056static(C6057e c6057e) {
        InterfaceC13418e interfaceC13418e = this.f15384e;
        if (interfaceC13418e != null) {
            interfaceC13418e.mo2056static(c6057e);
        }
        C7556e c7556e = this.f15386e;
        if (c7556e != null) {
            c7556e.mo2056static(c6057e);
        }
        this.f15386e = null;
    }
}
