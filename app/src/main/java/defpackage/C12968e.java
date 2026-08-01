package defpackage;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.InputStream;
import java.util.Arrays;

/* renamed from: eْٟؑ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C12968e implements InterfaceC3928e {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final C7583e f25841e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final C11589e f25842e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final byte[][] f25843e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final int f25844e;

    public C12968e(int i, C11589e c11589e, C7583e c7583e, byte[][] bArr) {
        this.f25844e = i;
        this.f25842e = c11589e;
        this.f25841e = c7583e;
        this.f25843e = bArr;
    }

    public static C12968e ad(Object obj) {
        if (obj instanceof C12968e) {
            return (C12968e) obj;
        }
        if (obj instanceof DataInputStream) {
            DataInputStream dataInputStream = (DataInputStream) obj;
            int readInt = dataInputStream.readInt();
            C11589e ad = C11589e.ad(obj);
            C7583e c7583e = (C7583e) C7583e.appmetrica.get(Integer.valueOf(dataInputStream.readInt()));
            int i = c7583e.metrica;
            byte[][] bArr = new byte[i];
            for (int i2 = 0; i2 < i; i2++) {
                byte[] bArr2 = new byte[c7583e.vip];
                bArr[i2] = bArr2;
                dataInputStream.readFully(bArr2);
            }
            return new C12968e(readInt, ad, c7583e, bArr);
        }
        if (!(obj instanceof byte[])) {
            if (obj instanceof InputStream) {
                return ad(AbstractC9460e.metrica((InputStream) obj));
            }
            throw new IllegalArgumentException(AbstractC1634e.advert(obj, "cannot parse "));
        }
        DataInputStream dataInputStream2 = null;
        try {
            DataInputStream dataInputStream3 = new DataInputStream(new ByteArrayInputStream((byte[]) obj));
            try {
                C12968e ad2 = ad(dataInputStream3);
                dataInputStream3.close();
                return ad2;
            } catch (Throwable th) {
                th = th;
                dataInputStream2 = dataInputStream3;
                if (dataInputStream2 != null) {
                    dataInputStream2.close();
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C12968e.class != obj.getClass()) {
            return false;
        }
        C12968e c12968e = (C12968e) obj;
        C7583e c7583e = c12968e.f25841e;
        C11589e c11589e = c12968e.f25842e;
        if (this.f25844e != c12968e.f25844e) {
            return false;
        }
        C11589e c11589e2 = this.f25842e;
        if (c11589e2 == null ? c11589e != null : !c11589e2.equals(c11589e)) {
            return false;
        }
        C7583e c7583e2 = this.f25841e;
        if (c7583e2 == null ? c7583e == null : c7583e2.equals(c7583e)) {
            return Arrays.deepEquals(this.f25843e, c12968e.f25843e);
        }
        return false;
    }

    @Override // defpackage.InterfaceC3928e
    public final byte[] getEncoded() {
        C15816e c15816e = new C15816e(6);
        ByteArrayOutputStream byteArrayOutputStream = (ByteArrayOutputStream) c15816e.f31190e;
        c15816e.m4013case(this.f25844e);
        c15816e.subscription(this.f25842e.getEncoded());
        c15816e.m4013case(this.f25841e.ad);
        try {
            for (byte[] bArr : this.f25843e) {
                byteArrayOutputStream.write(bArr);
            }
            return byteArrayOutputStream.toByteArray();
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage(), e);
        }
    }

    public final int hashCode() {
        int i = this.f25844e * 31;
        C11589e c11589e = this.f25842e;
        int hashCode = (i + (c11589e != null ? c11589e.hashCode() : 0)) * 31;
        C7583e c7583e = this.f25841e;
        return Arrays.deepHashCode(this.f25843e) + ((hashCode + (c7583e != null ? c7583e.hashCode() : 0)) * 31);
    }
}
