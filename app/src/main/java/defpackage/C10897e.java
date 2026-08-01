package defpackage;

import java.math.BigInteger;
import java.util.Enumeration;

/* renamed from: eٍُؑ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C10897e extends Cextends {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public BigInteger f21566e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public BigInteger f21567e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public BigInteger f21569e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public BigInteger f21570e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public BigInteger f21571e;

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public BigInteger f21572e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public BigInteger f21574e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public BigInteger f21575e;

    /* renamed from: eؙؔٞ, reason: contains not printable characters */
    public Ccatch f21568e = null;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public BigInteger f21573e = BigInteger.valueOf(0);

    public C10897e(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4, BigInteger bigInteger5, BigInteger bigInteger6, BigInteger bigInteger7, BigInteger bigInteger8) {
        this.f21569e = bigInteger;
        this.f21567e = bigInteger2;
        this.f21571e = bigInteger3;
        this.f21566e = bigInteger4;
        this.f21575e = bigInteger5;
        this.f21574e = bigInteger6;
        this.f21570e = bigInteger7;
        this.f21572e = bigInteger8;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [eٍُؑ, java.lang.Object] */
    public static C10897e loadAd(Object obj) {
        if (obj instanceof C10897e) {
            return (C10897e) obj;
        }
        if (obj == null) {
            return null;
        }
        Ccatch m168class = Ccatch.m168class(obj);
        ?? obj2 = new Object();
        obj2.f21568e = null;
        Enumeration mo170goto = m168class.mo170goto();
        Cthis cthis = (Cthis) mo170goto.nextElement();
        int m4666native = cthis.m4666native();
        if (m4666native < 0 || m4666native > 1) {
            throw new IllegalArgumentException("wrong version for RSA private key");
        }
        obj2.f21573e = cthis.firebase();
        obj2.f21569e = ((Cthis) mo170goto.nextElement()).firebase();
        obj2.f21567e = ((Cthis) mo170goto.nextElement()).firebase();
        obj2.f21571e = ((Cthis) mo170goto.nextElement()).firebase();
        obj2.f21566e = ((Cthis) mo170goto.nextElement()).firebase();
        obj2.f21575e = ((Cthis) mo170goto.nextElement()).firebase();
        obj2.f21574e = ((Cthis) mo170goto.nextElement()).firebase();
        obj2.f21570e = ((Cthis) mo170goto.nextElement()).firebase();
        obj2.f21572e = ((Cthis) mo170goto.nextElement()).firebase();
        if (mo170goto.hasMoreElements()) {
            obj2.f21568e = (Ccatch) mo170goto.nextElement();
        }
        return obj2;
    }

    /* JADX WARN: Type inference failed for: r1v11, types: [default, catch, eًٌَ] */
    @Override // defpackage.Cextends, defpackage.subs
    public final Cdefault billing() {
        crashlytics crashlyticsVar = new crashlytics(10, 0);
        crashlyticsVar.appmetrica(new Cthis(this.f21573e));
        crashlyticsVar.appmetrica(new Cthis(this.f21569e));
        crashlyticsVar.appmetrica(new Cthis(this.f21567e));
        crashlyticsVar.appmetrica(new Cthis(this.f21571e));
        crashlyticsVar.appmetrica(new Cthis(this.f21566e));
        crashlyticsVar.appmetrica(new Cthis(this.f21575e));
        crashlyticsVar.appmetrica(new Cthis(this.f21574e));
        crashlyticsVar.appmetrica(new Cthis(this.f21570e));
        crashlyticsVar.appmetrica(new Cthis(this.f21572e));
        Ccatch ccatch = this.f21568e;
        if (ccatch != null) {
            crashlyticsVar.appmetrica(ccatch);
        }
        ?? ccatch2 = new Ccatch(crashlyticsVar);
        ccatch2.f20096e = -1;
        return ccatch2;
    }
}
