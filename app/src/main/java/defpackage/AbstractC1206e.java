package defpackage;

import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؒٝٗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC1206e {
    public static final int[] ad = {-1, -1, -1, 0, 0, 0, 1, -1};
    public static final int[] vip = {1, 0, 0, -2, -1, -1, -2, 1, -2, 1, -2, 1, 1, -2, 2, -2};

    public static void ad(int[] iArr) {
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
        long j5 = ((iArr[3] & 4294967295L) - 1) + j2;
        iArr[3] = (int) j5;
        long j6 = j5 >> 32;
        if (j6 != 0) {
            long j7 = j6 + (iArr[4] & 4294967295L);
            iArr[4] = (int) j7;
            long j8 = (j7 >> 32) + (iArr[5] & 4294967295L);
            iArr[5] = (int) j8;
            j6 = j8 >> 32;
        }
        long j9 = ((iArr[6] & 4294967295L) - 1) + j6;
        iArr[6] = (int) j9;
        iArr[7] = (int) ((4294967295L & iArr[7]) + 1 + (j9 >> 32));
    }

    public static void adcel(int[] iArr, int[] iArr2, int[] iArr3) {
        if (AbstractC10077e.crashlytics(iArr, iArr2, iArr3) != 0) {
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
            long j5 = (iArr3[3] & 4294967295L) + 1 + j2;
            iArr3[3] = (int) j5;
            long j6 = j5 >> 32;
            if (j6 != 0) {
                long j7 = j6 + (iArr3[4] & 4294967295L);
                iArr3[4] = (int) j7;
                long j8 = (j7 >> 32) + (iArr3[5] & 4294967295L);
                iArr3[5] = (int) j8;
                j6 = j8 >> 32;
            }
            long j9 = (iArr3[6] & 4294967295L) + 1 + j6;
            iArr3[6] = (int) j9;
            iArr3[7] = (int) (((4294967295L & iArr3[7]) - 1) + (j9 >> 32));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:114:0x0201, code lost:
    
        if (r3 == false) goto L66;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r22v0, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r3v28, types: [eّٜٛ] */
    /* JADX WARN: Type inference failed for: r7v4, types: [java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.InterfaceC13984e advert(java.lang.reflect.Type r21, java.util.Map r22, int r23, boolean r24, int r25) {
        /*
            Method dump skipped, instructions count: 757
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC1206e.advert(java.lang.reflect.Type, java.util.Map, int, boolean, int):eٓٔۖ");
    }

    public static String amazon(String str, Object... objArr) {
        int length;
        int length2;
        int indexOf;
        String subscription;
        int i = 0;
        int i2 = 0;
        while (true) {
            length = objArr.length;
            if (i2 >= length) {
                break;
            }
            Object obj = objArr[i2];
            if (obj == null) {
                subscription = "null";
            } else {
                try {
                    subscription = obj.toString();
                } catch (Exception e) {
                    String isPro = AbstractC4653e.isPro(obj.getClass().getName(), "@", Integer.toHexString(System.identityHashCode(obj)));
                    Logger.getLogger("com.google.common.base.Strings").logp(Level.WARNING, "com.google.common.base.Strings", "lenientToString", "Exception during lenientFormat for ".concat(isPro), (Throwable) e);
                    subscription = AbstractC17861e.subscription("<", isPro, " threw ", e.getClass().getName(), ">");
                }
            }
            objArr[i2] = subscription;
            i2++;
        }
        StringBuilder sb = new StringBuilder(str.length() + (length * 16));
        int i3 = 0;
        while (true) {
            length2 = objArr.length;
            if (i >= length2 || (indexOf = str.indexOf("%s", i3)) == -1) {
                break;
            }
            sb.append((CharSequence) str, i3, indexOf);
            sb.append(objArr[i]);
            i++;
            i3 = indexOf + 2;
        }
        sb.append((CharSequence) str, i3, str.length());
        if (i < length2) {
            sb.append(" [");
            sb.append(objArr[i]);
            for (int i4 = i + 1; i4 < objArr.length; i4++) {
                sb.append(", ");
                sb.append(objArr[i4]);
            }
            sb.append(']');
        }
        return sb.toString();
    }

    public static final C8404e appmetrica(TypeVariable typeVariable) {
        GenericDeclaration genericDeclaration = typeVariable.getGenericDeclaration();
        if (genericDeclaration instanceof Class) {
            return (C8404e) AbstractC3820e.ad.vip((Class) genericDeclaration);
        }
        throw new Error("Non-class container of a type parameter is not supported: " + genericDeclaration + " (" + typeVariable + ')');
    }

    public static void billing(int[] iArr, int[] iArr2) {
        long j = iArr[9] & 4294967295L;
        long j2 = iArr[10] & 4294967295L;
        long j3 = iArr[11] & 4294967295L;
        long j4 = iArr[12] & 4294967295L;
        long j5 = iArr[13] & 4294967295L;
        long j6 = iArr[14] & 4294967295L;
        long j7 = iArr[15] & 4294967295L;
        long j8 = (iArr[8] & 4294967295L) - 6;
        long j9 = j8 + j;
        long j10 = j + j2;
        long j11 = (j2 + j3) - j7;
        long j12 = j3 + j4;
        long j13 = j4 + j5;
        long j14 = j5 + j6;
        long j15 = j6 + j7;
        long j16 = j14 - j9;
        long j17 = ((iArr[0] & 4294967295L) - j12) - j16;
        iArr2[0] = (int) j17;
        long j18 = ((((iArr[1] & 4294967295L) + j10) - j13) - j15) + (j17 >> 32);
        iArr2[1] = (int) j18;
        long j19 = (((iArr[2] & 4294967295L) + j11) - j14) + (j18 >> 32);
        iArr2[2] = (int) j19;
        long j20 = ((((iArr[3] & 4294967295L) + (j12 << 1)) + j16) - j15) + (j19 >> 32);
        iArr2[3] = (int) j20;
        long j21 = ((((iArr[4] & 4294967295L) + (j13 << 1)) + j6) - j10) + (j20 >> 32);
        iArr2[4] = (int) j21;
        long j22 = (((iArr[5] & 4294967295L) + (j14 << 1)) - j11) + (j21 >> 32);
        iArr2[5] = (int) j22;
        long j23 = (iArr[6] & 4294967295L) + (j15 << 1) + j16 + (j22 >> 32);
        iArr2[6] = (int) j23;
        long j24 = (((((iArr[7] & 4294967295L) + (j7 << 1)) + j8) - j11) - j13) + (j23 >> 32);
        iArr2[7] = (int) j24;
        yandex(iArr2, (int) ((j24 >> 32) + 6));
    }

    public static C14377e license(Type type, InterfaceC0861e interfaceC0861e, List list, boolean z) {
        return new C14377e(interfaceC0861e, list, z, C13664e.f27089e, null, false, false, false, null, new C1361e(type, 2));
    }

    public static final void metrica(AbstractC13960e abstractC13960e, C3168e c3168e, AbstractC0003e abstractC0003e) {
        AutoCloseable autoCloseable;
        C15423e c15423e = abstractC13960e.ad;
        if (c15423e != null) {
            synchronized (c15423e.ad) {
                autoCloseable = (AutoCloseable) c15423e.vip.get("androidx.lifecycle.savedstate.vm.tag");
            }
        } else {
            autoCloseable = null;
        }
        C17339e c17339e = (C17339e) autoCloseable;
        if (c17339e == null || c17339e.f34022e) {
            return;
        }
        c17339e.ad(c3168e, abstractC0003e);
        EnumC7785e enumC7785e = ((C4891e) abstractC0003e).license;
        if (enumC7785e == EnumC7785e.f15778e || enumC7785e.ad(EnumC7785e.f15779e)) {
            c3168e.m1263e();
        } else {
            abstractC0003e.ad(new C5462e(abstractC0003e, c3168e, 1));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final C12590e mopub(C14377e c14377e, Type type) {
        InterfaceC0861e interfaceC0861e = c14377e.f28436e;
        List<C5538e> list = c14377e.f28434e;
        ArrayList arrayList = new ArrayList(AbstractC0746e.subscription(list, 10));
        for (C5538e c5538e : list) {
            InterfaceC13984e interfaceC13984e = c5538e.vip;
            if (interfaceC13984e != null) {
                c5538e = new C5538e(3, interfaceC13984e);
            }
            arrayList.add(c5538e);
        }
        C14377e license = license(type, interfaceC0861e, arrayList, true);
        C1361e c1361e = new C1361e(type, 3);
        boolean equals = c14377e.equals(license);
        C12590e c12590e = c14377e;
        if (!equals) {
            c12590e = new C12590e(c14377e, license, false, c1361e);
        }
        return c12590e;
    }

    public static void purchase(int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4) {
        AbstractC10077e.isPro(iArr, iArr2, iArr4);
        billing(iArr4, iArr3);
    }

    public static final C5538e smaato(Type type, Map map) {
        if (!(type instanceof WildcardType)) {
            C5538e c5538e = C5538e.metrica;
            return AbstractC16704e.license(advert(type, map, 0, false, 6));
        }
        WildcardType wildcardType = (WildcardType) type;
        Type[] upperBounds = wildcardType.getUpperBounds();
        Type[] lowerBounds = wildcardType.getLowerBounds();
        if (upperBounds.length > 1 || lowerBounds.length > 1) {
            throw new Error("Wildcard types with many bounds are not supported: " + type);
        }
        if (lowerBounds.length == 1) {
            C5538e c5538e2 = C5538e.metrica;
            return new C5538e(2, advert((Type) AbstractC1660e.m676try(lowerBounds), map, 0, false, 6));
        }
        if (upperBounds.length != 1) {
            return C5538e.metrica;
        }
        C5538e c5538e3 = C5538e.metrica;
        return new C5538e(3, advert((Type) AbstractC1660e.m676try(upperBounds), map, 0, false, 6));
    }

    public static void startapp(int i, int[] iArr, int[] iArr2, int[] iArr3) {
        AbstractC10077e.premium(iArr, iArr3);
        while (true) {
            billing(iArr3, iArr2);
            i--;
            if (i <= 0) {
                return;
            } else {
                AbstractC10077e.premium(iArr2, iArr3);
            }
        }
    }

    public static final List vip(Class cls) {
        return AbstractC7762e.Signature(AbstractC7762e.mopub(AbstractC7762e.advert(cls, C11633e.f23360e), C11633e.f23374e));
    }

    public static void yandex(int[] iArr, int i) {
        long j;
        if (i != 0) {
            long j2 = i & 4294967295L;
            long j3 = (iArr[0] & 4294967295L) + j2;
            iArr[0] = (int) j3;
            long j4 = j3 >> 32;
            if (j4 != 0) {
                long j5 = j4 + (iArr[1] & 4294967295L);
                iArr[1] = (int) j5;
                long j6 = (j5 >> 32) + (iArr[2] & 4294967295L);
                iArr[2] = (int) j6;
                j4 = j6 >> 32;
            }
            long j7 = ((iArr[3] & 4294967295L) - j2) + j4;
            iArr[3] = (int) j7;
            long j8 = j7 >> 32;
            if (j8 != 0) {
                long j9 = j8 + (iArr[4] & 4294967295L);
                iArr[4] = (int) j9;
                long j10 = (j9 >> 32) + (iArr[5] & 4294967295L);
                iArr[5] = (int) j10;
                j8 = j10 >> 32;
            }
            long j11 = ((iArr[6] & 4294967295L) - j2) + j8;
            iArr[6] = (int) j11;
            long j12 = (4294967295L & iArr[7]) + j2 + (j11 >> 32);
            iArr[7] = (int) j12;
            j = j12 >> 32;
        } else {
            j = 0;
        }
        if (j != 0 || (iArr[7] == -1 && AbstractC10077e.pro(iArr, ad))) {
            ad(iArr);
        }
    }
}
