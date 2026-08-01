package defpackage;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.spec.AlgorithmParameterSpec;
import java.util.Arrays;
import java.util.Iterator;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: e٘ٛۗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C17862e implements InterfaceC6830e {
    public final /* synthetic */ int ad;
    public final Object metrica;
    public final Object vip;

    public C17862e(C2165e c2165e, C8866e c8866e) {
        this.ad = 3;
        this.metrica = c2165e;
        this.vip = c8866e;
    }

    public C17862e(InterfaceC6830e interfaceC6830e, byte[] bArr) {
        this.ad = 2;
        this.metrica = interfaceC6830e;
        if (bArr.length != 0 && bArr.length != 5) {
            throw new IllegalArgumentException("identifier has an invalid length");
        }
        this.vip = bArr;
    }

    public C17862e(byte[] bArr, int i, byte[] bArr2) {
        this.ad = i;
        switch (i) {
            case 4:
                this.metrica = new C9954e(1, bArr);
                this.vip = bArr2;
                return;
            default:
                this.metrica = new C9954e(0, bArr);
                this.vip = bArr2;
                return;
        }
    }

    public C17862e(byte[] bArr, C15768e c15768e) {
        this.ad = 0;
        if (!AbstractC1786e.adcel(2)) {
            throw new GeneralSecurityException("Can not use AES-GCM in FIPS-mode, as BoringCrypto module is not available.");
        }
        this.metrica = AbstractC0613e.vip(bArr);
        this.vip = c15768e.vip();
    }

    @Override // defpackage.InterfaceC6830e
    public final byte[] ad(byte[] bArr, byte[] bArr2) {
        int i = this.ad;
        Object obj = this.vip;
        Object obj2 = this.metrica;
        switch (i) {
            case 0:
                byte[] bArr3 = (byte[]) obj;
                if (bArr == null) {
                    throw new NullPointerException("plaintext is null");
                }
                byte[] ad = AbstractC10461e.ad(12);
                AlgorithmParameterSpec ad2 = AbstractC0613e.ad(0, ad.length, ad);
                Cipher metrica = AbstractC0613e.metrica();
                metrica.init(1, (SecretKeySpec) obj2, ad2);
                if (bArr2 != null && bArr2.length != 0) {
                    metrica.updateAAD(bArr2);
                }
                int outputSize = metrica.getOutputSize(bArr.length);
                if (outputSize > 2147483635 - bArr3.length) {
                    throw new GeneralSecurityException("plaintext too long");
                }
                byte[] copyOf = Arrays.copyOf(bArr3, bArr3.length + 12 + outputSize);
                System.arraycopy(ad, 0, copyOf, bArr3.length, 12);
                if (metrica.doFinal(bArr, 0, bArr.length, copyOf, bArr3.length + 12) == outputSize) {
                    return copyOf;
                }
                throw new GeneralSecurityException("not enough data written");
            case 1:
                ByteBuffer allocate = ByteBuffer.allocate(bArr.length + 28);
                byte[] ad3 = AbstractC10461e.ad(12);
                allocate.put(ad3);
                ((C9954e) obj2).m3040switch(allocate, ad3, bArr, bArr2);
                byte[] array = allocate.array();
                byte[] bArr4 = (byte[]) obj;
                return bArr4.length == 0 ? array : AbstractC7640e.ad(bArr4, array);
            case 2:
                InterfaceC6830e interfaceC6830e = (InterfaceC6830e) obj2;
                byte[] bArr5 = (byte[]) obj;
                return bArr5.length == 0 ? interfaceC6830e.ad(bArr, bArr2) : AbstractC7640e.ad(bArr5, interfaceC6830e.ad(bArr, bArr2));
            case 3:
                byte[] ad4 = ((C2165e) obj2).ad.ad(bArr, bArr2);
                int length = bArr.length;
                return ad4;
            default:
                ByteBuffer allocate2 = ByteBuffer.allocate(bArr.length + 40);
                byte[] ad5 = AbstractC10461e.ad(24);
                allocate2.put(ad5);
                ((C9954e) obj2).m3040switch(allocate2, ad5, bArr, bArr2);
                byte[] array2 = allocate2.array();
                byte[] bArr6 = (byte[]) obj;
                return bArr6.length == 0 ? array2 : AbstractC7640e.ad(bArr6, array2);
        }
    }

    public byte[] license(byte[] bArr, byte[] bArr2) {
        if (bArr.length < 40) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        byte[] copyOf = Arrays.copyOf(bArr, 24);
        return ((C9954e) this.metrica).m3038instanceof(ByteBuffer.wrap(bArr, 24, bArr.length - 24), copyOf, bArr2);
    }

    public byte[] metrica(byte[] bArr, byte[] bArr2) {
        if (bArr.length < 28) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        byte[] copyOf = Arrays.copyOf(bArr, 12);
        return ((C9954e) this.metrica).m3038instanceof(ByteBuffer.wrap(bArr, 12, bArr.length - 12), copyOf, bArr2);
    }

    @Override // defpackage.InterfaceC6830e
    public final byte[] vip(byte[] bArr, byte[] bArr2) {
        switch (this.ad) {
            case 0:
                byte[] bArr3 = (byte[]) this.vip;
                if (bArr == null) {
                    throw new NullPointerException("ciphertext is null");
                }
                if (bArr.length < bArr3.length + 28) {
                    throw new GeneralSecurityException("ciphertext too short");
                }
                if (!AbstractC6336e.vip(bArr3, bArr)) {
                    throw new GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
                }
                AlgorithmParameterSpec ad = AbstractC0613e.ad(bArr3.length, 12, bArr);
                Cipher metrica = AbstractC0613e.metrica();
                metrica.init(2, (SecretKeySpec) this.metrica, ad);
                if (bArr2 != null && bArr2.length != 0) {
                    metrica.updateAAD(bArr2);
                }
                return metrica.doFinal(bArr, bArr3.length + 12, (bArr.length - bArr3.length) - 12);
            case 1:
                byte[] bArr4 = (byte[]) this.vip;
                if (bArr4.length == 0) {
                    return metrica(bArr, bArr2);
                }
                if (AbstractC6336e.vip(bArr4, bArr)) {
                    return metrica(Arrays.copyOfRange(bArr, bArr4.length, bArr.length), bArr2);
                }
                throw new GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
            case 2:
                InterfaceC6830e interfaceC6830e = (InterfaceC6830e) this.metrica;
                byte[] bArr5 = (byte[]) this.vip;
                if (bArr5.length == 0) {
                    return interfaceC6830e.vip(bArr, bArr2);
                }
                if (AbstractC6336e.vip(bArr5, bArr)) {
                    return interfaceC6830e.vip(Arrays.copyOfRange(bArr, 5, bArr.length), bArr2);
                }
                throw new GeneralSecurityException("wrong prefix");
            case 3:
                Iterator it = ((C8866e) this.vip).ad(bArr).iterator();
                while (it.hasNext()) {
                    try {
                        return ((C2165e) it.next()).ad.vip(bArr, bArr2);
                    } catch (GeneralSecurityException unused) {
                    }
                }
                throw new GeneralSecurityException("decryption failed");
            default:
                byte[] bArr6 = (byte[]) this.vip;
                if (bArr6.length == 0) {
                    return license(bArr, bArr2);
                }
                if (AbstractC6336e.vip(bArr6, bArr)) {
                    return license(Arrays.copyOfRange(bArr, bArr6.length, bArr.length), bArr2);
                }
                throw new GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
        }
    }
}
