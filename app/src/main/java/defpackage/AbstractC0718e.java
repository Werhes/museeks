package defpackage;

import androidx.car.app.model.Alert;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.conscrypt.BuildConfig;
import org.conscrypt.PSKKeyManager;
import ua.itaysonlab.vkx.R;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًؑۧ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC0718e {
    public static final C2892e ad = new C2892e(2050145068, false, new C8453e(4));
    public static final C2892e vip = new C2892e(-1826085175, false, new C8453e(5));
    public static final C2892e metrica = new C2892e(1981716426, false, new C13428e(13));
    public static final C2892e license = new C2892e(-705657878, false, new C8453e(6));
    public static final C2892e appmetrica = new C2892e(2092249326, false, new C8453e(7));
    public static final C2892e purchase = new C2892e(-1394519925, false, new C8453e(8));
    public static final C2892e billing = new C2892e(-2113565906, false, new C8453e(9));
    public static final C2892e yandex = new C2892e(1174440974, false, new C8453e(10));
    public static final C2892e startapp = new C2892e(-1250285271, false, new C8453e(11));

    public static final void ad(InterfaceC16060e interfaceC16060e, C2892e c2892e, C6540e c6540e, InterfaceC12864e interfaceC12864e, Function0 function0, C2892e c2892e2, C13770e c13770e, int i) {
        InterfaceC16060e interfaceC16060e2;
        int i2;
        Function0 function02;
        InterfaceC3314e interfaceC3314e;
        C5170e c5170e;
        boolean z;
        C13770e c13770e2 = c13770e;
        c13770e2.m3671package(-1221877520);
        if ((i & 6) == 0) {
            interfaceC16060e2 = interfaceC16060e;
            i2 = (c13770e2.purchase(interfaceC16060e2) ? 4 : 2) | i;
        } else {
            interfaceC16060e2 = interfaceC16060e;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= c13770e2.yandex(c2892e) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= (i & AbstractC1815e.AUDIO_CONTENT_BUFFER_SIZE) == 0 ? c13770e2.purchase(c6540e) : c13770e2.yandex(c6540e) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= c13770e2.purchase(interfaceC12864e) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            function02 = function0;
            i2 |= c13770e2.yandex(function02) ? 16384 : 8192;
        } else {
            function02 = function0;
        }
        if ((i & 196608) == 0) {
            i2 |= c13770e2.billing(false) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= c13770e2.billing(true) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= c13770e2.billing(false) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            i2 |= c13770e2.yandex(c2892e2) ? 67108864 : 33554432;
        }
        int i3 = i2;
        if (c13770e2.m3673protected(i3 & 1, (38347923 & i3) != 38347922)) {
            Object m3681throw = c13770e2.m3681throw();
            C5170e c5170e2 = C2987e.ad;
            if (m3681throw == c5170e2) {
                m3681throw = AbstractC17680e.startapp(c13770e2);
                c13770e2.m3682throws(m3681throw);
            }
            InterfaceC18435e interfaceC18435e = (InterfaceC18435e) m3681throw;
            Object m3681throw2 = c13770e2.m3681throw();
            if (m3681throw2 == c5170e2) {
                m3681throw2 = AbstractC14533e.startapp(Boolean.FALSE);
                c13770e2.m3682throws(m3681throw2);
            }
            InterfaceC3314e interfaceC3314e2 = (InterfaceC3314e) m3681throw2;
            c13770e2.m3676strictfp(-1104742522);
            c13770e2.Signature(false);
            InterfaceC2747e license2 = AbstractC17074e.license(C5438e.f11676e, false);
            long j = c13770e2.f27286case;
            int i4 = (int) (j ^ (j >>> 32));
            InterfaceC3483e advert = c13770e2.advert();
            InterfaceC12864e purchase2 = AbstractC5679e.purchase(c13770e2, C0115e.f1276e);
            InterfaceC5685e.mopub.getClass();
            C7309e c7309e = C2721e.vip;
            c13770e2.m3666import();
            if (c13770e2.f27292implements) {
                c13770e2.mopub(c7309e);
            } else {
                c13770e2.m3684volatile();
            }
            AbstractC2270e.yandex(c13770e2, license2, C2721e.billing);
            AbstractC2270e.yandex(c13770e2, advert, C2721e.purchase);
            AbstractC2270e.yandex(c13770e2, Integer.valueOf(i4), C2721e.adcel);
            AbstractC2270e.purchase(c13770e2, C2721e.mopub);
            AbstractC2270e.yandex(c13770e2, purchase2, C2721e.license);
            if (c6540e.vip()) {
                c13770e2.m3676strictfp(-1891243071);
                c5170e = c5170e2;
                metrica(interfaceC16060e2, c6540e, function02, interfaceC18435e, false, interfaceC3314e2, c2892e, c13770e, (i3 & 14) | 196608 | ((i3 >> 3) & 112) | ((i3 >> 6) & 896) | ((i3 << 15) & 3670016));
                interfaceC3314e = interfaceC3314e2;
                c13770e2 = c13770e;
                z = false;
                c13770e2.Signature(false);
            } else {
                interfaceC3314e = interfaceC3314e2;
                c5170e = c5170e2;
                z = false;
                c13770e2.m3676strictfp(-1890863476);
                c13770e2.Signature(false);
            }
            appmetrica(c6540e, interfaceC3314e, interfaceC12864e, c2892e2, c13770e2, ((i3 >> 18) & 14) | 384 | ((i3 >> 3) & 112) | ((i3 >> 12) & 7168) | (57344 & (i3 << 3)) | ((i3 >> 9) & 458752));
            c13770e2.Signature(true);
            boolean z2 = ((i3 & 896) == 256 || ((i3 & AbstractC1815e.AUDIO_CONTENT_BUFFER_SIZE) != 0 && c13770e2.yandex(c6540e))) ? true : z;
            Object m3681throw3 = c13770e2.m3681throw();
            if (z2 || m3681throw3 == c5170e) {
                m3681throw3 = new C0609e(15, c6540e);
                c13770e2.m3682throws(m3681throw3);
            }
            AbstractC17680e.vip(c6540e, (Function1) m3681throw3, c13770e2);
        } else {
            c13770e2.m3659default();
        }
        C2846e subscription = c13770e2.subscription();
        if (subscription != null) {
            subscription.license = new C5524e(interfaceC16060e, c2892e, c6540e, interfaceC12864e, function0, c2892e2, i);
        }
    }

    public static C0388e adcel(String str) {
        String str2;
        String str3;
        String str4 = C10675e.f21023e;
        String subscription = !AbstractC7890e.billing(str4, "/") ? AbstractC6507e.subscription(str, str4, "/", false) : str;
        boolean z = true;
        int i = 0;
        int i2 = -1;
        int i3 = -1;
        int i4 = -1;
        int i5 = -1;
        int i6 = -1;
        while (i < subscription.length()) {
            char charAt = subscription.charAt(i);
            if (charAt != '#') {
                if (charAt != '/') {
                    if (charAt != ':') {
                        if (charAt == '?' && i4 == -1 && i2 == -1) {
                            i4 = i + 1;
                        }
                    } else if (z && i4 == -1 && i2 == -1) {
                        int i7 = i + 2;
                        if (i7 < str.length() && str.charAt(i + 1) == '/' && str.charAt(i7) == '/') {
                            i5 = i + 3;
                            z = false;
                            i6 = i;
                            i = i7;
                        } else if (subscription.equals(str)) {
                            i3 = i + 1;
                            i6 = i;
                            i = i3;
                            i5 = i;
                        }
                    }
                } else if (i3 == -1 && i4 == -1 && i2 == -1) {
                    i3 = i5 == -1 ? 0 : i;
                    z = false;
                }
            } else if (i2 == -1) {
                i2 = i + 1;
            }
            i++;
        }
        int i8 = Alert.DURATION_SHOW_INDEFINITELY;
        int min = Math.min(i2 == -1 ? Integer.MAX_VALUE : i2 - 1, subscription.length());
        int min2 = Math.min(i4 == -1 ? Integer.MAX_VALUE : i4 - 1, min);
        if (i5 != -1) {
            str3 = subscription.substring(0, i6);
            if (i3 != -1) {
                i8 = i3;
            }
            str2 = subscription.substring(i5, Math.min(i8, min2));
        } else {
            str2 = null;
            str3 = null;
        }
        String substring = i3 != -1 ? subscription.substring(i3, min2) : null;
        String substring2 = i4 != -1 ? subscription.substring(i4, min) : null;
        String substring3 = i2 != -1 ? subscription.substring(i2, subscription.length()) : null;
        byte[] bArr = new byte[Math.max(0, Math.max(str3 != null ? str3.length() : 0, Math.max(str2 != null ? str2.length() : 0, Math.max(substring != null ? substring.length() : 0, Math.max(substring2 != null ? substring2.length() : 0, substring3 != null ? substring3.length() : 0)))) - 2)];
        String str5 = substring2;
        String startapp2 = str3 != null ? startapp(str3, bArr) : null;
        String startapp3 = str2 != null ? startapp(str2, bArr) : null;
        String startapp4 = substring != null ? startapp(substring, bArr) : null;
        if (str5 != null) {
            startapp(str5, bArr);
        }
        if (substring3 != null) {
            startapp(substring3, bArr);
        }
        return new C0388e(subscription, str4, startapp2, startapp3, startapp4);
    }

    public static final void appmetrica(C6540e c6540e, InterfaceC3314e interfaceC3314e, InterfaceC12864e interfaceC12864e, C2892e c2892e, C13770e c13770e, int i) {
        int i2;
        c13770e.m3671package(1873232064);
        if ((i & 6) == 0) {
            i2 = (c13770e.billing(true) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? c13770e.purchase(c6540e) : c13770e.yandex(c6540e) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= c13770e.purchase(interfaceC3314e) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= c13770e.billing(false) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= c13770e.purchase(interfaceC12864e) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= c13770e.yandex(c2892e) ? 131072 : 65536;
        }
        if (c13770e.m3673protected(i2 & 1, (74899 & i2) != 74898)) {
            Object m3681throw = c13770e.m3681throw();
            C5170e c5170e = C2987e.ad;
            if (m3681throw == c5170e) {
                m3681throw = AbstractC17680e.startapp(c13770e);
                c13770e.m3682throws(m3681throw);
            }
            InterfaceC18435e interfaceC18435e = (InterfaceC18435e) m3681throw;
            String appmetrica2 = AbstractC5297e.appmetrica(c13770e, R.string.tooltip_label);
            Object m3681throw2 = c13770e.m3681throw();
            if (m3681throw2 == c5170e) {
                m3681throw2 = AbstractC14533e.startapp(Boolean.FALSE);
                c13770e.m3682throws(m3681throw2);
            }
            InterfaceC3314e interfaceC3314e2 = (InterfaceC3314e) m3681throw2;
            InterfaceC12864e license2 = AbstractC10681e.license(AbstractC17324e.license(AbstractC0845e.ad(AbstractC0845e.ad(interfaceC12864e, c6540e, new C16633e(c6540e, 0)), c6540e, new C16633e(c6540e, 1)).premium(new C17272e(new Cthrows(5, appmetrica2, interfaceC18435e, c6540e))), new Cthrows(4, interfaceC18435e, interfaceC3314e2, c6540e)), new C8286e(0, c6540e, interfaceC3314e, interfaceC3314e2));
            InterfaceC2747e license3 = AbstractC17074e.license(C5438e.f11676e, false);
            long j = c13770e.f27286case;
            int i3 = (int) (j ^ (j >>> 32));
            InterfaceC3483e advert = c13770e.advert();
            InterfaceC12864e purchase2 = AbstractC5679e.purchase(c13770e, license2);
            InterfaceC5685e.mopub.getClass();
            C7309e c7309e = C2721e.vip;
            c13770e.m3666import();
            if (c13770e.f27292implements) {
                c13770e.mopub(c7309e);
            } else {
                c13770e.m3684volatile();
            }
            AbstractC2270e.yandex(c13770e, license3, C2721e.billing);
            AbstractC2270e.yandex(c13770e, advert, C2721e.purchase);
            AbstractC2270e.yandex(c13770e, Integer.valueOf(i3), C2721e.adcel);
            AbstractC2270e.purchase(c13770e, C2721e.mopub);
            AbstractC2270e.yandex(c13770e, purchase2, C2721e.license);
            c2892e.invoke(c13770e, Integer.valueOf((i2 >> 15) & 14));
            c13770e.Signature(true);
        } else {
            c13770e.m3659default();
        }
        C2846e subscription = c13770e.subscription();
        if (subscription != null) {
            subscription.license = new C7303e(c6540e, interfaceC3314e, interfaceC12864e, c2892e, i);
        }
    }

    /* JADX WARN: Type inference failed for: r2v4, types: [eؔۦۗ, eؙؒؐ] */
    public static final InterfaceC2998e billing(AbstractC6126e abstractC6126e) {
        InterfaceC6459e license2 = AbstractC14114e.license(abstractC6126e, C5943e.f12526e);
        C5943e c5943e = license2 instanceof C5943e ? (C5943e) license2 : null;
        if (c5943e != null) {
            return c5943e.f12527e;
        }
        return null;
    }

    public static C0388e license(String str) {
        String str2 = C10675e.f21023e;
        StringBuilder sb = new StringBuilder();
        sb.append("file");
        sb.append(':');
        if (str != null) {
            sb.append(str);
        }
        return new C0388e(sb.toString(), str2, "file", null, str);
    }

    public static final void metrica(InterfaceC16060e interfaceC16060e, C6540e c6540e, Function0 function0, InterfaceC18435e interfaceC18435e, boolean z, InterfaceC3314e interfaceC3314e, C2892e c2892e, C13770e c13770e, int i) {
        int i2;
        Object obj;
        Object obj2;
        c13770e.m3671package(-1413720282);
        if ((i & 6) == 0) {
            i2 = (c13770e.purchase(interfaceC16060e) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? c13770e.purchase(c6540e) : c13770e.yandex(c6540e) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            obj = function0;
            i2 |= c13770e.yandex(obj) ? 256 : 128;
        } else {
            obj = function0;
        }
        if ((i & 3072) == 0) {
            i2 |= c13770e.yandex(interfaceC18435e) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= c13770e.billing(z) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            obj2 = interfaceC3314e;
            i2 |= c13770e.purchase(obj2) ? 131072 : 65536;
        } else {
            obj2 = interfaceC3314e;
        }
        if ((1572864 & i) == 0) {
            i2 |= c13770e.yandex(c2892e) ? 1048576 : 524288;
        }
        int i3 = i2;
        if (c13770e.m3673protected(i3 & 1, (599187 & i3) != 599186)) {
            String appmetrica2 = AbstractC5297e.appmetrica(c13770e, R.string.tooltip_description);
            boolean yandex2 = ((i3 & 896) == 256) | ((i3 & 112) == 32 || ((i3 & 64) != 0 && c13770e.yandex(c6540e))) | c13770e.yandex(interfaceC18435e) | ((458752 & i3) == 131072);
            Object m3681throw = c13770e.m3681throw();
            if (yandex2 || m3681throw == C2987e.ad) {
                C9411e c9411e = new C9411e(obj, c6540e, interfaceC18435e, obj2, 0);
                c13770e.m3682throws(c9411e);
                m3681throw = c9411e;
            }
            AbstractC12710e.ad(interfaceC16060e, (Function0) m3681throw, new C15534e(z, 22), AbstractC16653e.license(-1287705660, new C6949e(appmetrica2, c2892e, 21), c13770e), c13770e, (i3 & 14) | 3072, 0);
        } else {
            c13770e.m3659default();
        }
        C2846e subscription = c13770e.subscription();
        if (subscription != null) {
            subscription.license = new C2959e(interfaceC16060e, c6540e, function0, interfaceC18435e, z, interfaceC3314e, c2892e, i);
        }
    }

    public static final String purchase(C0388e c0388e) {
        List yandex2 = yandex(c0388e);
        String str = c0388e.vip;
        if (yandex2.isEmpty()) {
            return null;
        }
        if (!AbstractC6507e.pro(c0388e.appmetrica, str, false)) {
            str = BuildConfig.FLAVOR;
        }
        return AbstractC13480e.m3608try(yandex2, c0388e.vip, str, null, null, 60);
    }

    public static final String startapp(String str, byte[] bArr) {
        int length = str.length();
        int max = Math.max(0, length - 2);
        int i = 0;
        int i2 = 0;
        while (true) {
            if (i >= max) {
                if (i == i2) {
                    return str;
                }
                if (i >= length) {
                    return AbstractC6507e.advert(0, i2, 5, bArr);
                }
            } else if (str.charAt(i) == '%') {
                int i3 = i + 3;
                try {
                    String substring = str.substring(i + 1, i3);
                    AbstractC15211e.ad(16);
                    bArr[i2] = (byte) Integer.parseInt(substring, 16);
                    i2++;
                    i = i3;
                } catch (NumberFormatException unused) {
                }
            }
            bArr[i2] = (byte) str.charAt(i);
            i2++;
            i++;
        }
    }

    public static final void vip(C8791e c8791e, EnumC14621e enumC14621e, C13770e c13770e, int i) {
        c13770e.m3671package(-1770945943);
        int i2 = (c13770e.purchase(c8791e) ? 4 : 2) | i | 48;
        if ((i2 & 19) == 18 && c13770e.ads()) {
            c13770e.m3659default();
        } else {
            enumC14621e = EnumC14621e.ON_RESUME;
            c13770e.m3676strictfp(-2101357749);
            boolean z = (i2 & 14) == 4;
            Object m3681throw = c13770e.m3681throw();
            C5170e c5170e = C2987e.ad;
            if (z || m3681throw == c5170e) {
                m3681throw = new C5063e(enumC14621e, c8791e, 1);
                c13770e.m3682throws(m3681throw);
            }
            InterfaceC12179e interfaceC12179e = (InterfaceC12179e) m3681throw;
            c13770e.Signature(false);
            AbstractC0003e vip2 = ((InterfaceC16400e) c13770e.adcel(AbstractC9179e.ad)).vip();
            c13770e.m3676strictfp(-2101338711);
            boolean yandex2 = c13770e.yandex(vip2) | c13770e.yandex(interfaceC12179e);
            Object m3681throw2 = c13770e.m3681throw();
            if (yandex2 || m3681throw2 == c5170e) {
                m3681throw2 = new C10869e(vip2, interfaceC12179e, 24);
                c13770e.m3682throws(m3681throw2);
            }
            c13770e.Signature(false);
            AbstractC17680e.ad(vip2, interfaceC12179e, (Function1) m3681throw2, c13770e);
        }
        C2846e subscription = c13770e.subscription();
        if (subscription != null) {
            subscription.license = new C9130e(c8791e, enumC14621e, i, 24);
        }
    }

    public static final List yandex(C0388e c0388e) {
        String str = c0388e.appmetrica;
        if (str == null) {
            return C13664e.f27089e;
        }
        ArrayList arrayList = new ArrayList();
        int i = -1;
        while (i < str.length()) {
            int i2 = i + 1;
            int m1865interface = AbstractC5304e.m1865interface(str, '/', i2, 4);
            if (m1865interface == -1) {
                m1865interface = str.length();
            }
            String substring = str.substring(i2, m1865interface);
            if (substring.length() > 0) {
                arrayList.add(substring);
            }
            i = m1865interface;
        }
        return arrayList;
    }
}
