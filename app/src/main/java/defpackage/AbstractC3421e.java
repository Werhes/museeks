package defpackage;

import java.util.ArrayList;
import java.util.HashSet;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.conscrypt.BuildConfig;
import org.conscrypt.PSKKeyManager;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؕٗ۠ */
/* loaded from: classes3.dex */
public abstract class AbstractC3421e {
    public static final C7249e ad = new C7249e(3);
    public static C17149e vip;

    public static final C15602e ad(Number number, String str, String str2) {
        return license(-1, "Unexpected special floating-point value " + number + " with key " + str + ". By default, non-finite floating point values are prohibited because they do not conform JSON specification. It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'\nCurrent output: " + ((Object) adcel(str2, -1)));
    }

    public static final CharSequence adcel(CharSequence charSequence, int i) {
        if (charSequence.length() >= 200) {
            if (i != -1) {
                int i2 = i - 30;
                int i3 = i + 30;
                String str = i2 <= 0 ? BuildConfig.FLAVOR : ".....";
                String str2 = i3 >= charSequence.length() ? BuildConfig.FLAVOR : ".....";
                StringBuilder inmobi = AbstractC8703e.inmobi(str);
                if (i2 < 0) {
                    i2 = 0;
                }
                int length = charSequence.length();
                if (i3 > length) {
                    i3 = length;
                }
                inmobi.append(charSequence.subSequence(i2, i3).toString());
                inmobi.append(str2);
                return inmobi.toString();
            }
            int length2 = charSequence.length() - 60;
            if (length2 > 0) {
                return "....." + charSequence.subSequence(length2, charSequence.length()).toString();
            }
        }
        return charSequence;
    }

    public static final C15602e appmetrica(String str, CharSequence charSequence, int i) {
        StringBuilder isPro = AbstractC8703e.isPro(str, "\nJSON input: ");
        isPro.append((Object) adcel(charSequence, i));
        return license(i, isPro.toString());
    }

