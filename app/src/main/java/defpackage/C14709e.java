package defpackage;

/* renamed from: eٔٓۘ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C14709e extends Cstrictfp {
    @Override // defpackage.Cdefault
    public final void Signature(C7850e c7850e, boolean z) {
        Cdefault premium = this.f36464e.billing().premium();
        boolean m4635interface = m4635interface();
        if (z) {
            int i = this.f36463e;
            if (m4635interface || premium.admob()) {
                i |= 32;
            }
            c7850e.m2336final(i, this.f36462e);
        }
        if (m4635interface) {
            c7850e.m2330abstract(premium.remoteconfig(true));
        }
        premium.Signature(c7850e.premium(), m4635interface);
    }

    @Override // defpackage.Cdefault
    public final boolean admob() {
        return m4635interface() || this.f36464e.billing().premium().admob();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [catch, eؚؖٚ] */
    @Override // defpackage.Cstrictfp
    /* renamed from: goto */
    public final Ccatch mo2420goto(Cdefault cdefault) {
        ?? ccatch = new Ccatch(cdefault);
        ccatch.f14196e = -1;
        return ccatch;
    }

    @Override // defpackage.Cstrictfp, defpackage.Cdefault
    public final Cdefault premium() {
        return this;
    }

    @Override // defpackage.Cdefault
    public final int remoteconfig(boolean z) {
        Cdefault premium = this.f36464e.billing().premium();
        boolean m4635interface = m4635interface();
        int remoteconfig = premium.remoteconfig(m4635interface);
        if (m4635interface) {
            remoteconfig += C7850e.m2326class(remoteconfig);
        }
        return remoteconfig + (z ? C7850e.m2328native(this.f36462e) : 0);
    }
}
