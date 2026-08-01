package defpackage;

/* renamed from: eؙۤٗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C6767e extends Cextends {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public C4368e f13970e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public C3784e f13971e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public C9120e f13972e;

    /* JADX WARN: Type inference failed for: r0v1, types: [eؙۤٗ, java.lang.Object] */
    public static C6767e loadAd(Object obj) {
        int i;
        if (obj instanceof C6767e) {
            return (C6767e) obj;
        }
        if (obj == null) {
            return null;
        }
        Ccatch m168class = Ccatch.m168class(obj);
        ?? obj2 = new Object();
        if (m168class.size() > 3) {
            throw new IllegalArgumentException(AbstractC0054e.premium(m168class, new StringBuilder("Bad sequence size: ")));
        }
        if (m168class.mo171interface(0) instanceof Cstrictfp) {
            i = 0;
        } else {
            obj2.f13972e = C9120e.loadAd(m168class.mo171interface(0));
            i = 1;
        }
        while (i != m168class.size()) {
            Cstrictfp m4634class = Cstrictfp.m4634class(m168class.mo171interface(i));
            int i2 = m4634class.f36462e;
            if (i2 == 0) {
                obj2.f13971e = C3784e.loadAd(m4634class, false);
            } else {
                if (i2 != 1) {
                    throw new IllegalArgumentException("Bad tag number: " + m4634class.f36462e);
                }
                obj2.f13970e = C4368e.loadAd(m4634class);
            }
            i++;
        }
        return obj2;
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [default, catch, eًٌَ] */
    @Override // defpackage.Cextends, defpackage.subs
    public final Cdefault billing() {
        crashlytics crashlyticsVar = new crashlytics(3, 0);
        C9120e c9120e = this.f13972e;
        if (c9120e != null) {
            crashlyticsVar.appmetrica(c9120e);
        }
        C3784e c3784e = this.f13971e;
        if (c3784e != null) {
            crashlyticsVar.appmetrica(new Cstrictfp(false, 0, c3784e));
        }
        C4368e c4368e = this.f13970e;
        if (c4368e != null) {
            crashlyticsVar.appmetrica(new Cstrictfp(false, 1, c4368e));
        }
        ?? ccatch = new Ccatch(crashlyticsVar);
        ccatch.f20096e = -1;
        return ccatch;
    }
}
