package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
import org.conscrypt.PSKKeyManager;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؚٗؑ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC16852e {
    public static final long[] ad = new long[PSKKeyManager.MAX_KEY_LENGTH_BYTES];
    public static boolean vip = false;

    public static void Signature(Parcel parcel, int i, Integer num) {
        if (num == null) {
            return;
        }
        isPro(parcel, i, 4);
        parcel.writeInt(num.intValue());
    }

    public static final long ad(int i) {
        long j = (i << 32) | (0 & 4294967295L);
        int i2 = AbstractC13232e.f26265protected;
        return j;
    }

    public static void adcel(Parcel parcel, int i, Bundle bundle) {
        if (bundle == null) {
            return;
        }
        int applovin = applovin(parcel, i);
        parcel.writeBundle(bundle);
        ads(parcel, applovin);
    }

    public static void admob(Parcel parcel, int i, long[] jArr) {
        if (jArr == null) {
            return;
        }
        int applovin = applovin(parcel, i);
        parcel.writeLongArray(jArr);
        ads(parcel, applovin);
    }

    public static void ads(Parcel parcel, int i) {
        int dataPosition = parcel.dataPosition();
        parcel.setDataPosition(i - 4);
        parcel.writeInt(dataPosition - i);
        parcel.setDataPosition(dataPosition);
    }

    public static void advert(Parcel parcel, int i, byte[][] bArr) {
        if (bArr == null) {
            return;
        }
        int applovin = applovin(parcel, i);
        parcel.writeInt(bArr.length);
        for (byte[] bArr2 : bArr) {
            parcel.writeByteArray(bArr2);
        }
        ads(parcel, applovin);
    }

    public static void amazon(Parcel parcel, int i, int[] iArr) {
        if (iArr == null) {
            return;
        }
        int applovin = applovin(parcel, i);
        parcel.writeIntArray(iArr);
        ads(parcel, applovin);
    }

    public static int applovin(Parcel parcel, int i) {
        parcel.writeInt(i | (-65536));
        parcel.writeInt(0);
        return parcel.dataPosition();
    }

    public static final C5759e appmetrica(AbstractC14213e abstractC14213e, AbstractC14213e abstractC14213e2) {
        if (abstractC14213e == abstractC14213e2) {
            return new C5759e(abstractC14213e, abstractC14213e, 1);
        }
        long j = abstractC14213e.vip;
        long j2 = AbstractC16096e.ad;
        return (AbstractC16096e.ad(j, j2) && AbstractC16096e.ad(abstractC14213e2.vip, j2)) ? new C10404e((C14093e) abstractC14213e, (C14093e) abstractC14213e2) : new C5759e(abstractC14213e, abstractC14213e2, 0);
    }

    public static final float[] billing(float[] fArr, float[] fArr2) {
        float[] fArr3 = new float[9];
        if (fArr.length < 9 || fArr2.length < 9) {
            return fArr3;
        }
        float f = fArr[0] * fArr2[0];
        float f2 = fArr[3];
        float f3 = fArr2[1];
        float f4 = fArr[6];
        float f5 = fArr2[2];
        fArr3[0] = (f4 * f5) + (f2 * f3) + f;
        float f6 = fArr[1];
        float f7 = fArr2[0];
        float f8 = fArr[4];
        float f9 = fArr[7];
        float f10 = f9 * f5;
        fArr3[1] = f10 + (f3 * f8) + (f6 * f7);
        float f11 = fArr[2] * f7;
        float f12 = fArr[5];
        float f13 = (fArr2[1] * f12) + f11;
        float f14 = fArr[8];
        fArr3[2] = (f5 * f14) + f13;
        float f15 = fArr[0];
        float f16 = fArr2[3] * f15;
        float f17 = fArr2[4];
        float f18 = (f2 * f17) + f16;
        float f19 = fArr2[5];
        fArr3[3] = (f4 * f19) + f18;
        float f20 = fArr[1];
        float f21 = fArr2[3];
        float f22 = f8 * f17;
        fArr3[4] = (f9 * f19) + f22 + (f20 * f21);
        float f23 = fArr[2];
        float f24 = f19 * f14;
        fArr3[5] = f24 + (f12 * fArr2[4]) + (f21 * f23);
        float f25 = f15 * fArr2[6];
        float f26 = fArr[3];
        float f27 = fArr2[7];
        float f28 = (f26 * f27) + f25;
        float f29 = fArr2[8];
        fArr3[6] = (f4 * f29) + f28;
        float f30 = fArr2[6];
        float f31 = f9 * f29;
        fArr3[7] = f31 + (fArr[4] * f27) + (f20 * f30);
        float f32 = f14 * f29;
        fArr3[8] = f32 + (fArr[5] * fArr2[7]) + (f23 * f30);
        return fArr3;
    }

    public static void inmobi(int i, Object[] objArr) {
        for (int i2 = 0; i2 < i; i2++) {
            if (objArr[i2] == null) {
                throw new NullPointerException(AbstractC8647e.isPro(i2, "at index ", new StringBuilder(String.valueOf(i2).length() + 9)));
            }
        }
    }

    public static void isPro(Parcel parcel, int i, int i2) {
        parcel.writeInt(i | (i2 << 16));
    }

    public static void isVip(Parcel parcel, int i, List list) {
        if (list == null) {
            return;
        }
        int applovin = applovin(parcel, i);
        int size = list.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            Parcelable parcelable = (Parcelable) list.get(i2);
            if (parcelable == null) {
                parcel.writeInt(0);
            } else {
                int dataPosition = parcel.dataPosition();
                parcel.writeInt(1);
                int dataPosition2 = parcel.dataPosition();
                parcelable.writeToParcel(parcel, 0);
                int dataPosition3 = parcel.dataPosition();
                parcel.setDataPosition(dataPosition);
                parcel.writeInt(dataPosition3 - dataPosition2);
                parcel.setDataPosition(dataPosition3);
            }
        }
        ads(parcel, applovin);
    }

    public static final boolean license(C4574e c4574e, C4574e c4574e2) {
        if (c4574e == c4574e2) {
            return true;
        }
        return Math.abs(c4574e.ad - c4574e2.ad) < 0.001f && Math.abs(c4574e.vip - c4574e2.vip) < 0.001f;
    }

    public static void loadAd(Parcel parcel, int i, List list) {
        if (list == null) {
            return;
        }
        int applovin = applovin(parcel, i);
        int size = list.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            parcel.writeInt(((Integer) list.get(i2)).intValue());
        }
        ads(parcel, applovin);
    }

    public static final float[] metrica(float[] fArr, float[] fArr2, float[] fArr3) {
        yandex(fArr, fArr2);
        yandex(fArr, fArr3);
        float[] fArr4 = {fArr3[0] / fArr2[0], fArr3[1] / fArr2[1], fArr3[2] / fArr2[2]};
        float[] purchase = purchase(fArr);
        float f = fArr4[0];
        float f2 = fArr[0] * f;
        float f3 = fArr4[1];
        float f4 = fArr[1] * f3;
        float f5 = fArr4[2];
        return billing(purchase, new float[]{f2, f4, fArr[2] * f5, fArr[3] * f, fArr[4] * f3, fArr[5] * f5, f * fArr[6], f3 * fArr[7], f5 * fArr[8]});
    }

    public static void mopub(Parcel parcel, int i, byte[] bArr) {
        if (bArr == null) {
            return;
        }
        int applovin = applovin(parcel, i);
        parcel.writeByteArray(bArr);
        ads(parcel, applovin);
    }

    public static void pro(Parcel parcel, int i, String[] strArr) {
        if (strArr == null) {
            return;
        }
        int applovin = applovin(parcel, i);
        parcel.writeStringArray(strArr);
        ads(parcel, applovin);
    }

    public static final float[] purchase(float[] fArr) {
        float f = fArr[0];
        float f2 = fArr[3];
        float f3 = fArr[6];
        float f4 = fArr[1];
        float f5 = fArr[4];
        float f6 = fArr[7];
        float f7 = fArr[2];
        float f8 = fArr[5];
        float f9 = fArr[8];
        float f10 = (f5 * f9) - (f6 * f8);
        float f11 = (f6 * f7) - (f4 * f9);
        float f12 = (f4 * f8) - (f5 * f7);
        float f13 = (f3 * f12) + (f2 * f11) + (f * f10);
        float[] fArr2 = new float[fArr.length];
        fArr2[0] = f10 / f13;
        fArr2[1] = f11 / f13;
        fArr2[2] = f12 / f13;
        fArr2[3] = ((f3 * f8) - (f2 * f9)) / f13;
        fArr2[4] = ((f9 * f) - (f3 * f7)) / f13;
        fArr2[5] = ((f7 * f2) - (f8 * f)) / f13;
        fArr2[6] = ((f2 * f6) - (f3 * f5)) / f13;
        fArr2[7] = ((f3 * f4) - (f6 * f)) / f13;
        fArr2[8] = ((f * f5) - (f2 * f4)) / f13;
        return fArr2;
    }

    public static void remoteconfig(Parcel parcel, int i, String str) {
        if (str == null) {
            return;
        }
        int applovin = applovin(parcel, i);
        parcel.writeString(str);
        ads(parcel, applovin);
    }

    public static void signatures(Parcel parcel, int i, List list) {
        if (list == null) {
            return;
        }
        int applovin = applovin(parcel, i);
        parcel.writeStringList(list);
        ads(parcel, applovin);
    }

    public static void smaato(Parcel parcel, int i, IBinder iBinder) {
        if (iBinder == null) {
            return;
        }
        int applovin = applovin(parcel, i);
        parcel.writeStrongBinder(iBinder);
        ads(parcel, applovin);
    }

    public static void startapp(Parcel parcel, int i, Boolean bool) {
        if (bool == null) {
            return;
        }
        isPro(parcel, i, 4);
        parcel.writeInt(bool.booleanValue() ? 1 : 0);
    }

    public static void subscription(Parcel parcel, int i, Parcelable parcelable, int i2) {
        if (parcelable == null) {
            return;
        }
        int applovin = applovin(parcel, i);
        parcelable.writeToParcel(parcel, i2);
        ads(parcel, applovin);
    }

    public static void tapsense(Parcel parcel, int i, Parcelable[] parcelableArr, int i2) {
        if (parcelableArr == null) {
            return;
        }
        int applovin = applovin(parcel, i);
        parcel.writeInt(parcelableArr.length);
        for (Parcelable parcelable : parcelableArr) {
            if (parcelable == null) {
                parcel.writeInt(0);
            } else {
                int dataPosition = parcel.dataPosition();
                parcel.writeInt(1);
                int dataPosition2 = parcel.dataPosition();
                parcelable.writeToParcel(parcel, i2);
                int dataPosition3 = parcel.dataPosition();
                parcel.setDataPosition(dataPosition);
                parcel.writeInt(dataPosition3 - dataPosition2);
                parcel.setDataPosition(dataPosition3);
            }
        }
        ads(parcel, applovin);
    }

    public static AbstractC14213e vip(AbstractC14213e abstractC14213e) {
        if (AbstractC16096e.ad(abstractC14213e.vip, AbstractC16096e.ad)) {
            C14093e c14093e = (C14093e) abstractC14213e;
            C4574e c4574e = c14093e.license;
            C4574e c4574e2 = AbstractC15365e.vip;
            if (!license(c4574e, c4574e2)) {
                return new C14093e(c14093e.ad, c14093e.yandex, c4574e2, billing(metrica(C9444e.metrica.vip, c4574e.ad(), c4574e2.ad()), c14093e.startapp), c14093e.mopub, c14093e.amazon, c14093e.appmetrica, c14093e.purchase, c14093e.billing, -1);
            }
        }
        return abstractC14213e;
    }

    public static final float[] yandex(float[] fArr, float[] fArr2) {
        if (fArr.length < 9 || fArr2.length < 3) {
            return fArr2;
        }
        float f = fArr2[0];
        float f2 = fArr2[1];
        float f3 = fArr2[2];
        fArr2[0] = (fArr[6] * f3) + (fArr[3] * f2) + (fArr[0] * f);
        fArr2[1] = (fArr[7] * f3) + (fArr[4] * f2) + (fArr[1] * f);
        fArr2[2] = (fArr[8] * f3) + (fArr[5] * f2) + (fArr[2] * f);
        return fArr2;
    }
}
