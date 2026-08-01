package defpackage;

import io.realm.kotlin.internal.interop.CompactOnLaunchCallback;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌٜٓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC8677e implements CompactOnLaunchCallback {
    public static final int[] ad = {-1, -1, 0, -1, -1, -1, -1, -2};
    public static final int[] vip = {1, 0, -2, 1, 1, -2, 0, 2, -2, -3, 3, -2, -1, -1, 0, -2};

    public static boolean Signature(InterfaceC2268e interfaceC2268e, InterfaceC2268e interfaceC2268e2) {
        if (!interfaceC2268e.getClass().equals(interfaceC2268e2.getClass())) {
            return false;
        }
        if ((interfaceC2268e instanceof C1058e) || (interfaceC2268e instanceof C12157e)) {
            return true;
        }
        if (!(interfaceC2268e instanceof C6020e)) {
            return interfaceC2268e instanceof C15547e ? interfaceC2268e.startapp().equals(interfaceC2268e2.startapp()) : interfaceC2268e instanceof C14898e ? interfaceC2268e.yandex().equals(interfaceC2268e2.yandex()) : interfaceC2268e == interfaceC2268e2;
        }
        if (Double.isNaN(interfaceC2268e.subscription().doubleValue()) || Double.isNaN(interfaceC2268e2.subscription().doubleValue())) {
            return false;
        }
        return interfaceC2268e.subscription().equals(interfaceC2268e2.subscription());
    }

    public static void ad(int[] iArr, int[] iArr2, int[] iArr3) {
        if (AbstractC10077e.ad(iArr, iArr2, iArr3) != 0 || ((iArr3[7] >>> 1) >= Integer.MAX_VALUE && AbstractC10077e.pro(iArr3, ad))) {
            vip(iArr3);
        }
    }

    public static void adcel(int[] iArr, int[] iArr2, int[] iArr3) {
        if (AbstractC10077e.crashlytics(iArr, iArr2, iArr3) != 0) {
            long j = (iArr3[0] & 4294967295L) - 1;
            iArr3[0] = (int) j;
            long j2 = j >> 32;
            if (j2 != 0) {
                long j3 = j2 + (iArr3[1] & 4294967295L);
                iArr3[1] = (int) j3;
                j2 = j3 >> 32;
            }
            long j4 = (iArr3[2] & 4294967295L) + 1 + j2;
            iArr3[2] = (int) j4;
            long j5 = ((iArr3[3] & 4294967295L) - 1) + (j4 >> 32);
            iArr3[3] = (int) j5;
            long j6 = j5 >> 32;
            if (j6 != 0) {
                long j7 = j6 + (iArr3[4] & 4294967295L);
                iArr3[4] = (int) j7;
                long j8 = (j7 >> 32) + (iArr3[5] & 4294967295L);
                iArr3[5] = (int) j8;
                long j9 = (j8 >> 32) + (iArr3[6] & 4294967295L);
                iArr3[6] = (int) j9;
                j6 = j9 >> 32;
            }
            iArr3[7] = (int) (((4294967295L & iArr3[7]) - 1) + j6);
        }
    }

    public static int admob(double d) {
        if (Double.isNaN(d) || Double.isInfinite(d) || d == 0.0d) {
            return 0;
        }
        return (int) (((d > 0.0d ? 1 : -1) * Math.floor(Math.abs(d))) % 4.294967296E9d);
    }

    public static void advert(int i, String str, List list) {
        if (list.size() >= i) {
            return;
        }
        throw new IllegalArgumentException(str + " operation requires at least " + i + " parameters found " + list.size());
    }

    public static boolean amazon(InterfaceC2268e interfaceC2268e) {
        if (interfaceC2268e == null) {
            return false;
        }
        Double subscription = interfaceC2268e.subscription();
        return !subscription.isNaN() && subscription.doubleValue() >= 0.0d && subscription.equals(Double.valueOf(Math.floor(subscription.doubleValue())));
    }

    public static void appmetrica(int[] iArr, int[] iArr2, int[] iArr3) {
        int[] iArr4 = new int[16];
        AbstractC10077e.isPro(iArr, iArr2, iArr4);
        purchase(iArr4, iArr3);
    }

    public static void billing(int[] iArr, int i) {
        long j;
        if (i != 0) {
            long j2 = i & 4294967295L;
            long j3 = (iArr[0] & 4294967295L) + j2;
            iArr[0] = (int) j3;
            long j4 = j3 >> 32;
            if (j4 != 0) {
                long j5 = j4 + (iArr[1] & 4294967295L);
                iArr[1] = (int) j5;
                j4 = j5 >> 32;
            }
            long j6 = ((iArr[2] & 4294967295L) - j2) + j4;
            iArr[2] = (int) j6;
            long j7 = (iArr[3] & 4294967295L) + j2 + (j6 >> 32);
            iArr[3] = (int) j7;
            long j8 = j7 >> 32;
            if (j8 != 0) {
                long j9 = j8 + (iArr[4] & 4294967295L);
                iArr[4] = (int) j9;
                long j10 = (j9 >> 32) + (iArr[5] & 4294967295L);
                iArr[5] = (int) j10;
                long j11 = (j10 >> 32) + (iArr[6] & 4294967295L);
                iArr[6] = (int) j11;
                j8 = j11 >> 32;
            }
            long j12 = (4294967295L & iArr[7]) + j2 + j8;
            iArr[7] = (int) j12;
            j = j12 >> 32;
        } else {
            j = 0;
        }
        if (j != 0 || ((iArr[7] >>> 1) >= Integer.MAX_VALUE && AbstractC10077e.pro(iArr, ad))) {
            vip(iArr);
        }
    }

    public static final int license(C12476e c12476e, int i) {
        C0676e c0676e = c12476e.ad;
        C12890e c12890e = c12476e.vip;
        if (c0676e.ad.f20850e.length() != 0) {
            int license = c12890e.license(i);
            if ((i != 0 && license == c12890e.license(i - 1)) || (i != c0676e.ad.f20850e.length() && license == c12890e.license(i + 1))) {
                return c12476e.ad(i);
            }
        }
        return c12476e.adcel(i);
    }

    public static EnumC16521e loadAd(String str) {
        EnumC16521e enumC16521e = null;
        if (str != null && !str.isEmpty()) {
            enumC16521e = (EnumC16521e) EnumC16521e.f32350e.get(Integer.valueOf(Integer.parseInt(str)));
        }
        if (enumC16521e != null) {
            return enumC16521e;
        }
        throw new IllegalArgumentException(AbstractC17861e.Signature("Unsupported commandId ", str));
    }

    public static final List metrica(InterfaceC9153e interfaceC9153e, C4695e c4695e, C6594e c6594e) {
        C11241e c11241e;
        C12431e c12431e = (C12431e) c6594e.f13613e;
        if (!(c12431e.f24868e != 0) && c4695e.f10082e.isEmpty()) {
            return C13664e.f27089e;
        }
        ArrayList arrayList = new ArrayList();
        if (((C12431e) c6594e.f13613e).f24868e != 0) {
            int i = c12431e.f24868e;
            if (i == 0) {
                throw new NoSuchElementException("MutableVector is empty.");
            }
            Object[] objArr = c12431e.f24870e;
            int i2 = ((C9504e) objArr[0]).ad;
            for (int i3 = 0; i3 < i; i3++) {
                int i4 = ((C9504e) objArr[i3]).ad;
                if (i4 < i2) {
                    i2 = i4;
                }
            }
            if (i2 < 0) {
                AbstractC8889e.ad("negative minIndex");
            }
            int i5 = c12431e.f24868e;
            if (i5 == 0) {
                throw new NoSuchElementException("MutableVector is empty.");
            }
            Object[] objArr2 = c12431e.f24870e;
            int i6 = ((C9504e) objArr2[0]).vip;
            for (int i7 = 0; i7 < i5; i7++) {
                int i8 = ((C9504e) objArr2[i7]).vip;
                if (i8 > i6) {
                    i6 = i8;
                }
            }
            c11241e = new C11241e(i2, Math.min(i6, interfaceC9153e.ad() - 1), 1);
        } else {
            c11241e = C15926e.f31384e;
        }
        int size = c4695e.f10082e.size();
        for (int i9 = 0; i9 < size; i9++) {
            C8258e c8258e = (C8258e) c4695e.get(i9);
            int license = AbstractC0259e.license(interfaceC9153e, c8258e.ad, c8258e.metrica);
            int i10 = c11241e.f22523e;
            if ((license > c11241e.f22522e || i10 > license) && license >= 0 && license < interfaceC9153e.ad()) {
                arrayList.add(Integer.valueOf(license));
            }
        }
        int i11 = c11241e.f22523e;
        int i12 = c11241e.f22522e;
        if (i11 <= i12) {
            while (true) {
                arrayList.add(Integer.valueOf(i11));
                if (i11 == i12) {
                    break;
                }
                i11++;
            }
        }
        return arrayList;
    }

    public static void mopub(int i, String str, List list) {
        if (list.size() == i) {
            return;
        }
        throw new IllegalArgumentException(str + " operation requires " + i + " parameters found " + list.size());
    }

    public static HashMap pro(C18357e c18357e) {
        HashMap hashMap = new HashMap();
        Iterator it = new ArrayList(c18357e.f36035e.keySet()).iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            Object remoteconfig = remoteconfig(c18357e.billing(str));
            if (remoteconfig != null) {
                hashMap.put(str, remoteconfig);
            }
        }
        return hashMap;
    }

    public static void purchase(int[] iArr, int[] iArr2) {
        long j = iArr[8] & 4294967295L;
        long j2 = iArr[9] & 4294967295L;
        long j3 = iArr[10] & 4294967295L;
        long j4 = iArr[11] & 4294967295L;
        long j5 = iArr[12] & 4294967295L;
        long j6 = iArr[13] & 4294967295L;
        long j7 = iArr[14] & 4294967295L;
        long j8 = iArr[15] & 4294967295L;
        long j9 = j3 + j4;
        long j10 = j6 + j7;
        long j11 = j10 + (j8 << 1);
        long j12 = j + j2 + j10;
        long j13 = j9 + j5 + j8 + j12;
        long j14 = (iArr[0] & 4294967295L) + j13 + j6 + j7 + j8;
        iArr2[0] = (int) j14;
        long j15 = (((iArr[1] & 4294967295L) + j13) - j) + j7 + j8 + (j14 >> 32);
        iArr2[1] = (int) j15;
        long j16 = ((iArr[2] & 4294967295L) - j12) + (j15 >> 32);
        iArr2[2] = (int) j16;
        long j17 = ((((iArr[3] & 4294967295L) + j13) - j2) - j3) + j6 + (j16 >> 32);
        iArr2[3] = (int) j17;
        long j18 = ((((iArr[4] & 4294967295L) + j13) - j9) - j) + j7 + (j17 >> 32);
        iArr2[4] = (int) j18;
        long j19 = (iArr[5] & 4294967295L) + j11 + j3 + (j18 >> 32);
        iArr2[5] = (int) j19;
        long j20 = (iArr[6] & 4294967295L) + j4 + j7 + j8 + (j19 >> 32);
        iArr2[6] = (int) j20;
        long j21 = (iArr[7] & 4294967295L) + j13 + j11 + j5 + (j20 >> 32);
        iArr2[7] = (int) j21;
        billing(iArr2, (int) (j21 >> 32));
    }

    public static Object remoteconfig(InterfaceC2268e interfaceC2268e) {
        if (InterfaceC2268e.f5758e.equals(interfaceC2268e)) {
            return null;
        }
        if (InterfaceC2268e.f5755e.equals(interfaceC2268e)) {
            return BuildConfig.FLAVOR;
        }
        if (interfaceC2268e instanceof C18357e) {
            return pro((C18357e) interfaceC2268e);
        }
        if (!(interfaceC2268e instanceof C5273e)) {
            return !interfaceC2268e.subscription().isNaN() ? interfaceC2268e.subscription() : interfaceC2268e.startapp();
        }
        ArrayList arrayList = new ArrayList();
        C5273e c5273e = (C5273e) interfaceC2268e;
        int i = 0;
        while (i < c5273e.Signature()) {
            if (i >= c5273e.Signature()) {
                throw new NoSuchElementException(AbstractC8647e.isPro(i, "Out of bounds index: ", new StringBuilder(String.valueOf(i).length() + 21)));
            }
            int i2 = i + 1;
            Object remoteconfig = remoteconfig(c5273e.admob(i));
            if (remoteconfig != null) {
                arrayList.add(remoteconfig);
            }
            i = i2;
        }
        return arrayList;
    }

    public static void signatures(C11467e c11467e) {
        int admob = admob(c11467e.m3209case("runtime.counter").subscription().doubleValue() + 1.0d);
        if (admob > 1000000) {
            throw new IllegalStateException("Instructions allowed exceeded");
        }
        c11467e.m3211default("runtime.counter", new C6020e(Double.valueOf(admob)));
    }

    public static void smaato(String str, int i, ArrayList arrayList) {
        if (arrayList.size() <= i) {
            return;
        }
        throw new IllegalArgumentException(str + " operation requires at most " + i + " parameters found " + arrayList.size());
    }

    public static void startapp(int i, int[] iArr, int[] iArr2) {
        int[] iArr3 = new int[16];
        AbstractC10077e.premium(iArr, iArr3);
        while (true) {
            purchase(iArr3, iArr2);
            i--;
            if (i <= 0) {
                return;
            } else {
                AbstractC10077e.premium(iArr2, iArr3);
            }
        }
    }

    public static double subscription(double d) {
        if (Double.isNaN(d)) {
            return 0.0d;
        }
        if (Double.isInfinite(d) || d == 0.0d || d == 0.0d) {
            return d;
        }
        return (d > 0.0d ? 1 : -1) * Math.floor(Math.abs(d));
    }

    public static void vip(int[] iArr) {
        long j = (iArr[0] & 4294967295L) + 1;
        iArr[0] = (int) j;
        long j2 = j >> 32;
        if (j2 != 0) {
            long j3 = j2 + (iArr[1] & 4294967295L);
            iArr[1] = (int) j3;
            j2 = j3 >> 32;
        }
        long j4 = ((iArr[2] & 4294967295L) - 1) + j2;
        iArr[2] = (int) j4;
        long j5 = (iArr[3] & 4294967295L) + 1 + (j4 >> 32);
        iArr[3] = (int) j5;
        long j6 = j5 >> 32;
        if (j6 != 0) {
            long j7 = j6 + (iArr[4] & 4294967295L);
            iArr[4] = (int) j7;
            long j8 = (j7 >> 32) + (iArr[5] & 4294967295L);
            iArr[5] = (int) j8;
            long j9 = (j8 >> 32) + (iArr[6] & 4294967295L);
            iArr[6] = (int) j9;
            j6 = j9 >> 32;
        }
        iArr[7] = (int) ((4294967295L & iArr[7]) + 1 + j6);
    }

    public static void yandex(int[] iArr, int[] iArr2) {
        int[] iArr3 = new int[16];
        AbstractC10077e.premium(iArr, iArr3);
        purchase(iArr3, iArr2);
    }
}
