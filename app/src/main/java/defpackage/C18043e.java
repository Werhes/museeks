package defpackage;

/* renamed from: e٘۟ۡ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C18043e extends Cextends {

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public static final Cthis f35384e = new Cthis(0);

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public Ccatch f35385e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public C15300e f35386e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public Cthis f35387e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public Cinterface f35388e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public boolean f35389e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public C9216e f35390e;

    /* JADX WARN: Type inference failed for: r0v1, types: [e٘۟ۡ, java.lang.Object] */
    public static C18043e loadAd(Object obj) {
        C15300e c15300e;
        C15300e c15300e2;
        if (obj instanceof C18043e) {
            return (C18043e) obj;
        }
        if (obj == null) {
            return null;
        }
        Ccatch m168class = Ccatch.m168class(obj);
        ?? obj2 = new Object();
        int i = 0;
        boolean z = m168class.mo171interface(0) instanceof Cstrictfp;
        Cthis cthis = f35384e;
        if (z && ((Cstrictfp) m168class.mo171interface(0)).f36462e == 0) {
            obj2.f35389e = true;
            obj2.f35387e = (Cthis) Cthis.f36479e.m4616e((Cstrictfp) m168class.mo171interface(0), true);
            i = 1;
        } else {
            obj2.f35387e = cthis;
        }
        int i2 = i + 1;
        subs mo171interface = m168class.mo171interface(i);
        if (mo171interface instanceof C15300e) {
            c15300e2 = (C15300e) mo171interface;
        } else {
            if (mo171interface instanceof C12241e) {
                c15300e = new C15300e((C12241e) mo171interface);
            } else if (mo171interface instanceof Cstrictfp) {
                Cstrictfp cstrictfp = (Cstrictfp) mo171interface;
                if (cstrictfp.f36462e == 1) {
                    C12553e c12553e = C15466e.f30554e;
                    c15300e = new C15300e(C15466e.Signature((Ccatch) Ccatch.f640e.m4616e(cstrictfp, true)));
                } else {
                    AbstractC9947e.ad(cstrictfp);
                    inmobi inmobiVar = Cprotected.f36448e;
                    Cdefault crashlytics = cstrictfp.crashlytics(true, inmobiVar);
                    inmobiVar.m4630e(crashlytics);
                    c15300e = new C15300e((Cprotected) crashlytics);
                }
            } else {
                c15300e = new C15300e(C15466e.Signature(mo171interface));
            }
            c15300e2 = c15300e;
        }
        obj2.f35386e = c15300e2;
        int i3 = i + 2;
        obj2.f35388e = Cinterface.m4595class(m168class.mo171interface(i2));
        int i4 = i + 3;
        obj2.f35385e = (Ccatch) m168class.mo171interface(i3);
        if (m168class.size() > i4) {
            obj2.f35390e = C9216e.admob(Ccatch.firebase((Cstrictfp) m168class.mo171interface(i4), true));
        }
        return obj2;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [default, catch, eًٌَ] */
    @Override // defpackage.Cextends, defpackage.subs
    public final Cdefault billing() {
        Cthis cthis = this.f35387e;
        crashlytics crashlyticsVar = new crashlytics(5, 0);
        if (this.f35389e || !cthis.isVip(f35384e)) {
            crashlyticsVar.appmetrica(new Cstrictfp(true, 0, cthis));
        }
        crashlyticsVar.appmetrica(this.f35386e);
        crashlyticsVar.appmetrica(this.f35388e);
        crashlyticsVar.appmetrica(this.f35385e);
        C9216e c9216e = this.f35390e;
        if (c9216e != null) {
            crashlyticsVar.appmetrica(new Cstrictfp(true, 1, c9216e));
        }
        ?? ccatch = new Ccatch(crashlyticsVar);
        ccatch.f20096e = -1;
        return ccatch;
    }
}
