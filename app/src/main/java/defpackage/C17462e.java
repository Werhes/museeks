package defpackage;

/* renamed from: e٘ؐۛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C17462e extends Cextends {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public static final C16527e f34197e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public static final C16527e f34198e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public static final C16527e f34199e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public C16527e f34200e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public C16527e f34201e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public C16527e f34202e;

    static {
        C16527e c16527e = new C16527e(InterfaceC12598e.purchase, C0503e.f2592e);
        f34198e = c16527e;
        f34197e = new C16527e(InterfaceC5051e.f10781catch, c16527e);
        f34199e = new C16527e(InterfaceC5051e.f10824final, new Cprotected(new byte[0]));
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [e٘ؐۛ, java.lang.Object] */
    public static C17462e loadAd(Object obj) {
        if (obj instanceof C17462e) {
            return (C17462e) obj;
        }
        if (obj == null) {
            return null;
        }
        Ccatch m168class = Ccatch.m168class(obj);
        ?? obj2 = new Object();
        obj2.f34202e = f34198e;
        obj2.f34201e = f34197e;
        obj2.f34200e = f34199e;
        for (int i = 0; i != m168class.size(); i++) {
            Cstrictfp cstrictfp = (Cstrictfp) m168class.mo171interface(i);
            int i2 = cstrictfp.f36462e;
            if (i2 == 0) {
                obj2.f34202e = C16527e.loadAd(Ccatch.firebase(cstrictfp, true));
            } else if (i2 == 1) {
                obj2.f34201e = C16527e.loadAd(Ccatch.firebase(cstrictfp, true));
            } else {
                if (i2 != 2) {
                    throw new IllegalArgumentException("unknown tag");
                }
                obj2.f34200e = C16527e.loadAd(Ccatch.firebase(cstrictfp, true));
            }
        }
        return obj2;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [default, catch, eًٌَ] */
    @Override // defpackage.Cextends, defpackage.subs
    public final Cdefault billing() {
        C16527e c16527e = this.f34200e;
        C16527e c16527e2 = this.f34201e;
        crashlytics crashlyticsVar = new crashlytics(3, 0);
        C16527e c16527e3 = this.f34202e;
        if (!c16527e3.equals(f34198e)) {
            crashlyticsVar.appmetrica(new Cstrictfp(true, 0, c16527e3));
        }
        if (!c16527e2.equals(f34197e)) {
            crashlyticsVar.appmetrica(new Cstrictfp(true, 1, c16527e2));
        }
        if (!c16527e.equals(f34199e)) {
            crashlyticsVar.appmetrica(new Cstrictfp(true, 2, c16527e));
        }
        ?? ccatch = new Ccatch(crashlyticsVar);
        ccatch.f20096e = -1;
        return ccatch;
    }
}
