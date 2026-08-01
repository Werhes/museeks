package defpackage;

/* renamed from: eّؑۡ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0273e extends Cextends {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public Ccatch f2273e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public Ctry f2274e;

    /* JADX WARN: Type inference failed for: r0v1, types: [eّؑۡ, java.lang.Object] */
    public static C0273e loadAd(Object obj) {
        if (obj == null || (obj instanceof C0273e)) {
            return (C0273e) obj;
        }
        Ccatch m168class = Ccatch.m168class(obj);
        ?? obj2 = new Object();
        if (m168class.size() < 1 || m168class.size() > 2) {
            throw new IllegalArgumentException(AbstractC0054e.premium(m168class, new StringBuilder("Bad sequence size: ")));
        }
        obj2.f2274e = Ctry.m4669interface(m168class.mo171interface(0));
        if (m168class.size() > 1) {
            obj2.f2273e = Ccatch.m168class(m168class.mo171interface(1));
        }
        return obj2;
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [default, catch, eًٌَ] */
    @Override // defpackage.Cextends, defpackage.subs
    public final Cdefault billing() {
        crashlytics crashlyticsVar = new crashlytics(2, 0);
        crashlyticsVar.appmetrica(this.f2274e);
        Ccatch ccatch = this.f2273e;
        if (ccatch != null) {
            crashlyticsVar.appmetrica(ccatch);
        }
        ?? ccatch2 = new Ccatch(crashlyticsVar);
        ccatch2.f20096e = -1;
        return ccatch2;
    }

    /* JADX WARN: Type inference failed for: r6v1, types: [eّٞٔ, java.lang.Object] */
    public final String toString() {
        C12627e c12627e;
        StringBuilder sb = new StringBuilder("Policy information: ");
        sb.append(this.f2274e);
        Ccatch ccatch = this.f2273e;
        if (ccatch != null) {
            StringBuilder sb2 = new StringBuilder();
            for (int i = 0; i < ccatch.size(); i++) {
                if (sb2.length() != 0) {
                    sb2.append(", ");
                }
                subs mo171interface = ccatch.mo171interface(i);
                if (mo171interface instanceof C12627e) {
                    c12627e = (C12627e) mo171interface;
                } else if (mo171interface != null) {
                    Ccatch m168class = Ccatch.m168class(mo171interface);
                    ?? obj = new Object();
                    if (m168class.size() != 2) {
                        throw new IllegalArgumentException(AbstractC0054e.premium(m168class, new StringBuilder("Bad sequence size: ")));
                    }
                    obj.f25342e = Ctry.m4669interface(m168class.mo171interface(0));
                    obj.f25341e = m168class.mo171interface(1);
                    c12627e = obj;
                } else {
                    c12627e = null;
                }
                sb2.append(c12627e);
            }
            sb.append("[");
            sb.append((CharSequence) sb2);
            sb.append("]");
        }
        return sb.toString();
    }
}
