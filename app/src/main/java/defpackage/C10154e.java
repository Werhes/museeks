package defpackage;

/* renamed from: eًٌَ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C10154e extends Ccatch {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public int f20096e;

    public C10154e(subs subsVar, subs subsVar2) {
        super(subsVar, subsVar2);
        this.f20096e = -1;
    }

    public C10154e(subs[] subsVarArr) {
        super(subsVarArr);
        this.f20096e = -1;
    }

    @Override // defpackage.Cdefault
    public final void Signature(C7850e c7850e, boolean z) {
        c7850e.m2343super(48, z);
        C11626e ads = c7850e.ads();
        int length = this.f641e.length;
        int i = 0;
        if (this.f20096e >= 0 || length > 16) {
            c7850e.m2330abstract(m2775while());
            while (i < length) {
                this.f641e[i].billing().ads().Signature(ads, true);
                i++;
            }
            return;
        }
        Cdefault[] cdefaultArr = new Cdefault[length];
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3++) {
            Cdefault ads2 = this.f641e[i3].billing().ads();
            cdefaultArr[i3] = ads2;
            i2 += ads2.remoteconfig(true);
        }
        this.f20096e = i2;
        c7850e.m2330abstract(i2);
        while (i < length) {
            cdefaultArr[i].Signature(ads, true);
            i++;
        }
    }

    @Override // defpackage.Ccatch, defpackage.Cdefault
    public final Cdefault ads() {
        return this;
    }

    @Override // defpackage.Ccatch
    /* renamed from: extends */
    public final Cprotected mo169extends() {
        return new Cprotected(C6210e.crashlytics(crashlytics()));
    }

    @Override // defpackage.Ccatch
    /* renamed from: native */
    public final C4148e mo172native() {
        return new C4148e(this, 0);
    }

    @Override // defpackage.Ccatch, defpackage.Cdefault
    public final Cdefault premium() {
        return this;
    }

    @Override // defpackage.Cdefault
    public final int remoteconfig(boolean z) {
        return C7850e.m2327goto(m2775while(), z);
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
    public final int m2775while() {
        if (this.f20096e < 0) {
            int length = this.f641e.length;
            int i = 0;
            for (int i2 = 0; i2 < length; i2++) {
                i += this.f641e[i2].billing().ads().remoteconfig(true);
            }
            this.f20096e = i;
        }
        return this.f20096e;
    }
}
