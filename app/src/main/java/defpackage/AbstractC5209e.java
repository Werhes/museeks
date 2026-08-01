package defpackage;

import java.io.Serializable;
import java.util.Iterator;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؗۡٚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC5209e {
    public static final C2892e ad = new C2892e(665120949, false, new C14234e(6));
    public static final C2892e vip = new C2892e(1775959061, false, new C14234e(15));
    public static final C2892e metrica = new C2892e(-1184022757, false, new C17240e(16));
    public static final C2892e license = new C2892e(2141322025, false, new C17240e(17));
    public static final C2892e appmetrica = new C2892e(-213017744, false, new C17240e(18));
    public static final C2892e purchase = new C2892e(-1516724185, false, new C17240e(19));
    public static final C2892e billing = new C2892e(1913989392, false, new C17240e(20));
    public static final C2892e yandex = new C2892e(1731967226, false, new C14234e(7));
    public static final C2892e startapp = new C2892e(231062679, false, new C14234e(8));
    public static final C2892e adcel = new C2892e(335272419, false, new C14234e(9));
    public static final C2892e mopub = new C2892e(1075014208, false, new C14234e(10));
    public static final C2892e advert = new C2892e(1378075342, false, new C17240e(21));
    public static final C2892e smaato = new C2892e(-1037365331, false, new C17240e(22));
    public static final C2892e amazon = new C2892e(1196053176, false, new C14234e(11));
    public static final C2892e loadAd = new C2892e(-304851371, false, new C14234e(12));
    public static final C2892e Signature = new C2892e(-200641631, false, new C14234e(13));
    public static final C2892e admob = new C2892e(539100158, false, new C14234e(14));
    public static final C2892e subscription = new C2892e(842161292, false, new C17240e(23));

    public static final long ad(C13197e c13197e, C0193e c0193e, int i, long j, long j2) {
        C0193e c0193e2;
        C16151e c16151e = c13197e.f26204e;
        long j3 = i;
        AbstractC7844e.startapp(c0193e.license(), 0, j3);
        if (c13197e.f26203e) {
            throw new IllegalStateException("closed");
        }
        long j4 = j;
        int i2 = i;
        C0193e c0193e3 = c0193e;
        loop0: while (true) {
            long ad2 = vip.ad(c16151e, c0193e3, j4, j2, i2);
            long j5 = j4;
            if (ad2 == -1) {
                long j6 = c16151e.f31731e;
                long j7 = (j6 - j3) + 1;
                if (j7 >= j2) {
                    break;
                }
                if (j6 >= j2) {
                    int max = (int) Math.max(1L, (j6 - j2) + 1);
                    int min = ((int) Math.min(j3, (c16151e.f31731e - j5) + 1)) - 1;
                    if (max > min) {
                        break;
                    }
                    while (true) {
                        c0193e2 = c0193e;
                        if (!c16151e.ads(c16151e.f31731e - min, c0193e2, min)) {
                            if (min == max) {
                                break loop0;
                            }
                            min--;
                        } else {
                            break;
                        }
                    }
                } else {
                    c0193e2 = c0193e;
                }
                if (c13197e.f26205e.signatures(c16151e, 8192L) == -1) {
                    break;
                }
                i2 = i;
                j4 = Math.max(j5, j7);
                c0193e3 = c0193e2;
            } else {
                return ad2;
            }
        }
        return -1L;
    }

    public static boolean appmetrica(double d) {
        return Math.getExponent(d) <= 1023;
    }

    public static InterfaceC6823e billing(InterfaceC6823e interfaceC6823e) {
        return ((interfaceC6823e instanceof C4297e) || (interfaceC6823e instanceof C7276e)) ? interfaceC6823e : interfaceC6823e instanceof Serializable ? new C7276e(interfaceC6823e) : new C4297e(interfaceC6823e);
    }

    public static long license(double d) {
        AbstractC2301e.yandex(appmetrica(d), "not a normal value");
        int exponent = Math.getExponent(d);
        long doubleToRawLongBits = Double.doubleToRawLongBits(d) & 4503599627370495L;
        return exponent == -1023 ? doubleToRawLongBits << 1 : doubleToRawLongBits | 4503599627370496L;
    }

    public static final String metrica(InterfaceC6647e interfaceC6647e) {
        if (!AbstractC14300e.smaato(interfaceC6647e)) {
            InterfaceC15498e mo1351switch = interfaceC6647e.mo1351switch();
            InterfaceC5052e interfaceC5052e = mo1351switch instanceof InterfaceC5052e ? (InterfaceC5052e) mo1351switch : null;
            if (interfaceC5052e != null && !interfaceC5052e.getName().f2666e) {
                InterfaceC6647e vip2 = interfaceC6647e.vip();
                C1117e c1117e = vip2 instanceof C1117e ? (C1117e) vip2 : null;
                if (c1117e != null) {
                    String vip3 = vip(c1117e, 3);
                    String str = C0696e.ad;
                    C11709e billing2 = C0696e.billing(AbstractC2876e.billing(interfaceC5052e).ad);
                    return AbstractC0869e.tapsense('.', billing2 != null ? C1553e.appmetrica(billing2) : AbstractC9164e.license(interfaceC5052e, C17354e.f34038e), vip3);
                }
            }
        }
        return null;
    }

    public static final AbstractC17308e purchase(AbstractC1186e abstractC1186e) {
        return (AbstractC17308e) AbstractC9164e.appmetrica(abstractC1186e, C11534e.startapp, C15042e.f29806e);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static String vip(InterfaceC16528e interfaceC16528e, int i) {
        boolean z = (i & 1) != 0;
        boolean z2 = (i & 2) != 0;
        StringBuilder sb = new StringBuilder();
        if (z2) {
            sb.append(interfaceC16528e instanceof InterfaceC11788e ? "<init>" : ((AbstractC2214e) interfaceC16528e).getName().vip());
        }
        sb.append("(");
        C16169e mo327e = interfaceC16528e.mo327e();
        if (mo327e != null) {
            sb.append(purchase(mo327e.ad()));
        }
        Iterator it = interfaceC16528e.mo330e().iterator();
        while (it.hasNext()) {
            sb.append(purchase(((C13043e) it.next()).ad()));
        }
        sb.append(")");
        if (z) {
            if (!(interfaceC16528e instanceof InterfaceC11788e)) {
                AbstractC1186e inmobi = interfaceC16528e.inmobi();
                if (inmobi == null) {
                    AbstractC13270e.ad(142);
                    throw null;
                }
                C0520e c0520e = AbstractC13270e.appmetrica;
                if (!AbstractC13270e.crashlytics(inmobi, AbstractC0206e.license) || AbstractC11957e.appmetrica(interfaceC16528e.inmobi()) || (interfaceC16528e instanceof C7901e)) {
                    sb.append(purchase(interfaceC16528e.inmobi()));
                }
            }
            sb.append("V");
        }
        return sb.toString();
    }
}
