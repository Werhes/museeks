package defpackage;

/* renamed from: eؙٕؓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C15289e extends Cstrictfp {
    @Override // defpackage.Cdefault
    public final void Signature(C7850e c7850e, boolean z) {
        Cdefault ads = this.f36464e.billing().ads();
        boolean m4635interface = m4635interface();
        if (z) {
            int i = this.f36463e;
            if (m4635interface || ads.admob()) {
                i |= 32;
            }
            c7850e.m2336final(i, this.f36462e);
        }
        if (m4635interface) {
            c7850e.m2330abstract(ads.remoteconfig(true));
        }
        ads.Signature(c7850e.ads(), m4635interface);
    }

    @Override // defpackage.Cdefault
    public final boolean admob() {
        return m4635interface() || this.f36464e.billing().ads().admob();
    }

    @Override // defpackage.Cstrictfp, defpackage.Cdefault
    public final Cdefault ads() {
        return this;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [catch, eًٌَ] */
    @Override // defpackage.Cstrictfp
    /* renamed from: goto */
    public final Ccatch mo2420goto(Cdefault cdefault) {
        ?? ccatch = new Ccatch(cdefault);
        ccatch.f20096e = -1;
        return ccatch;
    }

    @Override // defpackage.Cstrictfp, defpackage.Cdefault
    public final Cdefault premium() {
        return this;
    }

    @Override // defpackage.Cdefault
    public final int remoteconfig(boolean z) {
        Cdefault ads = this.f36464e.billing().ads();
        boolean m4635interface = m4635interface();
        int remoteconfig = ads.remoteconfig(m4635interface);
        if (m4635interface) {
            remoteconfig += C7850e.m2326class(remoteconfig);
        }
        return remoteconfig + (z ? C7850e.m2328native(this.f36462e) : 0);
    }
}
