package defpackage;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes3.dex */
public abstract class isPro extends Cdefault implements Cnew, applovin {

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final byte[] f36413e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public static final inmobi f36412e = new inmobi(1, isPro.class);

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public static final char[] f36411e = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    public isPro(int i, byte[] bArr) {
        if (bArr == null) {
            throw new NullPointerException("'data' cannot be null");
        }
        if (bArr.length == 0 && i != 0) {
            throw new IllegalArgumentException("zero length data with non-zero pad bits");
        }
        if (i > 7 || i < 0) {
            throw new IllegalArgumentException("pad bits cannot be greater than 7 or less than 0");
        }
        int length = bArr.length;
        byte[] bArr2 = new byte[length + 1];
        System.arraycopy(bArr, 0, bArr2, 1, length);
        bArr2[0] = (byte) i;
        this.f36413e = bArr2;
    }

    public isPro(byte[] bArr) {
        this.f36413e = bArr;
    }

    public static isPro firebase(Object obj) {
        if (obj == null || (obj instanceof isPro)) {
            return (isPro) obj;
        }
        if (obj instanceof subs) {
            Cdefault billing = ((subs) obj).billing();
            if (billing instanceof isPro) {
                return (isPro) billing;
            }
        } else if (obj instanceof byte[]) {
            try {
                return (isPro) f36412e.m4631e((byte[]) obj);
            } catch (IOException e) {
                throw new IllegalArgumentException(AbstractC8703e.admob(e, new StringBuilder("failed to construct BIT STRING from byte[]: ")));
            }
        }
        throw new IllegalArgumentException("illegal object in getInstance: ".concat(obj.getClass().getName()));
    }

    public static isPro subs(byte[] bArr) {
        int length = bArr.length;
        if (length < 1) {
            throw new IllegalArgumentException("truncated BIT STRING detected");
        }
        int i = bArr[0] & 255;
        if (i > 0) {
            if (i > 7 || length < 2) {
                throw new IllegalArgumentException("invalid pad bits detected");
            }
            byte b = bArr[length - 1];
            if (b != ((byte) ((255 << i) & b))) {
                return new isPro(bArr);
            }
        }
        return new isPro(bArr);
    }

    @Override // defpackage.applovin
    public final int adcel() {
        return this.f36413e[0] & 255;
    }

    @Override // defpackage.Cdefault
    public Cdefault ads() {
        return new isPro(this.f36413e);
    }

    @Override // defpackage.InterfaceC5145e
    public final Cdefault advert() {
        return this;
    }

    /* renamed from: class, reason: not valid java name */
    public final byte[] m4602class() {
        byte[] bArr = this.f36413e;
        if (bArr[0] == 0) {
            return AbstractC12442e.admob(1, bArr.length, bArr);
        }
        throw new IllegalStateException("attempt to get non-octet aligned data from BIT STRING");
    }

    public final byte[] crashlytics() {
        byte[] bArr = this.f36413e;
        if (bArr.length == 1) {
            return Cprotected.f36447e;
        }
        int i = bArr[0] & 255;
        byte[] admob = AbstractC12442e.admob(1, bArr.length, bArr);
        int length = admob.length - 1;
        admob[length] = (byte) (((byte) (255 << i)) & admob[length]);
        return admob;
    }

    @Override // defpackage.Cdefault, defpackage.Cextends
    public final int hashCode() {
        byte[] bArr = this.f36413e;
        if (bArr.length < 2) {
            return 1;
        }
        int i = 0;
        int i2 = bArr[0] & 255;
        int length = bArr.length;
        int i3 = length - 1;
        byte b = (byte) ((255 << i2) & bArr[i3]);
        if (bArr != null) {
            i = length;
            while (true) {
                i3--;
                if (i3 < 0) {
                    break;
                }
                i = (i * 257) ^ bArr[i3];
            }
        }
        return (i * 257) ^ b;
    }

    /* renamed from: interface, reason: not valid java name */
    public final int m4603interface() {
        byte[] bArr = this.f36413e;
        int min = Math.min(5, bArr.length - 1);
        int i = 0;
        for (int i2 = 1; i2 < min; i2++) {
            i |= (255 & bArr[i2]) << ((i2 - 1) * 8);
        }
        if (1 > min || min >= 5) {
            return i;
        }
        return ((((byte) (bArr[min] & (255 << (bArr[0] & 255)))) & 255) << ((min - 1) * 8)) | i;
    }

    @Override // defpackage.Cdefault
    public final boolean loadAd(Cdefault cdefault) {
        if (!(cdefault instanceof isPro)) {
            return false;
        }
        byte[] bArr = ((isPro) cdefault).f36413e;
        byte[] bArr2 = this.f36413e;
        int length = bArr2.length;
        if (bArr.length != length) {
            return false;
        }
        if (length == 1) {
            return true;
        }
        int i = length - 1;
        for (int i2 = 0; i2 < i; i2++) {
            if (bArr2[i2] != bArr[i2]) {
                return false;
            }
        }
        int i3 = 255 << (bArr2[0] & 255);
        return ((byte) (bArr2[i] & i3)) == ((byte) (bArr[i] & i3));
    }

    @Override // defpackage.Cdefault
    public Cdefault premium() {
        return new isPro(this.f36413e);
    }

    @Override // defpackage.applovin
    public final InputStream startapp() {
        byte[] bArr = this.f36413e;
        return new ByteArrayInputStream(bArr, 1, bArr.length - 1);
    }

    public String toString() {
        return yandex();
    }

    @Override // defpackage.Cnew
    public final String yandex() {
        try {
            byte[] encoded = getEncoded();
            StringBuilder sb = new StringBuilder((encoded.length * 2) + 1);
            sb.append('#');
            for (int i = 0; i != encoded.length; i++) {
                byte b = encoded[i];
                char[] cArr = f36411e;
                sb.append(cArr[(b >>> 4) & 15]);
                sb.append(cArr[b & 15]);
            }
            return sb.toString();
        } catch (IOException e) {
            throw new Cabstract(AbstractC8703e.admob(e, new StringBuilder("Internal error encoding BitString: ")), e, 0);
        }
    }
}
