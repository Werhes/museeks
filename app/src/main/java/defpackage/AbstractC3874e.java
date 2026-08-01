package defpackage;

import java.util.Hashtable;
import org.conscrypt.PSKKeyManager;

/* renamed from: eٕؖؕ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC3874e {
    public static final Hashtable ad;

    static {
        Hashtable hashtable = new Hashtable();
        ad = hashtable;
        hashtable.put("SHA-1", 128);
        hashtable.put("SHA-224", 192);
        Integer valueOf = Integer.valueOf(PSKKeyManager.MAX_KEY_LENGTH_BYTES);
        hashtable.put("SHA-256", valueOf);
        hashtable.put("SHA-384", valueOf);
        hashtable.put("SHA-512", valueOf);
        hashtable.put("SHA-512/224", 192);
        hashtable.put("SHA-512/256", valueOf);
    }

    public static byte[] ad(C15708e c15708e, byte[] bArr, int i) {
        int i2 = (i + 7) / 8;
        byte[] bArr2 = new byte[i2];
        c15708e.getClass();
        int i3 = i2 / 64;
        byte[] bArr3 = new byte[64];
        int i4 = 1;
        int i5 = 0;
        for (int i6 = 0; i6 <= i3; i6++) {
            c15708e.update((byte) i4);
            c15708e.update((byte) (i >> 24));
            c15708e.update((byte) (i >> 16));
            c15708e.update((byte) (i >> 8));
            c15708e.update((byte) i);
            c15708e.update(bArr, 0, bArr.length);
            c15708e.doFinal(bArr3, 0);
            int i7 = i6 * 64;
            int i8 = i2 - i7;
            if (i8 > 64) {
                i8 = 64;
            }
            System.arraycopy(bArr3, 0, bArr2, i7, i8);
            i4++;
        }
        int i9 = i % 8;
        if (i9 != 0) {
            int i10 = 8 - i9;
            int i11 = 0;
            while (i5 != i2) {
                int i12 = bArr2[i5] & 255;
                bArr2[i5] = (byte) ((i11 << (8 - i10)) | (i12 >>> i10));
                i5++;
                i11 = i12;
            }
        }
        return bArr2;
    }
}
