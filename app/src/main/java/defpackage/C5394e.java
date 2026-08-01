package defpackage;

import java.math.BigInteger;
import java.util.Enumeration;

/* renamed from: eؘؓۦ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5394e extends Cextends {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final C3816e f11548e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final Cthis f11549e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final Cthis f11550e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final Cthis f11551e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final Cthis f11552e;

    /* JADX WARN: Type inference failed for: r1v5, types: [eؖؑٗ, java.lang.Object] */
    public C5394e(Ccatch ccatch) {
        if (ccatch.size() < 3 || ccatch.size() > 5) {
            throw new IllegalArgumentException(AbstractC0054e.premium(ccatch, new StringBuilder("Bad sequence size: ")));
        }
        Enumeration mo170goto = ccatch.mo170goto();
        this.f11552e = Cthis.subs(mo170goto.nextElement());
        this.f11550e = Cthis.subs(mo170goto.nextElement());
        this.f11549e = Cthis.subs(mo170goto.nextElement());
        C3816e c3816e = null;
        subs subsVar = mo170goto.hasMoreElements() ? (subs) mo170goto.nextElement() : null;
        if (subsVar == null || !(subsVar instanceof Cthis)) {
            this.f11551e = null;
        } else {
            this.f11551e = Cthis.subs(subsVar);
            subsVar = mo170goto.hasMoreElements() ? (subs) mo170goto.nextElement() : null;
        }
        if (subsVar == null) {
            this.f11548e = null;
            return;
        }
        Cdefault billing = subsVar.billing();
        if (billing != null) {
            Ccatch m168class = Ccatch.m168class(billing);
            ?? obj = new Object();
            if (m168class.size() != 2) {
                throw new IllegalArgumentException(AbstractC0054e.premium(m168class, new StringBuilder("Bad sequence size: ")));
            }
            obj.f8443e = isPro.firebase(m168class.mo171interface(0));
            obj.f8442e = Cthis.subs(m168class.mo171interface(1));
            c3816e = obj;
        }
        this.f11548e = c3816e;
    }

    public static C5394e loadAd(Object obj) {
        if (obj instanceof C5394e) {
            return (C5394e) obj;
        }
        if (obj != null) {
            return new C5394e(Ccatch.m168class(obj));
        }
        return null;
    }

    public final BigInteger Signature() {
        Cthis cthis = this.f11551e;
        if (cthis == null) {
            return null;
        }
        return cthis.crashlytics();
    }

    /* JADX WARN: Type inference failed for: r1v6, types: [default, catch, eًٌَ] */
    @Override // defpackage.Cextends, defpackage.subs
    public final Cdefault billing() {
        crashlytics crashlyticsVar = new crashlytics(5, 0);
        crashlyticsVar.appmetrica(this.f11552e);
        crashlyticsVar.appmetrica(this.f11550e);
        crashlyticsVar.appmetrica(this.f11549e);
        Cthis cthis = this.f11551e;
        if (cthis != null) {
            crashlyticsVar.appmetrica(cthis);
        }
        C3816e c3816e = this.f11548e;
        if (c3816e != null) {
            crashlyticsVar.appmetrica(c3816e);
        }
        ?? ccatch = new Ccatch(crashlyticsVar);
        ccatch.f20096e = -1;
        return ccatch;
    }
}
