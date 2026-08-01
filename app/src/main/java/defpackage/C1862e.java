package defpackage;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌؓٗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1862e implements InterfaceC5372e {
    public static final C1862e ad = new Object();
    public static final InterfaceC9998e metrica;
    public static final InterfaceC5372e vip;

    /* JADX WARN: Type inference failed for: r0v0, types: [eٌؓٗ, java.lang.Object] */
    static {
        InterfaceC5372e serializer = C9495e.Companion.serializer();
        vip = serializer;
        metrica = serializer.appmetrica();
    }

    public static void purchase(InterfaceC5757e interfaceC5757e, C12355e c12355e) {
        if (!(interfaceC5757e instanceof C6929e)) {
            throw new IllegalArgumentException(AbstractC10257e.startapp("Unknown encoder type: ", interfaceC5757e));
        }
        vip.ad(interfaceC5757e, new C9495e(c12355e));
    }

    @Override // defpackage.InterfaceC5372e
    public final /* bridge */ /* synthetic */ void ad(InterfaceC5757e interfaceC5757e, Object obj) {
        purchase(interfaceC5757e, (C12355e) obj);
    }

    @Override // defpackage.InterfaceC5372e
    public final InterfaceC9998e appmetrica() {
        return metrica;
    }

    @Override // defpackage.InterfaceC5372e
    public final Object metrica(InterfaceC11754e interfaceC11754e) {
        int i;
        int length;
        int length2;
        long j;
        long j2;
        C15563e c15563e;
        if (!(interfaceC11754e instanceof InterfaceC1527e)) {
            throw new IllegalArgumentException(AbstractC10257e.yandex("Unknown decoder type: ", interfaceC11754e));
        }
        C9495e c9495e = (C9495e) vip.metrica(interfaceC11754e);
        c9495e.getClass();
        C9131e c9131e = C12355e.Companion;
        String str = c9495e.ad;
        c9131e.getClass();
        C3087e c3087e = C15563e.metrica;
        if (str.length() == 0) {
            throw new NumberFormatException();
        }
        Matcher matcher = Pattern.compile("^([+-])?(\\d+([.]\\d*)?|[.]\\d+)([eE]([+-])?(\\d+))?$").matcher(str);
        C14031e c14031e = !matcher.matches() ? null : new C14031e(matcher, str);
        if (c14031e != null) {
            C4468e c4468e = c14031e.metrica;
            C18352e firebase = c4468e.firebase(1);
            String str2 = firebase != null ? firebase.ad : null;
            boolean z = str2 != null && str2.equals("-");
            C18352e firebase2 = c4468e.firebase(4);
            String str3 = firebase2 != null ? firebase2.ad : null;
            if (str3 == null || str3.length() == 0) {
                i = 0;
            } else {
                i = Integer.parseInt(c4468e.firebase(6).ad);
                C18352e firebase3 = c4468e.firebase(5);
                String str4 = firebase3 != null ? firebase3.ad : null;
                if (str4 != null && str4.equals("-")) {
                    i = -i;
                }
            }
            String str5 = c4468e.firebase(2).ad;
            int m1865interface = AbstractC5304e.m1865interface(str5, '.', 0, 6);
            if (m1865interface != -1) {
                int i2 = m1865interface + 1;
                i -= str5.length() - i2;
                str5 = str5.substring(0, m1865interface).concat(str5.substring(i2));
            }
            if (str5.charAt(0) == '0' && str5.length() > 1) {
                str5 = Pattern.compile("^0+").matcher(str5).replaceFirst(BuildConfig.FLAVOR);
                if (str5.length() == 0) {
                    str5 = "0";
                }
            }
            if (i > 6111) {
                if (!str5.equals("0")) {
                    int i3 = i - 6111;
                    if (i3 <= 34 - str5.length()) {
                        StringBuilder inmobi = AbstractC8703e.inmobi(str5);
                        inmobi.append(AbstractC6507e.admob(i3, "0"));
                        str5 = inmobi.toString();
                    }
                }
                i = 6111;
            } else if (i < -6176) {
                if (!str5.equals("0")) {
                    int i4 = (-6176) - i;
                    if (i4 < str5.length()) {
                        if (Pattern.compile("^0+$").matcher(str5.substring(str5.length() - i4)).matches()) {
                            str5 = AbstractC5087e.m1752this(i4, 0, str5);
                        }
                    }
                }
                i = -6176;
            } else if (str5.length() > 34 && (length2 = i + (length = str5.length() - 34)) <= 6111) {
                if (Pattern.compile("^0+$").matcher(str5.substring(str5.length() - length)).matches()) {
                    str5 = AbstractC5087e.m1752this(length, 0, str5);
                    i = length2;
                }
            }
            if (i > 6111 || i < -6176) {
                throw new NumberFormatException("Can't parse to Decimal128:".concat(str));
            }
            if (str5.length() > 34) {
                throw new NumberFormatException("Can't parse to Decimal128:".concat(str));
            }
            C3087e license = AbstractC12475e.license(str5);
            if (i < -6176 || i > 6111) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            if (license.compareTo(C15563e.metrica) > 0) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            if (i < 0) {
                i += 12288;
            }
            long j3 = (i << 49) | license.f7172e;
            if (z) {
                j3 |= Long.MIN_VALUE;
            }
            if (Long.compare((6917529027641081856L & j3) ^ Long.MIN_VALUE, -4611686018427387904L) > 0) {
                long j4 = (8646911284551352320L & j3) ^ Long.MIN_VALUE;
                if ((Long.compare(j4, -2305843009213693952L) >= 0) & (Long.compare(j4, -1152921504606846976L) <= 0)) {
                    if (Long.compare((2305702271725338624L & j3) ^ Long.MIN_VALUE, -8363325245515366400L) <= 0) {
                        j2 = 869194728082505728L;
                        j3 += j2;
                    } else {
                        j = 860187528827764736L;
                        j3 -= j;
                    }
                }
            } else if (Long.compare((9222809086901354496L & j3) ^ Long.MIN_VALUE, -5783184871497138176L) <= 0) {
                j2 = 3476778912330022912L;
                j3 += j2;
            } else {
                j = 3440750115311058944L;
                j3 -= j;
            }
            c15563e = new C15563e(j3, license.f7171e);
        } else if (str.equalsIgnoreCase("Inf") || str.equalsIgnoreCase("Infinity") || str.equalsIgnoreCase("+Inf") || str.equalsIgnoreCase("+Infinity")) {
            c15563e = C15563e.license;
        } else if (str.equalsIgnoreCase("-Inf") || str.equalsIgnoreCase("-Infinity")) {
            c15563e = C15563e.appmetrica;
        } else if (str.equalsIgnoreCase("NaN")) {
            c15563e = C15563e.billing;
        } else {
            if (!str.equalsIgnoreCase("-NaN")) {
                throw new NumberFormatException("Can't parse to Decimal128:".concat(str));
            }
            c15563e = C15563e.purchase;
        }
        return new C12355e(c15563e);
    }
}
