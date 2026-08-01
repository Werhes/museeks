package defpackage;

import android.content.Context;
import android.content.res.Resources;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import ua.itaysonlab.vkx.R;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَؒۦ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC10003e {
    public static final int[] ad = {-1, -1, -1, -3};
    public static final int[] vip = {1, 0, 0, 4, -2, -1, 3, -4};
    public static final int[] metrica = {-1, -1, -1, -5, 1, 0, -4, 3};

    public static final C3859e ad(String str) {
        C13337e c13337e = C13337e.smaato;
        if (AbstractC5304e.m1866native(str)) {
            throw new IllegalArgumentException("Blank serial names are prohibited");
        }
        Object it = ((C15240e) AbstractC7396e.ad.values()).iterator();
        while (((AbstractC3757e) it).hasNext()) {
            InterfaceC5372e interfaceC5372e = (InterfaceC5372e) ((C11697e) it).next();
            if (str.equals(interfaceC5372e.appmetrica().ad())) {
                StringBuilder applovin = AbstractC8703e.applovin("\n                The name of serial descriptor should uniquely identify associated serializer.\n                For serial name ", str, " there already exists ");
                applovin.append(AbstractC3820e.ad.vip(interfaceC5372e.getClass()).mopub());
                applovin.append(".\n                Please refer to SerialDescriptor documentation for additional information.\n            ");
                throw new IllegalArgumentException(AbstractC17540e.license(applovin.toString()));
            }
        }
        return new C3859e(str, c13337e);
    }

    public static void adcel(int[] iArr, int[] iArr2) {
        int[] iArr3 = new int[8];
        AbstractC0173e.adcel(iArr, iArr3);
        yandex(iArr3, iArr2);
    }

    public static void advert(int[] iArr, int[] iArr2, int[] iArr3) {
        if (AbstractC0173e.mopub(iArr, iArr2, iArr3) != 0) {
            long j = (iArr3[0] & 4294967295L) - 1;
            iArr3[0] = (int) j;
            long j2 = j >> 32;
            if (j2 != 0) {
                long j3 = j2 + (iArr3[1] & 4294967295L);
                iArr3[1] = (int) j3;
                long j4 = (j3 >> 32) + (iArr3[2] & 4294967295L);
                iArr3[2] = (int) j4;
                j2 = j4 >> 32;
            }
            iArr3[3] = (int) (((4294967295L & iArr3[3]) - 2) + j2);
        }
    }

    public static String amazon(Context context) {
        try {
            return context.getResources().getResourcePackageName(R.string.common_google_play_services_unknown_issue);
        } catch (Resources.NotFoundException unused) {
            return context.getPackageName();
        }
    }

    public static C17709e appmetrica(String str, AbstractC8457e abstractC8457e, InterfaceC9998e[] interfaceC9998eArr) {
        if (AbstractC5304e.m1866native(str)) {
            throw new IllegalArgumentException("Blank serial names are prohibited");
        }
        if (abstractC8457e.equals(C6805e.appmetrica)) {
            throw new IllegalArgumentException("For StructureKind.CLASS please use 'buildClassSerialDescriptor' instead");
        }
        C7469e c7469e = new C7469e(str);
        Unit unit = Unit.INSTANCE;
        return new C17709e(str, abstractC8457e, c7469e.metrica.size(), AbstractC1660e.m670implements(interfaceC9998eArr), c7469e);
    }

    public static void billing(int[] iArr, int[] iArr2, int[] iArr3) {
        int[] iArr4 = new int[8];
        AbstractC0173e.startapp(iArr, iArr2, iArr4);
        yandex(iArr4, iArr3);
    }

    public static final C17709e license(String str, AbstractC8457e abstractC8457e, InterfaceC9998e[] interfaceC9998eArr, Function1 function1) {
        if (AbstractC5304e.m1866native(str)) {
            throw new IllegalArgumentException("Blank serial names are prohibited");
        }
        if (abstractC8457e.equals(C6805e.appmetrica)) {
            throw new IllegalArgumentException("For StructureKind.CLASS please use 'buildClassSerialDescriptor' instead");
        }
        C7469e c7469e = new C7469e(str);
        function1.invoke(c7469e);
        return new C17709e(str, abstractC8457e, c7469e.metrica.size(), AbstractC1660e.m670implements(interfaceC9998eArr), c7469e);
    }

    public static void metrica(int[] iArr) {
        long j = (iArr[0] & 4294967295L) + 1;
        iArr[0] = (int) j;
        long j2 = j >> 32;
        if (j2 != 0) {
            long j3 = j2 + (iArr[1] & 4294967295L);
            iArr[1] = (int) j3;
            long j4 = (j3 >> 32) + (iArr[2] & 4294967295L);
            iArr[2] = (int) j4;
            j2 = j4 >> 32;
        }
        iArr[3] = (int) ((4294967295L & iArr[3]) + 2 + j2);
    }

    public static void mopub(int i, int[] iArr, int[] iArr2) {
        int[] iArr3 = new int[8];
        AbstractC0173e.adcel(iArr, iArr3);
        while (true) {
            yandex(iArr3, iArr2);
            i--;
            if (i <= 0) {
                return;
            } else {
                AbstractC0173e.adcel(iArr2, iArr3);
            }
        }
    }

    public static final InterfaceC7227e purchase(InterfaceC9998e interfaceC9998e) {
        if (interfaceC9998e instanceof C16763e) {
            return ((C16763e) interfaceC9998e).vip;
        }
        if (interfaceC9998e instanceof C0899e) {
            return purchase(((C0899e) interfaceC9998e).ad);
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.List, java.util.Collection, java.lang.Object] */
    public static final int smaato(C13648e c13648e) {
        ?? r0 = c13648e.mopub;
        if (r0.isEmpty()) {
            return 0;
        }
        int size = r0.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += ((C3225e) r0.get(i2)).Signature;
        }
        return (i / r0.size()) + c13648e.admob;
    }

    public static void startapp(int[] iArr, int i) {
        while (i != 0) {
            long j = i & 4294967295L;
            long j2 = (iArr[0] & 4294967295L) + j;
            iArr[0] = (int) j2;
            long j3 = j2 >> 32;
            if (j3 != 0) {
                long j4 = j3 + (iArr[1] & 4294967295L);
                iArr[1] = (int) j4;
                long j5 = (j4 >> 32) + (iArr[2] & 4294967295L);
                iArr[2] = (int) j5;
                j3 = j5 >> 32;
            }
            long j6 = (4294967295L & iArr[3]) + (j << 1) + j3;
            iArr[3] = (int) j6;
            i = (int) (j6 >> 32);
        }
        if ((iArr[3] >>> 1) < 2147483646 || !AbstractC0173e.purchase(iArr, ad)) {
            return;
        }
        metrica(iArr);
    }

    public static void vip(int[] iArr, int[] iArr2, int[] iArr3) {
        long j = (iArr[0] & 4294967295L) + (iArr2[0] & 4294967295L);
        iArr3[0] = (int) j;
        long j2 = (iArr[1] & 4294967295L) + (iArr2[1] & 4294967295L) + (j >>> 32);
        iArr3[1] = (int) j2;
        long j3 = (iArr[2] & 4294967295L) + (iArr2[2] & 4294967295L) + (j2 >>> 32);
        iArr3[2] = (int) j3;
        long j4 = (iArr[3] & 4294967295L) + (iArr2[3] & 4294967295L) + (j3 >>> 32);
        int i = (int) j4;
        iArr3[3] = i;
        if (((int) (j4 >>> 32)) != 0 || ((i >>> 1) >= 2147483646 && AbstractC0173e.purchase(iArr3, ad))) {
            metrica(iArr3);
        }
    }

    public static void yandex(int[] iArr, int[] iArr2) {
        long j = iArr[7] & 4294967295L;
        long j2 = (iArr[6] & 4294967295L) + (j << 1);
        long j3 = (iArr[2] & 4294967295L) + j2;
        long j4 = (iArr[5] & 4294967295L) + (j2 << 1);
        long j5 = (iArr[4] & 4294967295L) + (j4 << 1);
        long j6 = (iArr[0] & 4294967295L) + j5;
        iArr2[0] = (int) j6;
        long j7 = (iArr[1] & 4294967295L) + j4 + (j6 >>> 32);
        iArr2[1] = (int) j7;
        long j8 = j3 + (j7 >>> 32);
        iArr2[2] = (int) j8;
        long j9 = (iArr[3] & 4294967295L) + j + (j5 << 1) + (j8 >>> 32);
        iArr2[3] = (int) j9;
        startapp(iArr2, (int) (j9 >>> 32));
    }
}
