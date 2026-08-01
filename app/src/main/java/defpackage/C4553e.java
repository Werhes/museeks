package defpackage;

/* renamed from: eٌؗؐ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4553e extends Cextends {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public static final C16527e f9838e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public static final Cthis f9839e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public static final Cthis f9840e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public static final C16527e f9841e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public Cthis f9842e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public C16527e f9843e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public Cthis f9844e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public C16527e f9845e;

    static {
        C16527e c16527e = new C16527e(InterfaceC12598e.purchase, C0503e.f2592e);
        f9838e = c16527e;
        f9841e = new C16527e(InterfaceC5051e.f10781catch, c16527e);
        f9840e = new Cthis(20L);
        f9839e = new Cthis(1L);
    }

    public C4553e(C16527e c16527e, C16527e c16527e2, Cthis cthis, Cthis cthis2) {
        this.f9845e = c16527e;
        this.f9843e = c16527e2;
        this.f9842e = cthis;
        this.f9844e = cthis2;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, eٌؗؐ] */
    public static C4553e loadAd(Object obj) {
        if (obj instanceof C4553e) {
            return (C4553e) obj;
        }
        if (obj == null) {
            return null;
        }
        Ccatch m168class = Ccatch.m168class(obj);
        ?? obj2 = new Object();
        obj2.f9845e = f9838e;
        obj2.f9843e = f9841e;
        obj2.f9842e = f9840e;
        obj2.f9844e = f9839e;
        for (int i = 0; i != m168class.size(); i++) {
            Cstrictfp cstrictfp = (Cstrictfp) m168class.mo171interface(i);
            int i2 = cstrictfp.f36462e;
            inmobi inmobiVar = Ccatch.f640e;
            if (i2 == 0) {
                obj2.f9845e = C16527e.loadAd((Ccatch) inmobiVar.m4616e(cstrictfp, true));
            } else if (i2 != 1) {
                inmobi inmobiVar2 = Cthis.f36479e;
                if (i2 == 2) {
                    AbstractC9947e.ad(cstrictfp);
                    Cdefault crashlytics = cstrictfp.crashlytics(true, inmobiVar2);
                    inmobiVar2.m4630e(crashlytics);
                    obj2.f9842e = (Cthis) crashlytics;
                } else {
                    if (i2 != 3) {
                        throw new IllegalArgumentException("unknown tag");
                    }
                    AbstractC9947e.ad(cstrictfp);
                    Cdefault crashlytics2 = cstrictfp.crashlytics(true, inmobiVar2);
                    inmobiVar2.m4630e(crashlytics2);
                    obj2.f9844e = (Cthis) crashlytics2;
                }
            } else {
                obj2.f9843e = C16527e.loadAd((Ccatch) inmobiVar.m4616e(cstrictfp, true));
            }
        }
        return obj2;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [default, catch, eًٌَ] */
    @Override // defpackage.Cextends, defpackage.subs
    public final Cdefault billing() {
        Cthis cthis = this.f9844e;
        Cthis cthis2 = this.f9842e;
        C16527e c16527e = this.f9843e;
        crashlytics crashlyticsVar = new crashlytics(4, 0);
        C16527e c16527e2 = this.f9845e;
        if (!c16527e2.equals(f9838e)) {
            crashlyticsVar.appmetrica(new Cstrictfp(true, 0, c16527e2));
        }
        if (!c16527e.equals(f9841e)) {
            crashlyticsVar.appmetrica(new Cstrictfp(true, 1, c16527e));
        }
        if (!cthis2.isVip(f9840e)) {
            crashlyticsVar.appmetrica(new Cstrictfp(true, 2, cthis2));
        }
        if (!cthis.isVip(f9839e)) {
            crashlyticsVar.appmetrica(new Cstrictfp(true, 3, cthis));
        }
        ?? ccatch = new Ccatch(crashlyticsVar);
        ccatch.f20096e = -1;
        return ccatch;
    }
}
