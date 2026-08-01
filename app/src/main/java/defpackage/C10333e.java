package defpackage;

/* renamed from: eَٟ٘, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C10333e extends Cextends {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public boolean f20384e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public boolean f20385e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public boolean f20386e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public C3322e f20387e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public C17310e f20388e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public Ccatch f20389e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public boolean f20390e;

    /* JADX WARN: Type inference failed for: r0v1, types: [eَٟ٘, java.lang.Object] */
    public static C10333e Signature(Object obj) {
        if (obj instanceof C10333e) {
            return (C10333e) obj;
        }
        if (obj == null) {
            return null;
        }
        Ccatch m168class = Ccatch.m168class(obj);
        ?? obj2 = new Object();
        obj2.f20389e = m168class;
        for (int i = 0; i != m168class.size(); i++) {
            Cstrictfp m4634class = Cstrictfp.m4634class(m168class.mo171interface(i));
            int i2 = m4634class.f36462e;
            if (i2 != 0) {
                inmobi inmobiVar = ads.f3e;
                if (i2 == 1) {
                    AbstractC9947e.ad(m4634class);
                    Cdefault crashlytics = m4634class.crashlytics(false, inmobiVar);
                    inmobiVar.m4630e(crashlytics);
                    obj2.f20386e = ((ads) crashlytics).firebase();
                } else if (i2 == 2) {
                    AbstractC9947e.ad(m4634class);
                    Cdefault crashlytics2 = m4634class.crashlytics(false, inmobiVar);
                    inmobiVar.m4630e(crashlytics2);
                    obj2.f20385e = ((ads) crashlytics2).firebase();
                } else if (i2 == 3) {
                    AbstractC9947e.ad(m4634class);
                    inmobi inmobiVar2 = isPro.f36412e;
                    Cdefault crashlytics3 = m4634class.crashlytics(false, inmobiVar2);
                    inmobiVar2.m4630e(crashlytics3);
                    obj2.f20387e = new C3322e((isPro) crashlytics3);
                } else if (i2 == 4) {
                    AbstractC9947e.ad(m4634class);
                    Cdefault crashlytics4 = m4634class.crashlytics(false, inmobiVar);
                    inmobiVar.m4630e(crashlytics4);
                    obj2.f20384e = ((ads) crashlytics4).firebase();
                } else {
                    if (i2 != 5) {
                        throw new IllegalArgumentException("unknown tag in IssuingDistributionPoint");
                    }
                    AbstractC9947e.ad(m4634class);
                    Cdefault crashlytics5 = m4634class.crashlytics(false, inmobiVar);
                    inmobiVar.m4630e(crashlytics5);
                    obj2.f20390e = ((ads) crashlytics5).firebase();
                }
            } else {
                obj2.f20388e = C17310e.Signature(m4634class);
            }
        }
        return obj2;
    }

    public static void loadAd(StringBuilder sb, String str, String str2, String str3) {
        AbstractC13501e.Signature(sb, "    ", str2, ":", str);
        AbstractC13501e.Signature(sb, "    ", "    ", str3, str);
    }

    @Override // defpackage.Cextends, defpackage.subs
    public final Cdefault billing() {
        return this.f20389e;
    }

    public final String toString() {
        String str = AbstractC1433e.ad;
        StringBuilder isPro = AbstractC8703e.isPro("IssuingDistributionPoint: [", str);
        C17310e c17310e = this.f20388e;
        if (c17310e != null) {
            loadAd(isPro, str, "distributionPoint", c17310e.toString());
        }
        boolean z = this.f20386e;
        if (z) {
            loadAd(isPro, str, "onlyContainsUserCerts", z ? "true" : "false");
        }
        boolean z2 = this.f20385e;
        if (z2) {
            loadAd(isPro, str, "onlyContainsCACerts", z2 ? "true" : "false");
        }
        C3322e c3322e = this.f20387e;
        if (c3322e != null) {
            loadAd(isPro, str, "onlySomeReasons", c3322e.yandex());
        }
        boolean z3 = this.f20390e;
        if (z3) {
            loadAd(isPro, str, "onlyContainsAttributeCerts", z3 ? "true" : "false");
        }
        boolean z4 = this.f20384e;
        if (z4) {
            loadAd(isPro, str, "indirectCRL", z4 ? "true" : "false");
        }
        return AbstractC1786e.signatures(isPro, "]", str);
    }
}
