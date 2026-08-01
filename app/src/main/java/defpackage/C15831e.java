package defpackage;

/* renamed from: eٕۤۜ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C15831e extends Cextends {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public C17759e f31258e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public Cinterface f31259e;

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, eٕۤۜ] */
    public static C15831e loadAd(Cextends cextends) {
        if (cextends instanceof C15831e) {
            return (C15831e) cextends;
        }
        if (cextends == null) {
            return null;
        }
        Ccatch m168class = Ccatch.m168class(cextends);
        ?? obj = new Object();
        obj.f31259e = Cinterface.m4595class(m168class.mo171interface(0));
        if (m168class.size() > 1) {
            obj.f31258e = C17759e.loadAd((firebase) firebase.f36391e.m4616e((Cstrictfp) m168class.mo171interface(1), true));
        }
        return obj;
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [default, catch, eًٌَ] */
    @Override // defpackage.Cextends, defpackage.subs
    public final Cdefault billing() {
        crashlytics crashlyticsVar = new crashlytics(2, 0);
        crashlyticsVar.appmetrica(this.f31259e);
        C17759e c17759e = this.f31258e;
        if (c17759e != null) {
            crashlyticsVar.appmetrica(new Cstrictfp(true, 0, c17759e));
        }
        ?? ccatch = new Ccatch(crashlyticsVar);
        ccatch.f20096e = -1;
        return ccatch;
    }
}
