package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؙٝٞ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC6532e {
    public static String[] Signature(Parcel parcel, int i) {
        int m2198this = m2198this(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (m2198this == 0) {
            return null;
        }
        String[] createStringArray = parcel.createStringArray();
        parcel.setDataPosition(dataPosition + m2198this);
        return createStringArray;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0179  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final long ad(float r21, float r22, float r23, float r24, defpackage.AbstractC14213e r25) {
        /*
            Method dump skipped, instructions count: 481
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC6532e.ad(float, float, float, float, eٓۙۧ):long");
    }

    public static byte[][] adcel(Parcel parcel, int i) {
        int m2198this = m2198this(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (m2198this == 0) {
            return null;
        }
        int readInt = parcel.readInt();
        byte[][] bArr = new byte[readInt];
        for (int i2 = 0; i2 < readInt; i2++) {
            bArr[i2] = parcel.createByteArray();
        }
        parcel.setDataPosition(dataPosition + m2198this);
        return bArr;
    }

    public static ArrayList admob(Parcel parcel, int i) {
        int m2198this = m2198this(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (m2198this == 0) {
            return null;
        }
        ArrayList<String> createStringArrayList = parcel.createStringArrayList();
        parcel.setDataPosition(dataPosition + m2198this);
        return createStringArrayList;
    }

    public static InterfaceC12864e ads(InterfaceC12864e interfaceC12864e, float f, float f2, int i) {
        if ((i & 1) != 0) {
            f = 0;
        }
        if ((i & 2) != 0) {
            f2 = 0;
        }
        return applovin(interfaceC12864e, f, f2);
    }

    public static ArrayList advert(Parcel parcel, int i) {
        int m2198this = m2198this(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (m2198this == 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int readInt = parcel.readInt();
        for (int i2 = 0; i2 < readInt; i2++) {
            arrayList.add(Integer.valueOf(parcel.readInt()));
        }
        parcel.setDataPosition(dataPosition + m2198this);
        return arrayList;
    }

    public static Parcelable amazon(Parcel parcel, int i, Parcelable.Creator creator) {
        int m2198this = m2198this(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (m2198this == 0) {
            return null;
        }
        Parcelable parcelable = (Parcelable) creator.createFromParcel(parcel);
        parcel.setDataPosition(dataPosition + m2198this);
        return parcelable;
    }

    public static final InterfaceC12864e applovin(InterfaceC12864e interfaceC12864e, float f, float f2) {
        return interfaceC12864e.premium(new C10635e(f, f2, new C4526e(1)));
    }

    public static final long billing(long j, long j2) {
        float f;
        float f2;
        long ad = C3618e.ad(j, C3618e.purchase(j2));
        float license = C3618e.license(j2);
        float license2 = C3618e.license(ad);
        float f3 = 1.0f - license2;
        float f4 = (license * f3) + license2;
        float yandex = C3618e.yandex(ad);
        float yandex2 = C3618e.yandex(j2);
        float f5 = 0.0f;
        if (f4 == 0.0f) {
            f = 0.0f;
        } else {
            f = (((yandex2 * license) * f3) + (yandex * license2)) / f4;
        }
        float billing = C3618e.billing(ad);
        float billing2 = C3618e.billing(j2);
        if (f4 == 0.0f) {
            f2 = 0.0f;
        } else {
            f2 = (((billing2 * license) * f3) + (billing * license2)) / f4;
        }
        float appmetrica = C3618e.appmetrica(ad);
        float appmetrica2 = C3618e.appmetrica(j2);
        if (f4 != 0.0f) {
            f5 = (((appmetrica2 * license) * f3) + (appmetrica * license2)) / f4;
        }
        return purchase(f, f2, f5, f4, C3618e.purchase(j2));
    }

    /* renamed from: class, reason: not valid java name */
    public static int m2192class(Parcel parcel, int i) {
        m2201while(parcel, i, 4);
        return parcel.readInt();
    }

    public static double crashlytics(Parcel parcel, int i) {
        m2201while(parcel, i, 8);
        return parcel.readDouble();
    }

    /* renamed from: extends, reason: not valid java name */
    public static final int m2193extends(long j) {
        float[] fArr = C4717e.ad;
        return (int) (C3618e.ad(j, C4717e.appmetrica) >>> 32);
    }

    public static IBinder firebase(Parcel parcel, int i) {
        int m2198this = m2198this(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (m2198this == 0) {
            return null;
        }
        IBinder readStrongBinder = parcel.readStrongBinder();
        parcel.setDataPosition(dataPosition + m2198this);
        return readStrongBinder;
    }

    /* renamed from: goto, reason: not valid java name */
    public static long m2194goto(Parcel parcel, int i) {
        m2201while(parcel, i, 8);
        return parcel.readLong();
    }

    public static final float inmobi(long j) {
        AbstractC14213e purchase = C3618e.purchase(j);
        if (!AbstractC16096e.ad(purchase.vip, AbstractC16096e.ad)) {
            AbstractC18019e.ad("The specified color must be encoded in an RGB color space. The supplied color space is " + ((Object) AbstractC16096e.vip(purchase.vip)));
        }
        C14910e c14910e = ((C14093e) purchase).Signature;
        double mopub = c14910e.mopub(C3618e.yandex(j));
        float mopub2 = (float) ((c14910e.mopub(C3618e.appmetrica(j)) * 0.0722d) + (c14910e.mopub(C3618e.billing(j)) * 0.7152d) + (mopub * 0.2126d));
        if (mopub2 < 0.0f) {
            mopub2 = 0.0f;
        }
        if (mopub2 > 1.0f) {
            return 1.0f;
        }
        return mopub2;
    }

    /* renamed from: interface, reason: not valid java name */
    public static Integer m2195interface(Parcel parcel, int i) {
        int m2198this = m2198this(parcel, i);
        if (m2198this == 0) {
            return null;
        }
        m2200try(parcel, m2198this, 4);
        return Integer.valueOf(parcel.readInt());
    }

    public static final InterfaceC12864e isPro(InterfaceC12864e interfaceC12864e, Function1 function1) {
        return interfaceC12864e.premium(new C10240e(function1, new C2046e(7, function1)));
    }

    public static final long isVip(long j, long j2, float f) {
        C1817e c1817e = C4717e.inmobi;
        long ad = C3618e.ad(j, c1817e);
        long ad2 = C3618e.ad(j2, c1817e);
        float license = C3618e.license(ad);
        float yandex = C3618e.yandex(ad);
        float billing = C3618e.billing(ad);
        float appmetrica = C3618e.appmetrica(ad);
        float license2 = C3618e.license(ad2);
        float yandex2 = C3618e.yandex(ad2);
        float billing2 = C3618e.billing(ad2);
        float appmetrica2 = C3618e.appmetrica(ad2);
        if (f < 0.0f) {
            f = 0.0f;
        }
        if (f > 1.0f) {
            f = 1.0f;
        }
        return C3618e.ad(purchase(AbstractC15842e.startapp(yandex, yandex2, f), AbstractC15842e.startapp(billing, billing2, f), AbstractC15842e.startapp(appmetrica, appmetrica2, f), AbstractC15842e.startapp(license, license2, f), c1817e), C3618e.purchase(j2));
    }

    public static final long license(long j) {
        long j2 = j << 32;
        int i = C3618e.mopub;
        return j2;
    }

    public static String loadAd(Parcel parcel, int i) {
        int m2198this = m2198this(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (m2198this == 0) {
            return null;
        }
        String readString = parcel.readString();
        parcel.setDataPosition(dataPosition + m2198this);
        return readString;
    }

    public static final long metrica(int i, int i2, int i3, int i4) {
        return vip(((i & 255) << 16) | ((i4 & 255) << 24) | ((i2 & 255) << 8) | (i3 & 255));
    }

    public static int[] mopub(Parcel parcel, int i) {
        int m2198this = m2198this(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (m2198this == 0) {
            return null;
        }
        int[] createIntArray = parcel.createIntArray();
        parcel.setDataPosition(dataPosition + m2198this);
        return createIntArray;
    }

    /* renamed from: native, reason: not valid java name */
    public static void m2196native(Parcel parcel, int i) {
        parcel.setDataPosition(parcel.dataPosition() + m2198this(parcel, i));
    }

    public static boolean premium(Parcel parcel, int i) {
        m2201while(parcel, i, 4);
        return parcel.readInt() != 0;
    }

    public static void pro(Parcel parcel, int i) {
        if (parcel.dataPosition() != i) {
            throw new C14658e(AbstractC8647e.isPro(i, "Overread allowed size end=", new StringBuilder(String.valueOf(i).length() + 26)), parcel);
        }
    }

    /* renamed from: protected, reason: not valid java name */
    public static boolean m2197protected(byte b) {
        return b > -65;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x009a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final long purchase(float r17, float r18, float r19, float r20, defpackage.AbstractC14213e r21) {
        /*
            Method dump skipped, instructions count: 335
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC6532e.purchase(float, float, float, float, eٓۙۧ):long");
    }

    public static ArrayList remoteconfig(Parcel parcel, int i, Parcelable.Creator creator) {
        int m2198this = m2198this(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (m2198this == 0) {
            return null;
        }
        ArrayList createTypedArrayList = parcel.createTypedArrayList(creator);
        parcel.setDataPosition(dataPosition + m2198this);
        return createTypedArrayList;
    }

    public static byte[] signatures(AbstractC9027e abstractC9027e, Cfinal cfinal) {
        if (!abstractC9027e.f18083e) {
            throw new IllegalArgumentException("public key found");
        }
        try {
            return AbstractC1358e.license(abstractC9027e, cfinal).smaato();
        } catch (Exception unused) {
            return null;
        }
    }

    public static long[] smaato(Parcel parcel, int i) {
        int m2198this = m2198this(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (m2198this == 0) {
            return null;
        }
        long[] createLongArray = parcel.createLongArray();
        parcel.setDataPosition(dataPosition + m2198this);
        return createLongArray;
    }

    public static byte[] startapp(Parcel parcel, int i) {
        int m2198this = m2198this(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (m2198this == 0) {
            return null;
        }
        byte[] createByteArray = parcel.createByteArray();
        parcel.setDataPosition(dataPosition + m2198this);
        return createByteArray;
    }

    public static Boolean subs(Parcel parcel, int i) {
        int m2198this = m2198this(parcel, i);
        if (m2198this == 0) {
            return null;
        }
        m2200try(parcel, m2198this, 4);
        return Boolean.valueOf(parcel.readInt() != 0);
    }

    public static Object[] subscription(Parcel parcel, int i, Parcelable.Creator creator) {
        int m2198this = m2198this(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (m2198this == 0) {
            return null;
        }
        Object[] createTypedArray = parcel.createTypedArray(creator);
        parcel.setDataPosition(dataPosition + m2198this);
        return createTypedArray;
    }

    public static byte[] tapsense(AbstractC9027e abstractC9027e) {
        if (abstractC9027e.f18083e) {
            throw new IllegalArgumentException("private key found");
        }
        try {
            return AbstractC0111e.ad(abstractC9027e).smaato();
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: this, reason: not valid java name */
    public static int m2198this(Parcel parcel, int i) {
        return (i & (-65536)) != -65536 ? (char) (i >> 16) : parcel.readInt();
    }

    /* renamed from: throw, reason: not valid java name */
    public static int m2199throw(Parcel parcel) {
        int readInt = parcel.readInt();
        int m2198this = m2198this(parcel, readInt);
        char c = (char) readInt;
        int dataPosition = parcel.dataPosition();
        if (c != 20293) {
            throw new C14658e("Expected object header. Got 0x".concat(String.valueOf(Integer.toHexString(readInt))), parcel);
        }
        int i = m2198this + dataPosition;
        if (i >= dataPosition && i <= parcel.dataSize()) {
            return i;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(dataPosition).length() + 32 + String.valueOf(i).length());
        sb.append("Size read is invalid start=");
        sb.append(dataPosition);
        sb.append(" end=");
        sb.append(i);
        throw new C14658e(sb.toString(), parcel);
    }

    /* renamed from: try, reason: not valid java name */
    public static void m2200try(Parcel parcel, int i, int i2) {
        if (i == i2) {
            return;
        }
        String hexString = Integer.toHexString(i);
        int length = String.valueOf(i2).length();
        StringBuilder sb = new StringBuilder(String.valueOf(hexString).length() + length + 19 + String.valueOf(i).length() + 4 + 1);
        sb.append("Expected size ");
        sb.append(i2);
        sb.append(" got ");
        sb.append(i);
        throw new C14658e(AbstractC8647e.ads(sb, " (0x", hexString, ")"), parcel);
    }

    public static final long vip(int i) {
        long j = i << 32;
        int i2 = C3618e.mopub;
        return j;
    }

    /* renamed from: while, reason: not valid java name */
    public static void m2201while(Parcel parcel, int i, int i2) {
        int m2198this = m2198this(parcel, i);
        if (m2198this == i2) {
            return;
        }
        String hexString = Integer.toHexString(m2198this);
        int length = String.valueOf(i2).length();
        StringBuilder sb = new StringBuilder(String.valueOf(hexString).length() + length + 19 + String.valueOf(m2198this).length() + 4 + 1);
        sb.append("Expected size ");
        sb.append(i2);
        sb.append(" got ");
        sb.append(m2198this);
        throw new C14658e(AbstractC8647e.ads(sb, " (0x", hexString, ")"), parcel);
    }

    public static Bundle yandex(Parcel parcel, int i) {
        int m2198this = m2198this(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (m2198this == 0) {
            return null;
        }
        Bundle readBundle = parcel.readBundle();
        parcel.setDataPosition(dataPosition + m2198this);
        return readBundle;
    }
}
