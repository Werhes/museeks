package defpackage;

import androidx.car.app.model.Alert;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.util.Arrays;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍؚٟ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C9312e implements InterfaceC6830e {
    public final C9116e ad;
    public final byte[] license;
    public final int metrica;
    public final C2557e vip;

    public C9312e(C9116e c9116e, C2557e c2557e, int i, byte[] bArr) {
        this.ad = c9116e;
        this.vip = c2557e;
        this.metrica = i;
        this.license = bArr;
    }

    public static C9312e metrica(C0860e c0860e) {
        byte[] vip = ((C15768e) c0860e.vip.f35233e).vip();
        C11897e c11897e = c0860e.ad;
        C9116e c9116e = new C9116e(c11897e.metrica, vip);
        C9556e c9556e = new C9556e("HMAC" + c11897e.purchase, new SecretKeySpec(((C15768e) c0860e.metrica.f35233e).vip(), "HMAC"));
        int i = c11897e.license;
        return new C9312e(c9116e, new C2557e(i, c9556e), i, c0860e.license.vip());
    }

    @Override // defpackage.InterfaceC6830e
    public final byte[] ad(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        C9116e c9116e = this.ad;
        int i = c9116e.vip;
        int i2 = Alert.DURATION_SHOW_INDEFINITELY - i;
        if (length > i2) {
            throw new GeneralSecurityException(AbstractC1786e.admob(i2, "plaintext length can not exceed "));
        }
        byte[] bArr3 = new byte[bArr.length + i];
        byte[] ad = AbstractC10461e.ad(i);
        System.arraycopy(ad, 0, bArr3, 0, i);
        c9116e.ad(bArr, 0, bArr.length, bArr3, c9116e.vip, ad, true);
        if (bArr2 == null) {
            bArr2 = new byte[0];
        }
        return AbstractC7640e.ad(this.license, bArr3, this.vip.ad(AbstractC7640e.ad(bArr2, bArr3, Arrays.copyOf(ByteBuffer.allocate(8).putLong(bArr2.length * 8).array(), 8))));
    }

    @Override // defpackage.InterfaceC6830e
    public final byte[] vip(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        byte[] bArr3 = this.license;
        int length2 = bArr3.length;
        int i = this.metrica;
        if (length < length2 + i) {
            throw new GeneralSecurityException("Decryption failed (ciphertext too short).");
        }
        if (!AbstractC6336e.vip(bArr3, bArr)) {
            throw new GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
        }
        byte[] copyOfRange = Arrays.copyOfRange(bArr, bArr3.length, bArr.length - i);
        byte[] copyOfRange2 = Arrays.copyOfRange(bArr, bArr.length - i, bArr.length);
        if (bArr2 == null) {
            bArr2 = new byte[0];
        }
        if (!MessageDigest.isEqual(this.vip.ad(AbstractC7640e.ad(bArr2, copyOfRange, Arrays.copyOf(ByteBuffer.allocate(8).putLong(bArr2.length * 8).array(), 8))), copyOfRange2)) {
            throw new GeneralSecurityException("invalid MAC");
        }
        int length3 = copyOfRange.length;
        C9116e c9116e = this.ad;
        int i2 = c9116e.vip;
        if (length3 < i2) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        byte[] bArr4 = new byte[i2];
        System.arraycopy(copyOfRange, 0, bArr4, 0, i2);
        int length4 = copyOfRange.length;
        int i3 = c9116e.vip;
        byte[] bArr5 = new byte[length4 - i3];
        c9116e.ad(copyOfRange, i3, copyOfRange.length - i3, bArr5, 0, bArr4, false);
        return bArr5;
    }
}
