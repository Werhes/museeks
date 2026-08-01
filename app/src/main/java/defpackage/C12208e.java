package defpackage;

import java.util.Enumeration;

/* renamed from: eّؓؔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C12208e extends Cextends {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public C2960e f24513e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public C2960e f24514e;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, eّؓؔ] */
    public static C12208e loadAd(Cdefault cdefault) {
        if (cdefault == 0) {
            return (C12208e) cdefault;
        }
        if (!(cdefault instanceof Ccatch)) {
            throw new IllegalArgumentException("illegal object in getInstance: ".concat(cdefault.getClass().getName()));
        }
        Ccatch ccatch = (Ccatch) cdefault;
        ?? obj = new Object();
        if (ccatch.size() != 1 && ccatch.size() != 2) {
            throw new IllegalArgumentException(AbstractC0054e.premium(ccatch, new StringBuilder("Bad sequence size: ")));
        }
        Enumeration mo170goto = ccatch.mo170goto();
        while (mo170goto.hasMoreElements()) {
            Cstrictfp m4634class = Cstrictfp.m4634class(mo170goto.nextElement());
            int i = m4634class.f36462e;
            inmobi inmobiVar = Ccatch.f640e;
            if (i == 0) {
                obj.f24514e = C2960e.loadAd((Ccatch) inmobiVar.m4616e(m4634class, true));
            } else {
                if (i != 1) {
                    throw new IllegalArgumentException("Bad tag number: " + m4634class.f36462e);
                }
                obj.f24513e = C2960e.loadAd((Ccatch) inmobiVar.m4616e(m4634class, true));
            }
        }
        return obj;
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [default, catch, eًٌَ] */
    @Override // defpackage.Cextends, defpackage.subs
    public final Cdefault billing() {
        crashlytics crashlyticsVar = new crashlytics(2, 0);
        C2960e c2960e = this.f24514e;
        if (c2960e != null) {
            crashlyticsVar.appmetrica(new Cstrictfp(true, 0, c2960e));
        }
        C2960e c2960e2 = this.f24513e;
        if (c2960e2 != null) {
            crashlyticsVar.appmetrica(new Cstrictfp(true, 1, c2960e2));
        }
        ?? ccatch = new Ccatch(crashlyticsVar);
        ccatch.f20096e = -1;
        return ccatch;
    }
}
