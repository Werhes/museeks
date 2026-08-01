package defpackage;

/* renamed from: eٕؕۨ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3784e extends Cextends {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public isPro f8387e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public Cthis f8388e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public C9120e f8389e;

    /* JADX WARN: Type inference failed for: r4v1, types: [eٕؕۨ, java.lang.Object] */
    public static C3784e loadAd(Cstrictfp cstrictfp, boolean z) {
        Ccatch ccatch = (Ccatch) Ccatch.f640e.m4616e(cstrictfp, z);
        if (ccatch == null) {
            return null;
        }
        Ccatch m168class = Ccatch.m168class(ccatch);
        ?? obj = new Object();
        if (m168class.size() != 2 && m168class.size() != 3) {
            throw new IllegalArgumentException(AbstractC0054e.premium(m168class, new StringBuilder("Bad sequence size: ")));
        }
        obj.f8389e = C9120e.loadAd(m168class.mo171interface(0));
        obj.f8388e = Cthis.subs(m168class.mo171interface(1));
        if (m168class.size() == 3) {
            obj.f8387e = isPro.firebase(m168class.mo171interface(2));
        }
        return obj;
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [default, catch, eًٌَ] */
    @Override // defpackage.Cextends, defpackage.subs
    public final Cdefault billing() {
        crashlytics crashlyticsVar = new crashlytics(3, 0);
        crashlyticsVar.appmetrica(this.f8389e);
        crashlyticsVar.appmetrica(this.f8388e);
        isPro ispro = this.f8387e;
        if (ispro != null) {
            crashlyticsVar.appmetrica(ispro);
        }
        ?? ccatch = new Ccatch(crashlyticsVar);
        ccatch.f20096e = -1;
        return ccatch;
    }
}
