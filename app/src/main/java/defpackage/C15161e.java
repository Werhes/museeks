package defpackage;

import java.util.Enumeration;

/* renamed from: eْٕؑ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C15161e extends Cextends {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public C12950e[] f30011e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public C12950e[] f30012e;

    /* JADX WARN: Type inference failed for: r0v0, types: [eْٕؑ, java.lang.Object] */
    public static C15161e Signature(Ccatch ccatch) {
        Ccatch m168class = Ccatch.m168class(ccatch);
        ?? obj = new Object();
        Enumeration mo170goto = m168class.mo170goto();
        while (mo170goto.hasMoreElements()) {
            Cstrictfp m4634class = Cstrictfp.m4634class(mo170goto.nextElement());
            int i = m4634class.f36462e;
            inmobi inmobiVar = Ccatch.f640e;
            if (i == 0) {
                AbstractC9947e.ad(m4634class);
                Cdefault crashlytics = m4634class.crashlytics(false, inmobiVar);
                inmobiVar.m4630e(crashlytics);
                obj.f30012e = loadAd((Ccatch) crashlytics);
            } else {
                if (i != 1) {
                    throw new IllegalArgumentException("Unknown tag encountered: " + m4634class.f36462e);
                }
                AbstractC9947e.ad(m4634class);
                Cdefault crashlytics2 = m4634class.crashlytics(false, inmobiVar);
                inmobiVar.m4630e(crashlytics2);
                obj.f30011e = loadAd((Ccatch) crashlytics2);
            }
        }
        return obj;
    }

    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object, eْؐۛ] */
    public static C12950e[] loadAd(Ccatch ccatch) {
        C12950e c12950e;
        Cstrictfp m4634class;
        int size = ccatch.size();
        C12950e[] c12950eArr = new C12950e[size];
        for (int i = 0; i != size; i++) {
            subs mo171interface = ccatch.mo171interface(i);
            int i2 = C12950e.f25805e;
            if (mo171interface == null) {
                c12950e = null;
            } else if (mo171interface instanceof C12950e) {
                c12950e = (C12950e) mo171interface;
            } else {
                Ccatch m168class = Ccatch.m168class(mo171interface);
                ?? obj = new Object();
                obj.f25808e = C5547e.loadAd(m168class.mo171interface(0));
                int size2 = m168class.size();
                if (size2 != 1) {
                    inmobi inmobiVar = Cthis.f36479e;
                    if (size2 == 2) {
                        m4634class = Cstrictfp.m4634class(m168class.mo171interface(1));
                        int i3 = m4634class.f36462e;
                        if (i3 == 0) {
                            AbstractC9947e.ad(m4634class);
                            Cdefault crashlytics = m4634class.crashlytics(false, inmobiVar);
                            inmobiVar.m4630e(crashlytics);
                            obj.f25807e = (Cthis) crashlytics;
                        } else if (i3 != 1) {
                            throw new IllegalArgumentException("Bad tag number: " + m4634class.f36462e);
                        }
                    } else {
                        if (size2 != 3) {
                            throw new IllegalArgumentException(AbstractC0054e.premium(m168class, new StringBuilder("Bad sequence size: ")));
                        }
                        Cstrictfp m4634class2 = Cstrictfp.m4634class(m168class.mo171interface(1));
                        if (m4634class2.f36462e != 0) {
                            throw new IllegalArgumentException("Bad tag number for 'minimum': " + m4634class2.f36462e);
                        }
                        AbstractC9947e.ad(m4634class2);
                        Cdefault crashlytics2 = m4634class2.crashlytics(false, inmobiVar);
                        inmobiVar.m4630e(crashlytics2);
                        obj.f25807e = (Cthis) crashlytics2;
                        m4634class = Cstrictfp.m4634class(m168class.mo171interface(2));
                        if (m4634class.f36462e != 1) {
                            throw new IllegalArgumentException("Bad tag number for 'maximum': " + m4634class.f36462e);
                        }
                    }
                    AbstractC9947e.ad(m4634class);
                    Cdefault crashlytics3 = m4634class.crashlytics(false, inmobiVar);
                    inmobiVar.m4630e(crashlytics3);
                    obj.f25806e = (Cthis) crashlytics3;
                }
                c12950e = obj;
            }
            c12950eArr[i] = c12950e;
        }
        return c12950eArr;
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [default, catch, eًٌَ] */
    @Override // defpackage.Cextends, defpackage.subs
    public final Cdefault billing() {
        crashlytics crashlyticsVar = new crashlytics(2, 0);
        C12950e[] c12950eArr = this.f30012e;
        if (c12950eArr != null) {
            crashlyticsVar.appmetrica(new Cstrictfp(false, 0, new C10154e(c12950eArr)));
        }
        C12950e[] c12950eArr2 = this.f30011e;
        if (c12950eArr2 != null) {
            crashlyticsVar.appmetrica(new Cstrictfp(false, 1, new C10154e(c12950eArr2)));
        }
        ?? ccatch = new Ccatch(crashlyticsVar);
        ccatch.f20096e = -1;
        return ccatch;
    }
}
