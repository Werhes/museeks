package defpackage;

/* renamed from: eؚؕٓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3205e extends Cfinal {

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public int f7323e;

    public C3205e(subs[] subsVarArr) {
        super(false, subsVarArr);
        this.f7323e = -1;
    }

    @Override // defpackage.Cdefault
    public final void Signature(C7850e c7850e, boolean z) {
        c7850e.m2343super(49, z);
        C15987e premium = c7850e.premium();
        subs[] subsVarArr = this.f36388e;
        int length = subsVarArr.length;
        int i = 0;
        if (this.f7323e >= 0 || length > 16) {
            c7850e.m2330abstract(m1318interface());
            while (i < length) {
                premium.mo2342strictfp(subsVarArr[i].billing());
                i++;
            }
            return;
        }
        Cdefault[] cdefaultArr = new Cdefault[length];
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3++) {
            Cdefault premium2 = subsVarArr[i3].billing().premium();
            cdefaultArr[i3] = premium2;
            i2 += premium2.remoteconfig(true);
        }
        this.f7323e = i2;
        c7850e.m2330abstract(i2);
        while (i < length) {
            premium.mo2342strictfp(cdefaultArr[i]);
            i++;
        }
    }

    /* renamed from: interface, reason: not valid java name */
    public final int m1318interface() {
        if (this.f7323e < 0) {
            int i = 0;
            for (subs subsVar : this.f36388e) {
                i += subsVar.billing().premium().remoteconfig(true);
            }
            this.f7323e = i;
        }
        return this.f7323e;
    }

    @Override // defpackage.Cfinal, defpackage.Cdefault
    public final Cdefault premium() {
        return this;
    }

    @Override // defpackage.Cdefault
    public final int remoteconfig(boolean z) {
        return C7850e.m2327goto(m1318interface(), z);
    }
}
