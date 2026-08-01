package defpackage;

import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import j$.util.Objects;
import java.util.Arrays;
import java.util.List;
import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eُٟؐ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11161e {
    public static final String Signature;
    public static final String admob;
    public static final String advert;
    public static final String amazon;
    public static final String loadAd;
    public static final String mopub;
    public static final String pro;
    public static final String remoteconfig;
    public static final String smaato;
    public static final String subscription;
    public final C11858e ad;
    public final Object adcel;
    public final Uri appmetrica;
    public final Bundle billing;
    public final int license;
    public final int metrica;
    public final CharSequence purchase;
    public final boolean startapp;
    public final int vip;
    public final C15574e yandex;

    static {
        String str = AbstractC9413e.ad;
        mopub = Integer.toString(0, 36);
        advert = Integer.toString(1, 36);
        smaato = Integer.toString(2, 36);
        amazon = Integer.toString(3, 36);
        loadAd = Integer.toString(4, 36);
        Signature = Integer.toString(5, 36);
        admob = Integer.toString(6, 36);
        subscription = Integer.toString(7, 36);
        remoteconfig = Integer.toString(8, 36);
        pro = Integer.toString(9, 36);
    }

    public C11161e(C11858e c11858e, int i, int i2, int i3, Uri uri, CharSequence charSequence, Bundle bundle, boolean z, C15574e c15574e, Object obj) {
        this.ad = c11858e;
        this.vip = i;
        this.metrica = i2;
        this.license = i3;
        this.appmetrica = uri;
        this.purchase = charSequence;
        this.billing = new Bundle(bundle);
        this.startapp = z;
        this.yandex = c15574e;
        this.adcel = obj;
    }

    public static Object ad(int i, Object obj) {
        if (obj == null) {
            return null;
        }
        switch (i) {
            case 1:
                if (obj instanceof Integer) {
                    obj = Long.valueOf(((Integer) obj).longValue());
                }
                AbstractC2301e.yandex(obj instanceof Long, "Parameter has incorrect type.");
                return obj;
            case 2:
                AbstractC2301e.yandex(obj instanceof Integer, "Parameter has incorrect type.");
                return obj;
            case 3:
                AbstractC2301e.yandex(obj instanceof Boolean, "Parameter has incorrect type.");
                return obj;
            case 4:
                if (obj instanceof Double) {
                    obj = Float.valueOf(((Double) obj).floatValue());
                }
                AbstractC2301e.yandex(obj instanceof Float, "Parameter has incorrect type.");
                return obj;
            case 5:
                AbstractC2301e.yandex(obj instanceof AbstractC5340e, "Parameter has incorrect type.");
                return obj;
            case 6:
                AbstractC2301e.yandex(obj instanceof C1962e, "Parameter has incorrect type.");
                return obj;
            case 7:
                AbstractC2301e.yandex(obj instanceof C12053e, "Parameter has incorrect type.");
                return obj;
            case 8:
                AbstractC2301e.yandex(obj instanceof C4491e, "Parameter has incorrect type.");
                return obj;
            default:
                return null;
        }
    }

    public static C1410e adcel(List list, boolean z, boolean z2, int i) {
        int vip;
        if (list.isEmpty()) {
            C2171e c2171e = AbstractC17475e.f34223e;
            return C1410e.f4222e;
        }
        int i2 = -1;
        int i3 = -1;
        for (int i4 = 0; i4 < list.size(); i4++) {
            C11161e c11161e = (C11161e) list.get(i4);
            boolean z3 = c11161e.startapp;
            C15574e c15574e = c11161e.yandex;
            if (z3 && c11161e.vip()) {
                int i5 = 0;
                while (true) {
                    if (i5 < c15574e.f30742e && (vip = c15574e.vip(i5)) != 6) {
                        if (z && i2 == -1 && vip == 2) {
                            i2 = i4;
                            break;
                        }
                        if (z2 && i3 == -1 && vip == 3) {
                            i3 = i4;
                            break;
                        }
                        i5++;
                    }
                }
            }
        }
        C13304e Signature2 = AbstractC17475e.Signature();
        if (i2 != -1) {
            Signature2.metrica(((C11161e) list.get(i2)).appmetrica(2, i));
        }
        if (i3 != -1) {
            Signature2.metrica(((C11161e) list.get(i3)).appmetrica(3, i));
        }
        for (int i6 = 0; i6 < list.size(); i6++) {
            C11161e c11161e2 = (C11161e) list.get(i6);
            if (c11161e2.startapp && c11161e2.vip() && i6 != i2 && i6 != i3 && c11161e2.yandex.ad(6)) {
                Signature2.metrica(c11161e2.appmetrica(6, i));
            }
        }
        return Signature2.billing();
    }

    public static Object advert(int i, int i2, Bundle bundle, String str) {
        if (!bundle.containsKey(str)) {
            return null;
        }
        switch (i) {
            case 1:
                return Long.valueOf(bundle.getLong(str));
            case 2:
                return Integer.valueOf(bundle.getInt(str));
            case 3:
                return Boolean.valueOf(bundle.getBoolean(str));
            case 4:
                return Float.valueOf(bundle.getFloat(str));
            case 5:
                Bundle bundle2 = bundle.getBundle(str);
                bundle2.getClass();
                return AbstractC5340e.ad(bundle2);
            case 6:
                Bundle bundle3 = bundle.getBundle(str);
                bundle3.getClass();
                return C1962e.ad(i2, bundle3);
            case 7:
                Bundle bundle4 = bundle.getBundle(str);
                bundle4.getClass();
                return C12053e.vip(i2, bundle4);
            case 8:
                Bundle bundle5 = bundle.getBundle(str);
                bundle5.getClass();
                return C4491e.vip(bundle5);
            default:
                return null;
        }
    }

    public static boolean amazon(String str) {
        return str.startsWith("androidx.media3.session.PLAYER_COMMAND_") || str.startsWith("androidx.media3.session.SESSION_COMMAND_");
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0032, code lost:
    
        if (r20.ad(r4) != false) goto L15;
     */
    /* JADX WARN: Type inference failed for: r0v0, types: [eّۗؐ, eْٗۤ] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.C1410e billing(java.util.List r18, defpackage.C6689e r19, defpackage.C5298e r20) {
        /*
            eْٗۤ r0 = new eْٗۤ
            r1 = 4
            r0.<init>(r1)
            r1 = 0
        L7:
            int r2 = r18.size()
            if (r1 >= r2) goto L67
            r2 = r18
            java.lang.Object r3 = r2.get(r1)
            eُٟؐ r3 = (defpackage.C11161e) r3
            eِٜٔ r4 = r3.ad
            r5 = r19
            if (r4 == 0) goto L27
            eّٖٝ r6 = r5.ad
            boolean r4 = r6.contains(r4)
            if (r4 != 0) goto L24
            goto L27
        L24:
            r6 = r20
            goto L34
        L27:
            int r4 = r3.vip
            r6 = -1
            if (r4 == r6) goto L38
            r6 = r20
            boolean r4 = r6.ad(r4)
            if (r4 == 0) goto L3a
        L34:
            r0.metrica(r3)
            goto L64
        L38:
            r6 = r20
        L3a:
            boolean r4 = r3.startapp
            if (r4 != 0) goto L3f
            goto L61
        L3f:
            eُٟؐ r7 = new eُٟؐ
            eِٜٔ r8 = r3.ad
            int r9 = r3.vip
            int r10 = r3.metrica
            int r11 = r3.license
            android.net.Uri r12 = r3.appmetrica
            java.lang.CharSequence r13 = r3.purchase
            android.os.Bundle r14 = new android.os.Bundle
            android.os.Bundle r4 = r3.billing
            r14.<init>(r4)
            eٍٕٛ r4 = r3.yandex
            java.lang.Object r3 = r3.adcel
            r15 = 0
            r17 = r3
            r16 = r4
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            r3 = r7
        L61:
            r0.metrica(r3)
        L64:
            int r1 = r1 + 1
            goto L7
        L67:
            eؒۢۗ r0 = r0.billing()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C11161e.billing(java.util.List, eؙ۟ۢ, eِؗۧ):eؒۢۗ");
    }

    public static C11161e license(C11858e c11858e) {
        String str = c11858e.vip;
        Bundle bundle = c11858e.metrica;
        if (!str.startsWith("androidx.media3.session.PLAYER_COMMAND_")) {
            int parseInt = Integer.parseInt(str.substring(40));
            Object advert2 = advert(parseInt == 40010 ? 5 : 0, 9, bundle, "androidx.media3.session.CUSTOM_COMMAND_PARAMETER");
            C12769e c12769e = new C12769e(0);
            c12769e.appmetrica(new C11858e(parseInt), advert2);
            return c12769e.ad();
        }
        int parseInt2 = Integer.parseInt(str.substring(39));
        Object advert3 = advert(smaato(parseInt2), 9, bundle, "androidx.media3.session.CUSTOM_COMMAND_PARAMETER");
        C12769e c12769e2 = new C12769e(0);
        AbstractC2301e.yandex(c12769e2.vip == null, "sessionCommand is already set. Only one of sessionCommand and playerCommand should be set.");
        c12769e2.metrica = parseInt2;
        c12769e2.adcel = ad(smaato(parseInt2), advert3);
        return c12769e2.ad();
    }

    public static boolean metrica(int i, List list) {
        for (int i2 = 0; i2 < list.size(); i2++) {
            if (((C11161e) list.get(i2)).yandex.vip(0) == i) {
                return true;
            }
        }
        return false;
    }

    public static C1410e mopub(List list, C5298e c5298e, Bundle bundle) {
        if (list.isEmpty()) {
            C2171e c2171e = AbstractC17475e.f34223e;
            return C1410e.f4222e;
        }
        boolean ad = c5298e.ad.ad(7, 6);
        boolean ad2 = c5298e.ad.ad(9, 8);
        boolean z = bundle.getBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_PREVIOUS", false);
        boolean z2 = bundle.getBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_NEXT", false);
        int i = (ad || z) ? -1 : 0;
        int i2 = (ad2 || z2) ? -1 : i == 0 ? 1 : 0;
        C13304e Signature2 = AbstractC17475e.Signature();
        for (int i3 = 0; i3 < list.size(); i3++) {
            C11161e c11161e = (C11161e) list.get(i3);
            if (i3 == i) {
                if (i2 == -1) {
                    Signature2.metrica(c11161e.purchase(new C15574e(new int[]{2, 6})));
                } else {
                    Signature2.metrica(c11161e.purchase(new C15574e(new int[]{2, 3, 6})));
                }
            } else if (i3 == i2) {
                Signature2.metrica(c11161e.purchase(new C15574e(new int[]{3, 6})));
            } else {
                Signature2.metrica(c11161e.purchase(new C15574e(new int[]{6})));
            }
        }
        return Signature2.billing();
    }

    public static int smaato(int i) {
        if (i == 1) {
            return 3;
        }
        if (i == 5) {
            return 1;
        }
        if (i == 10) {
            return 2;
        }
        if (i == 19) {
            return 7;
        }
        if (i == 24) {
            return 4;
        }
        if (i == 29) {
            return 8;
        }
        if (i == 31) {
            return 6;
        }
        switch (i) {
            case 13:
                return 4;
            case 14:
                return 3;
            case 15:
                return 2;
            default:
                return 0;
        }
    }

    public static C11161e startapp(int i, Bundle bundle) {
        Bundle bundle2 = bundle.getBundle(mopub);
        C11858e ad = bundle2 == null ? null : C11858e.ad(bundle2);
        int i2 = bundle.getInt(advert, -1);
        int i3 = bundle.getInt(smaato, 0);
        CharSequence charSequence = bundle.getCharSequence(amazon, BuildConfig.FLAVOR);
        Bundle Signature2 = AbstractC9413e.Signature(bundle.getBundle(loadAd));
        boolean z = i < 3 || bundle.getBoolean(Signature, true);
        Uri uri = (Uri) bundle.getParcelable(admob);
        int i4 = bundle.getInt(subscription, 0);
        int[] intArray = bundle.getIntArray(remoteconfig);
        C12769e c12769e = new C12769e(i4, i3);
        String str = pro;
        if (ad != null) {
            c12769e.appmetrica(ad, advert(ad.ad == 40010 ? 5 : 0, i, bundle, str));
        }
        if (i2 != -1) {
            Object advert2 = advert(smaato(i2), i, bundle, str);
            AbstractC2301e.yandex(c12769e.vip == null, "sessionCommand is already set. Only one of sessionCommand and playerCommand should be set.");
            c12769e.metrica = i2;
            c12769e.adcel = ad(smaato(i2), advert2);
        }
        if (uri != null && (Objects.equals(uri.getScheme(), "content") || Objects.equals(uri.getScheme(), "android.resource"))) {
            c12769e.vip(uri);
        }
        c12769e.purchase = charSequence;
        if (Signature2 == null) {
            Signature2 = Bundle.EMPTY;
        }
        c12769e.billing = new Bundle(Signature2);
        c12769e.yandex = z;
        if (intArray == null) {
            intArray = new int[]{6};
        }
        AbstractC2301e.billing(intArray.length != 0);
        C15574e c15574e = C15574e.f30741e;
        c12769e.startapp = intArray.length == 0 ? C15574e.f30741e : new C15574e(Arrays.copyOf(intArray, intArray.length));
        return c12769e.ad();
    }

    public final void Signature(String str, int i, Bundle bundle) {
        C11858e c11858e = this.ad;
        int smaato2 = c11858e != null ? c11858e.ad == 40010 ? 5 : 0 : smaato(this.vip);
        Object obj = this.adcel;
        switch (smaato2) {
            case 1:
                bundle.putLong(str, ((Long) obj).longValue());
                return;
            case 2:
                bundle.putInt(str, ((Integer) obj).intValue());
                return;
            case 3:
                bundle.putBoolean(str, ((Boolean) obj).booleanValue());
                return;
            case 4:
                bundle.putFloat(str, ((Float) obj).floatValue());
                return;
            case 5:
                bundle.putBundle(str, ((AbstractC5340e) obj).metrica());
                return;
            case 6:
                bundle.putBundle(str, ((C1962e) obj).metrica(i, false));
                return;
            case 7:
                bundle.putBundle(str, ((C12053e) obj).metrica(i));
                return;
            case 8:
                bundle.putBundle(str, ((C4491e) obj).metrica());
                return;
            default:
                return;
        }
    }

    public final C11161e appmetrica(int i, int i2) {
        String str;
        C11858e c11858e = this.ad;
        if (c11858e != null && c11858e.ad == 0) {
            return purchase(new C15574e(new int[]{i}));
        }
        Bundle bundle = Bundle.EMPTY;
        if (this.adcel != null) {
            bundle = new Bundle();
            Signature("androidx.media3.session.CUSTOM_COMMAND_PARAMETER", i2, bundle);
        }
        if (c11858e != null) {
            str = "androidx.media3.session.SESSION_COMMAND_" + c11858e.ad;
        } else {
            str = "androidx.media3.session.PLAYER_COMMAND_" + this.vip;
        }
        return new C11161e(new C11858e(str, bundle), -1, this.metrica, this.license, this.appmetrica, this.purchase, this.billing, this.startapp, new C15574e(new int[]{i}), null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C11161e)) {
            return false;
        }
        C11161e c11161e = (C11161e) obj;
        return Objects.equals(this.ad, c11161e.ad) && this.vip == c11161e.vip && this.metrica == c11161e.metrica && this.license == c11161e.license && Objects.equals(this.appmetrica, c11161e.appmetrica) && TextUtils.equals(this.purchase, c11161e.purchase) && this.startapp == c11161e.startapp && this.yandex.equals(c11161e.yandex) && Objects.equals(this.adcel, c11161e.adcel);
    }

    public final int hashCode() {
        return Objects.hash(this.ad, Integer.valueOf(this.vip), Integer.valueOf(this.metrica), Integer.valueOf(this.license), this.purchase, Boolean.valueOf(this.startapp), this.appmetrica, this.yandex, this.adcel);
    }

    public final Bundle loadAd(int i) {
        Bundle bundle = new Bundle();
        C11858e c11858e = this.ad;
        if (c11858e != null) {
            bundle.putBundle(mopub, c11858e.vip());
        }
        int i2 = this.vip;
        if (i2 != -1) {
            bundle.putInt(advert, i2);
        }
        int i3 = this.metrica;
        if (i3 != 0) {
            bundle.putInt(subscription, i3);
        }
        int i4 = this.license;
        if (i4 != 0) {
            bundle.putInt(smaato, i4);
        }
        CharSequence charSequence = this.purchase;
        if (charSequence != BuildConfig.FLAVOR) {
            bundle.putCharSequence(amazon, charSequence);
        }
        Bundle bundle2 = this.billing;
        if (!bundle2.isEmpty()) {
            bundle.putBundle(loadAd, bundle2);
        }
        Uri uri = this.appmetrica;
        if (uri != null) {
            bundle.putParcelable(admob, uri);
        }
        boolean z = this.startapp;
        if (!z) {
            bundle.putBoolean(Signature, z);
        }
        C15574e c15574e = this.yandex;
        if (c15574e.f30742e != 1 || c15574e.vip(0) != 6) {
            bundle.putIntArray(remoteconfig, Arrays.copyOfRange(c15574e.f30743e, 0, c15574e.f30742e));
        }
        if (this.adcel != null) {
            Signature(pro, i, bundle);
        }
        return bundle;
    }

    public final C11161e purchase(C15574e c15574e) {
        if (this.yandex.equals(c15574e)) {
            return this;
        }
        return new C11161e(this.ad, this.vip, this.metrica, this.license, this.appmetrica, this.purchase, new Bundle(this.billing), this.startapp, c15574e, this.adcel);
    }

    public final boolean vip() {
        Object obj = this.adcel;
        C11858e c11858e = this.ad;
        if (c11858e != null) {
            int i = c11858e.ad;
            if (i != 0) {
                return i == 40010 && obj != null;
            }
            return true;
        }
        int i2 = this.vip;
        if (i2 != 19) {
            if (i2 != 24) {
                if (i2 != 29 && i2 != 31) {
                    switch (i2) {
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 6:
                        case 7:
                        case 8:
                        case 9:
                        case 11:
                        case 12:
                        case 14:
                            break;
                        case 5:
                        case 10:
                        case 13:
                        case 15:
                            break;
                        default:
                            return false;
                    }
                }
            }
            return true;
        }
        return obj != null;
    }

    public final void yandex(InterfaceC16843e interfaceC16843e) {
        if (this.startapp) {
            Object obj = this.adcel;
            int i = this.vip;
            if (i == 19) {
                if (obj != null) {
                    interfaceC16843e.mo2096e((C12053e) obj);
                    return;
                }
                return;
            }
            if (i == 24) {
                if (obj != null) {
                    interfaceC16843e.mo2126for(((Float) obj).floatValue());
                    return;
                } else if (interfaceC16843e.mo2064catch() == 0.0f) {
                    interfaceC16843e.mo2078e();
                    return;
                } else {
                    interfaceC16843e.mo2072e();
                    return;
                }
            }
            if (i == 29) {
                if (obj != null) {
                    interfaceC16843e.mo2138synchronized((C4491e) obj);
                    return;
                }
                return;
            }
            if (i == 31) {
                if (obj != null) {
                    interfaceC16843e.mo2103e((C1962e) obj);
                    return;
                }
                return;
            }
            switch (i) {
                case 1:
                    if (obj != null) {
                        interfaceC16843e.mo2123e(((Boolean) obj).booleanValue());
                        return;
                    } else {
                        interfaceC16843e.mo2123e(!interfaceC16843e.mo2129interface());
                        return;
                    }
                case 2:
                    interfaceC16843e.license();
                    return;
                case 3:
                    interfaceC16843e.stop();
                    return;
                case 4:
                    interfaceC16843e.mo2125final();
                    return;
                case 5:
                    if (obj != null) {
                        interfaceC16843e.admob(((Long) obj).longValue());
                        return;
                    }
                    return;
                case 6:
                    interfaceC16843e.mo2063case();
                    return;
                case 7:
                    interfaceC16843e.mo2066continue();
                    return;
                case 8:
                    interfaceC16843e.mo2080e();
                    return;
                case 9:
                    interfaceC16843e.mo2109e();
                    return;
                case 10:
                    if (obj != null) {
                        interfaceC16843e.mo2092e(((Integer) obj).intValue());
                        return;
                    }
                    return;
                case 11:
                    interfaceC16843e.mo2093e();
                    return;
                case 12:
                    interfaceC16843e.mo2077e();
                    return;
                case 13:
                    if (obj != null) {
                        interfaceC16843e.purchase(((Float) obj).floatValue());
                        return;
                    }
                    return;
                case 14:
                    if (obj != null) {
                        interfaceC16843e.mo2130native(((Boolean) obj).booleanValue());
                        return;
                    } else {
                        interfaceC16843e.mo2130native(!interfaceC16843e.mo2091e());
                        return;
                    }
                case 15:
                    if (obj != null) {
                        interfaceC16843e.signatures(((Integer) obj).intValue());
                        return;
                    }
                    return;
                default:
                    return;
            }
        }
    }
}
