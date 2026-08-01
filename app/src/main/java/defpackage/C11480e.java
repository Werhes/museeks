package defpackage;

/* renamed from: eِؓٚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C11480e extends Cextends {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public C12855e f23084e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public byte[] f23085e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public byte[] f23086e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public byte[] f23087e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public int f23088e;

    /* JADX WARN: Type inference failed for: r0v2, types: [eؚّۤ, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v0, types: [eِؓٚ, java.lang.Object] */
    public static C11480e loadAd(Cdefault cdefault) {
        C12855e c12855e = null;
        if (cdefault == null) {
            return null;
        }
        Ccatch m168class = Ccatch.m168class(cdefault);
        ?? obj = new Object();
        int m4666native = Cthis.subs(m168class.mo171interface(0)).m4666native();
        obj.f23088e = m4666native;
        if (m4666native != 0) {
            throw new IllegalArgumentException("unrecognized version");
        }
        obj.f23086e = AbstractC12442e.license(Cprotected.subs(m168class.mo171interface(1)).f36449e);
        obj.f23085e = AbstractC12442e.license(Cprotected.subs(m168class.mo171interface(2)).f36449e);
        obj.f23087e = AbstractC12442e.license(Cprotected.subs(m168class.mo171interface(3)).f36449e);
        if (m168class.size() == 5) {
            subs mo171interface = m168class.mo171interface(4);
            if (mo171interface instanceof C12855e) {
                c12855e = (C12855e) mo171interface;
            } else if (mo171interface != null) {
                Ccatch m168class2 = Ccatch.m168class(mo171interface);
                ?? obj2 = new Object();
                obj2.f25683e = AbstractC12442e.license(Cprotected.subs(m168class2.mo171interface(0)).f36449e);
                c12855e = obj2;
            }
            obj.f23084e = c12855e;
        }
        return obj;
    }

    /* JADX WARN: Type inference failed for: r1v6, types: [default, catch, eًٌَ] */
    @Override // defpackage.Cextends, defpackage.subs
    public final Cdefault billing() {
        crashlytics crashlyticsVar = new crashlytics((byte) 0, 0);
        crashlyticsVar.appmetrica(new Cthis(this.f23088e));
        crashlyticsVar.appmetrica(new Cprotected(this.f23086e));
        crashlyticsVar.appmetrica(new Cprotected(this.f23085e));
        crashlyticsVar.appmetrica(new Cprotected(this.f23087e));
        C12855e c12855e = this.f23084e;
        if (c12855e != null) {
            crashlyticsVar.appmetrica(new C12855e(c12855e.f25683e));
        }
        ?? ccatch = new Ccatch(crashlyticsVar);
        ccatch.f20096e = -1;
        return ccatch;
    }
}
