package defpackage;

import java.io.ByteArrayOutputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَؚّ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC12394e {
    public static final String ad = System.getProperty("line.separator");

    public static void ad(InputStream inputStream, OutputStream outputStream, long j) {
        byte[] bArr = new byte[8192];
        long j2 = 0;
        while (j2 < j) {
            long j3 = j - j2;
            int read = inputStream.read(bArr, 0, j3 < 8192 ? (int) j3 : 8192);
            if (read == -1) {
                throw new IOException(AbstractC1634e.mopub(j3, "Inputstream has to continue for another ", " bytes."));
            }
            outputStream.write(bArr, 0, read);
            j2 += read;
        }
    }

    public static long appmetrica(InputStream inputStream) {
        long j = 0;
        for (int i = 0; i <= 24; i += 8) {
            j |= inputStream.read() << i;
        }
        return j;
    }

    public static void billing(int i, ByteArrayOutputStream byteArrayOutputStream) {
        if (i < 0) {
            throw new IllegalArgumentException("positive value expected.");
        }
        byte[] bArr = new byte[2];
        for (int i2 = 0; i2 <= 8; i2 += 8) {
            bArr[i2 / 8] = (byte) ((i >> i2) & 255);
        }
        byteArrayOutputStream.write(bArr);
    }

    public static C7056e license(InputStream inputStream) {
        if (inputStream == null) {
            throw new IllegalArgumentException("Argument must not be null");
        }
        int[] iArr = new int[16];
        for (int i = 0; i < 16; i++) {
            iArr[i] = inputStream.read();
        }
        return new C7056e(iArr);
    }

    public static BigInteger metrica(InputStream inputStream) {
        byte[] bArr = new byte[8];
        byte[] bArr2 = new byte[8];
        if (inputStream.read(bArr) != 8) {
            throw new EOFException();
        }
        for (int i = 0; i < 8; i++) {
            bArr2[7 - i] = bArr[i];
        }
        return new BigInteger(bArr2);
    }

    public static long purchase(InputStream inputStream) {
        long j = 0;
        for (int i = 0; i <= 56; i += 8) {
            j |= inputStream.read() << i;
        }
        return j;
    }

    public static void startapp(long j, OutputStream outputStream) {
        if (j < 0) {
            throw new IllegalArgumentException("positive value expected.");
        }
        byte[] bArr = new byte[8];
        for (int i = 0; i <= 56; i += 8) {
            bArr[i / 8] = (byte) ((j >> i) & 255);
        }
        outputStream.write(bArr);
    }

    public static byte[] vip(String str, Charset charset) {
        ByteBuffer encode = charset.encode(str);
        byte[] bArr = new byte[encode.limit()];
        encode.rewind();
        encode.get(bArr);
        return bArr;
    }

    public static void yandex(long j, OutputStream outputStream) {
        if (j < 0) {
            throw new IllegalArgumentException("positive value expected.");
        }
        byte[] bArr = new byte[4];
        for (int i = 0; i <= 24; i += 8) {
            bArr[i / 8] = (byte) ((j >> i) & 255);
        }
        outputStream.write(bArr);
    }
}
