package defpackage;

import java.math.BigInteger;
import java.util.Enumeration;

/* renamed from: eؚّؕ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3204e extends Cextends {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public Cthis f7320e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public Cthis f7321e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public Cthis f7322e;

    public C3204e(int i, BigInteger bigInteger, BigInteger bigInteger2) {
        this.f7322e = new Cthis(bigInteger);
        this.f7321e = new Cthis(bigInteger2);
        if (i != 0) {
            this.f7320e = new Cthis(i);
        } else {
            this.f7320e = null;
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [eؚّؕ, java.lang.Object] */
    public static C3204e loadAd(Object obj) {
        if (obj instanceof C3204e) {
            return (C3204e) obj;
        }
        if (obj == null) {
            return null;
        }
        Ccatch m168class = Ccatch.m168class(obj);
        ?? obj2 = new Object();
        Enumeration mo170goto = m168class.mo170goto();
        obj2.f7322e = Cthis.subs(mo170goto.nextElement());
        obj2.f7321e = Cthis.subs(mo170goto.nextElement());
        if (mo170goto.hasMoreElements()) {
            obj2.f7320e = (Cthis) mo170goto.nextElement();
            return obj2;
        }
        obj2.f7320e = null;
        return obj2;
    }

    public final BigInteger Signature() {
        Cthis cthis = this.f7320e;
        if (cthis == null) {
            return null;
        }
        return cthis.crashlytics();
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [default, catch, eًٌَ] */
    @Override // defpackage.Cextends, defpackage.subs
    public final Cdefault billing() {
        crashlytics crashlyticsVar = new crashlytics(3, 0);
        crashlyticsVar.appmetrica(this.f7322e);
        crashlyticsVar.appmetrica(this.f7321e);
        if (Signature() != null) {
            crashlyticsVar.appmetrica(this.f7320e);
        }
        ?? ccatch = new Ccatch(crashlyticsVar);
        ccatch.f20096e = -1;
        return ccatch;
    }
}
