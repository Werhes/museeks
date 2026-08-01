package defpackage;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.InputStream;

/* renamed from: eؕؓ٘, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3100e extends AbstractC13156e {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final C8459e f7180e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final int f7181e;

    public C3100e(int i, C8459e c8459e) {
        super(false);
        if (c8459e == null) {
            throw new NullPointerException("lmsPublicKey");
        }
        this.f7181e = i;
        this.f7180e = c8459e;
    }

    public static C3100e ad(Object obj) {
        if (obj instanceof C3100e) {
            return (C3100e) obj;
        }
        if (obj instanceof DataInputStream) {
            return new C3100e(((DataInputStream) obj).readInt(), C8459e.ad(obj));
        }
        if (!(obj instanceof byte[])) {
            if (obj instanceof InputStream) {
                return ad(AbstractC9460e.metrica((InputStream) obj));
            }
            throw new IllegalArgumentException(AbstractC1634e.advert(obj, "cannot parse "));
        }
        DataInputStream dataInputStream = null;
        try {
            DataInputStream dataInputStream2 = new DataInputStream(new ByteArrayInputStream((byte[]) obj));
            try {
                C3100e ad = ad(dataInputStream2);
                dataInputStream2.close();
                return ad;
            } catch (Throwable th) {
                th = th;
                dataInputStream = dataInputStream2;
                if (dataInputStream != null) {
                    dataInputStream.close();
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
        if (obj == null || C3100e.class != obj.getClass()) {
            return false;
        }
        C3100e c3100e = (C3100e) obj;
        if (this.f7181e != c3100e.f7181e) {
            return false;
        }
        return this.f7180e.equals(c3100e.f7180e);
    }

    @Override // defpackage.InterfaceC3928e
    public final byte[] getEncoded() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int i = this.f7181e;
        byteArrayOutputStream.write((byte) (i >>> 24));
        byteArrayOutputStream.write((byte) (i >>> 16));
        byteArrayOutputStream.write((byte) (i >>> 8));
        byteArrayOutputStream.write((byte) i);
        try {
            byteArrayOutputStream.write(this.f7180e.vip());
            return byteArrayOutputStream.toByteArray();
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage(), e);
        }
    }

    public final int hashCode() {
        return this.f7180e.hashCode() + (this.f7181e * 31);
    }
}
