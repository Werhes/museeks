package defpackage;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.InputStream;
import java.util.Arrays;

/* renamed from: eٌؔؒ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C8459e extends AbstractC13156e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final byte[] f17229e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final C11892e f17230e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final C7583e f17231e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final byte[] f17232e;

    public C8459e(C7583e c7583e, C11892e c11892e, byte[] bArr, byte[] bArr2) {
        super(false);
        this.f17231e = c7583e;
        this.f17230e = c11892e;
        this.f17232e = AbstractC12442e.license(bArr2);
        this.f17229e = AbstractC12442e.license(bArr);
    }

    public static C8459e ad(Object obj) {
        if (obj instanceof C8459e) {
            return (C8459e) obj;
        }
        if (obj instanceof DataInputStream) {
            DataInputStream dataInputStream = (DataInputStream) obj;
            C7583e c7583e = (C7583e) C7583e.appmetrica.get(Integer.valueOf(dataInputStream.readInt()));
            C11892e c11892e = (C11892e) C11892e.billing.get(Integer.valueOf(dataInputStream.readInt()));
            byte[] bArr = new byte[16];
            dataInputStream.readFully(bArr);
            byte[] bArr2 = new byte[c7583e.vip];
            dataInputStream.readFully(bArr2);
            return new C8459e(c7583e, c11892e, bArr2, bArr);
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
                C8459e ad = ad(dataInputStream3);
                dataInputStream3.close();
                return ad;
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
        if (obj == null || C8459e.class != obj.getClass()) {
            return false;
        }
        C8459e c8459e = (C8459e) obj;
        if (this.f17231e.equals(c8459e.f17231e) && this.f17230e.equals(c8459e.f17230e) && Arrays.equals(this.f17232e, c8459e.f17232e)) {
            return Arrays.equals(this.f17229e, c8459e.f17229e);
        }
        return false;
    }

    @Override // defpackage.InterfaceC3928e
    public final byte[] getEncoded() {
        return vip();
    }

    public final int hashCode() {
        return AbstractC12442e.isVip(this.f17229e) + ((AbstractC12442e.isVip(this.f17232e) + ((this.f17230e.hashCode() + (this.f17231e.hashCode() * 31)) * 31)) * 31);
    }

    public final byte[] vip() {
        C15816e c15816e = new C15816e(6);
        c15816e.m4013case(this.f17231e.ad);
        c15816e.m4013case(this.f17230e.ad);
        c15816e.subscription(this.f17232e);
        c15816e.subscription(this.f17229e);
        return ((ByteArrayOutputStream) c15816e.f31190e).toByteArray();
    }
}
