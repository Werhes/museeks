package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.car.app.model.Alert;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import org.conscrypt.BuildConfig;
import org.conscrypt.PSKKeyManager;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٕۚٚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC15710e {
    public static final int[] ad = {-19, -1, -1, -1, -1, -1, -1, Alert.DURATION_SHOW_INDEFINITELY};
    public static final int[] vip = {361, 0, 0, 0, 0, 0, 0, 0, -19, -1, -1, -1, -1, -1, -1, 1073741823};

    public static void Signature(int[] iArr, int[] iArr2) {
        AbstractC12797e.subs(8, 0, iArr, iArr2);
        if (AbstractC10077e.pro(iArr2, ad)) {
            amazon(iArr2);
        }
    }

    public static final void ad(final Function0 function0, final boolean z, final boolean z2, final InterfaceC12864e interfaceC12864e, final long j, long j2, float f, C13770e c13770e, final int i) {
        final long j3;
        final float f2;
        c13770e.m3671package(-261695189);
        int i2 = i | (c13770e.yandex(function0) ? 4 : 2) | (c13770e.billing(z) ? 32 : 16) | (c13770e.billing(z2) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128) | (c13770e.purchase(interfaceC12864e) ? 2048 : 1024) | 1769472;
        if (c13770e.m3673protected(i2 & 1, (599187 & i2) != 599186)) {
            long j4 = C3618e.appmetrica;
            final float f3 = 24;
            float f4 = 0;
            AbstractC0207e.ad(function0, interfaceC12864e, AbstractC6549e.ad, j, j4, AbstractC12681e.metrica(f4, f4, f4, f4, 0), AbstractC16653e.license(-1305201303, new Function2() { // from class: eٖ۠ؕ
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    C13770e c13770e2 = (C13770e) obj;
                    int intValue = ((Integer) obj2).intValue();
                    if (c13770e2.m3673protected(intValue & 1, (intValue & 3) != 2)) {
                        AbstractC15710e.vip(z, z2, interfaceC12864e, f3, c13770e2, 0, 0);
                    } else {
                        c13770e2.m3659default();
                    }
                    return Unit.INSTANCE;
                }
            }, c13770e), c13770e, ((i2 >> 6) & 112) | (i2 & 14) | 12582912 | 27648, 64);
            j3 = j4;
            f2 = f3;
        } else {
            c13770e.m3659default();
            j3 = j2;
            f2 = f;
        }
        C2846e subscription = c13770e.subscription();
        if (subscription != null) {
            subscription.license = new Function2(z, z2, interfaceC12864e, j, j3, f2, i) { // from class: eَٟۘ

                /* renamed from: eّؑؑ, reason: contains not printable characters */
                public final /* synthetic */ long f20696e;

                /* renamed from: eًؔؐ, reason: contains not printable characters */
                public final /* synthetic */ boolean f20697e;

                /* renamed from: eؘٙؓ, reason: contains not printable characters */
                public final /* synthetic */ boolean f20698e;

                /* renamed from: eؙِٖ, reason: contains not printable characters */
                public final /* synthetic */ InterfaceC12864e f20699e;

                /* renamed from: eؘَٗ, reason: contains not printable characters */
                public final /* synthetic */ float f20701e;

                /* renamed from: eٗۚۖ, reason: contains not printable characters */
                public final /* synthetic */ long f20702e;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int advert = AbstractC5190e.advert(24577);
                    AbstractC15710e.ad(Function0.this, this.f20698e, this.f20697e, this.f20699e, this.f20696e, this.f20702e, this.f20701e, (C13770e) obj, advert);
                    return Unit.INSTANCE;
                }
            };
        }
    }

    public static void adcel(int[] iArr, int[] iArr2) {
        int i = iArr[7];
        int i2 = i;
        int i3 = 0;
        while (i3 < 8) {
            int i4 = iArr[8 + i3];
            iArr2[i3] = (i2 >>> 31) | (i4 << 1);
            i3++;
            i2 = i4;
        }
        long j = 19 & 4294967295L;
        long j2 = ((iArr2[0] & 4294967295L) * j) + (iArr[0] & 4294967295L);
        iArr2[0] = (int) j2;
        long j3 = ((iArr2[1] & 4294967295L) * j) + (iArr[1] & 4294967295L) + (j2 >>> 32);
        iArr2[1] = (int) j3;
        long j4 = ((iArr2[2] & 4294967295L) * j) + (iArr[2] & 4294967295L) + (j3 >>> 32);
        iArr2[2] = (int) j4;
        long j5 = ((iArr2[3] & 4294967295L) * j) + (iArr[3] & 4294967295L) + (j4 >>> 32);
        iArr2[3] = (int) j5;
        long j6 = ((iArr2[4] & 4294967295L) * j) + (iArr[4] & 4294967295L) + (j5 >>> 32);
        iArr2[4] = (int) j6;
        long j7 = ((iArr2[5] & 4294967295L) * j) + (iArr[5] & 4294967295L) + (j6 >>> 32);
        iArr2[5] = (int) j7;
        long j8 = ((iArr2[6] & 4294967295L) * j) + (iArr[6] & 4294967295L) + (j7 >>> 32);
        iArr2[6] = (int) j8;
        long j9 = (j * (iArr2[7] & 4294967295L)) + (4294967295L & iArr[7]) + (j8 >>> 32);
        int i5 = (int) j9;
        iArr2[7] = i5;
        iArr2[7] = AbstractC12797e.billing(7, (((i5 >>> 31) - (i >>> 31)) + (((int) (j9 >>> 32)) << 1)) * 19, iArr2) + (Integer.MAX_VALUE & i5);
        if (AbstractC10077e.pro(iArr2, ad)) {
            amazon(iArr2);
        }
    }

    public static void admob(Parcel parcel, Parcelable parcelable, int i) {
        if (parcelable == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcelable.writeToParcel(parcel, i);
        }
    }

    public static void advert(int[] iArr, int[] iArr2) {
        int[] iArr3 = new int[16];
        AbstractC10077e.premium(iArr, iArr3);
        adcel(iArr3, iArr2);
    }

    public static void amazon(int[] iArr) {
        long j = (iArr[0] & 4294967295L) + 19;
        iArr[0] = (int) j;
        long j2 = j >> 32;
        if (j2 != 0) {
            j2 = AbstractC12797e.tapsense(7, 1, iArr);
        }
        iArr[7] = (int) (((4294967295L & iArr[7]) - 2147483648L) + j2);
    }

    public static final void appmetrica(InterfaceC1618e interfaceC1618e) {
        C0638e c0638e = new C0638e(1, interfaceC1618e, InterfaceC1618e.class, "flushAndClose", "flushAndClose(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, 0, 19);
        C3966e c3966e = AbstractC12534e.ad;
        try {
            AbstractC7214e.advert(AbstractC10558e.startapp(new C8652e(c0638e)), Unit.INSTANCE);
        } catch (Throwable th) {
            AbstractC17673e.license(c3966e, th);
            throw null;
        }
    }

    public static final Object billing(InterfaceC1618e interfaceC1618e, AbstractC10731e abstractC10731e) {
        Throwable vip2 = interfaceC1618e.vip();
        if (vip2 != null) {
            throw vip2;
        }
        if (!interfaceC1618e.startapp()) {
            C12402e appmetrica = interfaceC1618e.appmetrica();
            appmetrica.metrica();
            if (((int) appmetrica.f24832e) < 1048576) {
                return Unit.INSTANCE;
            }
        }
        Object metrica = interfaceC1618e.metrica(abstractC10731e);
        return metrica == EnumC2821e.f6782e ? metrica : Unit.INSTANCE;
    }

    public static final void license(C0731e c0731e, C2401e c2401e, long j) {
        C7699e c7699e = (C7699e) c0731e.f3025e;
        c7699e.getClass();
        C1756e c1756e = (C1756e) c7699e.f15623e;
        C1756e c1756e2 = (C1756e) c7699e.f15624e;
        boolean metrica = AbstractC17957e.metrica(c2401e);
        long j2 = c2401e.vip;
        if (metrica) {
            AbstractC1660e.inmobi(null, c1756e2.license);
            c1756e2.appmetrica = 0;
            AbstractC1660e.inmobi(null, c1756e.license);
            c1756e.appmetrica = 0;
            c7699e.f15625e = 0L;
        }
        if (!AbstractC17957e.appmetrica(c2401e)) {
            List list = c2401e.smaato;
            if (list == null) {
                list = C13664e.f27089e;
            }
            int i = 0;
            for (int size = list.size(); i < size; size = size) {
                C15715e c15715e = (C15715e) list.get(i);
                c7699e.license(c15715e.ad, C2152e.startapp(c15715e.appmetrica, j));
                i++;
            }
            c7699e.license(j2, C2152e.startapp(c2401e.amazon, j));
        }
        if (AbstractC17957e.appmetrica(c2401e) && j2 - c7699e.f15625e > 40) {
            AbstractC1660e.inmobi(null, c1756e2.license);
            c1756e2.appmetrica = 0;
            AbstractC1660e.inmobi(null, c1756e.license);
            c1756e.appmetrica = 0;
            c7699e.f15625e = 0L;
        }
        c7699e.f15625e = j2;
    }

    public static void loadAd(int[] iArr, int[] iArr2, int[] iArr3) {
        if (AbstractC10077e.crashlytics(iArr, iArr2, iArr3) != 0) {
            long j = (iArr3[0] & 4294967295L) - 19;
            iArr3[0] = (int) j;
            long j2 = j >> 32;
            if (j2 != 0) {
                j2 = AbstractC12797e.yandex(7, 1, iArr3);
            }
            iArr3[7] = (int) ((4294967295L & iArr3[7]) + 2147483648L + j2);
        }
    }

    public static Object metrica(Parcel parcel, Parcelable.Creator creator) {
        if (parcel.readInt() != 0) {
            return creator.createFromParcel(parcel);
        }
        return null;
    }

    public static void mopub(int[] iArr, int i) {
        int i2 = iArr[7];
        int i3 = (i << 1) | (i2 >>> 31);
        iArr[7] = AbstractC12797e.billing(7, i3 * 19, iArr) + (i2 & Alert.DURATION_SHOW_INDEFINITELY);
        if (AbstractC10077e.pro(iArr, ad)) {
            amazon(iArr);
        }
    }

    public static final float purchase(float[] fArr, float[] fArr2) {
        int length = fArr.length;
        float f = 0.0f;
        for (int i = 0; i < length; i++) {
            f += fArr[i] * fArr2[i];
        }
        return f;
    }

    public static void smaato(int i, int[] iArr, int[] iArr2) {
        int[] iArr3 = new int[16];
        AbstractC10077e.premium(iArr, iArr3);
        while (true) {
            adcel(iArr3, iArr2);
            i--;
            if (i <= 0) {
                return;
            } else {
                AbstractC10077e.premium(iArr2, iArr3);
            }
        }
    }

    public static final void startapp(float[] fArr, float[] fArr2, int i, float[] fArr3) {
        if (i == 0) {
            AbstractC14070e.ad("At least one point must be provided");
        }
        int i2 = 2 >= i ? i - 1 : 2;
        int i3 = i2 + 1;
        float[][] fArr4 = new float[i3];
        for (int i4 = 0; i4 < i3; i4++) {
            fArr4[i4] = new float[i];
        }
        for (int i5 = 0; i5 < i; i5++) {
            fArr4[0][i5] = 1.0f;
            for (int i6 = 1; i6 < i3; i6++) {
                fArr4[i6][i5] = fArr4[i6 - 1][i5] * fArr[i5];
            }
        }
        float[][] fArr5 = new float[i3];
        for (int i7 = 0; i7 < i3; i7++) {
            fArr5[i7] = new float[i];
        }
        float[][] fArr6 = new float[i3];
        for (int i8 = 0; i8 < i3; i8++) {
            fArr6[i8] = new float[i3];
        }
        int i9 = 0;
        while (i9 < i3) {
            float[] fArr7 = fArr5[i9];
            System.arraycopy(fArr4[i9], 0, fArr7, 0, i);
            for (int i10 = 0; i10 < i9; i10++) {
                float[] fArr8 = fArr5[i10];
                float purchase = purchase(fArr7, fArr8);
                for (int i11 = 0; i11 < i; i11++) {
                    fArr7[i11] = fArr7[i11] - (fArr8[i11] * purchase);
                }
            }
            float sqrt = (float) Math.sqrt(purchase(fArr7, fArr7));
            if (sqrt < 1.0E-6f) {
                sqrt = 1.0E-6f;
            }
            float f = 1.0f / sqrt;
            for (int i12 = 0; i12 < i; i12++) {
                fArr7[i12] = fArr7[i12] * f;
            }
            float[] fArr9 = fArr6[i9];
            int i13 = 0;
            while (i13 < i3) {
                fArr9[i13] = i13 < i9 ? 0.0f : purchase(fArr7, fArr4[i13]);
                i13++;
            }
            i9++;
        }
        for (int i14 = i2; -1 < i14; i14--) {
            float purchase2 = purchase(fArr5[i14], fArr2);
            float[] fArr10 = fArr6[i14];
            int i15 = i14 + 1;
            if (i15 <= i2) {
                int i16 = i2;
                while (true) {
                    purchase2 -= fArr10[i16] * fArr3[i16];
                    if (i16 != i15) {
                        i16--;
                    }
                }
            }
            fArr3[i14] = purchase2 / fArr10[i14];
        }
    }

    public static final void vip(final boolean z, final boolean z2, InterfaceC12864e interfaceC12864e, final float f, C13770e c13770e, final int i, final int i2) {
        int i3;
        InterfaceC12864e interfaceC12864e2;
        int i4;
        final InterfaceC12864e interfaceC12864e3;
        c13770e.m3671package(1799700514);
        if ((i & 6) == 0) {
            i3 = (c13770e.billing(z) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= c13770e.billing(z2) ? 32 : 16;
        }
        int i5 = i2 & 4;
        if (i5 != 0) {
            i4 = i3 | 384;
            interfaceC12864e2 = interfaceC12864e;
        } else {
            interfaceC12864e2 = interfaceC12864e;
            i4 = i3 | (c13770e.purchase(interfaceC12864e2) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128);
        }
        if ((i & 3072) == 0) {
            i4 |= c13770e.metrica(f) ? 2048 : 1024;
        }
        if (c13770e.m3673protected(i4 & 1, (i4 & 1171) != 1170)) {
            InterfaceC12864e interfaceC12864e4 = i5 != 0 ? C0115e.f1276e : interfaceC12864e2;
            int startapp = AbstractC4533e.startapp(0.0f, c13770e, 0, 1);
            Boolean valueOf = Boolean.valueOf(z);
            boolean license = c13770e.license(startapp);
            Object m3681throw = c13770e.m3681throw();
            if (license || m3681throw == C2987e.ad) {
                m3681throw = new C17028e(startapp, 19);
                c13770e.m3682throws(m3681throw);
            }
            AbstractC7572e.vip(valueOf, interfaceC12864e4, (Function1) m3681throw, null, BuildConfig.FLAVOR, null, AbstractC16653e.license(-1172285979, new Function4() { // from class: e٘ۚ۠
                @Override // kotlin.jvm.functions.Function4
                public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                    boolean booleanValue = ((Boolean) obj2).booleanValue();
                    C13770e c13770e2 = (C13770e) obj3;
                    ((Integer) obj4).getClass();
                    if (booleanValue) {
                        c13770e2.m3676strictfp(-1192477427);
                        AbstractC0702e.ad(null, ((C3618e) c13770e2.adcel(AbstractC0608e.ad)).ad, 2, 24, c13770e2, 3456);
                        c13770e2.Signature(false);
                    } else {
                        c13770e2.m3676strictfp(-1192234821);
                        C8738e.ad(z2, ((C3618e) c13770e2.adcel(AbstractC0608e.ad)).ad, AbstractC18007e.startapp(C0115e.f1276e, f), c13770e2, 0);
                        c13770e2.Signature(false);
                    }
                    return Unit.INSTANCE;
                }
            }, c13770e), c13770e, (i4 & 14) | 1597440 | ((i4 >> 3) & 112), 40);
            interfaceC12864e3 = interfaceC12864e4;
        } else {
            c13770e.m3659default();
            interfaceC12864e3 = interfaceC12864e2;
        }
        C2846e subscription = c13770e.subscription();
        if (subscription != null) {
            subscription.license = new Function2() { // from class: eٍْؐ
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    AbstractC15710e.vip(z, z2, interfaceC12864e3, f, (C13770e) obj, AbstractC5190e.advert(i | 1), i2);
                    return Unit.INSTANCE;
                }
            };
        }
    }

    public static void yandex(int[] iArr, int[] iArr2, int[] iArr3) {
        int[] iArr4 = new int[16];
        AbstractC10077e.isPro(iArr, iArr2, iArr4);
        adcel(iArr4, iArr3);
    }
}
