package defpackage;

/* renamed from: eْٚٛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C13346e extends Cfinal {

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public int f26600e;

    public C13346e() {
        this.f26600e = -1;
    }

    public C13346e(subs subsVar) {
        super(subsVar);
        this.f26600e = -1;
    }

    @Override // defpackage.Cdefault
    public final void Signature(C7850e c7850e, boolean z) {
        c7850e.m2343super(49, z);
        C11626e ads = c7850e.ads();
        subs[] subsVarArr = this.f36388e;
        int length = subsVarArr.length;
        int i = 0;
        if (this.f26600e >= 0 || length > 16) {
            c7850e.m2330abstract(m3557interface());
            while (i < length) {
                subsVarArr[i].billing().ads().Signature(ads, true);
                i++;
            }
            return;
        }
        Cdefault[] cdefaultArr = new Cdefault[length];
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3++) {
            Cdefault ads2 = subsVarArr[i3].billing().ads();
            cdefaultArr[i3] = ads2;
            i2 += ads2.remoteconfig(true);
        }
        this.f26600e = i2;
        c7850e.m2330abstract(i2);
        while (i < length) {
            cdefaultArr[i].Signature(ads, true);
            i++;
        }
    }

    @Override // defpackage.Cfinal, defpackage.Cdefault
    public final Cdefault ads() {
        return this.f36387e != null ? this : super.ads();
    }

    /* renamed from: interface, reason: not valid java name */
    public final int m3557interface() {
        if (this.f26600e < 0) {
            int i = 0;
            for (subs subsVar : this.f36388e) {
                i += subsVar.billing().ads().remoteconfig(true);
            }
            this.f26600e = i;
        }
        return this.f26600e;
    }

    @Override // defpackage.Cfinal, defpackage.Cdefault
    public final Cdefault premium() {
        return this;
    }

    @Override // defpackage.Cdefault
    public final int remoteconfig(boolean z) {
        return C7850e.m2327goto(m3557interface(), z);
    }
}
