package defpackage;

/* renamed from: eٕٜۛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C15592e extends Cextends {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public C4368e f30765e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public C9120e f30766e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public int f30767e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public C3784e f30768e;

    /* JADX WARN: Type inference failed for: r0v2, types: [eٕٜۛ, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v4, types: [eٕٜۛ, java.lang.Object] */
    public static C15592e loadAd(subs subsVar) {
        if (subsVar instanceof C15592e) {
            return (C15592e) subsVar;
        }
        boolean z = subsVar instanceof Cstrictfp;
        inmobi inmobiVar = Ccatch.f640e;
        if (z) {
            Cstrictfp m4634class = Cstrictfp.m4634class(subsVar);
            ?? obj = new Object();
            obj.f30767e = 1;
            int i = m4634class.f36462e;
            if (i == 0) {
                obj.f30768e = C3784e.loadAd(m4634class, true);
            } else {
                if (i != 1) {
                    throw new IllegalArgumentException("unknown tag in Holder");
                }
                obj.f30766e = new C9120e((Ccatch) inmobiVar.m4616e(m4634class, true));
            }
            obj.f30767e = 0;
            return obj;
        }
        if (subsVar == null) {
            return null;
        }
        Ccatch m168class = Ccatch.m168class(subsVar);
        ?? obj2 = new Object();
        obj2.f30767e = 1;
        if (m168class.size() > 3) {
            throw new IllegalArgumentException(AbstractC0054e.premium(m168class, new StringBuilder("Bad sequence size: ")));
        }
        for (int i2 = 0; i2 != m168class.size(); i2++) {
            Cstrictfp m4634class2 = Cstrictfp.m4634class(m168class.mo171interface(i2));
            int i3 = m4634class2.f36462e;
            if (i3 == 0) {
                obj2.f30768e = C3784e.loadAd(m4634class2, false);
            } else if (i3 == 1) {
                obj2.f30766e = new C9120e((Ccatch) inmobiVar.m4616e(m4634class2, false));
            } else {
                if (i3 != 2) {
                    throw new IllegalArgumentException("unknown tag in Holder");
                }
                obj2.f30765e = C4368e.loadAd(m4634class2);
            }
        }
        obj2.f30767e = 1;
        return obj2;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [default, catch, eًٌَ] */
    @Override // defpackage.Cextends, defpackage.subs
    public final Cdefault billing() {
        C9120e c9120e = this.f30766e;
        C3784e c3784e = this.f30768e;
        if (this.f30767e != 1) {
            return c9120e != null ? new Cstrictfp(true, 1, c9120e) : new Cstrictfp(true, 0, c3784e);
        }
        crashlytics crashlyticsVar = new crashlytics(3, 0);
        if (c3784e != null) {
            crashlyticsVar.appmetrica(new Cstrictfp(2, 128, 0, c3784e));
        }
        if (c9120e != null) {
            crashlyticsVar.appmetrica(new Cstrictfp(2, 128, 1, c9120e));
        }
        C4368e c4368e = this.f30765e;
        if (c4368e != null) {
            crashlyticsVar.appmetrica(new Cstrictfp(2, 128, 2, c4368e));
        }
        ?? ccatch = new Ccatch(crashlyticsVar);
        ccatch.f20096e = -1;
        return ccatch;
    }
}
