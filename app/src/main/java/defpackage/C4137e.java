package defpackage;

/* renamed from: eٖؖؗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4137e extends Cextends {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public Cfinal f9119e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public Cextends f9120e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public Ctry f9121e;

    public C4137e(Ctry ctry, C10154e c10154e, C13346e c13346e) {
        this.f9121e = ctry;
        this.f9120e = c10154e;
        this.f9119e = c13346e;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [eٖؖؗ, java.lang.Object] */
    public static C4137e loadAd(subs subsVar) {
        if (subsVar instanceof C4137e) {
            return (C4137e) subsVar;
        }
        if (subsVar == null) {
            return null;
        }
        Ccatch m168class = Ccatch.m168class(subsVar);
        ?? obj = new Object();
        obj.f9121e = (Ctry) m168class.mo171interface(0);
        obj.f9120e = ((Cstrictfp) m168class.mo171interface(1)).firebase();
        if (m168class.size() == 3) {
            obj.f9119e = (Cfinal) m168class.mo171interface(2);
        }
        return obj;
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [default, catch, eؚؖٚ] */
    @Override // defpackage.Cextends, defpackage.subs
    public final Cdefault billing() {
        crashlytics crashlyticsVar = new crashlytics(3, 0);
        crashlyticsVar.appmetrica(this.f9121e);
        crashlyticsVar.appmetrica(new Cstrictfp(true, 0, this.f9120e));
        Cfinal cfinal = this.f9119e;
        if (cfinal != null) {
            crashlyticsVar.appmetrica(cfinal);
        }
        ?? ccatch = new Ccatch(crashlyticsVar);
        ccatch.f14196e = -1;
        return ccatch;
    }
}
