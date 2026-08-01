package defpackage;

import java.math.BigInteger;

/* renamed from: eٍؚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C9300e extends Cextends implements InterfaceC16631e {

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public static final BigInteger f18528e = BigInteger.valueOf(1);

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public BigInteger f18529e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public C1324e f18530e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public C17586e f18531e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public BigInteger f18532e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public C6463e f18533e;

    /* JADX WARN: Type inference failed for: r0v0, types: [eؘ٘ۗ, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v14, types: [java.lang.Object, eؙٜ٘] */
    public C9300e(AbstractC0362e abstractC0362e, C1324e c1324e, BigInteger bigInteger, BigInteger bigInteger2, byte[] bArr) {
        C6463e c6463e;
        ?? obj = new Object();
        obj.f34436e = null;
        obj.f34438e = abstractC0362e;
        obj.f34437e = AbstractC12442e.license(bArr);
        InterfaceC13441e interfaceC13441e = abstractC0362e.ad;
        boolean appmetrica = AbstractC0853e.appmetrica(interfaceC13441e);
        Ctry ctry = InterfaceC16631e.f32629e;
        if (appmetrica) {
            obj.f34436e = ctry;
        } else {
            if (interfaceC13441e.ad() <= 1 || !interfaceC13441e.vip().equals(InterfaceC4563e.admob) || !(interfaceC13441e instanceof C12301e)) {
                throw new IllegalArgumentException("This type of ECCurve is not implemented");
            }
            obj.f34436e = InterfaceC16631e.f32655e;
        }
        this.f18531e = obj;
        this.f18530e = c1324e;
        this.f18532e = bigInteger;
        this.f18529e = bigInteger2;
        if (AbstractC0853e.appmetrica(interfaceC13441e)) {
            BigInteger vip = interfaceC13441e.vip();
            ?? obj2 = new Object();
            obj2.f13368e = ctry;
            obj2.f13367e = new Cthis(vip);
            c6463e = obj2;
        } else {
            if (interfaceC13441e.ad() <= 1 || !interfaceC13441e.vip().equals(InterfaceC4563e.admob) || !(interfaceC13441e instanceof C12301e)) {
                throw new IllegalArgumentException("'curve' is of an unsupported type");
            }
            int[] appmetrica2 = AbstractC12442e.appmetrica(((C12301e) interfaceC13441e).vip.ad);
            if (appmetrica2.length == 3) {
                c6463e = new C6463e(appmetrica2[2], appmetrica2[1], 0, 0);
            } else {
                if (appmetrica2.length != 5) {
                    throw new IllegalArgumentException("Only trinomial and pentomial curves are supported");
                }
                c6463e = new C6463e(appmetrica2[4], appmetrica2[1], appmetrica2[2], appmetrica2[3]);
            }
        }
        this.f18533e = c6463e;
    }

    /* JADX WARN: Type inference failed for: r15v0, types: [eؘ٘ۗ, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v0, types: [eٍؚ, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Object, eؙٜ٘] */
    public static C9300e loadAd(Object obj) {
        C6463e c6463e;
        int m4666native;
        int i;
        int i2;
        int i3;
        Ccatch ccatch;
        if (obj instanceof C9300e) {
            return (C9300e) obj;
        }
        if (obj == null) {
            return null;
        }
        Ccatch m168class = Ccatch.m168class(obj);
        ?? obj2 = new Object();
        if (!(m168class.mo171interface(0) instanceof Cthis) || !((Cthis) m168class.mo171interface(0)).m4663class(1)) {
            throw new IllegalArgumentException("bad version in X9ECParameters");
        }
        BigInteger firebase = ((Cthis) m168class.mo171interface(4)).firebase();
        obj2.f18532e = firebase;
        if (m168class.size() == 6) {
            obj2.f18529e = ((Cthis) m168class.mo171interface(5)).firebase();
        }
        subs mo171interface = m168class.mo171interface(1);
        if (mo171interface instanceof C6463e) {
            c6463e = (C6463e) mo171interface;
        } else if (mo171interface != null) {
            Ccatch m168class2 = Ccatch.m168class(mo171interface);
            ?? obj3 = new Object();
            obj3.f13368e = Ctry.m4669interface(m168class2.mo171interface(0));
            obj3.f13367e = m168class2.mo171interface(1).billing();
            c6463e = obj3;
        } else {
            c6463e = null;
        }
        obj2.f18533e = c6463e;
        BigInteger bigInteger = obj2.f18529e;
        Ccatch m168class3 = Ccatch.m168class(m168class.mo171interface(2));
        ?? obj4 = new Object();
        obj4.f34436e = null;
        Ctry ctry = c6463e.f13368e;
        Cdefault cdefault = c6463e.f13367e;
        obj4.f34436e = ctry;
        if (ctry.isVip(InterfaceC16631e.f32629e)) {
            obj4.f34438e = new C17328e(((Cthis) cdefault).firebase(), new BigInteger(1, Cprotected.subs(m168class3.mo171interface(0)).f36449e), new BigInteger(1, Cprotected.subs(m168class3.mo171interface(1)).f36449e), firebase, bigInteger, false);
            i3 = 2;
            ccatch = m168class3;
        } else {
            if (!obj4.f34436e.isVip(InterfaceC16631e.f32655e)) {
                throw new IllegalArgumentException("This type of ECCurve is not implemented");
            }
            Ccatch m168class4 = Ccatch.m168class(cdefault);
            int m4666native2 = ((Cthis) m168class4.mo171interface(0)).m4666native();
            Ctry ctry2 = (Ctry) m168class4.mo171interface(1);
            if (ctry2.isVip(InterfaceC16631e.f32641e)) {
                i = Cthis.subs(m168class4.mo171interface(2)).m4666native();
                m4666native = 0;
                i2 = 0;
            } else {
                if (!ctry2.isVip(InterfaceC16631e.f32644e)) {
                    throw new IllegalArgumentException("This type of EC basis is not implemented");
                }
                Ccatch m168class5 = Ccatch.m168class(m168class4.mo171interface(2));
                int m4666native3 = Cthis.subs(m168class5.mo171interface(0)).m4666native();
                int m4666native4 = Cthis.subs(m168class5.mo171interface(1)).m4666native();
                m4666native = Cthis.subs(m168class5.mo171interface(2)).m4666native();
                i = m4666native3;
                i2 = m4666native4;
            }
            i3 = 2;
            int i4 = m4666native;
            ccatch = m168class3;
            obj4.f34438e = new C13022e(m4666native2, i, i2, i4, new BigInteger(1, Cprotected.subs(m168class3.mo171interface(0)).f36449e), new BigInteger(1, Cprotected.subs(m168class3.mo171interface(1)).f36449e), firebase, bigInteger);
        }
        if (ccatch.size() == 3) {
            obj4.f34437e = ((C14458e) ccatch.mo171interface(i3)).crashlytics();
        }
        obj2.f18531e = obj4;
        subs mo171interface2 = m168class.mo171interface(3);
        if (mo171interface2 instanceof C1324e) {
            obj2.f18530e = (C1324e) mo171interface2;
            return obj2;
        }
        obj2.f18530e = new C1324e(obj4.f34438e, ((Cprotected) mo171interface2).f36449e);
        return obj2;
    }

    public final byte[] Signature() {
        return AbstractC12442e.license(this.f18531e.f34437e);
    }

    /* JADX WARN: Type inference failed for: r1v7, types: [default, catch, eًٌَ] */
    @Override // defpackage.Cextends, defpackage.subs
    public final Cdefault billing() {
        crashlytics crashlyticsVar = new crashlytics(6, 0);
        crashlyticsVar.appmetrica(new Cthis(f18528e));
        crashlyticsVar.appmetrica(this.f18533e);
        crashlyticsVar.appmetrica(this.f18531e);
        crashlyticsVar.appmetrica(this.f18530e);
        crashlyticsVar.appmetrica(new Cthis(this.f18532e));
        BigInteger bigInteger = this.f18529e;
        if (bigInteger != null) {
            crashlyticsVar.appmetrica(new Cthis(bigInteger));
        }
        ?? ccatch = new Ccatch(crashlyticsVar);
        ccatch.f20096e = -1;
        return ccatch;
    }
}
