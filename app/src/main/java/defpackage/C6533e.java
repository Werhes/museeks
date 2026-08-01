package defpackage;

import java.security.spec.AlgorithmParameterSpec;

/* renamed from: eؙٝۖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C6533e implements AlgorithmParameterSpec, InterfaceC17822e {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final String f13457e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final String f13458e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final String f13459e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final C0127e f13460e;

    public C6533e(C0127e c0127e) {
        this.f13460e = c0127e;
        this.f13457e = InterfaceC6859e.loadAd.m4673class();
        this.f13459e = null;
    }

    public C6533e(String str, String str2, String str3) {
        C4796e c4796e;
        try {
            c4796e = (C4796e) AbstractC10737e.vip.get(new Ctry(str));
        } catch (IllegalArgumentException unused) {
            Ctry ctry = (Ctry) AbstractC10737e.ad.get(str);
            if (ctry != null) {
                str = ctry.m4673class();
                c4796e = (C4796e) AbstractC10737e.vip.get(ctry);
            } else {
                c4796e = null;
            }
        }
        if (c4796e == null) {
            throw new IllegalArgumentException("no key parameter set for passed in name/OID.");
        }
        this.f13460e = new C0127e(c4796e.f10224e.crashlytics(), c4796e.f10223e.crashlytics(), c4796e.f10222e.crashlytics());
        this.f13458e = str;
        this.f13457e = str2;
        this.f13459e = str3;
    }

    public static C6533e ad(C17984e c17984e) {
        Ctry ctry = c17984e.f35277e;
        Ctry ctry2 = c17984e.f35278e;
        Ctry ctry3 = c17984e.f35279e;
        return ctry != null ? new C6533e(ctry3.m4673class(), ctry2.m4673class(), c17984e.f35277e.m4673class()) : ctry2 != null ? new C6533e(ctry3.m4673class(), ctry2.m4673class(), null) : new C6533e(ctry3.m4673class(), null, null);
    }

    public final boolean equals(Object obj) {
        Object obj2;
        String str;
        if (obj instanceof C6533e) {
            C6533e c6533e = (C6533e) obj;
            if (this.f13460e.equals(c6533e.f13460e) && ((str = this.f13457e) == (obj2 = c6533e.f13457e) || (str != null && str.equals(obj2)))) {
                Object obj3 = c6533e.f13459e;
                String str2 = this.f13459e;
                if (str2 == obj3) {
                    return true;
                }
                if (str2 != null && str2.equals(obj3)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.f13460e.hashCode() ^ this.f13457e.hashCode();
        String str = this.f13459e;
        return hashCode ^ (str != null ? str.hashCode() : 0);
    }
}
