package defpackage;

/* renamed from: eّؔؐ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2284e extends Cextends {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public C14458e f5782e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public C16527e f5783e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public Ccatch f5784e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public C18043e f5785e;

    /* JADX WARN: Type inference failed for: r0v1, types: [eّؔؐ, java.lang.Object] */
    public static C2284e loadAd(Object obj) {
        if (obj instanceof C2284e) {
            return (C2284e) obj;
        }
        if (obj == null) {
            return null;
        }
        Ccatch m168class = Ccatch.m168class(obj);
        ?? obj2 = new Object();
        obj2.f5785e = C18043e.loadAd(m168class.mo171interface(0));
        obj2.f5783e = C16527e.loadAd(m168class.mo171interface(1));
        obj2.f5782e = (C14458e) m168class.mo171interface(2);
        if (m168class.size() > 3) {
            obj2.f5784e = Ccatch.firebase((Cstrictfp) m168class.mo171interface(3), true);
        }
        return obj2;
    }

    /* JADX WARN: Type inference failed for: r1v5, types: [default, catch, eًٌَ] */
    @Override // defpackage.Cextends, defpackage.subs
    public final Cdefault billing() {
        crashlytics crashlyticsVar = new crashlytics(4, 0);
        crashlyticsVar.appmetrica(this.f5785e);
        crashlyticsVar.appmetrica(this.f5783e);
        crashlyticsVar.appmetrica(this.f5782e);
        Ccatch ccatch = this.f5784e;
        if (ccatch != null) {
            crashlyticsVar.appmetrica(new Cstrictfp(true, 0, ccatch));
        }
        ?? ccatch2 = new Ccatch(crashlyticsVar);
        ccatch2.f20096e = -1;
        return ccatch2;
    }
}
