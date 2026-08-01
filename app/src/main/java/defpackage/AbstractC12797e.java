package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import java.lang.annotation.Annotation;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eّ۠۟, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC12797e {
    public static final C2892e ad = new C2892e(-1643941996, false, new C14866e(22));
    public static final C2892e vip = new C2892e(287183638, false, new C14866e(28));
    public static final C2892e metrica = new C2892e(-1844402534, false, new C7478e(10));
    public static final C2892e license = new C2892e(-878839717, false, new C7478e(1));
    public static final C2892e appmetrica = new C2892e(86723100, false, new C7478e(2));
    public static final C2892e purchase = new C2892e(-1006554274, false, new C14866e(23));
    public static final C2892e billing = new C2892e(-177090020, false, new C14866e(24));
    public static final C2892e yandex = new C2892e(1933212406, false, new C14866e(25));
    public static final C2892e startapp = new C2892e(2121518062, false, new C14866e(26));
    public static final C2892e adcel = new C2892e(47497260, false, new C14866e(27));
    public static final C2892e mopub = new C2892e(182570024, false, new C7478e(3));
    public static final C2892e advert = new C2892e(-854440377, false, new C7478e(4));
    public static final C2892e smaato = new C2892e(-1891450778, false, new C7478e(5));
    public static final C2892e amazon = new C2892e(-78674513, false, new C7478e(6));
    public static final C2892e loadAd = new C2892e(-996086774, false, new C7478e(7));
    public static final C2892e Signature = new C2892e(194878854, false, new C7478e(8));
    public static final C2892e admob = new C2892e(-1269359481, false, new C7478e(9));

    public static final long[] Signature(InterfaceC9998e interfaceC9998e) {
        List annotations = interfaceC9998e.getAnnotations();
        ArrayList arrayList = new ArrayList();
        for (Object obj : annotations) {
            if (obj instanceof InterfaceC17755e) {
                arrayList.add(obj);
            }
        }
        InterfaceC17755e interfaceC17755e = (InterfaceC17755e) AbstractC13480e.m3604this(arrayList);
        if (interfaceC17755e != null) {
            return interfaceC17755e.tags();
        }
        return null;
    }

    public static int ad(int i, int[] iArr, int[] iArr2, int[] iArr3) {
        long j = 0;
        for (int i2 = 0; i2 < i; i2++) {
            long j2 = (iArr[i2] & 4294967295L) + (4294967295L & iArr2[i2]) + j;
            iArr3[i2] = (int) j2;
            j = j2 >>> 32;
        }
        return (int) j;
    }

    public static int[] adcel(int i, BigInteger bigInteger) {
        if (bigInteger.signum() < 0 || bigInteger.bitLength() > i) {
            throw new IllegalArgumentException();
        }
        int i2 = (i + 31) >> 5;
        int[] iArr = new int[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            iArr[i3] = bigInteger.intValue();
            bigInteger = bigInteger.shiftRight(32);
        }
        return iArr;
    }

    public static final long[] admob(InterfaceC9998e interfaceC9998e, int i) {
        Object obj;
        Iterator it = interfaceC9998e.startapp(i).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((Annotation) obj) instanceof InterfaceC2621e) {
                break;
            }
        }
        InterfaceC2621e interfaceC2621e = (InterfaceC2621e) obj;
        if (interfaceC2621e != null) {
            return interfaceC2621e.tags();
        }
        return null;
    }

    public static int ads(int i, int[] iArr, int[] iArr2) {
        long j = 0;
        for (int i2 = 0; i2 < i; i2++) {
            j = (((iArr[i2] & 4294967295L) - (4294967295L & iArr2[i2])) + j) >> 32;
        }
        return (int) j;
    }

    public static C6510e advert(int i) {
        Object obj;
        Iterator it = C6510e.vip.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((C6510e) obj).ad == i) {
                break;
            }
        }
        return (C6510e) obj;
    }

    public static final Long amazon(InterfaceC9998e interfaceC9998e, int i) {
        Object obj;
        Iterator it = interfaceC9998e.startapp(i).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((Annotation) obj) instanceof InterfaceC7647e) {
                break;
            }
        }
        InterfaceC7647e interfaceC7647e = (InterfaceC7647e) obj;
        if (interfaceC7647e != null) {
            return Long.valueOf(interfaceC7647e.label());
        }
        return null;
    }

    public static boolean applovin(int[] iArr, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            if (iArr[i2] != 0) {
                return false;
            }
        }
        return true;
    }

    public static int appmetrica(int i, int[] iArr, int[] iArr2) {
        long j = 0;
        for (int i2 = 0; i2 < i; i2++) {
            long j2 = (iArr[i2] & 4294967295L) + (4294967295L & iArr2[i2]) + j;
            iArr2[i2] = (int) j2;
            j = j2 >>> 32;
        }
        return (int) j;
    }

    public static int billing(int i, int i2, int[] iArr) {
        long j = (i2 & 4294967295L) + (4294967295L & iArr[0]);
        iArr[0] = (int) j;
        if ((j >>> 32) == 0) {
            return 0;
        }
        return tapsense(i, 1, iArr);
    }

    /* renamed from: class, reason: not valid java name */
    public static int m3397class(int i, int[] iArr, int[] iArr2, int[] iArr3) {
        long j = 0;
        for (int i2 = 0; i2 < i; i2++) {
            long j2 = ((iArr[i2] & 4294967295L) - (4294967295L & iArr2[i2])) + j;
            iArr3[i2] = (int) j2;
            j = j2 >> 32;
        }
        return (int) j;
    }

    public static int crashlytics(int i, int[] iArr, int[] iArr2) {
        int i2 = 0;
        int i3 = 0;
        while (i2 < i) {
            int i4 = iArr[i2];
            iArr2[i2] = (i3 >>> (-3)) | (i4 << 3);
            i2++;
            i3 = i4;
        }
        return i3 >>> (-3);
    }

    /* renamed from: extends, reason: not valid java name */
    public static final String m3398extends(String str) {
        int length = str.length();
        int i = 0;
        while (true) {
            if (i >= length) {
                i = -1;
                break;
            }
            char charAt = str.charAt(i);
            if ((('A' > charAt || charAt >= '[') ? (charAt < 0 || charAt >= 128) ? Character.toLowerCase(charAt) : charAt : (char) (charAt + ' ')) != charAt) {
                break;
            }
            i++;
        }
        if (i == -1) {
            return str;
        }
        StringBuilder sb = new StringBuilder(str.length());
        sb.append((CharSequence) str, 0, i);
        int crashlytics = AbstractC5304e.crashlytics(str);
        if (i <= crashlytics) {
            while (true) {
                char charAt2 = str.charAt(i);
                if ('A' <= charAt2 && charAt2 < '[') {
                    charAt2 = (char) (charAt2 + ' ');
                } else if (charAt2 < 0 || charAt2 >= 128) {
                    charAt2 = Character.toLowerCase(charAt2);
                }
                sb.append(charAt2);
                if (i == crashlytics) {
                    break;
                }
                i++;
            }
        }
        return sb.toString();
    }

    public static int firebase(int[] iArr, int i) {
        int i2 = 0;
        int i3 = 0;
        while (i2 < i) {
            int i4 = iArr[i2];
            iArr[i2] = (i3 >>> (-2)) | (i4 << 2);
            i2++;
            i3 = i4;
        }
        return i3 >>> (-2);
    }

    /* renamed from: goto, reason: not valid java name */
    public static int m3399goto(int i, int i2, int[] iArr, int[] iArr2) {
        long j = 0;
        for (int i3 = 0; i3 < i; i3++) {
            long j2 = ((iArr2[r3] & 4294967295L) - (4294967295L & iArr[i3])) + j;
            iArr2[i2 + i3] = (int) j2;
            j = j2 >> 32;
        }
        return (int) j;
    }

    public static final boolean inmobi(InterfaceC9998e interfaceC9998e, int i) {
        Object obj;
        Iterator it = interfaceC9998e.startapp(i).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((Annotation) obj) instanceof InterfaceC5961e) {
                break;
            }
        }
        return obj != null;
    }

    /* renamed from: interface, reason: not valid java name */
    public static void m3400interface(int i, int i2, int[] iArr) {
        long j = (iArr[0] & 4294967295L) - (i2 & 4294967295L);
        iArr[0] = (int) j;
        long j2 = ((4294967295L & iArr[1]) - 1) + (j >> 32);
        iArr[1] = (int) j2;
        if ((j2 >> 32) == 0) {
            return;
        }
        yandex(i, 2, iArr);
    }

    public static boolean isPro(int[] iArr, int i) {
        if (iArr[0] != 1) {
            return false;
        }
        for (int i2 = 1; i2 < i; i2++) {
            if (iArr[i2] != 0) {
                return false;
            }
        }
        return true;
    }

    public static int isVip(int i, int i2, int[] iArr) {
        while (i2 < i) {
            int i3 = iArr[i2] + 1;
            iArr[i2] = i3;
            if (i3 != 0) {
                return 0;
            }
            i2++;
        }
        return 1;
    }

    public static int license(int i, int i2, int[] iArr, int[] iArr2) {
        long j = 0;
        for (int i3 = 0; i3 < i; i3++) {
            long j2 = (iArr[i3] & 4294967295L) + (4294967295L & iArr2[r7]) + j;
            iArr2[i2 + i3] = (int) j2;
            j = j2 >>> 32;
        }
        return (int) j;
    }

    public static final long[] loadAd(InterfaceC9998e interfaceC9998e, int i) {
        Object obj;
        Iterator it = interfaceC9998e.startapp(i).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((Annotation) obj) instanceof InterfaceC7215e) {
                break;
            }
        }
        InterfaceC7215e interfaceC7215e = (InterfaceC7215e) obj;
        if (interfaceC7215e != null) {
            return interfaceC7215e.tags();
        }
        return null;
    }

    public static int metrica(int i, int[] iArr, int[] iArr2, int[] iArr3) {
        long j = 0;
        for (int i2 = 0; i2 < i; i2++) {
            long j2 = (iArr[i2] & 4294967295L) + (iArr2[i2] & 4294967295L) + (4294967295L & iArr3[i2]) + j;
            iArr3[i2] = (int) j2;
            j = j2 >>> 32;
        }
        return (int) j;
    }

    public static long[] mopub(int i, BigInteger bigInteger) {
        if (bigInteger.signum() < 0 || bigInteger.bitLength() > i) {
            throw new IllegalArgumentException();
        }
        int i2 = (i + 63) >> 6;
        long[] jArr = new long[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            jArr[i3] = bigInteger.longValue();
            bigInteger = bigInteger.shiftRight(64);
        }
        return jArr;
    }

    /* renamed from: native, reason: not valid java name */
    public static BigInteger m3401native(int[] iArr, int i) {
        byte[] bArr = new byte[i << 2];
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = iArr[i2];
            if (i3 != 0) {
                AbstractC3628e.billing(i3, ((i - 1) - i2) << 2, bArr);
            }
        }
        return new BigInteger(1, bArr);
    }

    public static int premium(int i, int i2, int[] iArr, int[] iArr2, int i3) {
        long j = i2 & 4294967295L;
        long j2 = 0;
        int i4 = 0;
        do {
            long j3 = ((iArr[i4] & 4294967295L) * j) + (iArr2[r8] & 4294967295L) + j2;
            iArr2[i3 + i4] = (int) j3;
            j2 = j3 >>> 32;
            i4++;
        } while (i4 < i);
        return (int) j2;
    }

    public static int pro(int i, int[] iArr, int[] iArr2) {
        int i2 = 0;
        while (i2 < i) {
            int i3 = iArr[i2] + 1;
            iArr2[i2] = i3;
            i2++;
            if (i3 != 0) {
                while (i2 < i) {
                    iArr2[i2] = iArr[i2];
                    i2++;
                }
                return 0;
            }
        }
        return 1;
    }

    public static void purchase(int i, int i2, int i3, int[] iArr) {
        long j = (i2 & 4294967295L) + (4294967295L & iArr[i3]);
        iArr[i3] = (int) j;
        if ((j >>> 32) == 0) {
            return;
        }
        tapsense(i, i3 + 1, iArr);
    }

    public static final boolean remoteconfig(InterfaceC9998e interfaceC9998e) {
        List annotations = interfaceC9998e.getAnnotations();
        if (annotations != null && annotations.isEmpty()) {
            return false;
        }
        Iterator it = annotations.iterator();
        while (it.hasNext()) {
            if (((Annotation) it.next()) instanceof InterfaceC5288e) {
                return true;
            }
        }
        return false;
    }

    public static int signatures(int[] iArr) {
        for (int i = 0; i < 16; i++) {
            int i2 = iArr[i] + 1;
            iArr[i] = i2;
            if (i2 != 0) {
                return 0;
            }
        }
        return 1;
    }

    public static int smaato(int[] iArr) {
        return iArr[0] & 1;
    }

    public static boolean startapp(int i, int[] iArr, int[] iArr2) {
        for (int i2 = i - 1; i2 >= 0; i2--) {
            if (iArr[i2] != iArr2[i2]) {
                return false;
            }
        }
        return true;
    }

    public static int subs(int i, int i2, int[] iArr, int[] iArr2) {
        int i3 = 0;
        while (i3 < i) {
            int i4 = iArr[i3];
            iArr2[i3] = (i2 >>> 31) | (i4 << 1);
            i3++;
            i2 = i4;
        }
        return i2 >>> 31;
    }

    public static boolean subscription(int i, int[] iArr, int[] iArr2) {
        for (int i2 = i - 1; i2 >= 0; i2--) {
            int i3 = iArr[i2] ^ RecyclerView.UNDEFINED_DURATION;
            int i4 = Integer.MIN_VALUE ^ iArr2[i2];
            if (i3 < i4) {
                return false;
            }
            if (i3 > i4) {
                return true;
            }
        }
        return true;
    }

    public static int tapsense(int i, int i2, int[] iArr) {
        while (i2 < i) {
            int i3 = iArr[i2] + 1;
            iArr[i2] = i3;
            if (i3 != 0) {
                return 0;
            }
            i2++;
        }
        return 1;
    }

    /* renamed from: this, reason: not valid java name */
    public static void m3402this(int i, int[] iArr, int[] iArr2) {
        long j = 0;
        for (int i2 = 0; i2 < i; i2++) {
            long j2 = ((iArr2[i2] & 4294967295L) - (4294967295L & iArr[i2])) + j;
            iArr2[i2] = (int) j2;
            j = j2 >> 32;
        }
    }

    public static void vip(int i, int i2, int[] iArr) {
        long j = (iArr[0] & 4294967295L) + (i2 & 4294967295L);
        iArr[0] = (int) j;
        long j2 = (4294967295L & iArr[1]) + 1 + (j >>> 32);
        iArr[1] = (int) j2;
        if ((j2 >>> 32) == 0) {
            return;
        }
        tapsense(i, 2, iArr);
    }

    public static int yandex(int i, int i2, int[] iArr) {
        while (i2 < i) {
            int i3 = iArr[i2] - 1;
            iArr[i2] = i3;
            if (i3 != -1) {
                return 0;
            }
            i2++;
        }
        return -1;
    }
}
