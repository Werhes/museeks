package defpackage;

import java.math.BigInteger;
import java.util.Enumeration;

/* renamed from: eُ٘, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C17676e extends Cextends {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public Cthis f34639e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public Cthis f34640e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public Cthis f34641e;

    public C17676e(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3) {
        this.f34641e = new Cthis(bigInteger);
        this.f34640e = new Cthis(bigInteger2);
        this.f34639e = new Cthis(bigInteger3);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, eُ٘] */
    public static C17676e loadAd(Object obj) {
        if (obj instanceof C17676e) {
            return (C17676e) obj;
        }
        if (obj == null) {
            return null;
        }
        Ccatch m168class = Ccatch.m168class(obj);
        ?? obj2 = new Object();
        if (m168class.size() != 3) {
            throw new IllegalArgumentException(AbstractC0054e.premium(m168class, new StringBuilder("Bad sequence size: ")));
        }
        Enumeration mo170goto = m168class.mo170goto();
        obj2.f34641e = Cthis.subs(mo170goto.nextElement());
        obj2.f34640e = Cthis.subs(mo170goto.nextElement());
        obj2.f34639e = Cthis.subs(mo170goto.nextElement());
        return obj2;
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [default, catch, eًٌَ] */
    @Override // defpackage.Cextends, defpackage.subs
    public final Cdefault billing() {
        crashlytics crashlyticsVar = new crashlytics(3, 0);
        crashlyticsVar.appmetrica(this.f34641e);
        crashlyticsVar.appmetrica(this.f34640e);
        crashlyticsVar.appmetrica(this.f34639e);
        ?? ccatch = new Ccatch(crashlyticsVar);
        ccatch.f20096e = -1;
        return ccatch;
    }
}
