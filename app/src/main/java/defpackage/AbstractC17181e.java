package defpackage;

import android.content.SharedPreferences;
import android.content.res.Resources;
import android.net.Uri;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.conscrypt.BuildConfig;
import org.conscrypt.PSKKeyManager;
import ua.itaysonlab.vkx.R;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eِٟٗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC17181e implements InterfaceC7998e {

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public static final long[] f33686e = {3161836309350906777L, -7642453882179322845L, -3821226941089661423L, 7312758566309945096L, -556661012383879292L, 8945041530681231562L, -4750851271514160027L, 6847946401097695794L, 541669439031730457L};

    public static void Signature(long[] jArr, long[] jArr2) {
        AbstractC15792e.license(9, jArr, jArr2);
    }

    public static void adcel(long[] jArr, int i, long[] jArr2, int i2, long[] jArr3, int i3) {
        for (int i4 = 0; i4 < 9; i4++) {
            int i5 = i3 + i4;
            jArr3[i5] = jArr3[i5] ^ (jArr[i + i4] ^ jArr2[i2 + i4]);
        }
    }

    public static final boolean admob(C15566e c15566e, C6399e c6399e) {
        String m3398extends;
        CharSequence charSequence;
        String str = c15566e.f30735e;
        String str2 = c15566e.f30736e;
        if (str2 != null && (m3398extends = AbstractC12797e.m3398extends(str2)) != null) {
            char[] cArr = {'.'};
            int length = m3398extends.length();
            int i = 0;
            while (true) {
                if (i >= length) {
                    charSequence = BuildConfig.FLAVOR;
                    break;
                }
                char charAt = m3398extends.charAt(i);
                int i2 = 0;
                while (true) {
                    if (i2 >= 1) {
                        i2 = -1;
                        break;
                    }
                    if (charAt == cArr[i2]) {
                        break;
                    }
                    i2++;
                }
                if (!(i2 >= 0)) {
                    charSequence = m3398extends.subSequence(i, m3398extends.length());
                    break;
                }
                i++;
            }
            String obj = charSequence.toString();
            if (obj != null) {
                if (str == null) {
                    throw new IllegalStateException("Path field should have the default value");
                }
                if (!AbstractC5304e.premium(str, '/')) {
                    str = str.concat("/");
                }
                String m3398extends2 = AbstractC12797e.m3398extends(c6399e.f13273e);
                String str3 = (String) c6399e.f13262e.getValue();
                if (!AbstractC5304e.premium(str3, '/')) {
                    str3 = str3.concat("/");
                }
                return (AbstractC7890e.billing(m3398extends2, obj) || (!((C10445e) AbstractC13693e.ad.f13613e).license(m3398extends2) && AbstractC6507e.amazon(m3398extends2, ".".concat(obj), false))) && (AbstractC7890e.billing(str, "/") || AbstractC7890e.billing(str3, str) || AbstractC6507e.pro(str3, str, false)) && (!c15566e.f30731e || AbstractC0815e.adcel(c6399e.f13270e));
            }
        }
        throw new IllegalStateException("Domain field should have the default value");
    }

    public static void advert(long[] jArr, long[] jArr2, long[] jArr3) {
        for (int i = 0; i < 18; i++) {
            jArr3[i] = jArr[i] ^ jArr2[i];
        }
    }

    public static void amazon(long[] jArr, long[] jArr2, long[] jArr3) {
        int i = 56;
        while (true) {
            long j = 0;
            int i2 = 0;
            if (i < 0) {
                break;
            }
            for (int i3 = 1; i3 < 9; i3 += 2) {
                int i4 = (int) (jArr[i3] >>> i);
                adcel(jArr2, (i4 & 15) * 9, jArr2, (((i4 >>> 4) & 15) + 16) * 9, jArr3, i3 - 1);
            }
            while (i2 < 16) {
                long j2 = jArr3[i2];
                jArr3[i2] = (j >>> (-8)) | (j2 << 8);
                i2++;
                j = j2;
            }
            i -= 8;
        }
        for (int i5 = 56; i5 >= 0; i5 -= 8) {
            int i6 = 0;
            while (i6 < 9) {
                int i7 = (int) (jArr[i6] >>> i5);
                int i8 = i6;
                adcel(jArr2, (i7 & 15) * 9, jArr2, (((i7 >>> 4) & 15) + 16) * 9, jArr3, i8);
                i6 = i8 + 2;
            }
            if (i5 > 0) {
                long j3 = 0;
                int i9 = 0;
                while (i9 < 18) {
                    long j4 = jArr3[i9];
                    jArr3[i9] = (j3 >>> (-8)) | (j4 << 8);
                    i9++;
                    j3 = j4;
                }
            }
        }
    }

    public static final void appmetrica(String str, String str2, Function1 function1, C13770e c13770e, int i) {
        String str3;
        Function1 function12;
        c13770e.m3671package(-1551197982);
        int i2 = i | 24960;
        if (c13770e.m3673protected(i2 & 1, (i2 & 9363) != 9362)) {
            Object m3681throw = c13770e.m3681throw();
            Object obj = C2987e.ad;
            if (m3681throw == obj) {
                m3681throw = new C7983e(18);
                c13770e.m3682throws(m3681throw);
            }
            Function1 function13 = (Function1) m3681throw;
            Object m3681throw2 = c13770e.m3681throw();
            if (m3681throw2 == obj) {
                SharedPreferences sharedPreferences = AbstractC16082e.license;
                Object c16110e = new C16110e(sharedPreferences != null ? sharedPreferences : null, str, false, function13, new C7983e(20));
                c13770e.m3682throws(c16110e);
                m3681throw2 = c16110e;
            }
            C16110e c16110e2 = (C16110e) m3681throw2;
            c13770e.m3676strictfp(2109515355);
            c13770e.Signature(false);
            InterfaceC12864e metrica = AbstractC18007e.metrica(C0115e.f1276e, 1.0f);
            boolean yandex = c13770e.yandex(c16110e2);
            Object m3681throw3 = c13770e.m3681throw();
            if (yandex || m3681throw3 == obj) {
                m3681throw3 = new C6317e(0, c16110e2, C16110e.class, "switch", "switch()V", 0, 0, 0);
                c13770e.m3682throws(m3681throw3);
            }
            str3 = str2;
            AbstractC16429e.ad(AbstractC16653e.license(2013501892, new C11449e(str3, 17), c13770e), AbstractC9546e.license(metrica, false, null, (Function0) ((InterfaceC5261e) m3681throw3), 15), null, null, null, AbstractC16653e.license(-1178722465, new C14295e(c16110e2, 1), c13770e), null, 0.0f, 0.0f, c13770e, 196614, 468);
            function12 = function13;
        } else {
            str3 = str2;
            c13770e.m3659default();
            function12 = function1;
        }
        C2846e subscription = c13770e.subscription();
        if (subscription != null) {
            subscription.license = new C4197e(i, 27, str, str3, function12);
        }
    }

    public static final void billing(InterfaceC16400e interfaceC16400e, C0057e c0057e, Function1 function1, C13770e c13770e, int i) {
        int i2;
        c13770e.m3671package(228371534);
        if ((i & 6) == 0) {
            i2 = (c13770e.yandex(interfaceC16400e) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= c13770e.yandex(c0057e) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= c13770e.yandex(function1) ? 256 : 128;
        }
        if (c13770e.m3673protected(i2 & 1, (i2 & 147) != 146)) {
            boolean yandex = c13770e.yandex(c0057e) | ((i2 & 896) == 256) | c13770e.yandex(interfaceC16400e);
            Object m3681throw = c13770e.m3681throw();
            if (yandex || m3681throw == C2987e.ad) {
                m3681throw = new Cthrows(23, interfaceC16400e, c0057e, function1);
                c13770e.m3682throws(m3681throw);
            }
            AbstractC17680e.ad(interfaceC16400e, c0057e, (Function1) m3681throw, c13770e);
        } else {
            c13770e.m3659default();
        }
        C2846e subscription = c13770e.subscription();
        if (subscription != null) {
            subscription.license = new C9381e(i, 18, interfaceC16400e, c0057e, function1);
        }
    }

    public static void inmobi(int i, long[] jArr, long[] jArr2) {
        long[] jArr3 = new long[18];
        Signature(jArr, jArr3);
        while (true) {
            tapsense(jArr3, jArr2);
            i--;
            if (i <= 0) {
                return;
            } else {
                Signature(jArr2, jArr3);
            }
        }
    }

    public static final InputStream isPro(C11467e c11467e) {
        C10005e ad = ((InterfaceC1312e) c11467e.f23072e).ad((Uri) c11467e.f23071e);
        ArrayList arrayList = new ArrayList();
        arrayList.add(ad);
        ArrayList arrayList2 = (ArrayList) c11467e.f23069e;
        if (!arrayList2.isEmpty()) {
            int i = C17473e.f34221e;
            ArrayList arrayList3 = new ArrayList();
            Iterator it = arrayList2.iterator();
            if (it.hasNext()) {
                throw AbstractC5087e.m1747goto(it);
            }
            C17473e c17473e = !arrayList3.isEmpty() ? new C17473e(ad, arrayList3) : null;
            if (c17473e != null) {
                arrayList.add(c17473e);
            }
        }
        Iterator it2 = ((AbstractC17475e) c11467e.f23070e).iterator();
        if (!it2.hasNext()) {
            Collections.reverse(arrayList);
            return (InputStream) arrayList.get(0);
        }
        if (it2.next() != null) {
            throw new ClassCastException();
        }
        throw null;
    }

    public static void isVip(long[] jArr, long[] jArr2) {
        long[] jArr3 = new long[18];
        Signature(jArr, jArr3);
        tapsense(jArr3, jArr2);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:55:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0068  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void license(final java.lang.String r26, final int r27, int r28, final boolean r29, boolean r30, kotlin.jvm.functions.Function1 r31, defpackage.C13770e r32, final int r33, final int r34) {
        /*
            Method dump skipped, instructions count: 387
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC17181e.license(java.lang.String, int, int, boolean, boolean, kotlin.jvm.functions.Function1, eٓؕۥ, int, int):void");
    }

    public static void loadAd(long[] jArr, long j, long j2, long[] jArr2, int i) {
        long j3 = j;
        jArr[1] = j2;
        for (int i2 = 2; i2 < 16; i2 += 2) {
            long j4 = jArr[i2 >>> 1] << 1;
            jArr[i2] = j4;
            jArr[i2 + 1] = j4 ^ j2;
        }
        int i3 = (int) j3;
        long j5 = jArr[i3 & 15] ^ (jArr[(i3 >>> 4) & 15] << 4);
        long j6 = 0;
        int i4 = 56;
        do {
            int i5 = (int) (j3 >>> i4);
            long j7 = jArr[i5 & 15] ^ (jArr[(i5 >>> 4) & 15] << 4);
            j5 ^= j7 << i4;
            j6 ^= j7 >>> (-i4);
            i4 -= 8;
        } while (i4 > 0);
        for (int i6 = 0; i6 < 7; i6++) {
            j3 = (j3 & (-72340172838076674L)) >>> 1;
            j6 ^= ((j2 << i6) >> 63) & j3;
        }
        jArr2[i] = jArr2[i] ^ j5;
        int i7 = i + 1;
        jArr2[i7] = jArr2[i7] ^ j6;
    }

    public static final void metrica(Function1 function1, C13770e c13770e, int i) {
        Function1 function12;
        c13770e.m3671package(1045600533);
        int i2 = (c13770e.license(R.string.st_ac) ? 32 : 16) | i | (c13770e.license(R.array.AutoCacheConfig) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128) | (c13770e.license(R.array.AutoCacheConfigValues) ? 2048 : 1024) | 196608;
        if (c13770e.m3673protected(i2 & 1, (74899 & i2) != 74898)) {
            Object m3681throw = c13770e.m3681throw();
            C5170e c5170e = C2987e.ad;
            if (m3681throw == c5170e) {
                m3681throw = new C7983e(19);
                c13770e.m3682throws(m3681throw);
            }
            function12 = (Function1) m3681throw;
            C5015e c5015e = AbstractC2676e.metrica;
            Object[] stringArray = ((Resources) c13770e.adcel(c5015e)).getStringArray(R.array.AutoCacheConfig);
            String[] stringArray2 = ((Resources) c13770e.adcel(c5015e)).getStringArray(R.array.AutoCacheConfigValues);
            Object m3681throw2 = c13770e.m3681throw();
            if (m3681throw2 == c5170e) {
                SharedPreferences sharedPreferences = AbstractC16082e.license;
                if (sharedPreferences == null) {
                    sharedPreferences = null;
                }
                m3681throw2 = new C10011e(sharedPreferences, function12);
                c13770e.m3682throws(m3681throw2);
            }
            C10011e c10011e = (C10011e) m3681throw2;
            Object m3681throw3 = c13770e.m3681throw();
            if (m3681throw3 == c5170e) {
                m3681throw3 = AbstractC14533e.startapp(Boolean.FALSE);
                c13770e.m3682throws(m3681throw3);
            }
            InterfaceC3314e interfaceC3314e = (InterfaceC3314e) m3681throw3;
            boolean purchase = c13770e.purchase((String) c10011e.metrica.getValue());
            Object m3681throw4 = c13770e.m3681throw();
            if (purchase || m3681throw4 == c5170e) {
                m3681throw4 = stringArray[AbstractC1660e.firebase((String) c10011e.metrica.getValue(), stringArray2)];
                c13770e.m3682throws(m3681throw4);
            }
            String str = (String) m3681throw4;
            InterfaceC12864e metrica = AbstractC18007e.metrica(C0115e.f1276e, 1.0f);
            Object m3681throw5 = c13770e.m3681throw();
            if (m3681throw5 == c5170e) {
                m3681throw5 = new C1672e(interfaceC3314e, 25);
                c13770e.m3682throws(m3681throw5);
            }
            AbstractC16429e.ad(AbstractC16653e.license(-819931789, new C14151e((byte) 0, 3), c13770e), AbstractC9546e.license(metrica, false, null, (Function0) m3681throw5, 15), null, AbstractC16653e.license(1967383606, new C11449e(str, 16), c13770e), null, AbstractC16653e.license(-1901029192, new C6409e(interfaceC3314e, (Object) stringArray2, (Object) c10011e, (Object) stringArray, 20), c13770e), null, 0.0f, 0.0f, c13770e, 199686, 468);
        } else {
            c13770e.m3659default();
            function12 = function1;
        }
        C2846e subscription = c13770e.subscription();
        if (subscription != null) {
            subscription.license = new C6282e(i, function12);
        }
    }

    public static void mopub(long[] jArr, long[] jArr2, long[] jArr3) {
        for (int i = 0; i < 9; i++) {
            jArr3[i] = jArr3[i] ^ (jArr[i] ^ jArr2[i]);
        }
    }

    public static void pro(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] jArr4 = new long[18];
        amazon(jArr, jArr2, jArr4);
        tapsense(jArr4, jArr3);
    }

    public static final void purchase(Boolean bool, Object obj, InterfaceC16400e interfaceC16400e, Function1 function1, C13770e c13770e, int i) {
        int i2;
        c13770e.m3671package(696924721);
        if ((i & 6) == 0) {
            i2 = (c13770e.yandex(bool) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= c13770e.yandex(obj) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= 128;
        }
        if ((i & 3072) == 0) {
            i2 |= c13770e.yandex(function1) ? 2048 : 1024;
        }
        if (c13770e.m3673protected(i2 & 1, (i2 & 1171) != 1170)) {
            c13770e.m3655case();
            if ((i & 1) == 0 || c13770e.isPro()) {
                interfaceC16400e = (InterfaceC16400e) c13770e.adcel(AbstractC9179e.ad);
            } else {
                c13770e.m3659default();
            }
            int i3 = i2 & (-897);
            c13770e.admob();
            boolean purchase = c13770e.purchase(bool) | c13770e.purchase(obj) | c13770e.purchase(interfaceC16400e);
            Object m3681throw = c13770e.m3681throw();
            if (purchase || m3681throw == C2987e.ad) {
                m3681throw = new C0057e(interfaceC16400e.vip());
                c13770e.m3682throws(m3681throw);
            }
            billing(interfaceC16400e, (C0057e) m3681throw, function1, c13770e, (i3 >> 3) & 896);
        } else {
            c13770e.m3659default();
        }
        InterfaceC16400e interfaceC16400e2 = interfaceC16400e;
        C2846e subscription = c13770e.subscription();
        if (subscription != null) {
            subscription.license = new C7303e(bool, obj, interfaceC16400e2, function1, i, 6);
        }
    }

    public static void remoteconfig(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] jArr4 = new long[18];
        smaato(jArr, jArr2, jArr4);
        advert(jArr3, jArr4, jArr3);
    }

    public static long[] signatures(long[] jArr) {
        long j;
        long[] jArr2 = new long[288];
        int i = 0;
        System.arraycopy(jArr, 0, jArr2, 9, 9);
        int i2 = 7;
        int i3 = 0;
        while (true) {
            j = 0;
            if (i2 <= 0) {
                break;
            }
            int i4 = i3 + 18;
            int i5 = i4 >>> 1;
            int i6 = 0;
            while (i6 < 9) {
                long j2 = jArr2[i5 + i6];
                jArr2[i4 + i6] = (j >>> 63) | (j2 << 1);
                i6++;
                j = j2;
            }
            int i7 = i3 + 26;
            long j3 = jArr2[i7];
            long j4 = j3 >>> 59;
            jArr2[i4] = ((j4 << 10) ^ (((j4 << 2) ^ j4) ^ (j4 << 5))) ^ jArr2[i4];
            jArr2[i7] = j3 & 576460752303423487L;
            int i8 = i3 + 27;
            for (int i9 = 0; i9 < 9; i9++) {
                jArr2[i8 + i9] = jArr2[9 + i9] ^ jArr2[i4 + i9];
            }
            i2--;
            i3 = i4;
        }
        while (i < 144) {
            long j5 = jArr2[i];
            jArr2[144 + i] = (j >>> (-4)) | (j5 << 4);
            i++;
            j = j5;
        }
        return jArr2;
    }

    public static void smaato(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] jArr4 = new long[16];
        for (int i = 0; i < 9; i++) {
            loadAd(jArr4, jArr[i], jArr2[i], jArr3, i << 1);
        }
        long j = jArr3[0];
        long j2 = jArr3[1];
        long j3 = jArr3[2] ^ j;
        long j4 = j3 ^ j2;
        jArr3[1] = j4;
        long j5 = j2 ^ jArr3[3];
        long j6 = j3 ^ jArr3[4];
        long j7 = j6 ^ j5;
        jArr3[2] = j7;
        long j8 = j5 ^ jArr3[5];
        long j9 = j6 ^ jArr3[6];
        long j10 = j9 ^ j8;
        jArr3[3] = j10;
        long j11 = j8 ^ jArr3[7];
        long j12 = j9 ^ jArr3[8];
        long j13 = j12 ^ j11;
        jArr3[4] = j13;
        long j14 = j11 ^ jArr3[9];
        long j15 = j12 ^ jArr3[10];
        long j16 = j15 ^ j14;
        jArr3[5] = j16;
        long j17 = j14 ^ jArr3[11];
        long j18 = j15 ^ jArr3[12];
        long j19 = j18 ^ j17;
        jArr3[6] = j19;
        long j20 = j17 ^ jArr3[13];
        long j21 = j18 ^ jArr3[14];
        long j22 = j21 ^ j20;
        jArr3[7] = j22;
        long j23 = j20 ^ jArr3[15];
        long j24 = j21 ^ jArr3[16];
        long j25 = j24 ^ j23;
        jArr3[8] = j25;
        long j26 = (j23 ^ jArr3[17]) ^ j24;
        jArr3[9] = j ^ j26;
        jArr3[10] = j4 ^ j26;
        jArr3[11] = j7 ^ j26;
        jArr3[12] = j10 ^ j26;
        jArr3[13] = j13 ^ j26;
        jArr3[14] = j16 ^ j26;
        jArr3[15] = j19 ^ j26;
        jArr3[16] = j22 ^ j26;
        jArr3[17] = j25 ^ j26;
        loadAd(jArr4, jArr[0] ^ jArr[1], jArr2[0] ^ jArr2[1], jArr3, 1);
        loadAd(jArr4, jArr[0] ^ jArr[2], jArr2[0] ^ jArr2[2], jArr3, 2);
        loadAd(jArr4, jArr[0] ^ jArr[3], jArr2[0] ^ jArr2[3], jArr3, 3);
        loadAd(jArr4, jArr[1] ^ jArr[2], jArr2[1] ^ jArr2[2], jArr3, 3);
        loadAd(jArr4, jArr[0] ^ jArr[4], jArr2[0] ^ jArr2[4], jArr3, 4);
        loadAd(jArr4, jArr[1] ^ jArr[3], jArr2[1] ^ jArr2[3], jArr3, 4);
        loadAd(jArr4, jArr[0] ^ jArr[5], jArr2[0] ^ jArr2[5], jArr3, 5);
        loadAd(jArr4, jArr[1] ^ jArr[4], jArr2[1] ^ jArr2[4], jArr3, 5);
        loadAd(jArr4, jArr[2] ^ jArr[3], jArr2[2] ^ jArr2[3], jArr3, 5);
        loadAd(jArr4, jArr[0] ^ jArr[6], jArr2[0] ^ jArr2[6], jArr3, 6);
        loadAd(jArr4, jArr[1] ^ jArr[5], jArr2[1] ^ jArr2[5], jArr3, 6);
        loadAd(jArr4, jArr[2] ^ jArr[4], jArr2[2] ^ jArr2[4], jArr3, 6);
        loadAd(jArr4, jArr[0] ^ jArr[7], jArr2[0] ^ jArr2[7], jArr3, 7);
        loadAd(jArr4, jArr[1] ^ jArr[6], jArr2[1] ^ jArr2[6], jArr3, 7);
        loadAd(jArr4, jArr[2] ^ jArr[5], jArr2[2] ^ jArr2[5], jArr3, 7);
        loadAd(jArr4, jArr[3] ^ jArr[4], jArr2[3] ^ jArr2[4], jArr3, 7);
        loadAd(jArr4, jArr[0] ^ jArr[8], jArr2[0] ^ jArr2[8], jArr3, 8);
        loadAd(jArr4, jArr[1] ^ jArr[7], jArr2[1] ^ jArr2[7], jArr3, 8);
        loadAd(jArr4, jArr[2] ^ jArr[6], jArr2[2] ^ jArr2[6], jArr3, 8);
        loadAd(jArr4, jArr[3] ^ jArr[5], jArr2[3] ^ jArr2[5], jArr3, 8);
        loadAd(jArr4, jArr[1] ^ jArr[8], jArr2[1] ^ jArr2[8], jArr3, 9);
        loadAd(jArr4, jArr[2] ^ jArr[7], jArr2[2] ^ jArr2[7], jArr3, 9);
        loadAd(jArr4, jArr[3] ^ jArr[6], jArr2[3] ^ jArr2[6], jArr3, 9);
        loadAd(jArr4, jArr[4] ^ jArr[5], jArr2[4] ^ jArr2[5], jArr3, 9);
        loadAd(jArr4, jArr[2] ^ jArr[8], jArr2[2] ^ jArr2[8], jArr3, 10);
        loadAd(jArr4, jArr[3] ^ jArr[7], jArr2[3] ^ jArr2[7], jArr3, 10);
        loadAd(jArr4, jArr[4] ^ jArr[6], jArr2[4] ^ jArr2[6], jArr3, 10);
        loadAd(jArr4, jArr[3] ^ jArr[8], jArr2[3] ^ jArr2[8], jArr3, 11);
        loadAd(jArr4, jArr[4] ^ jArr[7], jArr2[4] ^ jArr2[7], jArr3, 11);
        loadAd(jArr4, jArr[5] ^ jArr[6], jArr2[5] ^ jArr2[6], jArr3, 11);
        loadAd(jArr4, jArr[4] ^ jArr[8], jArr2[4] ^ jArr2[8], jArr3, 12);
        loadAd(jArr4, jArr[5] ^ jArr[7], jArr2[5] ^ jArr2[7], jArr3, 12);
        loadAd(jArr4, jArr[5] ^ jArr[8], jArr2[5] ^ jArr2[8], jArr3, 13);
        loadAd(jArr4, jArr[6] ^ jArr[7], jArr2[6] ^ jArr2[7], jArr3, 13);
        loadAd(jArr4, jArr[6] ^ jArr[8], jArr2[6] ^ jArr2[8], jArr3, 14);
        loadAd(jArr4, jArr[7] ^ jArr[8], jArr2[7] ^ jArr2[8], jArr3, 15);
    }

    public static void startapp(long[] jArr, long[] jArr2, long[] jArr3) {
        for (int i = 0; i < 9; i++) {
            jArr3[i] = jArr[i] ^ jArr2[i];
        }
    }

    public static void subscription(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] jArr4 = new long[18];
        smaato(jArr, jArr2, jArr4);
        tapsense(jArr4, jArr3);
    }

    public static void tapsense(long[] jArr, long[] jArr2) {
        long j = jArr[9];
        long j2 = jArr[17];
        long j3 = (((j ^ (j2 >>> 59)) ^ (j2 >>> 57)) ^ (j2 >>> 54)) ^ (j2 >>> 49);
        long j4 = (j2 << 15) ^ (((jArr[8] ^ (j2 << 5)) ^ (j2 << 7)) ^ (j2 << 10));
        for (int i = 16; i >= 10; i--) {
            long j5 = jArr[i];
            jArr2[i - 8] = (((j4 ^ (j5 >>> 59)) ^ (j5 >>> 57)) ^ (j5 >>> 54)) ^ (j5 >>> 49);
            j4 = (((jArr[i - 9] ^ (j5 << 5)) ^ (j5 << 7)) ^ (j5 << 10)) ^ (j5 << 15);
        }
        jArr2[1] = (((j4 ^ (j3 >>> 59)) ^ (j3 >>> 57)) ^ (j3 >>> 54)) ^ (j3 >>> 49);
        long j6 = (j3 << 15) ^ (((jArr[0] ^ (j3 << 5)) ^ (j3 << 7)) ^ (j3 << 10));
        long j7 = jArr2[8];
        long j8 = j7 >>> 59;
        jArr2[0] = (((j6 ^ j8) ^ (j8 << 2)) ^ (j8 << 5)) ^ (j8 << 10);
        jArr2[8] = 576460752303423487L & j7;
    }

    public static final void vip(String str, C13770e c13770e, int i) {
        c13770e.m3671package(-753066479);
        int i2 = i | (c13770e.purchase(str) ? 4 : 2);
        if (c13770e.m3673protected(i2 & 1, (i2 & 3) != 2)) {
            AbstractC14489e.vip(str, AbstractC12220e.advert(C0115e.f1276e, 16, 12), C3618e.vip(0.7f, ((C7019e) c13770e.adcel(AbstractC11785e.ad)).ad.admob), 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c13770e, (i2 & 14) | 48, 0, 262136);
        } else {
            c13770e.m3659default();
        }
        C2846e subscription = c13770e.subscription();
        if (subscription != null) {
            subscription.license = new C11449e(str, i, 15);
        }
    }

    public static final void yandex(final C1733e c1733e, boolean z, Function1 function1, Function1 function12, C13770e c13770e, int i, int i2) {
        boolean z2;
        int i3;
        Function1 function13;
        int i4;
        Function1 function14;
        int i5;
        boolean z3;
        Function1 function15;
        Function1 function16;
        Function1 function17;
        Function1 function18;
        C2892e c2892e;
        c13770e.m3671package(-724741042);
        int i6 = i | (c13770e.yandex(c1733e) ? 4 : 2);
        int i7 = i2 & 2;
        if (i7 != 0) {
            i3 = i6 | 48;
            z2 = z;
        } else {
            z2 = z;
            i3 = i6 | (c13770e.billing(z2) ? 32 : 16);
        }
        int i8 = i2 & 4;
        if (i8 != 0) {
            i4 = i3 | 384;
            function13 = function1;
        } else {
            function13 = function1;
            i4 = i3 | (c13770e.yandex(function13) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128);
        }
        int i9 = i2 & 8;
        if (i9 != 0) {
            i5 = i4 | 3072;
            function14 = function12;
        } else {
            function14 = function12;
            i5 = i4 | (c13770e.yandex(function14) ? 2048 : 1024);
        }
        if (c13770e.m3673protected(i5 & 1, (i5 & 1171) != 1170)) {
            final boolean z4 = i7 != 0 ? true : z2;
            C5170e c5170e = C2987e.ad;
            if (i8 != 0) {
                Object m3681throw = c13770e.m3681throw();
                if (m3681throw == c5170e) {
                    m3681throw = new C7983e(20);
                    c13770e.m3682throws(m3681throw);
                }
                function17 = (Function1) m3681throw;
            } else {
                function17 = function13;
            }
            if (i9 != 0) {
                Object m3681throw2 = c13770e.m3681throw();
                if (m3681throw2 == c5170e) {
                    m3681throw2 = new C7983e(21);
                    c13770e.m3682throws(m3681throw2);
                }
                function18 = (Function1) m3681throw2;
            } else {
                function18 = function14;
            }
            Object m3681throw3 = c13770e.m3681throw();
            if (m3681throw3 == c5170e) {
                SharedPreferences sharedPreferences = AbstractC9357e.billing;
                C16110e c16110e = new C16110e(sharedPreferences != null ? sharedPreferences : null, c1733e.ad, ((Boolean) c1733e.metrica).booleanValue(), function18, function17);
                c13770e.m3682throws(c16110e);
                m3681throw3 = c16110e;
            }
            C16110e c16110e2 = (C16110e) m3681throw3;
            if (c1733e.appmetrica != null) {
                c13770e.m3676strictfp(40884372);
                final int i10 = 0;
                c2892e = AbstractC16653e.license(2103377805, new Function2() { // from class: eًٜ٘
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        switch (i10) {
                            case 0:
                                C13770e c13770e2 = (C13770e) obj;
                                int intValue = ((Integer) obj2).intValue();
                                if (c13770e2.m3673protected(intValue & 1, (intValue & 3) != 2)) {
                                    Integer num = c1733e.appmetrica;
                                    AbstractC14489e.vip(AbstractC5297e.appmetrica(c13770e2, num != null ? num.intValue() : 0), AbstractC1376e.ad(C0115e.f1276e, z4 ? 1.0f : 0.75f), 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c13770e2, 0, 0, 262140);
                                } else {
                                    c13770e2.m3659default();
                                }
                                return Unit.INSTANCE;
                            default:
                                C13770e c13770e3 = (C13770e) obj;
                                int intValue2 = ((Integer) obj2).intValue();
                                if (c13770e3.m3673protected(intValue2 & 1, (intValue2 & 3) != 2)) {
                                    AbstractC14489e.vip(AbstractC5297e.appmetrica(c13770e3, c1733e.license), AbstractC1376e.ad(C0115e.f1276e, z4 ? 1.0f : 0.75f), 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c13770e3, 0, 0, 262140);
                                } else {
                                    c13770e3.m3659default();
                                }
                                return Unit.INSTANCE;
                        }
                    }
                }, c13770e);
                c13770e.Signature(false);
            } else {
                c13770e.m3676strictfp(41105711);
                c13770e.Signature(false);
                c2892e = null;
            }
            InterfaceC12864e metrica = AbstractC18007e.metrica(C0115e.f1276e, 1.0f);
            boolean yandex = c13770e.yandex(c16110e2);
            Object m3681throw4 = c13770e.m3681throw();
            if (yandex || m3681throw4 == c5170e) {
                m3681throw4 = new C6317e(0, c16110e2, C16110e.class, "switch", "switch()V", 0, 0, 1);
                c13770e.m3682throws(m3681throw4);
            }
            InterfaceC12864e license = AbstractC9546e.license(metrica, z4, null, (Function0) ((InterfaceC5261e) m3681throw4), 14);
            final int i11 = 1;
            AbstractC16429e.ad(AbstractC16653e.license(-2112155604, new Function2() { // from class: eًٜ٘
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    switch (i11) {
                        case 0:
                            C13770e c13770e2 = (C13770e) obj;
                            int intValue = ((Integer) obj2).intValue();
                            if (c13770e2.m3673protected(intValue & 1, (intValue & 3) != 2)) {
                                Integer num = c1733e.appmetrica;
                                AbstractC14489e.vip(AbstractC5297e.appmetrica(c13770e2, num != null ? num.intValue() : 0), AbstractC1376e.ad(C0115e.f1276e, z4 ? 1.0f : 0.75f), 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c13770e2, 0, 0, 262140);
                            } else {
                                c13770e2.m3659default();
                            }
                            return Unit.INSTANCE;
                        default:
                            C13770e c13770e3 = (C13770e) obj;
                            int intValue2 = ((Integer) obj2).intValue();
                            if (c13770e3.m3673protected(intValue2 & 1, (intValue2 & 3) != 2)) {
                                AbstractC14489e.vip(AbstractC5297e.appmetrica(c13770e3, c1733e.license), AbstractC1376e.ad(C0115e.f1276e, z4 ? 1.0f : 0.75f), 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c13770e3, 0, 0, 262140);
                            } else {
                                c13770e3.m3659default();
                            }
                            return Unit.INSTANCE;
                    }
                }
            }, c13770e), license, null, c2892e, null, AbstractC16653e.license(1792860337, new C14674e(z4, c16110e2, 10), c13770e), null, 0.0f, 0.0f, c13770e, 196614, 468);
            z3 = z4;
            function16 = function18;
            function15 = function17;
        } else {
            c13770e.m3659default();
            z3 = z2;
            function15 = function13;
            function16 = function14;
        }
        C2846e subscription = c13770e.subscription();
        if (subscription != null) {
            subscription.license = new C13888e(c1733e, z3, function15, function16, i, i2);
        }
    }
}
