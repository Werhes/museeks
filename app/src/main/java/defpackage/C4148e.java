package defpackage;

/* renamed from: eٖؖۢ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4148e extends Cdefault {

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public static final inmobi f9151e = new inmobi(4, C4148e.class);

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public Cdefault f9152e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public Cdefault f9153e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public Cthis f9154e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public int f9155e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public Ctry f9156e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final /* synthetic */ int f9157e;

    public /* synthetic */ C4148e() {
        this.f9157e = 0;
    }

    public C4148e(Ccatch ccatch, int i) {
        int i2;
        Cdefault billing;
        this.f9157e = i;
        Cdefault crashlytics = crashlytics(ccatch, 0);
        if (crashlytics instanceof Ctry) {
            this.f9156e = (Ctry) crashlytics;
            crashlytics = crashlytics(ccatch, 1);
            i2 = 1;
        } else {
            i2 = 0;
        }
        if (crashlytics instanceof Cthis) {
            this.f9154e = (Cthis) crashlytics;
            i2++;
            crashlytics = crashlytics(ccatch, i2);
        }
        if (!(crashlytics instanceof Cstrictfp)) {
            this.f9153e = crashlytics;
            i2++;
            crashlytics = crashlytics(ccatch, i2);
        }
        if (ccatch.size() != i2 + 1) {
            throw new IllegalArgumentException("input sequence too large");
        }
        if (!(crashlytics instanceof Cstrictfp)) {
            throw new IllegalArgumentException("No tagged object found in sequence. Structure doesn't seem to be of type External");
        }
        Cstrictfp cstrictfp = (Cstrictfp) crashlytics;
        int i3 = cstrictfp.f36462e;
        if (i3 < 0 || i3 > 2) {
            throw new IllegalArgumentException(AbstractC1786e.admob(i3, "invalid encoding value: "));
        }
        this.f9155e = i3;
        AbstractC9947e.ad(cstrictfp);
        if (i3 == 0) {
            billing = cstrictfp.firebase().billing();
        } else if (i3 == 1) {
            AbstractC9947e.ad(cstrictfp);
            inmobi inmobiVar = Cprotected.f36448e;
            Cdefault crashlytics2 = cstrictfp.crashlytics(false, inmobiVar);
            inmobiVar.m4630e(crashlytics2);
            billing = (Cprotected) crashlytics2;
        } else {
            if (i3 != 2) {
                throw new IllegalArgumentException("invalid tag: " + AbstractC9947e.vip(cstrictfp.f36463e, i3));
            }
            AbstractC9947e.ad(cstrictfp);
            inmobi inmobiVar2 = isPro.f36412e;
            Cdefault crashlytics3 = cstrictfp.crashlytics(false, inmobiVar2);
            inmobiVar2.m4630e(crashlytics3);
            billing = (isPro) crashlytics3;
        }
        this.f9152e = billing;
    }

    public static Cdefault crashlytics(Ccatch ccatch, int i) {
        if (ccatch.size() > i) {
            return ccatch.mo171interface(i).billing();
        }
        throw new IllegalArgumentException("too few objects in input sequence");
    }

    @Override // defpackage.Cdefault
    public final void Signature(C7850e c7850e, boolean z) {
        c7850e.m2343super(40, z);
        subs().Signature(c7850e, false);
    }

    @Override // defpackage.Cdefault
    public final boolean admob() {
        return true;
    }

    @Override // defpackage.Cdefault
    public Cdefault ads() {
        switch (this.f9157e) {
            case 0:
                return this;
            default:
                Ctry ctry = this.f9156e;
                Cthis cthis = this.f9154e;
                Cdefault cdefault = this.f9153e;
                int i = this.f9155e;
                Cdefault cdefault2 = this.f9152e;
                C4148e c4148e = new C4148e();
                c4148e.f9156e = ctry;
                c4148e.f9154e = cthis;
                c4148e.f9153e = cdefault;
                if (i < 0 || i > 2) {
                    throw new IllegalArgumentException(AbstractC1786e.admob(i, "invalid encoding value: "));
                }
                c4148e.f9155e = i;
                if (i != 1) {
                    if (i == 2 && !isPro.class.isInstance(cdefault2)) {
                        throw new IllegalStateException("unexpected object: ".concat(cdefault2.getClass().getName()));
                    }
                } else if (!Cprotected.class.isInstance(cdefault2)) {
                    throw new IllegalStateException("unexpected object: ".concat(cdefault2.getClass().getName()));
                }
                c4148e.f9152e = cdefault2;
                return c4148e;
        }
    }

    @Override // defpackage.Cdefault, defpackage.Cextends
    public final int hashCode() {
        Ctry ctry = this.f9156e;
        int hashCode = ctry == null ? 0 : ctry.hashCode();
        Cthis cthis = this.f9154e;
        int hashCode2 = hashCode ^ (cthis == null ? 0 : cthis.hashCode());
        Cdefault cdefault = this.f9153e;
        return ((hashCode2 ^ (cdefault != null ? cdefault.hashCode() : 0)) ^ this.f9155e) ^ this.f9152e.hashCode();
    }

    @Override // defpackage.Cdefault
    public final boolean loadAd(Cdefault cdefault) {
        if (this == cdefault) {
            return true;
        }
        if (!(cdefault instanceof C4148e)) {
            return false;
        }
        C4148e c4148e = (C4148e) cdefault;
        return AbstractC15268e.ad(this.f9156e, c4148e.f9156e) && AbstractC15268e.ad(this.f9154e, c4148e.f9154e) && AbstractC15268e.ad(this.f9153e, c4148e.f9153e) && this.f9155e == c4148e.f9155e && this.f9152e.isVip(c4148e.f9152e);
    }

    @Override // defpackage.Cdefault
    public final Cdefault premium() {
        int i = this.f9157e;
        return this;
    }

    @Override // defpackage.Cdefault
    public final int remoteconfig(boolean z) {
        return subs().remoteconfig(z);
    }

    /* JADX WARN: Type inference failed for: r1v12, types: [catch, eؚؖٚ] */
    /* JADX WARN: Type inference failed for: r1v5, types: [catch, eًٌَ] */
    public final Ccatch subs() {
        switch (this.f9157e) {
            case 0:
                crashlytics crashlyticsVar = new crashlytics(4, 0);
                Ctry ctry = this.f9156e;
                if (ctry != null) {
                    crashlyticsVar.appmetrica(ctry);
                }
                Cthis cthis = this.f9154e;
                if (cthis != null) {
                    crashlyticsVar.appmetrica(cthis);
                }
                Cdefault cdefault = this.f9153e;
                if (cdefault != null) {
                    crashlyticsVar.appmetrica(cdefault.ads());
                }
                int i = this.f9155e;
                crashlyticsVar.appmetrica(new Cstrictfp(i == 0, i, this.f9152e));
                ?? ccatch = new Ccatch(crashlyticsVar);
                ccatch.f20096e = -1;
                return ccatch;
            default:
                crashlytics crashlyticsVar2 = new crashlytics(4, 0);
                Ctry ctry2 = this.f9156e;
                if (ctry2 != null) {
                    crashlyticsVar2.appmetrica(ctry2);
                }
                Cthis cthis2 = this.f9154e;
                if (cthis2 != null) {
                    crashlyticsVar2.appmetrica(cthis2);
                }
                Cdefault cdefault2 = this.f9153e;
                if (cdefault2 != null) {
                    crashlyticsVar2.appmetrica(cdefault2.premium());
                }
                int i2 = this.f9155e;
                crashlyticsVar2.appmetrica(new Cstrictfp(i2 == 0, i2, this.f9152e));
                ?? ccatch2 = new Ccatch(crashlyticsVar2);
                ccatch2.f14196e = -1;
                return ccatch2;
        }
    }
}
