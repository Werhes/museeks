package defpackage;

import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Locale;
import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌۗؗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C8905e implements Comparable, Cloneable {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public static final long f17866e = new BigInteger("FFFFFFFF", 16).longValue();

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public static final BigInteger f17867e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public static final C7936e f17868e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public int f17869e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public byte[] f17870e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final String f17871e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final EnumC6816e f17872e;

    static {
        int i = AbstractC18186e.ad;
        int i2 = C1724e.ad;
        f17868e = new C7936e(2);
        f17867e = new BigInteger("FFFFFFFFFFFFFFFF", 16);
    }

    public C8905e(EnumC6816e enumC6816e, String str, int i, int i2) {
        this.f17870e = new byte[0];
        IllegalArgumentException ad = enumC6816e.ad(str, new byte[0], i);
        if (ad != null) {
            throw ad;
        }
        this.f17872e = enumC6816e;
        this.f17871e = str;
        this.f17869e = i;
    }

    public C8905e(String str, int i) {
        this(EnumC6816e.METADATA_LIBRARY_OBJECT, str, i, 0);
    }

    public final int ad(EnumC6816e enumC6816e) {
        EnumC6816e enumC6816e2 = EnumC6816e.EXTENDED_CONTENT;
        int length = (this.f17871e.length() * 2) + (enumC6816e != enumC6816e2 ? 14 : 8);
        int i = this.f17869e;
        if (i == 2) {
            return enumC6816e == enumC6816e2 ? length + 4 : length + 2;
        }
        int length2 = length + this.f17870e.length;
        return i == 0 ? length2 + 2 : length2;
    }

    public final String appmetrica() {
        switch (this.f17869e) {
            case 0:
                try {
                    return new String(this.f17870e, "UTF-16LE");
                } catch (UnsupportedEncodingException unused) {
                    EnumC1005e[] enumC1005eArr = EnumC1005e.f3456e;
                    f17868e.getClass();
                    int i = C1724e.ad;
                    return null;
                }
            case 1:
                return "binary data";
            case 2:
                byte[] bArr = this.f17870e;
                boolean z = false;
                if (bArr.length > 0 && bArr[0] != 0) {
                    z = true;
                }
                return String.valueOf(z);
            case 3:
            case 4:
            case 5:
                return String.valueOf(metrica());
            case 6:
                return vip() == null ? "Invalid GUID" : vip().toString();
            default:
                throw new IllegalStateException("Current type is not known.");
        }
    }

    public final void billing(BigInteger bigInteger) {
        if (BigInteger.ZERO.compareTo(bigInteger) > 0) {
            throw new IllegalArgumentException("Only unsigned values allowed (no negative)");
        }
        if (f17867e.compareTo(bigInteger) < 0) {
            throw new IllegalArgumentException("Value exceeds QWORD (64 bit unsigned)");
        }
        this.f17870e = new byte[8];
        byte[] byteArray = bigInteger.toByteArray();
        if (byteArray.length <= 8) {
            for (int length = byteArray.length - 1; length >= 0; length--) {
                this.f17870e[byteArray.length - (length + 1)] = byteArray[length];
            }
        } else {
            Arrays.fill(this.f17870e, (byte) -1);
        }
        this.f17869e = 4;
    }

    public final Object clone() {
        return super.clone();
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f17871e.compareTo(((C8905e) obj).f17871e);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C8905e)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        C8905e c8905e = (C8905e) obj;
        return c8905e.f17871e.equals(this.f17871e) && c8905e.f17869e == this.f17869e && Arrays.equals(this.f17870e, c8905e.f17870e);
    }

    public final int hashCode() {
        return this.f17871e.hashCode();
    }

    public final byte[] license() {
        byte[] bArr = this.f17870e;
        byte[] bArr2 = new byte[bArr.length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }

    public final long metrica() {
        int i = this.f17869e;
        int i2 = 2;
        if (i == 2) {
            i2 = 1;
        } else if (i == 3) {
            i2 = 4;
        } else if (i == 4) {
            i2 = 8;
        } else if (i != 5) {
            throw new UnsupportedOperationException(AbstractC17861e.smaato(this.f17869e, ")", new StringBuilder("The current type doesn't allow an interpretation as a number. (")));
        }
        if (i2 > this.f17870e.length) {
            throw new IllegalStateException("The stored data cannot represent the type of current object.");
        }
        long j = 0;
        for (int i3 = 0; i3 < i2; i3++) {
            j |= (this.f17870e[i3] & 255) << (i3 * 8);
        }
        return j;
    }

    public final void purchase(long j) {
        long j2 = f17866e;
        if (j < 0 || j > j2) {
            throw new IllegalArgumentException(AbstractC1634e.mopub(j2, "value out of range (0-", ")"));
        }
        String str = AbstractC12394e.ad;
        byte[] bArr = new byte[4];
        for (int i = 0; i < 4; i++) {
            bArr[i] = (byte) ((j >>> (i * 8)) & 255);
        }
        this.f17870e = bArr;
        this.f17869e = 3;
    }

    public final String toString() {
        return this.f17871e + " : " + new String[]{"String: ", "Binary: ", "Boolean: ", "DWORD: ", "QWORD:", "WORD:", "GUID:"}[this.f17869e] + appmetrica() + " (language: 0 / stream: 0)";
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, eَؚ٘] */
    public final C7056e vip() {
        if (this.f17869e != 6 || this.f17870e.length != 16) {
            return null;
        }
        byte[] bArr = this.f17870e;
        ?? obj = new Object();
        obj.ad = BuildConfig.FLAVOR;
        obj.vip = null;
        int length = bArr.length;
        int[] iArr = new int[length];
        for (int i = 0; i < bArr.length; i++) {
            iArr[i] = bArr[i] & 255;
        }
        if (length != 16) {
            throw new IllegalArgumentException("The given guidData doesn't match the GUID specification.");
        }
        int[] iArr2 = new int[16];
        obj.vip = iArr2;
        System.arraycopy(iArr, 0, iArr2, 0, 16);
        return obj;
    }

    public final void yandex(String str) {
        if (str == null) {
            this.f17870e = new byte[0];
        } else {
            byte[] vip = AbstractC12394e.vip(str, C2637e.billing);
            long length = vip.length;
            EnumC6816e enumC6816e = this.f17872e;
            long j = enumC6816e.f14041e;
            if ((j != -1 && j < length) || length < 0) {
                C12927e.license();
                throw new IllegalArgumentException(String.format(Locale.getDefault(), "Trying to create field with %s bytes of data but the maximum data allowed in WMA files is %s for %s.", Integer.valueOf(vip.length), enumC6816e.f14042e, enumC6816e.f14045e.ad));
            }
            this.f17870e = vip;
        }
        this.f17869e = 0;
    }
}
