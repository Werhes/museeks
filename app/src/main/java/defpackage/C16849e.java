package defpackage;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.WeakHashMap;

/* renamed from: eؙٗۨ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C16849e extends AbstractC13156e {

    /* renamed from: eٕؒۙ, reason: contains not printable characters */
    public static final C1480e[] f33012e;

    /* renamed from: eٕؓۥ, reason: contains not printable characters */
    public static final C1480e f33013e;

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final int f33014e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final C7583e f33015e;

    /* renamed from: eؙؔٞ, reason: contains not printable characters */
    public int f33016e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final byte[] f33017e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public final int f33018e;

    /* renamed from: eٍۗۛ, reason: contains not printable characters */
    public C8459e f33019e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final C11892e f33020e;

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public final InterfaceC0293e f33021e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final WeakHashMap f33022e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final byte[] f33023e;

    static {
        C1480e c1480e = new C1480e(1);
        f33013e = c1480e;
        C1480e[] c1480eArr = new C1480e[129];
        f33012e = c1480eArr;
        c1480eArr[1] = c1480e;
        int i = 2;
        while (true) {
            C1480e[] c1480eArr2 = f33012e;
            if (i >= c1480eArr2.length) {
                return;
            }
            c1480eArr2[i] = new C1480e(i);
            i++;
        }
    }

    public C16849e(C7583e c7583e, C11892e c11892e, int i, byte[] bArr, int i2, byte[] bArr2) {
        super(true);
        this.f33015e = c7583e;
        this.f33020e = c11892e;
        this.f33016e = i;
        this.f33017e = AbstractC12442e.license(bArr);
        this.f33014e = i2;
        this.f33023e = AbstractC12442e.license(bArr2);
        this.f33018e = 1 << (c7583e.metrica + 1);
        this.f33022e = new WeakHashMap();
        this.f33021e = AbstractC1266e.ad(c7583e.vip, c7583e.license);
    }

    public static C16849e appmetrica(Object obj) {
        Throwable th;
        DataInputStream dataInputStream;
        if (obj instanceof C16849e) {
            return (C16849e) obj;
        }
        if (!(obj instanceof DataInputStream)) {
            if (!(obj instanceof byte[])) {
                if (obj instanceof InputStream) {
                    return appmetrica(AbstractC9460e.metrica((InputStream) obj));
                }
                throw new IllegalArgumentException(AbstractC1634e.advert(obj, "cannot parse "));
            }
            DataInputStream dataInputStream2 = null;
            try {
                dataInputStream = new DataInputStream(new ByteArrayInputStream((byte[]) obj));
            } catch (Throwable th2) {
                th = th2;
            }
            try {
                C16849e appmetrica = appmetrica(dataInputStream);
                dataInputStream.close();
                return appmetrica;
            } catch (Throwable th3) {
                th = th3;
                dataInputStream2 = dataInputStream;
                if (dataInputStream2 == null) {
                    throw th;
                }
                dataInputStream2.close();
                throw th;
            }
        }
        DataInputStream dataInputStream3 = (DataInputStream) obj;
        if (dataInputStream3.readInt() != 0) {
            throw new IllegalStateException("expected version 0 lms private key");
        }
        C7583e c7583e = (C7583e) C7583e.appmetrica.get(Integer.valueOf(dataInputStream3.readInt()));
        C11892e c11892e = (C11892e) C11892e.billing.get(Integer.valueOf(dataInputStream3.readInt()));
        byte[] bArr = new byte[16];
        dataInputStream3.readFully(bArr);
        int readInt = dataInputStream3.readInt();
        int readInt2 = dataInputStream3.readInt();
        int readInt3 = dataInputStream3.readInt();
        if (readInt3 < 0) {
            throw new IllegalStateException("secret length less than zero");
        }
        if (readInt3 <= dataInputStream3.available()) {
            byte[] bArr2 = new byte[readInt3];
            dataInputStream3.readFully(bArr2);
            return new C16849e(c7583e, c11892e, readInt, bArr, readInt2, bArr2);
        }
        throw new IOException("secret length exceeded " + dataInputStream3.available());
    }

    public final byte[] ad(int i) {
        int i2 = 1 << this.f33015e.metrica;
        byte[] bArr = this.f33017e;
        InterfaceC0293e interfaceC0293e = this.f33021e;
        if (i < i2) {
            int i3 = i * 2;
            byte[] vip = vip(i3);
            byte[] vip2 = vip(i3 + 1);
            byte[] license = AbstractC12442e.license(bArr);
            interfaceC0293e.update(license, 0, license.length);
            AbstractC9180e.appmetrica(i, interfaceC0293e);
            interfaceC0293e.update((byte) 16777091);
            interfaceC0293e.update((byte) (-31869));
            interfaceC0293e.update(vip, 0, vip.length);
            interfaceC0293e.update(vip2, 0, vip2.length);
            byte[] bArr2 = new byte[interfaceC0293e.getDigestSize()];
            interfaceC0293e.doFinal(bArr2, 0);
            return bArr2;
        }
        byte[] license2 = AbstractC12442e.license(bArr);
        interfaceC0293e.update(license2, 0, license2.length);
        AbstractC9180e.appmetrica(i, interfaceC0293e);
        interfaceC0293e.update((byte) 16777090);
        interfaceC0293e.update((byte) (-32126));
        byte[] license3 = AbstractC12442e.license(bArr);
        int i4 = i - i2;
        byte[] license4 = AbstractC12442e.license(this.f33023e);
        C11892e c11892e = this.f33020e;
        InterfaceC0293e metrica = AbstractC1266e.metrica(c11892e);
        Ctry ctry = c11892e.purchase;
        int i5 = c11892e.vip;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            byteArrayOutputStream.write(license3);
            byte b = (byte) (i4 >>> 24);
            byteArrayOutputStream.write(b);
            byte b2 = (byte) (i4 >>> 16);
            byteArrayOutputStream.write(b2);
            byte b3 = (byte) (i4 >>> 8);
            byteArrayOutputStream.write(b3);
            byte b4 = (byte) i4;
            byteArrayOutputStream.write(b4);
            byteArrayOutputStream.write((byte) 128);
            byteArrayOutputStream.write((byte) 32896);
            while (byteArrayOutputStream.size() < 22) {
                byteArrayOutputStream.write(0);
            }
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            metrica.update(byteArray, 0, byteArray.length);
            InterfaceC0293e ad = AbstractC1266e.ad(i5, ctry);
            ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
            try {
                byteArrayOutputStream2.write(license3);
                byteArrayOutputStream2.write(b);
                byteArrayOutputStream2.write(b2);
                byteArrayOutputStream2.write(b3);
                byteArrayOutputStream2.write(b4);
                int digestSize = ad.getDigestSize() + 23;
                while (byteArrayOutputStream2.size() < digestSize) {
                    byteArrayOutputStream2.write(0);
                }
                byte[] byteArray2 = byteArrayOutputStream2.toByteArray();
                C6148e c6148e = new C6148e(license3, license4, AbstractC1266e.ad(i5, ctry));
                c6148e.f12916e = i4;
                c6148e.f12915e = 0;
                int i6 = c11892e.license;
                int i7 = (1 << c11892e.metrica) - 1;
                int i8 = 0;
                while (i8 < i6) {
                    c6148e.vip(23, i8 < i6 + (-1), byteArray2);
                    short s = (short) i8;
                    byteArray2[20] = (byte) (s >>> 8);
                    byteArray2[21] = (byte) s;
                    for (int i9 = 0; i9 < i7; i9++) {
                        byteArray2[22] = (byte) i9;
                        ad.update(byteArray2, 0, byteArray2.length);
                        ad.doFinal(byteArray2, 23);
                    }
                    metrica.update(byteArray2, 23, i5);
                    i8++;
                }
                int digestSize2 = metrica.getDigestSize();
                byte[] bArr3 = new byte[digestSize2];
                metrica.doFinal(bArr3, 0);
                interfaceC0293e.update(bArr3, 0, digestSize2);
                byte[] bArr4 = new byte[interfaceC0293e.getDigestSize()];
                interfaceC0293e.doFinal(bArr4, 0);
                return bArr4;
            } catch (Exception e) {
                throw new RuntimeException(e.getMessage(), e);
            }
        } catch (Exception e2) {
            throw new RuntimeException(e2.getMessage(), e2);
        }
    }

    public final synchronized void billing() {
        this.f33016e++;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C16849e.class != obj.getClass()) {
            return false;
        }
        C16849e c16849e = (C16849e) obj;
        C11892e c11892e = c16849e.f33020e;
        C7583e c7583e = c16849e.f33015e;
        if (this.f33016e != c16849e.f33016e || this.f33014e != c16849e.f33014e || !Arrays.equals(this.f33017e, c16849e.f33017e)) {
            return false;
        }
        C7583e c7583e2 = this.f33015e;
        if (c7583e2 == null ? c7583e != null : !c7583e2.equals(c7583e)) {
            return false;
        }
        C11892e c11892e2 = this.f33020e;
        if (c11892e2 == null ? c11892e == null : c11892e2.equals(c11892e)) {
            return Arrays.equals(this.f33023e, c16849e.f33023e);
        }
        return false;
    }

    @Override // defpackage.InterfaceC3928e
    public final byte[] getEncoded() {
        C15816e c15816e = new C15816e(6);
        c15816e.m4013case(0);
        c15816e.m4013case(this.f33015e.ad);
        c15816e.m4013case(this.f33020e.ad);
        c15816e.subscription(this.f33017e);
        c15816e.m4013case(this.f33016e);
        c15816e.m4013case(this.f33014e);
        byte[] bArr = this.f33023e;
        c15816e.m4013case(bArr.length);
        c15816e.subscription(bArr);
        return ((ByteArrayOutputStream) c15816e.f31190e).toByteArray();
    }

    public final int hashCode() {
        int isVip = (AbstractC12442e.isVip(this.f33017e) + (this.f33016e * 31)) * 31;
        C7583e c7583e = this.f33015e;
        int hashCode = (isVip + (c7583e != null ? c7583e.hashCode() : 0)) * 31;
        C11892e c11892e = this.f33020e;
        return AbstractC12442e.isVip(this.f33023e) + ((((hashCode + (c11892e != null ? c11892e.hashCode() : 0)) * 31) + this.f33014e) * 31);
    }

    public final synchronized int license() {
        return this.f33016e;
    }

    public final byte[] metrica(C1480e c1480e) {
        synchronized (this.f33022e) {
            try {
                byte[] bArr = (byte[]) this.f33022e.get(c1480e);
                if (bArr != null) {
                    return bArr;
                }
                byte[] ad = ad(c1480e.ad);
                this.f33022e.put(c1480e, ad);
                return ad;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final C8459e purchase() {
        C8459e c8459e;
        synchronized (this) {
            try {
                if (this.f33019e == null) {
                    this.f33019e = new C8459e(this.f33015e, this.f33020e, metrica(f33013e), this.f33017e);
                }
                c8459e = this.f33019e;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c8459e;
    }

    public final byte[] vip(int i) {
        if (i < this.f33018e) {
            return metrica(i < 129 ? f33012e[i] : new C1480e(i));
        }
        return ad(i);
    }
}
