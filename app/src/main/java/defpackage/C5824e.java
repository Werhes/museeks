package defpackage;

/* renamed from: eؘۖۙ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5824e extends Cextends {

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public Ccatch f12272e;

    /* JADX WARN: Type inference failed for: r0v1, types: [eؘۖۙ, java.lang.Object] */
    public static C5824e Signature(Object obj) {
        if (obj instanceof C5824e) {
            return (C5824e) obj;
        }
        if (obj == null) {
            return null;
        }
        Ccatch m168class = Ccatch.m168class(obj);
        ?? obj2 = new Object();
        obj2.f12272e = m168class;
        return obj2;
    }

    @Override // defpackage.Cextends, defpackage.subs
    public final Cdefault billing() {
        return this.f12272e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [eٌْۚ[]] */
    /* JADX WARN: Type inference failed for: r5v1, types: [eٌْۚ] */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v5, types: [java.lang.Object, eٌْۚ] */
    public final C13147e[] loadAd() {
        ?? r5;
        Ccatch ccatch = this.f12272e;
        ?? r1 = new C13147e[ccatch.size()];
        for (int i = 0; i != ccatch.size(); i++) {
            subs mo171interface = ccatch.mo171interface(i);
            if (mo171interface == null || (mo171interface instanceof C13147e)) {
                r5 = (C13147e) mo171interface;
            } else {
                if (!(mo171interface instanceof Ccatch)) {
                    throw new IllegalArgumentException("Invalid DistributionPoint: ".concat(mo171interface.getClass().getName()));
                }
                Ccatch ccatch2 = (Ccatch) mo171interface;
                r5 = new Object();
                for (int i2 = 0; i2 != ccatch2.size(); i2++) {
                    Cstrictfp m4634class = Cstrictfp.m4634class(ccatch2.mo171interface(i2));
                    int i3 = m4634class.f36462e;
                    if (i3 == 0) {
                        r5.f26131e = C17310e.Signature(m4634class);
                    } else if (i3 == 1) {
                        AbstractC9947e.ad(m4634class);
                        inmobi inmobiVar = isPro.f36412e;
                        Cdefault crashlytics = m4634class.crashlytics(false, inmobiVar);
                        inmobiVar.m4630e(crashlytics);
                        r5.f26130e = new C3322e((isPro) crashlytics);
                    } else {
                        if (i3 != 2) {
                            throw new IllegalArgumentException("Unknown tag encountered in structure: " + m4634class.f36462e);
                        }
                        r5.f26129e = new C9120e((Ccatch) Ccatch.f640e.m4616e(m4634class, false));
                    }
                }
            }
            r1[i] = r5;
        }
        return r1;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CRLDistPoint:");
        String str = AbstractC1433e.ad;
        sb.append(str);
        C13147e[] loadAd = loadAd();
        for (int i = 0; i != loadAd.length; i++) {
            sb.append("    ");
            sb.append(loadAd[i]);
            sb.append(str);
        }
        return sb.toString();
    }
}