    public static final C17149e billing() {
        C17149e c17149e = vip;
        if (c17149e != null) {
            return c17149e;
        }
        C18373e c18373e = new C18373e("Rounded.Check", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i = AbstractC13069e.ad;
        C18466e c18466e = new C18466e(C3618e.vip);
        C13935e c13935e = new C13935e(20);
        c13935e.m3733extends(9.0f, 16.17f);
        c13935e.m3747this(5.53f, 12.7f);
        c13935e.premium(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0.0f);
        c13935e.premium(-0.39f, 0.39f, -0.39f, 1.02f, 0.0f, 1.41f);
        c13935e.m3738native(4.18f, 4.18f);
        c13935e.premium(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0.0f);
        c13935e.m3747this(20.29f, 7.71f);
        c13935e.premium(0.39f, -0.39f, 0.39f, -1.02f, 0.0f, -1.41f);
        c13935e.premium(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0.0f);
        c13935e.m3747this(9.0f, 16.17f);
        c13935e.ads();
        C18373e.ad(c18373e, (ArrayList) c13935e.f27641e, c18466e);
        C17149e vip2 = c18373e.vip();
        vip = vip2;
        return vip2;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [eَٕٝ, java.lang.IllegalArgumentException] */
    public static final C15602e license(int i, String str) {
        if (i >= 0) {
            str = "Unexpected JSON token at offset " + i + ": " + str;
        }
        return new IllegalArgumentException(str);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [eٍّؓ, java.lang.IllegalArgumentException] */
    public static final C12375e metrica(InterfaceC9998e interfaceC9998e) {
        return new IllegalArgumentException("Value of type '" + interfaceC9998e.ad() + "' can't be used in JSON as a key in the map. It should have either primitive or enum kind, but its kind is '" + interfaceC9998e.appmetrica() + "'.\nUse 'allowStructuredMapKeys = true' in 'Json {}' builder to convert such maps to [key1, value1, key2, value2,...] arrays.");
    }

    public static final void purchase(C10743e c10743e, Object obj, InterfaceC12864e interfaceC12864e, boolean z, boolean z2, C2892e c2892e, C13770e c13770e, int i) {
        int i2;
        boolean z3;
        c13770e.m3671package(1129341741);
        if ((i & 6) == 0) {
            i2 = (c13770e.purchase(c10743e) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= c13770e.yandex(obj) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= c13770e.purchase(interfaceC12864e) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= c13770e.billing(z) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            z3 = z2;
            i2 |= c13770e.billing(z3) ? 16384 : 8192;
        } else {
            z3 = z2;
        }
        if ((196608 & i) == 0) {
            i2 |= c13770e.yandex(c2892e) ? 131072 : 65536;
        }
        if ((74899 & i2) == 74898 && c13770e.ads()) {
            c13770e.m3659default();
        } else {
            c13770e.m3676strictfp(-1931603123);
            Object m3681throw = c13770e.m3681throw();
            C5170e c5170e = C2987e.ad;
            if (m3681throw == c5170e) {
                m3681throw = AbstractC14533e.startapp(new C2152e(0L));
                c13770e.m3682throws(m3681throw);
            }
            InterfaceC3314e interfaceC3314e = (InterfaceC3314e) m3681throw;
            c13770e.Signature(false);
            c13770e.m3676strictfp(-1931600257);
            Object m3681throw2 = c13770e.m3681throw();
            if (m3681throw2 == c5170e) {
                m3681throw2 = new C17097e(27, interfaceC3314e);
                c13770e.m3682throws(m3681throw2);
            }
            c13770e.Signature(false);
            InterfaceC12864e license = AbstractC11261e.license(interfaceC12864e, (Function1) m3681throw2);
            InterfaceC2747e license2 = AbstractC17074e.license(C5438e.f11676e, false);
            int appmetrica = AbstractC5546e.appmetrica(c13770e);
            InterfaceC3483e advert = c13770e.advert();
            InterfaceC12864e purchase = AbstractC5679e.purchase(c13770e, license);
            InterfaceC5685e.mopub.getClass();
            C7309e c7309e = C2721e.vip;
            c13770e.m3666import();
            if (c13770e.f27292implements) {
                c13770e.mopub(c7309e);
            } else {
                c13770e.m3684volatile();
            }
            AbstractC2270e.yandex(c13770e, license2, C2721e.billing);
            AbstractC2270e.yandex(c13770e, advert, C2721e.purchase);
            C14865e c14865e = C2721e.adcel;
            if (c13770e.f27292implements || !AbstractC7890e.billing(c13770e.m3681throw(), Integer.valueOf(appmetrica))) {
                c13770e.m3682throws(Integer.valueOf(appmetrica));
                c13770e.vip(Integer.valueOf(appmetrica), c14865e);
            }
            AbstractC2270e.yandex(c13770e, purchase, C2721e.license);
            c13770e.m3676strictfp(872013070);
            int i3 = i2 & 14;
            boolean purchase2 = (i3 == 4) | c13770e.purchase(obj);
            Object m3681throw3 = c13770e.m3681throw();
            if (purchase2 || m3681throw3 == c5170e) {
                m3681throw3 = new C12692e(c10743e, obj, new C17073e(15, interfaceC3314e));
                c13770e.m3682throws(m3681throw3);
            }
            c13770e.Signature(false);
            c2892e.invoke((C12692e) m3681throw3, Boolean.valueOf(z3), c13770e, Integer.valueOf((i2 >> 9) & 1008));
            c13770e.Signature(true);
            HashSet hashSet = c10743e.admob;
            Boolean valueOf = Boolean.valueOf(z);
            c13770e.m3676strictfp(-1931586729);
            boolean yandex = ((i2 & 7168) == 2048) | (i3 == 4) | c13770e.yandex(obj);
            Object m3681throw4 = c13770e.m3681throw();
            if (yandex || m3681throw4 == c5170e) {
                m3681throw4 = new C13053e(z, c10743e, obj, (InterfaceC5083e) null);
                c13770e.m3682throws(m3681throw4);
            }
            c13770e.Signature(false);
            AbstractC17680e.appmetrica(hashSet, valueOf, (Function2) m3681throw4, c13770e);
        }
        C2846e subscription = c13770e.subscription();
        if (subscription != null) {
            subscription.license = new C7881e(c10743e, obj, interfaceC12864e, z, z3, c2892e, i);
        }
    }

    public static /* synthetic */ void startapp(AbstractC8712e abstractC8712e) {
        yandex(abstractC8712e, "object");
        throw null;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [eٍّؓ, java.lang.IllegalArgumentException] */
    public static final C12375e vip(Number number, String str) {
        return new IllegalArgumentException("Unexpected special floating-point value " + number + ". By default, non-finite floating point values are prohibited because they do not conform JSON specification. It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'\nCurrent output: " + ((Object) adcel(str, -1)));
    }

    public static final void yandex(AbstractC8712e abstractC8712e, String str) {
        abstractC8712e.Signature("Trailing comma before the end of JSON ".concat(str), abstractC8712e.vip - 1, "Trailing commas are non-complaint JSON and not allowed by default. Use 'allowTrailingComma = true' in 'Json {}' builder to support them.");
        throw null;
    }
}
