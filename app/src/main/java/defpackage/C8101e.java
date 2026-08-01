package defpackage;

import java.math.BigInteger;
import java.util.Enumeration;

/* renamed from: eًٞۚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C8101e extends Cextends {

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public Ccatch f16450e;

    /* JADX WARN: Type inference failed for: r4v5, types: [catch, eًٌَ] */
    public C8101e(int i, BigInteger bigInteger, isPro ispro, C14004e c14004e) {
        byte[] ad = AbstractC5907e.ad((i + 7) / 8, bigInteger);
        crashlytics crashlyticsVar = new crashlytics(4, 0);
        crashlyticsVar.appmetrica(new Cthis(1L));
        crashlyticsVar.appmetrica(new Cprotected(ad));
        if (c14004e != null) {
            crashlyticsVar.appmetrica(new Cstrictfp(true, 0, c14004e));
        }
        if (ispro != null) {
            crashlyticsVar.appmetrica(new Cstrictfp(true, 1, ispro));
        }
        ?? ccatch = new Ccatch(crashlyticsVar);
        ccatch.f20096e = -1;
        this.f16450e = ccatch;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [eًٞۚ, java.lang.Object] */
    public static C8101e loadAd(Object obj) {
        if (obj instanceof C8101e) {
            return (C8101e) obj;
        }
        if (obj == null) {
            return null;
        }
        Ccatch m168class = Ccatch.m168class(obj);
        ?? obj2 = new Object();
        obj2.f16450e = m168class;
        return obj2;
    }

    public final BigInteger Signature() {
        return new BigInteger(1, ((Cprotected) this.f16450e.mo171interface(1)).f36449e);
    }

    public final Cdefault admob(int i, int i2) {
        Enumeration mo170goto = this.f16450e.mo170goto();
        while (mo170goto.hasMoreElements()) {
            subs subsVar = (subs) mo170goto.nextElement();
            if (subsVar instanceof Cstrictfp) {
                Cstrictfp cstrictfp = (Cstrictfp) subsVar;
                if (cstrictfp.f36463e == 128 && cstrictfp.f36462e == i) {
                    return i2 < 0 ? cstrictfp.firebase().billing() : cstrictfp.subs(i2);
                }
            }
        }
        return null;
    }

    @Override // defpackage.Cextends, defpackage.subs
    public final Cdefault billing() {
        return this.f16450e;
    }
}
