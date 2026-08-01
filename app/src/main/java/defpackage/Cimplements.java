package defpackage;

import j$.util.concurrent.ConcurrentHashMap;
import java.io.ByteArrayOutputStream;
import java.math.BigInteger;
import java.util.Arrays;

/* renamed from: implements, reason: invalid class name */
/* loaded from: classes3.dex */
public final class Cimplements extends Cdefault {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public static final inmobi f36400e = new inmobi(16, Cimplements.class);

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public static final ConcurrentHashMap f36401e = new ConcurrentHashMap();

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public String f36402e = null;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final byte[] f36403e;

    public Cimplements(byte[] bArr) {
        this.f36403e = bArr;
    }

    /* renamed from: class, reason: not valid java name */
    public static boolean m4590class(int i, String str) {
        int length = str.length();
        int i2 = 0;
        while (true) {
            int i3 = length - 1;
            if (i3 < i) {
                if (i2 == 0 || (i2 > 1 && str.charAt(length) == '0')) {
                    break;
                }
                return true;
            }
            char charAt = str.charAt(i3);
            if (charAt != '.') {
                if ('0' > charAt || charAt > '9') {
                    break;
                }
                i2++;
                length = i3;
            } else {
                if (i2 == 0 || (i2 > 1 && str.charAt(length) == '0')) {
                    break;
                }
                i2 = 0;
                length = i3;
            }
        }
        return false;
    }

    public static boolean firebase(byte[] bArr) {
        if (AbstractC0361e.metrica("org.bouncycastle.asn1.allow_wrong_oid_enc")) {
            return true;
        }
        if (bArr.length < 1) {
            return false;
        }
        boolean z = true;
        for (int i = 0; i < bArr.length; i++) {
            if (z && (bArr[i] & 255) == 128) {
                return false;
            }
            z = (bArr[i] & 128) == 0;
        }
        return z;
    }

    /* renamed from: goto, reason: not valid java name */
    public static void m4591goto(ByteArrayOutputStream byteArrayOutputStream, BigInteger bigInteger) {
        int bitLength = (bigInteger.bitLength() + 6) / 7;
        if (bitLength == 0) {
            byteArrayOutputStream.write(0);
            return;
        }
        byte[] bArr = new byte[bitLength];
        int i = bitLength - 1;
        for (int i2 = i; i2 >= 0; i2--) {
            bArr[i2] = (byte) (bigInteger.intValue() | 128);
            bigInteger = bigInteger.shiftRight(7);
        }
        bArr[i] = (byte) (bArr[i] & Byte.MAX_VALUE);
        byteArrayOutputStream.write(bArr, 0, bitLength);
    }

    /* renamed from: interface, reason: not valid java name */
    public static void m4592interface(ByteArrayOutputStream byteArrayOutputStream, long j) {
        byte[] bArr = new byte[9];
        int i = 8;
        bArr[8] = (byte) (((int) j) & 127);
        while (j >= 128) {
            j >>= 7;
            i--;
            bArr[i] = (byte) (((int) j) | 128);
        }
        byteArrayOutputStream.write(bArr, i, 9 - i);
    }

    public static Cimplements subs(boolean z, byte[] bArr) {
        if (bArr.length > 4096) {
            throw new IllegalArgumentException("exceeded relative OID contents length limit");
        }
        Cimplements cimplements = (Cimplements) f36401e.get(new Cwhile(bArr));
        if (cimplements != null) {
            return cimplements;
        }
        if (!firebase(bArr)) {
            throw new IllegalArgumentException("invalid relative OID contents");
        }
        if (z) {
            bArr = AbstractC12442e.license(bArr);
        }
        return new Cimplements(bArr);
    }

    @Override // defpackage.Cdefault
    public final void Signature(C7850e c7850e, boolean z) {
        c7850e.m2337implements(13, z, this.f36403e);
    }

    @Override // defpackage.Cdefault
    public final boolean admob() {
        return false;
    }

    public final synchronized String crashlytics() {
        try {
            if (this.f36402e == null) {
                byte[] bArr = this.f36403e;
                StringBuilder sb = new StringBuilder();
                boolean z = true;
                BigInteger bigInteger = null;
                long j = 0;
                for (int i = 0; i != bArr.length; i++) {
                    byte b = bArr[i];
                    if (j <= 72057594037927808L) {
                        long j2 = j + (b & Byte.MAX_VALUE);
                        if ((b & 128) == 0) {
                            if (z) {
                                z = false;
                            } else {
                                sb.append('.');
                            }
                            sb.append(j2);
                            j = 0;
                        } else {
                            j = j2 << 7;
                        }
                    } else {
                        if (bigInteger == null) {
                            bigInteger = BigInteger.valueOf(j);
                        }
                        BigInteger or = bigInteger.or(BigInteger.valueOf(b & Byte.MAX_VALUE));
                        if ((b & 128) == 0) {
                            if (z) {
                                z = false;
                            } else {
                                sb.append('.');
                            }
                            sb.append(or);
                            bigInteger = null;
                            j = 0;
                        } else {
                            bigInteger = or.shiftLeft(7);
                        }
                    }
                }
                this.f36402e = sb.toString();
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f36402e;
    }

    @Override // defpackage.Cdefault, defpackage.Cextends
    public final int hashCode() {
        return AbstractC12442e.isVip(this.f36403e);
    }

    @Override // defpackage.Cdefault
    public final boolean loadAd(Cdefault cdefault) {
        if (this == cdefault) {
            return true;
        }
        if (cdefault instanceof Cimplements) {
            return Arrays.equals(this.f36403e, ((Cimplements) cdefault).f36403e);
        }
        return false;
    }

    @Override // defpackage.Cdefault
    public final int remoteconfig(boolean z) {
        return C7850e.m2327goto(this.f36403e.length, z);
    }

    public final String toString() {
        return crashlytics();
    }
}
