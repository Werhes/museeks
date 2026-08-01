package defpackage;

import androidx.car.app.model.Alert;
import java.io.Closeable;
import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٗؑۡ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC16704e {
    public static final String[] ad = {"audio/mpeg-L1", "audio/mpeg-L2", "audio/mpeg"};
    public static final int[] vip = {44100, 48000, 32000};
    public static final int[] metrica = {32000, 64000, 96000, 128000, 160000, 192000, 224000, 256000, 288000, 320000, 352000, 384000, 416000, 448000};
    public static final int[] license = {32000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000, 176000, 192000, 224000, 256000};
    public static final int[] appmetrica = {32000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000, 384000};
    public static final int[] purchase = {32000, 40000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000};
    public static final int[] billing = {8000, AbstractC1815e.AUDIO_CONTENT_SAMPLING_RATE, 24000, 32000, 40000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000};

    public static final AbstractC13345e ad(C14172e c14172e, InterfaceC13984e interfaceC13984e) {
        boolean z;
        AbstractC13345e ad2 = c14172e.ad(AbstractC9546e.smaato(interfaceC13984e));
        return ((ad2 instanceof C11248e) || ((z = ad2 instanceof C16380e))) ? ad2 : interfaceC13984e.startapp() ? ad2.license() : z ? ad2 : new C16380e(ad2);
    }

    public static final InterfaceC17242e appmetrica(InterfaceC18089e interfaceC18089e, int i, int i2, int i3, int i4, int i5, InterfaceC13158e interfaceC13158e, List list, AbstractC2832e[] abstractC2832eArr, int i6, int i7, int[] iArr, int i8) {
        int i9;
        float f;
        long j;
        int i10;
        int i11;
        int i12;
        List list2 = list;
        long j2 = i5;
        int i13 = i7 - i6;
        int[] iArr2 = new int[i13];
        int i14 = i6;
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        int i18 = 0;
        float f2 = 0.0f;
        while (i14 < i7) {
            InterfaceC16719e interfaceC16719e = (InterfaceC16719e) list2.get(i14);
            float purchase2 = AbstractC0607e.purchase(AbstractC0607e.appmetrica(interfaceC16719e));
            if (purchase2 > 0.0f) {
                f2 += purchase2;
                i16++;
                j = j2;
                i10 = i14;
            } else {
                int i19 = i3 - i17;
                AbstractC2832e abstractC2832e = abstractC2832eArr[i14];
                j = j2;
                if (abstractC2832e == null) {
                    if (i3 == Integer.MAX_VALUE) {
                        i10 = i14;
                        i11 = i16;
                        i12 = Alert.DURATION_SHOW_INDEFINITELY;
                    } else {
                        i10 = i14;
                        i11 = i16;
                        i12 = i19 < 0 ? 0 : i19;
                    }
                    abstractC2832e = interfaceC16719e.admob(interfaceC18089e.billing(0, i12, i4, false));
                } else {
                    i10 = i14;
                    i11 = i16;
                }
                AbstractC2832e abstractC2832e2 = abstractC2832e;
                int adcel = interfaceC18089e.adcel(abstractC2832e2);
                int startapp = interfaceC18089e.startapp(abstractC2832e2);
                iArr2[i10 - i6] = adcel;
                int i20 = i19 - adcel;
                if (i20 < 0) {
                    i20 = 0;
                }
                i18 = Math.min(i5, i20);
                i17 += adcel + i18;
                i15 = Math.max(i15, startapp);
                abstractC2832eArr[i10] = abstractC2832e2;
                i16 = i11;
            }
            i14 = i10 + 1;
            j2 = j;
        }
        long j3 = j2;
        if (i16 == 0) {
            i17 -= i18;
            i9 = 0;
        } else {
            long j4 = (r22 - 1) * j3;
            long j5 = ((i3 != Integer.MAX_VALUE ? i3 : i) - i17) - j4;
            if (j5 < 0) {
                j5 = 0;
            }
            float f3 = ((float) j5) / f2;
            for (int i21 = i6; i21 < i7; i21++) {
                j5 -= Math.round(AbstractC0607e.purchase(AbstractC0607e.appmetrica((InterfaceC16719e) list2.get(i21))) * f3);
            }
            int i22 = i6;
            int i23 = i15;
            int i24 = 0;
            while (i22 < i7) {
                if (abstractC2832eArr[i22] == null) {
                    InterfaceC16719e interfaceC16719e2 = (InterfaceC16719e) list2.get(i22);
                    f = f3;
                    C11249e appmetrica2 = AbstractC0607e.appmetrica(interfaceC16719e2);
                    float purchase3 = AbstractC0607e.purchase(appmetrica2);
                    if (purchase3 <= 0.0f) {
                        AbstractC9534e.vip("All weights <= 0 should have placeables");
                    }
                    int signum = Long.signum(j5);
                    long j6 = j5 - signum;
                    int max = Math.max(0, Math.round(purchase3 * f) + signum);
                    AbstractC2832e admob = interfaceC16719e2.admob(interfaceC18089e.billing((!(appmetrica2 != null ? appmetrica2.vip : true) || max == Integer.MAX_VALUE) ? 0 : max, max, i4, true));
                    int adcel2 = interfaceC18089e.adcel(admob);
                    int startapp2 = interfaceC18089e.startapp(admob);
                    iArr2[i22 - i6] = adcel2;
                    i24 += adcel2;
                    int max2 = Math.max(i23, startapp2);
                    abstractC2832eArr[i22] = admob;
                    i23 = max2;
                    j5 = j6;
                } else {
                    f = f3;
                }
                i22++;
                list2 = list;
                f3 = f;
            }
            i9 = (int) (i24 + j4);
            int i25 = i3 - i17;
            if (i9 < 0) {
                i9 = 0;
            }
            if (i9 > i25) {
                i9 = i25;
            }
            i15 = i23;
        }
        int i26 = i9 + i17;
        if (i26 < 0) {
            i26 = 0;
        }
        int max3 = Math.max(i26, i);
        int max4 = Math.max(i15, Math.max(i2, 0));
        int[] iArr3 = new int[i13];
        interfaceC18089e.purchase(max3, iArr2, iArr3, interfaceC13158e);
        return interfaceC18089e.yandex(abstractC2832eArr, interfaceC13158e, iArr3, max3, max4, iArr, i8, i6, i7);
    }

    public static C5538e license(InterfaceC13984e interfaceC13984e) {
        return new C5538e(1, interfaceC13984e);
    }

    public static int metrica(int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        if ((i & (-2097152)) != -2097152 || (i2 = (i >>> 19) & 3) == 1 || (i3 = (i >>> 17) & 3) == 0 || (i4 = (i >>> 12) & 15) == 0 || i4 == 15 || (i5 = (i >>> 10) & 3) == 3) {
            return -1;
        }
        int i6 = vip[i5];
        if (i2 == 2) {
            i6 /= 2;
        } else if (i2 == 0) {
            i6 /= 4;
        }
        int i7 = (i >>> 9) & 1;
        if (i3 == 3) {
            return ((((i2 == 3 ? metrica[i4 - 1] : license[i4 - 1]) * 12) / i6) + i7) * 4;
        }
        int i8 = i2 == 3 ? i3 == 2 ? appmetrica[i4 - 1] : purchase[i4 - 1] : billing[i4 - 1];
        if (i2 == 3) {
            return AbstractC10257e.appmetrica(i8, 144, i6, i7);
        }
        return AbstractC10257e.appmetrica(i3 == 1 ? 72 : 144, i8, i6, i7);
    }

    public static final void vip(Closeable closeable, Throwable th) {
        if (closeable != null) {
            if (th == null) {
                closeable.close();
                return;
            }
            try {
                closeable.close();
            } catch (Throwable th2) {
                AbstractC13362e.license(th, th2);
            }
        }
    }
}
