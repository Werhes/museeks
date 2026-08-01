package defpackage;

/* renamed from: eؚِٞ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C7087e extends Cextends implements premium {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final Cdefault f14542e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final Cextends f14543e;

    public C7087e(C6767e c6767e) {
        this.f14543e = c6767e;
        this.f14542e = new Cstrictfp(2, 128, 0, c6767e);
    }

    public C7087e(C9120e c9120e) {
        this.f14543e = c9120e;
        this.f14542e = c9120e.billing();
    }

    public static C7087e loadAd(subs subsVar) {
        if (subsVar == null || (subsVar instanceof C7087e)) {
            return (C7087e) subsVar;
        }
        if (subsVar instanceof C6767e) {
            return new C7087e(C6767e.loadAd(subsVar));
        }
        if (subsVar instanceof C9120e) {
            return new C7087e((C9120e) subsVar);
        }
        if (subsVar instanceof Cstrictfp) {
            return new C7087e(C6767e.loadAd((Ccatch) Ccatch.f640e.m4616e((Cstrictfp) subsVar, false)));
        }
        if (subsVar instanceof Ccatch) {
            return new C7087e(C9120e.loadAd(subsVar));
        }
        throw new IllegalArgumentException("unknown object in factory: ".concat(subsVar.getClass().getName()));
    }

    @Override // defpackage.Cextends, defpackage.subs
    public final Cdefault billing() {
        return this.f14542e;
    }
}
