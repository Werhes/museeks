package defpackage;

/* renamed from: eٖ۟, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C16527e extends Cextends {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public subs f32407e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public Ctry f32408e;

    public C16527e(Ctry ctry) {
        this.f32408e = ctry;
    }

    public C16527e(Ctry ctry, subs subsVar) {
        this.f32408e = ctry;
        this.f32407e = subsVar;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, eٖ۟] */
    public static C16527e loadAd(Object obj) {
        if (obj instanceof C16527e) {
            return (C16527e) obj;
        }
        if (obj == null) {
            return null;
        }
        Ccatch m168class = Ccatch.m168class(obj);
        ?? obj2 = new Object();
        if (m168class.size() < 1 || m168class.size() > 2) {
            throw new IllegalArgumentException(AbstractC0054e.premium(m168class, new StringBuilder("Bad sequence size: ")));
        }
        obj2.f32408e = Ctry.m4669interface(m168class.mo171interface(0));
        if (m168class.size() == 2) {
            obj2.f32407e = m168class.mo171interface(1);
            return obj2;
        }
        obj2.f32407e = null;
        return obj2;
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [default, catch, eًٌَ] */
    @Override // defpackage.Cextends, defpackage.subs
    public final Cdefault billing() {
        crashlytics crashlyticsVar = new crashlytics(2, 0);
        crashlyticsVar.appmetrica(this.f32408e);
        subs subsVar = this.f32407e;
        if (subsVar != null) {
            crashlyticsVar.appmetrica(subsVar);
        }
        ?? ccatch = new Ccatch(crashlyticsVar);
        ccatch.f20096e = -1;
        return ccatch;
    }
}
