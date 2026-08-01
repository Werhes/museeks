package defpackage;

import android.os.SystemClock;
import android.os.Trace;
import androidx.car.app.hardware.info.EnergyProfile;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌؙٕ */
/* loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC8703e {
    public static final /* synthetic */ int[] ad = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99, 100, EnergyProfile.EVCONNECTOR_TYPE_OTHER, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 123, 124, 125, 126, 127, 128, 129, 130, 131, 132, 133, 134, 135, 136, 137, 138, 139, 140, 141, 142, 143, 144, 145, 146, 147, 148, 149, 150, 151, 152, 153, 154, 155, 156, 157, 158, 159, 160, 161, 162, 163};

    public static C14803e Signature(String str) {
        AbstractC14070e.license(str);
        return new C14803e(9);
    }

    public static void ad(InterfaceC15893e interfaceC15893e, Function1[] function1Arr, Function1 function1) {
        ArrayList arrayList = new ArrayList(function1Arr.length);
        for (Function1 function12 : function1Arr) {
            InterfaceC15893e advert = interfaceC15893e.advert();
            function12.invoke(advert);
            arrayList.add(new C7725e((ArrayList) advert.ad().f16176e));
        }
        InterfaceC15893e advert2 = interfaceC15893e.advert();
        function1.invoke(advert2);
        interfaceC15893e.ad().premium(new C8867e(new C7725e((ArrayList) advert2.ad().f16176e), arrayList));
    }

    public static /* synthetic */ boolean adcel(int i, int i2) {
        if (i != 0) {
            return i == i2;
        }
        throw null;
    }

    public static String admob(IOException iOException, StringBuilder sb) {
        sb.append(iOException.getMessage());
        return sb.toString();
    }

    public static StringBuilder ads(ConfigurableProvider configurableProvider, String str, String str2, String str3, Ctry ctry) {
        configurableProvider.addAlgorithm(str, ctry, str2);
        StringBuilder sb = new StringBuilder();
        sb.append(str3);
        return sb;
    }

    public static int advert(float f, float f2, float f3) {
        return Math.round((f + f2) * f3);
    }

    public static long amazon(long j) {
        Trace.endSection();
        return SystemClock.elapsedRealtimeNanos() - j;
    }

    public static StringBuilder applovin(String str, String str2, String str3) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(str2);
        sb.append(str3);
        return sb;
    }

    public static boolean appmetrica(InterfaceC8377e interfaceC8377e, long j) {
        return j >= interfaceC8377e.vip();
    }

    public static InterfaceC12864e billing(C18055e c18055e) {
        C13540e purchase = AbstractC12696e.purchase(0.0f, 400.0f, null, 5);
        long j = 1;
        C13540e purchase2 = AbstractC12696e.purchase(0.0f, 400.0f, new C11490e((j & 4294967295L) | (j << 32)), 1);
        C13540e purchase3 = AbstractC12696e.purchase(0.0f, 400.0f, null, 5);
        c18055e.getClass();
        return new C4801e(purchase, purchase2, purchase3);
    }

    /* renamed from: class */
    public static /* synthetic */ int m2467class(int i) {
        if (i != 0) {
            return i - 1;
        }
        throw null;
    }

    public static int crashlytics(int i, int i2, int i3, int i4) {
        return i + i2 + i3 + i4;
    }

    public static /* synthetic */ String firebase(int i) {
        if (i == 1) {
            return "ACTIVITY";
        }
        if (i == 2) {
            return "BROADCAST";
        }
        if (i == 3) {
            return "SERVICE";
        }
        if (i == 4) {
            return "FOREGROUND_SERVICE";
        }
        if (i == 5) {
            return "CALLBACK";
        }
        throw null;
    }

    public static StringBuilder inmobi(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        return sb;
    }

    /* renamed from: interface */
    public static /* synthetic */ int[] m2468interface(int i) {
        int[] iArr = new int[i];
        System.arraycopy(ad, 0, iArr, 0, i);
        return iArr;
    }

    public static StringBuilder isPro(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(str2);
        return sb;
    }

    public static StringBuilder isVip(Ctry ctry, String str, String str2, StringBuilder sb, ConfigurableProvider configurableProvider) {
        sb.append(str);
        configurableProvider.addAlgorithm(str2, ctry, sb.toString());
        return new StringBuilder();
    }

    public static void license(InterfaceC15893e interfaceC15893e, String str) {
        interfaceC15893e.ad().premium(new C11629e(str));
    }

    public static C14815e loadAd(long j, C5015e c5015e) {
        return c5015e.ad(new C3618e(j));
    }

    public static C9710e metrica(InterfaceC15893e interfaceC15893e) {
        return new C9710e((ArrayList) interfaceC15893e.ad().f16176e);
    }

    public static InterfaceC12864e mopub(C18055e c18055e, InterfaceC12864e interfaceC12864e) {
        return interfaceC12864e.premium(new C6667e(c18055e.ad));
    }

    public static void premium(int i, C13770e c13770e, C14865e c14865e, C13770e c13770e2, C5430e c5430e) {
        AbstractC2270e.yandex(c13770e, Integer.valueOf(i), c14865e);
        AbstractC2270e.purchase(c13770e2, c5430e);
    }

    public static String pro(String str, StringBuilder sb) {
        return str + ((Object) sb);
    }

    public static void purchase(InterfaceC4740e interfaceC4740e) {
        interfaceC4740e.smaato(new C15965e(new C0496e()));
    }

    public static String remoteconfig(String str, InterfaceC3894e interfaceC3894e) {
        return str.concat(interfaceC3894e.getClass().getName());
    }

    public static String signatures(StringBuilder sb, boolean z, String str) {
        sb.append(z);
        sb.append(str);
        return sb.toString();
    }

    public static int smaato(int i, int i2, int i3, int i4) {
        return ((i - i2) / i3) + i4;
    }

    public static void subs(ArrayList arrayList, String str, String str2, String str3, String str4) {
        arrayList.add(str);
        arrayList.add(str2);
        arrayList.add(str3);
        arrayList.add(str4);
    }

    public static String subscription(Exception exc, StringBuilder sb) {
        sb.append(exc.toString());
        return sb.toString();
    }

    public static String tapsense(Object[] objArr, int i, Locale locale, String str, StringBuilder sb) {
        sb.append(String.format(locale, str, Arrays.copyOf(objArr, i)));
        return sb.toString();
    }

    public static void vip(InterfaceC15893e interfaceC15893e, String str, Function1 function1) {
        C7988e ad2 = interfaceC15893e.ad();
        InterfaceC15893e advert = interfaceC15893e.advert();
        function1.invoke(advert);
        Unit unit = Unit.INSTANCE;
        ad2.premium(new C17417e(str, new C7725e((ArrayList) advert.ad().f16176e)));
    }

    public static /* synthetic */ int yandex(int i, int i2) {
        if (i == 0 || i2 == 0) {
            throw null;
        }
        return i - i2;
    }
}
