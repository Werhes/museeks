package defpackage;

/* renamed from: eُۖٔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C11190e extends Cextends {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public C16312e f22452e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public C8477e f22453e;

    /* JADX WARN: Type inference failed for: r0v2, types: [eٌؕؑ, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, eُۖٔ] */
    public static C11190e loadAd(Object obj) {
        if (obj instanceof C11190e) {
            return (C11190e) obj;
        }
        C8477e c8477e = null;
        if (obj == null) {
            return null;
        }
        Ccatch m168class = Ccatch.m168class(obj);
        ?? obj2 = new Object();
        subs mo171interface = m168class.mo171interface(0);
        if (mo171interface instanceof C8477e) {
            c8477e = (C8477e) mo171interface;
        } else if (mo171interface != null) {
            firebase crashlytics = firebase.crashlytics(mo171interface);
            ?? obj3 = new Object();
            obj3.f17257e = crashlytics;
            c8477e = obj3;
        }
        obj2.f22453e = c8477e;
        if (m168class.size() == 2) {
            obj2.f22452e = C16312e.loadAd(Ccatch.firebase((Cstrictfp) m168class.mo171interface(1), true));
        }
        return obj2;
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [default, catch, eًٌَ] */
    @Override // defpackage.Cextends, defpackage.subs
    public final Cdefault billing() {
        crashlytics crashlyticsVar = new crashlytics(2, 0);
        crashlyticsVar.appmetrica(this.f22453e);
        C16312e c16312e = this.f22452e;
        if (c16312e != null) {
            crashlyticsVar.appmetrica(new Cstrictfp(true, 0, c16312e));
        }
        ?? ccatch = new Ccatch(crashlyticsVar);
        ccatch.f20096e = -1;
        return ccatch;
    }
}
