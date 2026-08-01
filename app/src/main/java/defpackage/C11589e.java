package defpackage;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.InputStream;
import java.util.Arrays;

/* renamed from: eًِؚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C11589e implements InterfaceC3928e {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final byte[] f23274e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final byte[] f23275e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final C11892e f23276e;

    public C11589e(C11892e c11892e, byte[] bArr, byte[] bArr2) {
        this.f23276e = c11892e;
        this.f23275e = bArr;
        this.f23274e = bArr2;
    }

    public static C11589e ad(Object obj) {
        DataInputStream dataInputStream;
        if (obj instanceof C11589e) {
            return (C11589e) obj;
        }
        if (obj instanceof DataInputStream) {
            DataInputStream dataInputStream2 = (DataInputStream) obj;
            C11892e c11892e = (C11892e) C11892e.billing.get(Integer.valueOf(dataInputStream2.readInt()));
            byte[] bArr = new byte[c11892e.vip];
            dataInputStream2.readFully(bArr);
            byte[] bArr2 = new byte[c11892e.license * c11892e.vip];
            dataInputStream2.readFully(bArr2);
            return new C11589e(c11892e, bArr, bArr2);
        }
        if (!(obj instanceof byte[])) {
            if (obj instanceof InputStream) {
                return ad(AbstractC9460e.metrica((InputStream) obj));
            }
            throw new IllegalArgumentException(AbstractC1634e.advert(obj, "cannot parse "));
        }
        DataInputStream dataInputStream3 = null;
        try {
            dataInputStream = new DataInputStream(new ByteArrayInputStream((byte[]) obj));
        } catch (Throwable th) {
            th = th;
        }
        try {
            C11589e ad = ad(dataInputStream);
            dataInputStream.close();
            return ad;
        } catch (Throwable th2) {
            th = th2;
            dataInputStream3 = dataInputStream;
            if (dataInputStream3 != null) {
                dataInputStream3.close();
            }
            throw th;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C11589e.class != obj.getClass()) {
            return false;
        }
        C11589e c11589e = (C11589e) obj;
        C11892e c11892e = c11589e.f23276e;
        C11892e c11892e2 = this.f23276e;
        if (c11892e2 == null ? c11892e != null : !c11892e2.equals(c11892e)) {
            return false;
        }
        if (Arrays.equals(this.f23275e, c11589e.f23275e)) {
            return Arrays.equals(this.f23274e, c11589e.f23274e);
        }
        return false;
    }

    @Override // defpackage.InterfaceC3928e
    public final byte[] getEncoded() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int i = this.f23276e.ad;
        byteArrayOutputStream.write((byte) 0);
        byteArrayOutputStream.write((byte) 0);
        byteArrayOutputStream.write((byte) 0);
        byteArrayOutputStream.write((byte) i);
        try {
            byteArrayOutputStream.write(this.f23275e);
            try {
                byteArrayOutputStream.write(this.f23274e);
                return byteArrayOutputStream.toByteArray();
            } catch (Exception e) {
                throw new RuntimeException(e.getMessage(), e);
            }
        } catch (Exception e2) {
            throw new RuntimeException(e2.getMessage(), e2);
        }
    }

    public final int hashCode() {
        C11892e c11892e = this.f23276e;
        return Arrays.hashCode(this.f23274e) + ((Arrays.hashCode(this.f23275e) + ((c11892e != null ? c11892e.hashCode() : 0) * 31)) * 31);
    }
}
