package defpackage;

/* renamed from: eَۣٔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C14643e extends Cextends {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public C15466e f28873e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public Cthis f28874e;

    /* renamed from: eؙؔٞ, reason: contains not printable characters */
    public isPro f28875e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public Cthis f28876e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public C3780e f28877e;

    /* renamed from: eٍۗۛ, reason: contains not printable characters */
    public C9216e f28878e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public C16527e f28879e;

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public isPro f28880e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public Ccatch f28881e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public C15466e f28882e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public C2582e f28883e;

    /* JADX WARN: Type inference failed for: r1v0, types: [eَۣٔ, java.lang.Object] */
    public static C14643e loadAd(Object obj) {
        int i;
        boolean z;
        boolean z2;
        if (obj instanceof C14643e) {
            return (C14643e) obj;
        }
        C2582e c2582e = null;
        if (obj == null) {
            return null;
        }
        Ccatch m168class = Ccatch.m168class(obj);
        ?? obj2 = new Object();
        obj2.f28881e = m168class;
        if (m168class.mo171interface(0) instanceof Cstrictfp) {
            obj2.f28876e = (Cthis) Cthis.f36479e.m4616e((Cstrictfp) m168class.mo171interface(0), true);
            i = 0;
        } else {
            obj2.f28876e = new Cthis(0L);
            i = -1;
        }
        if (obj2.f28876e.m4663class(0)) {
            z2 = false;
            z = true;
        } else if (obj2.f28876e.m4663class(1)) {
            z = false;
            z2 = true;
        } else {
            if (!obj2.f28876e.m4663class(2)) {
                throw new IllegalArgumentException("version number not recognised");
            }
            z = false;
            z2 = false;
        }
        obj2.f28874e = Cthis.subs(m168class.mo171interface(i + 1));
        obj2.f28879e = C16527e.loadAd(m168class.mo171interface(i + 2));
        obj2.f28873e = C15466e.Signature(m168class.mo171interface(i + 3));
        subs mo171interface = m168class.mo171interface(i + 4);
        if (mo171interface instanceof C2582e) {
            c2582e = (C2582e) mo171interface;
        } else if (mo171interface != null) {
            c2582e = new C2582e(Ccatch.m168class(mo171interface));
        }
        obj2.f28883e = c2582e;
        obj2.f28882e = C15466e.Signature(m168class.mo171interface(i + 5));
        int i2 = i + 6;
        obj2.f28877e = C3780e.loadAd(m168class.mo171interface(i2));
        int size = (m168class.size() - i2) - 1;
        if (size != 0 && z) {
            throw new IllegalArgumentException("version 1 certificate contains extra data");
        }
        while (size > 0) {
            Cstrictfp cstrictfp = (Cstrictfp) m168class.mo171interface(i2 + size);
            int i3 = cstrictfp.f36462e;
            inmobi inmobiVar = isPro.f36412e;
            if (i3 == 1) {
                AbstractC9947e.ad(cstrictfp);
                Cdefault crashlytics = cstrictfp.crashlytics(false, inmobiVar);
                inmobiVar.m4630e(crashlytics);
                obj2.f28880e = (isPro) crashlytics;
            } else if (i3 == 2) {
                AbstractC9947e.ad(cstrictfp);
                Cdefault crashlytics2 = cstrictfp.crashlytics(false, inmobiVar);
                inmobiVar.m4630e(crashlytics2);
                obj2.f28875e = (isPro) crashlytics2;
            } else {
                if (i3 != 3) {
                    throw new IllegalArgumentException("Unknown tag encountered in structure: " + cstrictfp.f36462e);
                }
                if (z2) {
                    throw new IllegalArgumentException("version 2 certificate cannot contain extensions");
                }
                AbstractC9947e.ad(cstrictfp);
                inmobi inmobiVar2 = Ccatch.f640e;
                Cdefault crashlytics3 = cstrictfp.crashlytics(true, inmobiVar2);
                inmobiVar2.m4630e(crashlytics3);
                obj2.f28878e = C9216e.admob((Ccatch) crashlytics3);
            }
            size--;
        }
        return obj2;
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [default, catch, eًٌَ] */
    @Override // defpackage.Cextends, defpackage.subs
    public final Cdefault billing() {
        Cthis cthis = this.f28876e;
        Ccatch ccatch = this.f28881e;
        if (ccatch != null && (AbstractC0361e.vip("org.bouncycastle.x509.allow_non-der_tbscert") == null || AbstractC0361e.metrica("org.bouncycastle.x509.allow_non-der_tbscert"))) {
            return ccatch;
        }
        crashlytics crashlyticsVar = new crashlytics(10, 0);
        if (!cthis.m4663class(0)) {
            crashlyticsVar.appmetrica(new Cstrictfp(true, 0, cthis));
        }
        crashlyticsVar.appmetrica(this.f28874e);
        crashlyticsVar.appmetrica(this.f28879e);
        crashlyticsVar.appmetrica(this.f28873e);
        crashlyticsVar.appmetrica(this.f28883e);
        crashlyticsVar.appmetrica(this.f28882e);
        crashlyticsVar.appmetrica(this.f28877e);
        isPro ispro = this.f28880e;
        if (ispro != null) {
            crashlyticsVar.appmetrica(new Cstrictfp(false, 1, ispro));
        }
        isPro ispro2 = this.f28875e;
        if (ispro2 != null) {
            crashlyticsVar.appmetrica(new Cstrictfp(false, 2, ispro2));
        }
        C9216e c9216e = this.f28878e;
        if (c9216e != null) {
            crashlyticsVar.appmetrica(new Cstrictfp(true, 3, c9216e));
        }
        ?? ccatch2 = new Ccatch(crashlyticsVar);
        ccatch2.f20096e = -1;
        return ccatch2;
    }
}
