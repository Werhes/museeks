package defpackage;

import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;
import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؒۙۚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1292e {
    public byte[] ad;
    public int metrica;
    public int vip;
    public static final char[] license = {'\r', '\n'};
    public static final char[] appmetrica = {'\n'};
    public static final AbstractC12614e purchase = AbstractC12614e.Signature(5, StandardCharsets.US_ASCII, StandardCharsets.UTF_8, StandardCharsets.UTF_16, StandardCharsets.UTF_16BE, StandardCharsets.UTF_16LE);
    public static final AtomicBoolean billing = new AtomicBoolean();

    public C1292e() {
        this.ad = AbstractC9413e.vip;
    }

    public C1292e(int i) {
        this.ad = new byte[i];
        this.metrica = i;
    }

    public C1292e(int i, byte[] bArr) {
        this.ad = bArr;
        this.metrica = i;
    }

    public C1292e(byte[] bArr) {
        this.ad = bArr;
        this.metrica = bArr.length;
    }

    public static boolean appmetrica(byte b) {
        return (b & 192) == 128;
    }

    public static int license(Charset charset) {
        AbstractC2301e.startapp(purchase.contains(charset), "Unsupported charset: %s", charset);
        return (charset.equals(StandardCharsets.UTF_8) || charset.equals(StandardCharsets.US_ASCII)) ? 1 : 2;
    }

    public static int vip(int i, int i2, int i3, int i4) {
        byte b = (byte) i3;
        return AbstractC10509e.mopub((byte) 0, AbstractC12184e.license(((i & 7) << 2) | ((i2 & 48) >> 4)), AbstractC12184e.license(((((byte) i2) & 15) << 4) | ((b & 60) >> 2)), AbstractC12184e.license(((b & 3) << 6) | (((byte) i4) & 63)));
    }

    public final long Signature() {
        purchase(8);
        byte[] bArr = this.ad;
        int i = this.vip;
        this.vip = i + 1;
        this.vip = i + 2;
        long j = (bArr[i] & 255) | ((bArr[r3] & 255) << 8);
        this.vip = i + 3;
        long j2 = j | ((bArr[r8] & 255) << 16);
        this.vip = i + 4;
        long j3 = j2 | ((bArr[r3] & 255) << 24);
        this.vip = i + 5;
        long j4 = j3 | ((bArr[r8] & 255) << 32);
        this.vip = i + 6;
        long j5 = j4 | ((bArr[r3] & 255) << 40);
        this.vip = i + 7;
        long j6 = j5 | ((bArr[r8] & 255) << 48);
        this.vip = i + 8;
        return ((bArr[r3] & 255) << 56) | j6;
    }

    public final int ad() {
        return Math.max(this.metrica - this.vip, 0);
    }

    public final int adcel() {
        purchase(1);
        return this.ad[this.vip] & 255;
    }

    public final short admob() {
        purchase(2);
        byte[] bArr = this.ad;
        int i = this.vip;
        int i2 = i + 1;
        this.vip = i2;
        int i3 = bArr[i] & 255;
        this.vip = i + 2;
        return (short) (((bArr[i2] & 255) << 8) | i3);
    }

    public final int ads() {
        purchase(1);
        byte[] bArr = this.ad;
        int i = this.vip;
        this.vip = i + 1;
        return bArr[i] & 255;
    }

    public final char advert(Charset charset, char[] cArr) {
        int yandex;
        if (ad() >= license(charset) && (yandex = yandex(charset)) != 0) {
            long j = yandex >>> 8;
            AbstractC2301e.appmetrica(j, "out of range: %s", (j >> 32) == 0);
            int i = (int) j;
            if (!Character.isSupplementaryCodePoint(i)) {
                long j2 = i;
                char c = (char) j2;
                AbstractC2301e.appmetrica(j2, "Out of range: %s", ((long) c) == j2);
                for (char c2 : cArr) {
                    if (c2 == c) {
                        this.vip = AbstractC10509e.purchase(yandex & 255) + this.vip;
                        return c;
                    }
                }
            }
        }
        return (char) 0;
    }

    public final String amazon(Charset charset) {
        int i;
        AbstractC2301e.startapp(purchase.contains(charset), "Unsupported charset: %s", charset);
        if (ad() == 0) {
            return null;
        }
        Charset charset2 = StandardCharsets.US_ASCII;
        if (!charset.equals(charset2)) {
            m567native();
        }
        if (charset.equals(StandardCharsets.UTF_8) || charset.equals(charset2)) {
            i = 1;
        } else {
            if (!charset.equals(StandardCharsets.UTF_16) && !charset.equals(StandardCharsets.UTF_16LE) && !charset.equals(StandardCharsets.UTF_16BE)) {
                throw new IllegalArgumentException("Unsupported charset: " + charset);
            }
            i = 2;
        }
        int i2 = this.vip;
        while (true) {
            int i3 = this.metrica;
            if (i2 >= i3 - (i - 1)) {
                i2 = i3;
                break;
            }
            if ((charset.equals(StandardCharsets.UTF_8) || charset.equals(StandardCharsets.US_ASCII)) && AbstractC9413e.m2545break(this.ad[i2])) {
                break;
            }
            if (charset.equals(StandardCharsets.UTF_16) || charset.equals(StandardCharsets.UTF_16BE)) {
                byte[] bArr = this.ad;
                if (bArr[i2] == 0 && AbstractC9413e.m2545break(bArr[i2 + 1])) {
                    break;
                }
            }
            if (charset.equals(StandardCharsets.UTF_16LE)) {
                byte[] bArr2 = this.ad;
                if (bArr2[i2 + 1] == 0 && AbstractC9413e.m2545break(bArr2[i2])) {
                    break;
                }
            }
            i2 += i;
        }
        String isPro = isPro(i2 - this.vip, charset);
        if (this.vip != this.metrica && advert(charset, license) == '\r') {
            advert(charset, appmetrica);
        }
        return isPro;
    }

    public final int applovin() {
        return (ads() << 21) | (ads() << 14) | (ads() << 7) | ads();
    }

    public final char billing(int i, ByteOrder byteOrder) {
        byte b;
        byte b2;
        purchase(2);
        if (byteOrder == ByteOrder.BIG_ENDIAN) {
            byte[] bArr = this.ad;
            int i2 = this.vip + i;
            b = bArr[i2];
            b2 = bArr[i2 + 1];
        } else {
            byte[] bArr2 = this.ad;
            int i3 = this.vip + i;
            b = bArr2[i3 + 1];
            b2 = bArr2[i3];
        }
        return (char) ((b << 8) | (b2 & 255));
    }

    /* renamed from: class, reason: not valid java name */
    public final int m563class() {
        long j = 0;
        for (int i = 0; i < 9; i++) {
            if (this.vip == this.metrica) {
                throw new IllegalStateException("Attempting to read a byte over the limit.");
            }
            long ads = ads();
            j |= (127 & ads) << (i * 7);
            if ((ads & 128) == 0) {
                break;
            }
        }
        return AbstractC10509e.purchase(j);
    }

    public final int crashlytics() {
        purchase(3);
        byte[] bArr = this.ad;
        int i = this.vip;
        int i2 = i + 1;
        this.vip = i2;
        int i3 = (bArr[i] & 255) << 16;
        int i4 = i + 2;
        this.vip = i4;
        int i5 = ((bArr[i2] & 255) << 8) | i3;
        this.vip = i + 3;
        return (bArr[i4] & 255) | i5;
    }

    /* renamed from: extends, reason: not valid java name */
    public final void m564extends(int i) {
        byte[] bArr = this.ad;
        if (bArr.length < i) {
            bArr = new byte[i];
        }
        m570throw(i, bArr);
    }

    public final int firebase() {
        int smaato = smaato();
        if (smaato >= 0) {
            return smaato;
        }
        throw new IllegalStateException(AbstractC1786e.admob(smaato, "Top bit not zero: "));
    }

    /* renamed from: goto, reason: not valid java name */
    public final int m565goto() {
        purchase(2);
        byte[] bArr = this.ad;
        int i = this.vip;
        int i2 = i + 1;
        this.vip = i2;
        int i3 = (bArr[i] & 255) << 8;
        this.vip = i + 2;
        return (bArr[i2] & 255) | i3;
    }

    public final short inmobi() {
        purchase(2);
        byte[] bArr = this.ad;
        int i = this.vip;
        int i2 = i + 1;
        this.vip = i2;
        int i3 = (bArr[i] & 255) << 8;
        this.vip = i + 2;
        return (short) ((bArr[i2] & 255) | i3);
    }

    /* renamed from: interface, reason: not valid java name */
    public final long m566interface() {
        long signatures = signatures();
        if (signatures >= 0) {
            return signatures;
        }
        throw new IllegalStateException(AbstractC0869e.isVip(signatures, "Top bit not zero: "));
    }

    public final String isPro(int i, Charset charset) {
        purchase(i);
        String str = new String(this.ad, this.vip, i, charset);
        this.vip += i;
        return str;
    }

    public final String isVip(int i) {
        purchase(i);
        if (i == 0) {
            return BuildConfig.FLAVOR;
        }
        int i2 = this.vip;
        int i3 = (i2 + i) - 1;
        int i4 = (i3 >= this.metrica || this.ad[i3] != 0) ? i : i - 1;
        byte[] bArr = this.ad;
        String str = AbstractC9413e.ad;
        String str2 = new String(bArr, i2, i4, StandardCharsets.UTF_8);
        this.vip += i;
        return str2;
    }

    public final int loadAd() {
        purchase(4);
        byte[] bArr = this.ad;
        int i = this.vip;
        int i2 = i + 1;
        this.vip = i2;
        int i3 = bArr[i] & 255;
        int i4 = i + 2;
        this.vip = i4;
        int i5 = ((bArr[i2] & 255) << 8) | i3;
        int i6 = i + 3;
        this.vip = i6;
        int i7 = i5 | ((bArr[i4] & 255) << 16);
        this.vip = i + 4;
        return ((bArr[i6] & 255) << 24) | i7;
    }

    public final void metrica(int i) {
        byte[] bArr = this.ad;
        if (i > bArr.length) {
            this.ad = Arrays.copyOf(bArr, i);
        }
    }

    public final void mopub(int i, int i2, byte[] bArr) {
        purchase(i2);
        System.arraycopy(this.ad, this.vip, bArr, i, i2);
        this.vip += i2;
    }

    /* renamed from: native, reason: not valid java name */
    public final Charset m567native() {
        if (ad() >= 3) {
            byte[] bArr = this.ad;
            int i = this.vip;
            if (bArr[i] == -17 && bArr[i + 1] == -69 && bArr[i + 2] == -65) {
                this.vip = i + 3;
                return StandardCharsets.UTF_8;
            }
        }
        if (ad() < 2) {
            return null;
        }
        byte[] bArr2 = this.ad;
        int i2 = this.vip;
        byte b = bArr2[i2];
        if (b == -2 && bArr2[i2 + 1] == -1) {
            this.vip = i2 + 2;
            return StandardCharsets.UTF_16BE;
        }
        if (b != -1 || bArr2[i2 + 1] != -2) {
            return null;
        }
        this.vip = i2 + 2;
        return StandardCharsets.UTF_16LE;
    }

    public final int premium() {
        purchase(4);
        byte[] bArr = this.ad;
        int i = this.vip;
        int i2 = i + 1;
        this.vip = i2;
        int i3 = (bArr[i] & 255) << 8;
        this.vip = i + 2;
        int i4 = (bArr[i2] & 255) | i3;
        this.vip = i + 4;
        return i4;
    }

    public final int pro() {
        purchase(2);
        byte[] bArr = this.ad;
        int i = this.vip;
        int i2 = i + 1;
        this.vip = i2;
        int i3 = bArr[i] & 255;
        this.vip = i + 2;
        return ((bArr[i2] & 255) << 8) | i3;
    }

    /* renamed from: protected, reason: not valid java name */
    public final void m568protected(int i) {
        m571try(this.vip + i);
    }

    public final void purchase(int i) {
        if (!billing.get() || ad() >= i) {
            return;
        }
        StringBuilder premium = AbstractC4653e.premium("bytesNeeded= ", i, ", bytesLeft=");
        premium.append(ad());
        throw new IndexOutOfBoundsException(premium.toString());
    }

    public final int remoteconfig() {
        int loadAd = loadAd();
        if (loadAd >= 0) {
            return loadAd;
        }
        throw new IllegalStateException(AbstractC1786e.admob(loadAd, "Top bit not zero: "));
    }

    public final long signatures() {
        purchase(8);
        byte[] bArr = this.ad;
        int i = this.vip;
        this.vip = i + 1;
        this.vip = i + 2;
        long j = ((bArr[i] & 255) << 56) | ((bArr[r3] & 255) << 48);
        this.vip = i + 3;
        long j2 = j | ((bArr[r8] & 255) << 40);
        this.vip = i + 4;
        long j3 = j2 | ((bArr[r3] & 255) << 32);
        this.vip = i + 5;
        long j4 = j3 | ((bArr[r8] & 255) << 24);
        this.vip = i + 6;
        long j5 = j4 | ((bArr[r3] & 255) << 16);
        this.vip = i + 7;
        long j6 = j5 | ((bArr[r8] & 255) << 8);
        this.vip = i + 8;
        return (bArr[r3] & 255) | j6;
    }

    public final int smaato() {
        purchase(4);
        byte[] bArr = this.ad;
        int i = this.vip;
        int i2 = i + 1;
        this.vip = i2;
        int i3 = (bArr[i] & 255) << 24;
        int i4 = i + 2;
        this.vip = i4;
        int i5 = ((bArr[i2] & 255) << 16) | i3;
        int i6 = i + 3;
        this.vip = i6;
        int i7 = i5 | ((bArr[i4] & 255) << 8);
        this.vip = i + 4;
        return (bArr[i6] & 255) | i7;
    }

    public final int startapp() {
        if (ad() >= 4) {
            int smaato = smaato();
            this.vip -= 4;
            return smaato;
        }
        throw new IndexOutOfBoundsException("position=" + this.vip + ", limit=" + this.metrica);
    }

    public final long subs() {
        purchase(4);
        byte[] bArr = this.ad;
        int i = this.vip;
        this.vip = i + 1;
        this.vip = i + 2;
        long j = ((bArr[i] & 255) << 24) | ((bArr[r3] & 255) << 16);
        this.vip = i + 3;
        long j2 = j | ((bArr[r8] & 255) << 8);
        this.vip = i + 4;
        return (bArr[r3] & 255) | j2;
    }

    public final long subscription() {
        purchase(4);
        byte[] bArr = this.ad;
        int i = this.vip;
        this.vip = i + 1;
        this.vip = i + 2;
        long j = (bArr[i] & 255) | ((bArr[r3] & 255) << 8);
        this.vip = i + 3;
        long j2 = j | ((bArr[r8] & 255) << 16);
        this.vip = i + 4;
        return ((bArr[r3] & 255) << 24) | j2;
    }

    public final String tapsense() {
        if (ad() == 0) {
            return null;
        }
        int i = this.vip;
        while (i < this.metrica && this.ad[i] != 0) {
            i++;
        }
        byte[] bArr = this.ad;
        int i2 = this.vip;
        String str = AbstractC9413e.ad;
        String str2 = new String(bArr, i2, i - i2, StandardCharsets.UTF_8);
        this.vip = i;
        if (i < this.metrica) {
            this.vip = i + 1;
        }
        return str2;
    }

    /* renamed from: this, reason: not valid java name */
    public final long m569this() {
        int i;
        purchase(1);
        long j = this.ad[this.vip];
        int i2 = 7;
        while (true) {
            if (i2 < 0) {
                break;
            }
            if (((1 << i2) & j) != 0) {
                i2--;
            } else if (i2 < 6) {
                j &= r6 - 1;
                i = 7 - i2;
            } else if (i2 == 7) {
                i = 1;
            }
        }
        i = 0;
        if (i == 0) {
            throw new NumberFormatException(AbstractC0869e.isVip(j, "Invalid UTF-8 sequence first byte: "));
        }
        purchase(i);
        for (int i3 = 1; i3 < i; i3++) {
            if ((this.ad[this.vip + i3] & 192) != 128) {
                throw new NumberFormatException(AbstractC0869e.isVip(j, "Invalid UTF-8 sequence continuation byte: "));
            }
            j = (j << 6) | (r4 & 63);
        }
        this.vip += i;
        return j;
    }

    /* renamed from: throw, reason: not valid java name */
    public final void m570throw(int i, byte[] bArr) {
        this.ad = bArr;
        this.metrica = i;
        this.vip = 0;
    }

    /* renamed from: try, reason: not valid java name */
    public final void m571try(int i) {
        AbstractC2301e.billing(i >= 0 && i <= this.metrica);
        this.vip = i;
    }

    /* renamed from: while, reason: not valid java name */
    public final void m572while(int i) {
        AbstractC2301e.billing(i >= 0 && i <= this.ad.length);
        this.metrica = i;
    }

    public final int yandex(Charset charset) {
        int i;
        int i2;
        AbstractC2301e.startapp(purchase.contains(charset), "Unsupported charset: %s", charset);
        if (ad() < license(charset)) {
            throw new IndexOutOfBoundsException("position=" + this.vip + ", limit=" + this.metrica);
        }
        int i3 = 1;
        if (charset.equals(StandardCharsets.US_ASCII)) {
            byte b = this.ad[this.vip];
            if ((b & 128) != 0) {
                return 0;
            }
            i = b & 255;
        } else if (charset.equals(StandardCharsets.UTF_8)) {
            byte b2 = this.ad[this.vip];
            int i4 = (b2 & 128) == 0 ? 1 : ((b2 & 224) == 192 && ad() >= 2 && appmetrica(this.ad[this.vip + 1])) ? 2 : ((this.ad[this.vip] & 240) == 224 && ad() >= 3 && appmetrica(this.ad[this.vip + 1]) && appmetrica(this.ad[this.vip + 2])) ? 3 : ((this.ad[this.vip] & 248) == 240 && ad() >= 4 && appmetrica(this.ad[this.vip + 1]) && appmetrica(this.ad[this.vip + 2]) && appmetrica(this.ad[this.vip + 3])) ? 4 : 0;
            if (i4 == 1) {
                i2 = this.ad[this.vip] & 255;
            } else if (i4 == 2) {
                byte[] bArr = this.ad;
                int i5 = this.vip;
                i2 = vip(0, 0, bArr[i5], bArr[i5 + 1]);
            } else if (i4 == 3) {
                byte[] bArr2 = this.ad;
                int i6 = this.vip;
                i2 = vip(0, bArr2[i6] & 15, bArr2[i6 + 1], bArr2[i6 + 2]);
            } else {
                if (i4 != 4) {
                    return 0;
                }
                byte[] bArr3 = this.ad;
                int i7 = this.vip;
                i2 = vip(bArr3[i7], bArr3[i7 + 1], bArr3[i7 + 2], bArr3[i7 + 3]);
            }
            i3 = i4;
            i = i2;
        } else {
            ByteOrder byteOrder = charset.equals(StandardCharsets.UTF_16LE) ? ByteOrder.LITTLE_ENDIAN : ByteOrder.BIG_ENDIAN;
            char billing2 = billing(0, byteOrder);
            if (!Character.isHighSurrogate(billing2) || ad() < 4) {
                i = billing2;
                i3 = 2;
            } else {
                i = Character.toCodePoint(billing2, billing(2, byteOrder));
                i3 = 4;
            }
        }
        return (i << 8) | i3;
    }
}
