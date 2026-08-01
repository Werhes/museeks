package defpackage;

import java.io.ByteArrayOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eِؑ۟, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC0258e {
    public static final StackTraceElement[] ad = new StackTraceElement[0];

    public static C15401e ad(Function1... function1Arr) {
        if (function1Arr.length > 0) {
            return new C15401e(0, function1Arr);
        }
        throw new IllegalArgumentException("Failed requirement.");
    }

    public static final long appmetrica(long j, long j2) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j2 >> 32)) * Float.intBitsToFloat((int) (j >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j2 & 4294967295L)) * Float.intBitsToFloat((int) (j & 4294967295L));
        return (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat) << 32);
    }

    public static C12968e license(C16849e c16849e, byte[] bArr) {
        int i;
        C11892e c11892e;
        byte[] bArr2;
        byte[] bArr3;
        byte[] bArr4;
        int i2 = c16849e.f33015e.metrica;
        int license = c16849e.license();
        synchronized (c16849e) {
            i = c16849e.f33016e;
            if (i >= c16849e.f33014e) {
                throw new C9442e("ots private key exhausted", 4);
            }
            c11892e = c16849e.f33020e;
            bArr2 = c16849e.f33017e;
            bArr3 = c16849e.f33023e;
            c16849e.billing();
        }
        int i3 = (1 << i2) + license;
        byte[][] bArr5 = new byte[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            bArr5[i4] = c16849e.vip((i3 / (1 << i4)) ^ 1);
        }
        C7583e c7583e = c16849e.f33015e;
        int i5 = c11892e.vip;
        byte[] bArr6 = new byte[i5];
        C6148e c6148e = new C6148e(bArr2, bArr3, AbstractC1266e.ad(i5, c11892e.purchase));
        c6148e.f12916e = i;
        c6148e.f12915e = -3;
        c6148e.vip(0, false, bArr6);
        InterfaceC0293e ad2 = AbstractC1266e.ad(c11892e.vip, c11892e.purchase);
        ad2.update(bArr2, 0, bArr2.length);
        AbstractC9180e.appmetrica(i, ad2);
        ad2.update((byte) 16777089);
        ad2.update((byte) (-32383));
        ad2.update(bArr6, 0, i5);
        ad2.update(bArr, 0, bArr.length);
        byte[] bArr7 = new byte[34];
        ad2.doFinal(bArr7, 0);
        int i6 = c11892e.vip;
        int i7 = c11892e.license;
        int i8 = c11892e.metrica;
        byte[] bArr8 = new byte[i7 * i6];
        InterfaceC0293e ad3 = AbstractC1266e.ad(i6, c11892e.purchase);
        C6148e c6148e2 = new C6148e(bArr2, bArr3, AbstractC1266e.ad(c11892e.vip, c11892e.purchase));
        c6148e2.f12916e = i;
        int i9 = (1 << i8) - 1;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            bArr4 = bArr7;
            if (i10 >= (i6 * 8) / i8) {
                break;
            }
            i11 = (i11 + i9) - ((bArr4[(i10 * i8) / 8] >>> (((~i10) & ((8 / i8) - 1)) * i8)) & i9);
            i10++;
            bArr7 = bArr4;
        }
        int i12 = i11 << c11892e.appmetrica;
        bArr4[i6] = (byte) ((i12 >>> 8) & 255);
        bArr4[i6 + 1] = (byte) i12;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            byteArrayOutputStream.write(bArr2);
            byteArrayOutputStream.write((byte) (i >>> 24));
            byteArrayOutputStream.write((byte) (i >>> 16));
            byteArrayOutputStream.write((byte) (i >>> 8));
            byteArrayOutputStream.write((byte) i);
            int i13 = i6 + 23;
            while (byteArrayOutputStream.size() < i13) {
                byteArrayOutputStream.write(0);
            }
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            c6148e2.f12915e = 0;
            int i14 = 0;
            while (i14 < i7) {
                short s = (short) i14;
                int i15 = i9;
                byteArray[20] = (byte) (s >>> 8);
                byteArray[21] = (byte) s;
                c6148e2.vip(23, i14 < i7 + (-1), byteArray);
                int i16 = 0;
                for (int i17 = (bArr4[(i14 * i8) / 8] >>> (((~i14) & ((8 / i8) - 1)) * i8)) & i15; i16 < i17; i17 = i17) {
                    byteArray[22] = (byte) i16;
                    ad3.update(byteArray, 0, i13);
                    ad3.doFinal(byteArray, 23);
                    i16++;
                }
                System.arraycopy(byteArray, 23, bArr8, i6 * i14, i6);
                i14++;
                i9 = i15;
            }
            return new C12968e(i, new C11589e(c11892e, bArr6, bArr8), c7583e, bArr5);
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage(), e);
        }
    }

    public static C16849e metrica(C7583e c7583e, C11892e c11892e, int i, byte[] bArr, byte[] bArr2) {
        if (bArr2 != null && bArr2.length >= c7583e.vip) {
            return new C16849e(c7583e, c11892e, i, bArr, 1 << c7583e.metrica, bArr2);
        }
        throw new IllegalArgumentException("root seed is less than " + c7583e.vip);
    }

    public static String purchase(String str, Object... objArr) {
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

    public static int vip(Comparable comparable, Comparable comparable2) {
        if (comparable == comparable2) {
            return 0;
        }
        if (comparable == null) {
            return -1;
        }
        if (comparable2 == null) {
            return 1;
        }
        return comparable.compareTo(comparable2);
    }
}
