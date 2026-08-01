package defpackage;

import android.graphics.PointF;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌِؒ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC11613e {
    public static final C2892e ad = new C2892e(2042924763, false, new C15480e(15));
    public static final C2892e vip = new C2892e(923990276, false, new C15480e(16));
    public static final C2892e metrica = new C2892e(-1078321053, false, new C15480e(17));
    public static final C2892e license = new C2892e(1214334914, false, new C15480e(18));

    public static final float Signature(long j) {
        return Float.intBitsToFloat((int) (j >> 32));
    }

    public static final void ad(InterfaceC7189e interfaceC7189e, C7139e c7139e, C2892e c2892e, C13770e c13770e, int i, int i2) {
        int i3;
        int i4;
        c13770e.m3671package(227045628);
        int i5 = i2 & 1;
        if (i5 != 0) {
            i3 = i | 6;
        } else {
            i3 = (c13770e.purchase(interfaceC7189e) ? 4 : 2) | i;
        }
        int i6 = i2 & 2;
        if (i6 != 0) {
            i4 = i3 | 48;
        } else {
            i4 = i3 | (c13770e.purchase(c7139e) ? 32 : 16);
        }
        if ((i4 & 147) == 146 && c13770e.ads()) {
            c13770e.m3659default();
        } else {
            if (i5 != 0) {
                interfaceC7189e = C17043e.ad;
            }
            if (i6 != 0) {
                c7139e = C7139e.metrica;
            }
            c13770e.m3672private(1849434622);
            Object m3681throw = c13770e.m3681throw();
            if (m3681throw == C2987e.ad) {
                m3681throw = C4147e.f9150e;
                c13770e.m3682throws(m3681throw);
            }
            c13770e.Signature(false);
            Function0 function0 = (Function0) ((InterfaceC5261e) m3681throw);
            c13770e.m3672private(-683746039);
            c13770e.m3672private(-548224868);
            if (!(c13770e.ad instanceof C9626e)) {
                AbstractC5546e.purchase();
                throw null;
            }
            c13770e.m3677super();
            if (c13770e.f27292implements) {
                c13770e.mopub(function0);
            } else {
                c13770e.m3684volatile();
            }
            AbstractC2270e.yandex(c13770e, interfaceC7189e, new C8171e(6));
            AbstractC2270e.yandex(c13770e, c7139e, new C8171e(7));
            c2892e.invoke(c13770e, 6);
            c13770e.Signature(true);
            c13770e.Signature(false);
            c13770e.Signature(false);
        }
        InterfaceC7189e interfaceC7189e2 = interfaceC7189e;
        C7139e c7139e2 = c7139e;
        C2846e subscription = c13770e.subscription();
        if (subscription != null) {
            subscription.license = new C9381e(i, i2, 3, interfaceC7189e2, c7139e2, c2892e);
        }
    }

    public static final float adcel(long j, long j2) {
        return (admob(j2) * admob(j)) + (Signature(j2) * Signature(j));
    }

    public static final float admob(long j) {
        return Float.intBitsToFloat((int) (j & 4294967295L));
    }

    public static final int advert(C12890e c12890e, long j, InterfaceC11678e interfaceC11678e) {
        float billing = interfaceC11678e != null ? interfaceC11678e.billing() : 0.0f;
        int i = (int) (4294967295L & j);
        int appmetrica = c12890e.appmetrica(Float.intBitsToFloat(i));
        if (Float.intBitsToFloat(i) < c12890e.purchase(appmetrica) - billing || Float.intBitsToFloat(i) > c12890e.vip(appmetrica) + billing) {
            return -1;
        }
        int i2 = (int) (j >> 32);
        if (Float.intBitsToFloat(i2) < (-billing) || Float.intBitsToFloat(i2) > c12890e.license + billing) {
            return -1;
        }
        return appmetrica;
    }

    public static final long amazon(C7911e c7911e, C0763e c0763e, int i) {
        C0866e license2 = c7911e.license();
        C12890e c12890e = license2 != null ? license2.ad.vip : null;
        InterfaceC0043e metrica2 = c7911e.metrica();
        return (c12890e == null || metrica2 == null) ? C12347e.vip : c12890e.yandex(c0763e.amazon(metrica2.mo209interface(0L)), i, C17647e.f34576e);
    }

    public static final long appmetrica(C7102e c7102e, C0763e c0763e, C0763e c0763e2, int i) {
        long loadAd = loadAd(c7102e, c0763e, i);
        if (C12347e.license(loadAd)) {
            return C12347e.vip;
        }
        long loadAd2 = loadAd(c7102e, c0763e2, i);
        if (C12347e.license(loadAd2)) {
            return C12347e.vip;
        }
        int i2 = (int) (loadAd >> 32);
        int i3 = (int) (loadAd2 & 4294967295L);
        return AbstractC9262e.metrica(Math.min(i2, i2), Math.max(i3, i3));
    }

    public static final long billing(CharSequence charSequence, int i) {
        int i2 = i;
        while (i2 > 0) {
            int codePointBefore = Character.codePointBefore(charSequence, i2);
            if (!pro(codePointBefore)) {
                break;
            }
            i2 -= Character.charCount(codePointBefore);
        }
        while (i < charSequence.length()) {
            int codePointAt = Character.codePointAt(charSequence, i);
            if (!pro(codePointAt)) {
                break;
            }
            i += Character.charCount(codePointAt);
        }
        return AbstractC9262e.metrica(i2, i);
    }

    public static final String inmobi(int i, String str) {
        int m1865interface;
        CharSequence charSequence;
        if (str.length() >= i + 12 && AbstractC5304e.isPro("+-", str.charAt(0)) && (m1865interface = AbstractC5304e.m1865interface(str, '-', 1, 4)) >= 12) {
            int i2 = 0;
            while (true) {
                int i3 = i2 + 1;
                if (str.charAt(i3) != '0') {
                    break;
                }
                i2 = i3;
            }
            if (m1865interface - i2 < 12) {
                int i4 = m1865interface - 10;
                if (i4 < 1) {
                    throw new IndexOutOfBoundsException(AbstractC1634e.smaato("End index (", i4, ") is less than start index (1)."));
                }
                if (i4 == 1) {
                    charSequence = str.subSequence(0, str.length());
                } else {
                    StringBuilder sb = new StringBuilder(str.length() - (m1865interface - 11));
                    sb.append((CharSequence) str, 0, 1);
                    sb.append((CharSequence) str, i4, str.length());
                    charSequence = sb;
                }
                return charSequence.toString();
            }
        }
        return str;
    }

    public static final long isPro(float f, long j) {
        return C9268e.ad(Signature(j) * f, admob(j) * f);
    }

    public static final long isVip(long j, long j2) {
        return C9268e.ad(Signature(j2) + Signature(j), admob(j2) + admob(j));
    }

    public static final long license(C7911e c7911e, C0763e c0763e, C0763e c0763e2, int i) {
        long amazon = amazon(c7911e, c0763e, i);
        if (C12347e.license(amazon)) {
            return C12347e.vip;
        }
        long amazon2 = amazon(c7911e, c0763e2, i);
        if (C12347e.license(amazon2)) {
            return C12347e.vip;
        }
        int i2 = (int) (amazon >> 32);
        int i3 = (int) (amazon2 & 4294967295L);
        return AbstractC9262e.metrica(Math.min(i2, i2), Math.max(i3, i3));
    }

    public static final long loadAd(C7102e c7102e, C0763e c0763e, int i) {
        C12476e metrica2 = c7102e.metrica();
        C12890e c12890e = metrica2 != null ? metrica2.vip : null;
        InterfaceC0043e appmetrica = c7102e.appmetrica();
        return (c12890e == null || appmetrica == null) ? C12347e.vip : c12890e.yandex(c0763e.amazon(appmetrica.mo209interface(0L)), i, C17647e.f34576e);
    }

    public static final long metrica(C12476e c12476e, long j, long j2, InterfaceC0043e interfaceC0043e, InterfaceC11678e interfaceC11678e) {
        if (c12476e != null) {
            C12890e c12890e = c12476e.vip;
            if (interfaceC0043e != null) {
                long mo209interface = interfaceC0043e.mo209interface(j);
                long mo209interface2 = interfaceC0043e.mo209interface(j2);
                int advert = advert(c12890e, mo209interface, interfaceC11678e);
                int advert2 = advert(c12890e, mo209interface2, interfaceC11678e);
                if (advert != -1) {
                    if (advert2 != -1) {
                        advert = Math.min(advert, advert2);
                    }
                    advert2 = advert;
                } else if (advert2 == -1) {
                    return C12347e.vip;
                }
                float vip2 = (c12890e.vip(advert2) + c12890e.purchase(advert2)) / 2;
                int i = (int) (mo209interface >> 32);
                int i2 = (int) (mo209interface2 >> 32);
                return c12890e.yandex(new C0763e(Math.min(Float.intBitsToFloat(i), Float.intBitsToFloat(i2)), vip2 - 0.1f, Math.max(Float.intBitsToFloat(i), Float.intBitsToFloat(i2)), vip2 + 0.1f), 0, C17647e.f34571e);
            }
        }
        return C12347e.vip;
    }

    public static final float mopub(long j) {
        return (float) Math.sqrt((admob(j) * admob(j)) + (Signature(j) * Signature(j)));
    }

    public static final boolean pro(int i) {
        return Character.isWhitespace(i) || i == 160;
    }

    public static final boolean purchase(C12476e c12476e, int i) {
        C12890e c12890e = c12476e.vip;
        int license2 = c12890e.license(i);
        return i == c12476e.startapp(license2) || i == c12890e.metrica(license2, false) ? c12476e.adcel(i) != c12476e.ad(i) : c12476e.ad(i) != c12476e.ad(i - 1);
    }

    public static final boolean remoteconfig(int i) {
        int type = Character.getType(i);
        return type == 23 || type == 20 || type == 22 || type == 30 || type == 29 || type == 24 || type == 21;
    }

    public static final boolean signatures(int i) {
        int type;
        return (!pro(i) || (type = Character.getType(i)) == 14 || type == 13 || i == 10) ? false : true;
    }

    public static final int smaato(C12890e c12890e, long j, InterfaceC0043e interfaceC0043e, InterfaceC11678e interfaceC11678e) {
        long mo209interface;
        int advert;
        if (interfaceC0043e == null || (advert = advert(c12890e, (mo209interface = interfaceC0043e.mo209interface(j)), interfaceC11678e)) == -1) {
            return -1;
        }
        return c12890e.billing(C2152e.ad((c12890e.vip(advert) + c12890e.purchase(advert)) / 2.0f, 1, mo209interface));
    }

    public static final long startapp(float f, long j) {
        return C9268e.ad(Signature(j) / f, admob(j) / f);
    }

    public static final boolean subscription(char c) {
        return '0' <= c && c < ':';
    }

    public static final long tapsense(long j, long j2) {
        return C9268e.ad(Signature(j) - Signature(j2), admob(j) - admob(j2));
    }

    public static final long vip(long j, CharSequence charSequence) {
        int i = C12347e.metrica;
        int i2 = (int) (j >> 32);
        int i3 = (int) (4294967295L & j);
        int codePointBefore = i2 > 0 ? Character.codePointBefore(charSequence, i2) : 10;
        int codePointAt = i3 < charSequence.length() ? Character.codePointAt(charSequence, i3) : 10;
        if (signatures(codePointBefore) && (pro(codePointAt) || remoteconfig(codePointAt))) {
            do {
                i2 -= Character.charCount(codePointBefore);
                if (i2 == 0) {
                    break;
                }
                codePointBefore = Character.codePointBefore(charSequence, i2);
            } while (signatures(codePointBefore));
            return AbstractC9262e.metrica(i2, i3);
        }
        if (!signatures(codePointAt)) {
            return j;
        }
        if (!pro(codePointBefore) && !remoteconfig(codePointBefore)) {
            return j;
        }
        do {
            i3 += Character.charCount(codePointAt);
            if (i3 == charSequence.length()) {
                break;
            }
            codePointAt = Character.codePointAt(charSequence, i3);
        } while (signatures(codePointAt));
        return AbstractC9262e.metrica(i2, i3);
    }

    public static final long yandex(PointF pointF) {
        float f = pointF.x;
        float f2 = pointF.y;
        return (Float.floatToRawIntBits(f) << 32) | (Float.floatToRawIntBits(f2) & 4294967295L);
    }
}
