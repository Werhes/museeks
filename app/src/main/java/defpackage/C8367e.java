package defpackage;

/* renamed from: eًۧٗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C8367e extends Cstrictfp {
    @Override // defpackage.Cdefault
    public final void Signature(C7850e c7850e, boolean z) {
        Cdefault billing = this.f36464e.billing();
        boolean m4635interface = m4635interface();
        if (z) {
            int i = this.f36463e;
            if (m4635interface || billing.admob()) {
                i |= 32;
            }
            c7850e.m2336final(i, this.f36462e);
        }
        if (!m4635interface) {
            billing.Signature(c7850e, false);
            return;
        }
        c7850e.m2341protected(128);
        billing.Signature(c7850e, true);
        c7850e.m2341protected(0);
        c7850e.m2341protected(0);
    }

    @Override // defpackage.Cdefault
    public final boolean admob() {
        return m4635interface() || this.f36464e.billing().admob();
    }

    @Override // defpackage.Cstrictfp
    /* renamed from: goto, reason: not valid java name */
    public final Ccatch mo2420goto(Cdefault cdefault) {
        return new Ccatch(cdefault);
    }

    @Override // defpackage.Cdefault
    public final int remoteconfig(boolean z) {
        Cdefault billing = this.f36464e.billing();
        boolean m4635interface = m4635interface();
        int remoteconfig = billing.remoteconfig(m4635interface);
        if (m4635interface) {
            remoteconfig += 3;
        }
        return remoteconfig + (z ? C7850e.m2328native(this.f36462e) : 0);
    }
}
