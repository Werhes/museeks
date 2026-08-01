package defpackage;

import java.util.Enumeration;

/* renamed from: eؚٕۘ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C7179e extends Cextends {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public isPro f14670e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public Cprotected f14671e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public C16527e f14672e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public Cfinal f14673e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public Cthis f14674e;

    public C7179e(C16527e c16527e, Cdefault cdefault, Cfinal cfinal) {
        this(c16527e, cdefault, cfinal, (byte[]) null);
    }

    public C7179e(C16527e c16527e, Cextends cextends, Cfinal cfinal, byte[] bArr) {
        this(c16527e, cextends.billing().smaato(), cfinal, bArr);
    }

    public C7179e(C16527e c16527e, byte[] bArr, Cfinal cfinal, byte[] bArr2) {
        this.f14674e = new Cthis(bArr2 != null ? AbstractC5907e.vip : AbstractC5907e.ad);
        this.f14672e = c16527e;
        this.f14671e = new Cprotected(bArr);
        this.f14673e = cfinal;
        this.f14670e = bArr2 == null ? null : new isPro(0, bArr2);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, eؚٕۘ] */
    public static C7179e loadAd(Object obj) {
        if (obj instanceof C7179e) {
            return (C7179e) obj;
        }
        if (obj == null) {
            return null;
        }
        Ccatch m168class = Ccatch.m168class(obj);
        ?? obj2 = new Object();
        Enumeration mo170goto = m168class.mo170goto();
        Cthis subs = Cthis.subs(mo170goto.nextElement());
        obj2.f14674e = subs;
        int m4666native = subs.m4666native();
        if (m4666native < 0 || m4666native > 1) {
            throw new IllegalArgumentException("invalid version for private key info");
        }
        obj2.f14672e = C16527e.loadAd(mo170goto.nextElement());
        obj2.f14671e = Cprotected.subs(mo170goto.nextElement());
        int i = -1;
        while (mo170goto.hasMoreElements()) {
            Cstrictfp cstrictfp = (Cstrictfp) mo170goto.nextElement();
            int i2 = cstrictfp.f36462e;
            if (i2 <= i) {
                throw new IllegalArgumentException("invalid optional field in private key info");
            }
            if (i2 == 0) {
                AbstractC9947e.ad(cstrictfp);
                inmobi inmobiVar = Cfinal.f36386e;
                Cdefault crashlytics = cstrictfp.crashlytics(false, inmobiVar);
                inmobiVar.m4630e(crashlytics);
                obj2.f14673e = (Cfinal) crashlytics;
            } else {
                if (i2 != 1) {
                    throw new IllegalArgumentException("unknown optional field in private key info");
                }
                if (m4666native < 1) {
                    throw new IllegalArgumentException("'publicKey' requires version v2(1) or later");
                }
                AbstractC9947e.ad(cstrictfp);
                inmobi inmobiVar2 = isPro.f36412e;
                Cdefault crashlytics2 = cstrictfp.crashlytics(false, inmobiVar2);
                inmobiVar2.m4630e(crashlytics2);
                obj2.f14670e = (isPro) crashlytics2;
            }
            i = i2;
        }
        return obj2;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [protected, eّؔۥ] */
    public final C12241e Signature() {
        return new Cprotected(this.f14671e.f36449e);
    }

    public final Cdefault admob() {
        return Cdefault.inmobi(this.f14671e.f36449e);
    }

    /* JADX WARN: Type inference failed for: r1v6, types: [default, catch, eًٌَ] */
    @Override // defpackage.Cextends, defpackage.subs
    public final Cdefault billing() {
        crashlytics crashlyticsVar = new crashlytics(5, 0);
        crashlyticsVar.appmetrica(this.f14674e);
        crashlyticsVar.appmetrica(this.f14672e);
        crashlyticsVar.appmetrica(this.f14671e);
        Cfinal cfinal = this.f14673e;
        if (cfinal != null) {
            crashlyticsVar.appmetrica(new Cstrictfp(false, 0, cfinal));
        }
        isPro ispro = this.f14670e;
        if (ispro != null) {
            crashlyticsVar.appmetrica(new Cstrictfp(false, 1, ispro));
        }
        ?? ccatch = new Ccatch(crashlyticsVar);
        ccatch.f20096e = -1;
        return ccatch;
    }
}
