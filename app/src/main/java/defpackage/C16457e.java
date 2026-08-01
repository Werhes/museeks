package defpackage;

import j$.util.DesugarCollections;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٖۙؐ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C16457e {
    public final String ad;
    public Long appmetrica;
    public final /* synthetic */ int billing;
    public Boolean license;
    public Boolean metrica;
    public Long purchase;
    public final AbstractC15319e startapp;
    public final int vip;
    public final /* synthetic */ C14092e yandex;

    public C16457e(C14092e c14092e, String str, int i, AbstractC15319e abstractC15319e, int i2) {
        this.billing = i2;
        this.yandex = c14092e;
        this.ad = str;
        this.vip = i;
        this.startapp = abstractC15319e;
    }

    public static Boolean appmetrica(BigDecimal bigDecimal, C4103e c4103e, double d) {
        BigDecimal bigDecimal2;
        BigDecimal bigDecimal3;
        BigDecimal bigDecimal4;
        AbstractC9528e.startapp(c4103e);
        if (c4103e.signatures()) {
            if (c4103e.firebase() != 1 && (c4103e.firebase() != 5 ? c4103e.inmobi() : c4103e.applovin() && c4103e.premium())) {
                int firebase = c4103e.firebase();
                try {
                    if (c4103e.firebase() == 5) {
                        if (C10686e.m2872e(c4103e.ads()) && C10686e.m2872e(c4103e.subs())) {
                            BigDecimal bigDecimal5 = new BigDecimal(c4103e.ads());
                            bigDecimal4 = new BigDecimal(c4103e.subs());
                            bigDecimal3 = bigDecimal5;
                            bigDecimal2 = null;
                        }
                    } else if (C10686e.m2872e(c4103e.isPro())) {
                        bigDecimal2 = new BigDecimal(c4103e.isPro());
                        bigDecimal3 = null;
                        bigDecimal4 = null;
                    }
                    if (firebase != 5 ? bigDecimal2 != null : bigDecimal3 != null) {
                        int i = firebase - 1;
                        if (i != 1) {
                            if (i != 2) {
                                if (i != 3) {
                                    if (i == 4 && bigDecimal3 != null) {
                                        return Boolean.valueOf(bigDecimal.compareTo(bigDecimal3) >= 0 && bigDecimal.compareTo(bigDecimal4) <= 0);
                                    }
                                } else if (bigDecimal2 != null) {
                                    if (d != 0.0d) {
                                        return Boolean.valueOf(bigDecimal.compareTo(bigDecimal2.subtract(new BigDecimal(d).multiply(new BigDecimal(2)))) > 0 && bigDecimal.compareTo(bigDecimal2.add(new BigDecimal(d).multiply(new BigDecimal(2)))) < 0);
                                    }
                                    return Boolean.valueOf(bigDecimal.compareTo(bigDecimal2) == 0);
                                }
                            } else if (bigDecimal2 != null) {
                                return Boolean.valueOf(bigDecimal.compareTo(bigDecimal2) > 0);
                            }
                        } else if (bigDecimal2 != null) {
                            return Boolean.valueOf(bigDecimal.compareTo(bigDecimal2) < 0);
                        }
                    }
                } catch (NumberFormatException unused) {
                }
            }
        }
        return null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static Boolean license(String str, C0973e c0973e, C13879e c13879e) {
        List applovin;
        AbstractC9528e.startapp(c0973e);
        if (str != null && c0973e.signatures() && c0973e.subs() != 1 && (c0973e.subs() != 7 ? c0973e.tapsense() : c0973e.ads() != 0)) {
            int subs = c0973e.subs();
            boolean isPro = c0973e.isPro();
            String isVip = (isPro || subs == 2 || subs == 7) ? c0973e.isVip() : c0973e.isVip().toUpperCase(Locale.ENGLISH);
            if (c0973e.ads() == 0) {
                applovin = null;
            } else {
                applovin = c0973e.applovin();
                if (!isPro) {
                    ArrayList arrayList = new ArrayList(applovin.size());
                    Iterator it = applovin.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((String) it.next()).toUpperCase(Locale.ENGLISH));
                    }
                    applovin = DesugarCollections.unmodifiableList(arrayList);
                }
            }
            String str2 = subs == 2 ? isVip : null;
            if (subs != 7 ? isVip != null : applovin != null && !applovin.isEmpty()) {
                if (!isPro && subs != 2) {
                    str = str.toUpperCase(Locale.ENGLISH);
                }
                switch (subs - 1) {
                    case 1:
                        if (str2 != null) {
                            try {
                                return Boolean.valueOf(Pattern.compile(str2, true != isPro ? 66 : 0).matcher(str).matches());
                            } catch (PatternSyntaxException unused) {
                                if (c13879e != null) {
                                    c13879e.f27495e.vip(str2, "Invalid regular expression in REGEXP audience filter. expression");
                                    break;
                                }
                            }
                        }
                        break;
                    case 2:
                        return Boolean.valueOf(str.startsWith(isVip));
                    case 3:
                        return Boolean.valueOf(str.endsWith(isVip));
                    case 4:
                        return Boolean.valueOf(str.contains(isVip));
                    case 5:
                        return Boolean.valueOf(str.equals(isVip));
                    case 6:
                        if (applovin != null) {
                            return Boolean.valueOf(applovin.contains(str));
                        }
                        break;
                }
            }
        }
        return null;
    }

    public static Boolean metrica(Boolean bool, boolean z) {
        if (bool == null) {
            return null;
        }
        return Boolean.valueOf(bool.booleanValue() != z);
    }

    /* JADX WARN: Removed duplicated region for block: B:153:0x035f  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x03c9 A[EDGE_INSN: B:160:0x03c9->B:52:0x03c9 BREAK  A[LOOP:3: B:132:0x0246->B:157:0x0246], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x03ce  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x03da A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x03dc  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x03d1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean ad(java.lang.Long r22, java.lang.Long r23, defpackage.C2266e r24, long r25, defpackage.C2497e r27, boolean r28) {
        /*
            Method dump skipped, instructions count: 1085
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C16457e.ad(java.lang.Long, java.lang.Long, eؓۨٙ, long, eُؚؔ, boolean):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0179 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0171  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean vip(java.lang.Long r15, java.lang.Long r16, defpackage.C5952e r17, boolean r18) {
        /*
            Method dump skipped, instructions count: 465
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C16457e.vip(java.lang.Long, java.lang.Long, eؘٖ۠, boolean):boolean");
    }
}
