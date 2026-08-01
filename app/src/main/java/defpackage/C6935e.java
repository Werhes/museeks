package defpackage;

/* renamed from: eؚؖٚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C6935e extends Ccatch {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public int f14196e;

    @Override // defpackage.Cdefault
    public final void Signature(C7850e c7850e, boolean z) {
        c7850e.m2343super(48, z);
        C15987e premium = c7850e.premium();
        int length = this.f641e.length;
        int i = 0;
        if (this.f14196e >= 0 || length > 16) {
            c7850e.m2330abstract(m2257while());
            while (i < length) {
                premium.mo2342strictfp(this.f641e[i].billing());
                i++;
            }
            return;
        }
        Cdefault[] cdefaultArr = new Cdefault[length];
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3++) {
            Cdefault premium2 = this.f641e[i3].billing().premium();
            cdefaultArr[i3] = premium2;
            i2 += premium2.remoteconfig(true);
        }
        this.f14196e = i2;
        c7850e.m2330abstract(i2);
        while (i < length) {
            premium.mo2342strictfp(cdefaultArr[i]);
            i++;
        }
    }

    @Override // defpackage.Ccatch
    /* renamed from: extends */
    public final Cprotected mo169extends() {
        return new Cprotected(C6210e.crashlytics(crashlytics()));
    }

    @Override // defpackage.Ccatch
    /* renamed from: native */
    public final C4148e mo172native() {
        return new C4148e(this, 1);
    }

    @Override // defpackage.Ccatch, defpackage.Cdefault
    public final Cdefault premium() {
        return this;
    }

    @Override // defpackage.Cdefault
    public final int remoteconfig(boolean z) {
        return C7850e.m2327goto(m2257while(), z);
    }

    @Override // defpackage.Ccatch
    /* renamed from: this */
    public final isPro mo173this() {
        return new isPro(C16940e.m4229goto(subs()));
    }

    @Override // defpackage.Ccatch
    /* renamed from: throw */
    public final Cfinal mo174throw() {
        return new C3205e(this.f641e);
    }

    /* renamed from: while, reason: not valid java name */
    public final int m2257while() {
        if (this.f14196e < 0) {
            int length = this.f641e.length;
            int i = 0;
            for (int i2 = 0; i2 < length; i2++) {
                i += this.f641e[i2].billing().premium().remoteconfig(true);
            }
            this.f14196e = i;
        }
        return this.f14196e;
    }
}
