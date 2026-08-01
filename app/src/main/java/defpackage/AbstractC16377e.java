package defpackage;

import java.util.Enumeration;
import java.util.Vector;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٖٟٝ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC16377e {
    public static final C2892e ad = new C2892e(-752112598, false, new C14123e(23));
    public static final C2892e vip = new C2892e(-2120573208, false, new C14123e(24));

    public static void ad(Vector vector, Enumeration enumeration) {
        while (enumeration.hasMoreElements()) {
            vector.addElement(enumeration.nextElement());
        }
    }

    public static C9300e appmetrica(Ctry ctry) {
        AbstractC4068e abstractC4068e = (AbstractC4068e) AbstractC13720e.vip.get(ctry);
        C9300e license = abstractC4068e == null ? null : abstractC4068e.license();
        if (license == null) {
            AbstractC4068e abstractC4068e2 = (AbstractC4068e) AbstractC5335e.vip.get(ctry);
            license = abstractC4068e2 == null ? null : abstractC4068e2.license();
        }
        if (license == null) {
            AbstractC4068e abstractC4068e3 = (AbstractC4068e) AbstractC9632e.vip.get(ctry);
            license = abstractC4068e3 == null ? null : abstractC4068e3.license();
        }
        if (license == null) {
            AbstractC4068e abstractC4068e4 = (AbstractC4068e) pro.vip.get(ctry);
            license = abstractC4068e4 == null ? null : abstractC4068e4.license();
        }
        if (license == null) {
            license = AbstractC7899e.license(ctry);
        }
        if (license != null) {
            return license;
        }
        AbstractC4068e abstractC4068e5 = (AbstractC4068e) AbstractC17398e.vip.get(ctry);
        if (abstractC4068e5 == null) {
            return null;
        }
        return abstractC4068e5.license();
    }

    public static Enumeration billing() {
        Vector vector = new Vector();
        ad(vector, AbstractC13720e.ad.keys());
        ad(vector, AbstractC5335e.metrica.elements());
        ad(vector, AbstractC2208e.ad.keys());
        ad(vector, AbstractC9632e.metrica.elements());
        ad(vector, pro.metrica.elements());
        ad(vector, AbstractC7899e.metrica.elements());
        ad(vector, AbstractC17398e.metrica.elements());
        return vector.elements();
    }

    public static C9300e license(String str) {
        AbstractC4068e abstractC4068e;
        AbstractC4068e abstractC4068e2;
        AbstractC4068e abstractC4068e3;
        AbstractC4068e abstractC4068e4;
        AbstractC4068e abstractC4068e5;
        AbstractC4068e abstractC4068e6;
        Ctry ctry = (Ctry) AbstractC13720e.ad.get(AbstractC1433e.license(str));
        C9300e license = (ctry == null || (abstractC4068e = (AbstractC4068e) AbstractC13720e.vip.get(ctry)) == null) ? null : abstractC4068e.license();
        if (license == null) {
            Ctry ctry2 = (Ctry) AbstractC5335e.ad.get(AbstractC1433e.license(str));
            license = (ctry2 == null || (abstractC4068e6 = (AbstractC4068e) AbstractC5335e.vip.get(ctry2)) == null) ? null : abstractC4068e6.license();
        }
        if (license == null) {
            Ctry ctry3 = (Ctry) AbstractC2208e.ad.get(AbstractC1433e.billing(str));
            license = (ctry3 == null || (abstractC4068e5 = (AbstractC4068e) AbstractC5335e.vip.get(ctry3)) == null) ? null : abstractC4068e5.license();
        }
        if (license == null) {
            Ctry ctry4 = (Ctry) AbstractC9632e.ad.get(AbstractC1433e.license(str));
            license = (ctry4 == null || (abstractC4068e4 = (AbstractC4068e) AbstractC9632e.vip.get(ctry4)) == null) ? null : abstractC4068e4.license();
        }
        if (license == null) {
            Ctry ctry5 = (Ctry) pro.ad.get(AbstractC1433e.license(str));
            license = (ctry5 == null || (abstractC4068e3 = (AbstractC4068e) pro.vip.get(ctry5)) == null) ? null : abstractC4068e3.license();
        }
        if (license == null) {
            Ctry purchase = AbstractC7899e.purchase(str);
            license = purchase == null ? null : AbstractC7899e.license(purchase);
        }
        if (license != null) {
            return license;
        }
        Ctry ctry6 = (Ctry) AbstractC17398e.ad.get(AbstractC1433e.license(str));
        if (ctry6 == null || (abstractC4068e2 = (AbstractC4068e) AbstractC17398e.vip.get(ctry6)) == null) {
            return null;
        }
        return abstractC4068e2.license();
    }

    public static void metrica(String str, StringBuilder sb) {
        sb.append('\"');
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (charAt == '\n') {
                sb.append("%0A");
            } else if (charAt == '\r') {
                sb.append("%0D");
            } else if (charAt != '\"') {
                sb.append(charAt);
            } else {
                sb.append("%22");
            }
        }
        sb.append('\"');
    }

    public static String purchase(Ctry ctry) {
        String str = (String) AbstractC13720e.metrica.get(ctry);
        if (str == null) {
            str = (String) AbstractC5335e.metrica.get(ctry);
        }
        if (str == null) {
            str = (String) AbstractC2208e.vip.get(ctry);
        }
        if (str == null) {
            str = (String) AbstractC9632e.metrica.get(ctry);
        }
        if (str == null) {
            str = (String) pro.metrica.get(ctry);
        }
        if (str == null) {
            str = AbstractC7899e.appmetrica(ctry);
        }
        if (str == null) {
            str = (String) AbstractC17398e.metrica.get(ctry);
        }
        return str == null ? (String) AbstractC11301e.license.get(ctry) : str;
    }

    public static final void startapp(C2573e c2573e, int i, int i2) {
        c2573e.billing(AbstractC9262e.metrica(AbstractC3062e.metrica(i, 0, c2573e.f6429e.length()), AbstractC3062e.metrica(i2, 0, c2573e.f6429e.length())));
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0011, code lost:
    
        if (r0 == r1) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final long vip(int r2, int r3, int r4, long r5) {
        /*
            int r0 = defpackage.C12347e.billing(r5)
            int r1 = defpackage.C12347e.purchase(r5)
            if (r1 >= r2) goto Lb
            return r5
        Lb:
            if (r0 > r2) goto L17
            if (r3 > r1) goto L17
            int r3 = r3 - r2
            int r4 = r4 - r3
            if (r0 != r1) goto L14
            goto L22
        L14:
            int r2 = r1 + r4
            goto L2c
        L17:
            if (r0 <= r2) goto L1e
            if (r1 >= r3) goto L1e
            int r2 = r2 + r4
            r0 = r2
            goto L2c
        L1e:
            if (r0 < r3) goto L24
            int r3 = r3 - r2
            int r4 = r4 - r3
        L22:
            int r0 = r0 + r4
            goto L14
        L24:
            if (r2 >= r0) goto L2c
            int r0 = r2 + r4
            int r3 = r3 - r2
            int r4 = r4 - r3
            int r2 = r4 + r1
        L2c:
            long r2 = defpackage.AbstractC9262e.metrica(r0, r2)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC16377e.vip(int, int, int, long):long");
    }

    public static Ctry yandex(String str) {
        Ctry ctry = (Ctry) AbstractC13720e.ad.get(AbstractC1433e.license(str));
        if (ctry == null) {
            ctry = (Ctry) AbstractC5335e.ad.get(AbstractC1433e.license(str));
        }
        if (ctry == null) {
            ctry = (Ctry) AbstractC2208e.ad.get(AbstractC1433e.billing(str));
        }
        if (ctry == null) {
            ctry = (Ctry) AbstractC9632e.ad.get(AbstractC1433e.license(str));
        }
        if (ctry == null) {
            ctry = (Ctry) pro.ad.get(AbstractC1433e.license(str));
        }
        if (ctry == null) {
            ctry = AbstractC7899e.purchase(str);
        }
        if (ctry == null) {
            ctry = (Ctry) AbstractC17398e.ad.get(AbstractC1433e.license(str));
        }
        return (ctry == null && str.equals("curve25519")) ? AbstractC17363e.ad : ctry;
    }
}
