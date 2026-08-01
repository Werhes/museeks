package defpackage;

/* renamed from: eِؐۤ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C11432e extends Cextends {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public C9216e f22978e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public Cinterface f22979e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public C17626e f22980e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public Cinterface f22981e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public C16013e f22982e;

    /* JADX WARN: Type inference failed for: r0v1, types: [eِؐۤ, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v6, types: [eً٘٘, java.lang.Object] */
    public static C11432e loadAd(subs subsVar) {
        C17626e c17626e;
        Cextends cextends;
        if (subsVar instanceof C11432e) {
            return (C11432e) subsVar;
        }
        if (subsVar == null) {
            return null;
        }
        Ccatch m168class = Ccatch.m168class(subsVar);
        ?? obj = new Object();
        obj.f22982e = C16013e.loadAd(m168class.mo171interface(0));
        subs mo171interface = m168class.mo171interface(1);
        inmobi inmobiVar = Ccatch.f640e;
        if (mo171interface == null || (mo171interface instanceof C17626e)) {
            c17626e = (C17626e) mo171interface;
        } else {
            if (!(mo171interface instanceof Cstrictfp)) {
                throw new IllegalArgumentException("unknown object in factory: ".concat(mo171interface.getClass().getName()));
            }
            Cstrictfp cstrictfp = (Cstrictfp) mo171interface;
            int i = cstrictfp.f36462e;
            ?? obj2 = new Object();
            inmobi inmobiVar2 = Cnative.f36442e;
            if (i != 0) {
                if (i == 1) {
                    cextends = C15831e.loadAd((Ccatch) inmobiVar.m4616e(cstrictfp, false));
                    obj2.f34547e = cextends;
                    obj2.f34548e = i;
                    c17626e = obj2;
                } else if (i != 2) {
                    throw new IllegalArgumentException("Unknown tag encountered: " + AbstractC9947e.vip(cstrictfp.f36463e, i));
                }
            }
            AbstractC9947e.ad(cstrictfp);
            Cdefault crashlytics = cstrictfp.crashlytics(false, inmobiVar2);
            inmobiVar2.m4630e(crashlytics);
            cextends = (Cnative) crashlytics;
            obj2.f34547e = cextends;
            obj2.f34548e = i;
            c17626e = obj2;
        }
        obj.f22980e = c17626e;
        obj.f22979e = Cinterface.m4595class(m168class.mo171interface(2));
        int size = m168class.size();
        inmobi inmobiVar3 = Cinterface.f36407e;
        if (size > 4) {
            obj.f22981e = (Cinterface) inmobiVar3.m4616e((Cstrictfp) m168class.mo171interface(3), true);
            obj.f22978e = C9216e.admob(Ccatch.firebase((Cstrictfp) m168class.mo171interface(4), true));
            return obj;
        }
        if (m168class.size() > 3) {
            Cstrictfp cstrictfp2 = (Cstrictfp) m168class.mo171interface(3);
            if (cstrictfp2.f36462e == 0) {
                AbstractC9947e.ad(cstrictfp2);
                Cdefault crashlytics2 = cstrictfp2.crashlytics(true, inmobiVar3);
                inmobiVar3.m4630e(crashlytics2);
                obj.f22981e = (Cinterface) crashlytics2;
                return obj;
            }
            obj.f22978e = C9216e.admob((Ccatch) inmobiVar.m4616e(cstrictfp2, true));
        }
        return obj;
    }

    /* JADX WARN: Type inference failed for: r1v6, types: [default, catch, eًٌَ] */
    @Override // defpackage.Cextends, defpackage.subs
    public final Cdefault billing() {
        crashlytics crashlyticsVar = new crashlytics(5, 0);
        crashlyticsVar.appmetrica(this.f22982e);
        crashlyticsVar.appmetrica(this.f22980e);
        crashlyticsVar.appmetrica(this.f22979e);
        Cinterface cinterface = this.f22981e;
        if (cinterface != null) {
            crashlyticsVar.appmetrica(new Cstrictfp(true, 0, cinterface));
        }
        C9216e c9216e = this.f22978e;
        if (c9216e != null) {
            crashlyticsVar.appmetrica(new Cstrictfp(true, 1, c9216e));
        }
        ?? ccatch = new Ccatch(crashlyticsVar);
        ccatch.f20096e = -1;
        return ccatch;
    }
}
