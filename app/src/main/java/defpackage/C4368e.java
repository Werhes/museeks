package defpackage;

/* renamed from: eؖۚۚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4368e extends Cextends {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public C16527e f9498e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public Ctry f9499e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public isPro f9500e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public firebase f9501e;

    /* JADX WARN: Type inference failed for: r0v1, types: [eؖۚۚ, java.lang.Object] */
    public static C4368e loadAd(Cstrictfp cstrictfp) {
        int i = 0;
        Ccatch ccatch = (Ccatch) Ccatch.f640e.m4616e(cstrictfp, false);
        if (ccatch == null) {
            return null;
        }
        Ccatch m168class = Ccatch.m168class(ccatch);
        ?? obj = new Object();
        if (m168class.size() > 4 || m168class.size() < 3) {
            throw new IllegalArgumentException(AbstractC0054e.premium(m168class, new StringBuilder("Bad sequence size: ")));
        }
        obj.f9501e = firebase.crashlytics(m168class.mo171interface(0));
        if (m168class.size() == 4) {
            i = 1;
            obj.f9499e = Ctry.m4669interface(m168class.mo171interface(1));
        }
        obj.f9498e = C16527e.loadAd(m168class.mo171interface(i + 1));
        obj.f9500e = isPro.firebase(m168class.mo171interface(i + 2));
        return obj;
    }

    /* JADX WARN: Type inference failed for: r1v5, types: [default, catch, eًٌَ] */
    @Override // defpackage.Cextends, defpackage.subs
    public final Cdefault billing() {
        crashlytics crashlyticsVar = new crashlytics(4, 0);
        crashlyticsVar.appmetrica(this.f9501e);
        Ctry ctry = this.f9499e;
        if (ctry != null) {
            crashlyticsVar.appmetrica(ctry);
        }
        crashlyticsVar.appmetrica(this.f9498e);
        crashlyticsVar.appmetrica(this.f9500e);
        ?? ccatch = new Ccatch(crashlyticsVar);
        ccatch.f20096e = -1;
        return ccatch;
    }
}
