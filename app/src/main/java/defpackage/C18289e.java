package defpackage;

import java.util.Hashtable;

/* renamed from: eۖؒ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C18289e implements InterfaceC10898e {

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public static final byte[] f35750e = {1};

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public static final Hashtable f35751e;

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public InterfaceC16186e f35752e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public byte[] f35753e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public byte[] f35754e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public long f35755e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public C15708e f35756e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public int f35757e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public int f35758e;

    static {
        Hashtable hashtable = new Hashtable();
        f35751e = hashtable;
        hashtable.put("SHA-1", 440);
        hashtable.put("SHA-224", 440);
        hashtable.put("SHA-256", 440);
        hashtable.put("SHA-512/256", 440);
        hashtable.put("SHA-512/224", 440);
        hashtable.put("SHA-384", 888);
        hashtable.put("SHA-512", 888);
    }

    public static void vip(byte[] bArr, byte[] bArr2) {
        int i = 0;
        for (int i2 = 1; i2 <= bArr2.length; i2++) {
            int i3 = (bArr[bArr.length - i2] & 255) + (bArr2[bArr2.length - i2] & 255) + i;
            i = i3 > 255 ? 1 : 0;
            bArr[bArr.length - i2] = (byte) i3;
        }
        for (int length = bArr2.length + 1; length <= bArr.length; length++) {
            int i4 = (bArr[bArr.length - length] & 255) + i;
            i = i4 > 255 ? 1 : 0;
            bArr[bArr.length - length] = (byte) i4;
        }
    }

    @Override // defpackage.InterfaceC10898e
    public final int ad(boolean z, byte[] bArr) {
        C15708e c15708e = this.f35756e;
        int length = bArr.length * 8;
        if (length > 262144) {
            throw new IllegalArgumentException("Number of bits per request limited to 262144");
        }
        if (this.f35755e > 140737488355328L) {
            return -1;
        }
        if (z) {
            license(null);
        }
        byte[] bArr2 = this.f35754e;
        c15708e.getClass();
        int i = length / 8;
        int i2 = i / 64;
        int length2 = bArr2.length;
        byte[] bArr3 = new byte[length2];
        System.arraycopy(bArr2, 0, bArr3, 0, bArr2.length);
        byte[] bArr4 = new byte[i];
        byte[] bArr5 = new byte[64];
        for (int i3 = 0; i3 <= i2; i3++) {
            c15708e.update(bArr3, 0, length2);
            c15708e.doFinal(bArr5, 0);
            int i4 = i3 * 64;
            int i5 = i - i4;
            if (i5 > 64) {
                i5 = 64;
            }
            System.arraycopy(bArr5, 0, bArr4, i4, i5);
            vip(bArr3, f35750e);
        }
        byte[] bArr6 = this.f35754e;
        int length3 = bArr6.length + 1;
        byte[] bArr7 = new byte[length3];
        System.arraycopy(bArr6, 0, bArr7, 1, bArr6.length);
        bArr7[0] = 3;
        c15708e.getClass();
        byte[] bArr8 = new byte[64];
        c15708e.update(bArr7, 0, length3);
        c15708e.doFinal(bArr8, 0);
        vip(this.f35754e, bArr8);
        vip(this.f35754e, this.f35753e);
        vip(this.f35754e, new byte[]{(byte) (r6 >> 24), (byte) (r6 >> 16), (byte) (r6 >> 8), (byte) this.f35755e});
        this.f35755e++;
        System.arraycopy(bArr4, 0, bArr, 0, bArr.length);
        return length;
    }

    @Override // defpackage.InterfaceC10898e
    public final void license(byte[] bArr) {
        byte[] entropy = this.f35752e.getEntropy();
        if (entropy.length < (this.f35758e + 7) / 8) {
            throw new IllegalStateException("Insufficient entropy provided by entropy source");
        }
        byte[] advert = AbstractC12442e.advert(f35750e, this.f35754e, entropy, bArr);
        C15708e c15708e = this.f35756e;
        int i = this.f35757e;
        byte[] ad = AbstractC3874e.ad(c15708e, advert, i);
        this.f35754e = ad;
        byte[] bArr2 = new byte[ad.length + 1];
        bArr2[0] = 0;
        System.arraycopy(ad, 0, bArr2, 1, ad.length);
        this.f35753e = AbstractC3874e.ad(c15708e, bArr2, i);
        this.f35755e = 1L;
    }
}
