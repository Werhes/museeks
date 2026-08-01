package defpackage;

import j$.util.DesugarCollections;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.HashSet;
import java.util.Set;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٜ٘۟, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C17883e implements InterfaceC6830e {
    public static final Set appmetrica;
    public static final byte[] license = new byte[0];
    public final String ad;
    public final C4536e metrica;
    public final AbstractC12699e vip;

    static {
        HashSet hashSet = new HashSet();
        hashSet.add("type.googleapis.com/google.crypto.tink.AesGcmKey");
        hashSet.add("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key");
        hashSet.add("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key");
        hashSet.add("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey");
        hashSet.add("type.googleapis.com/google.crypto.tink.AesGcmSivKey");
        hashSet.add("type.googleapis.com/google.crypto.tink.AesEaxKey");
        appmetrica = DesugarCollections.unmodifiableSet(hashSet);
    }

    public C17883e(C7818e c7818e, C4536e c4536e) {
        if (!appmetrica.contains(c7818e.firebase())) {
            throw new IllegalArgumentException("Unsupported DEK key type: " + c7818e.firebase() + ". Only Tink AEAD key types are supported.");
        }
        this.ad = c7818e.firebase();
        C2455e m2322goto = C7818e.m2322goto(c7818e);
        m2322goto.billing(EnumC3021e.RAW);
        this.vip = AbstractC15268e.license(((C7818e) m2322goto.ad()).appmetrica());
        this.metrica = c4536e;
    }

    @Override // defpackage.InterfaceC6830e
    public final byte[] ad(byte[] bArr, byte[] bArr2) {
        AbstractC14783e vip = C1825e.vip.vip(this.vip, null);
        byte[] ad = this.metrica.ad(((C12524e) C15619e.vip.billing(vip)).f25073e.adcel(), license);
        if (ad.length > 4096) {
            throw new GeneralSecurityException("length of encrypted DEK too large");
        }
        byte[] ad2 = ((InterfaceC6830e) ((C17919e) C17895e.vip.ad.get()).ad(vip, InterfaceC6830e.class)).ad(bArr, bArr2);
        return ByteBuffer.allocate(ad.length + 4 + ad2.length).putInt(ad.length).put(ad).put(ad2).array();
    }

    @Override // defpackage.InterfaceC6830e
    public final byte[] vip(byte[] bArr, byte[] bArr2) {
        try {
            ByteBuffer wrap = ByteBuffer.wrap(bArr);
            int i = wrap.getInt();
            if (i <= 0 || i > 4096 || i > bArr.length - 4) {
                throw new GeneralSecurityException("length of encrypted DEK too large");
            }
            byte[] bArr3 = new byte[i];
            wrap.get(bArr3, 0, i);
            byte[] bArr4 = new byte[wrap.remaining()];
            wrap.get(bArr4, 0, wrap.remaining());
            byte[] vip = this.metrica.vip(bArr3, license);
            String str = this.ad;
            C2096e c2096e = AbstractC10498e.f20717e;
            return ((InterfaceC6830e) ((C17919e) C17895e.vip.ad.get()).ad(C15619e.vip.ad(C12524e.ad(str, AbstractC10498e.yandex(0, vip.length, vip), EnumC13541e.SYMMETRIC, EnumC3021e.RAW, null)), InterfaceC6830e.class)).vip(bArr4, bArr2);
        } catch (IndexOutOfBoundsException e) {
            e = e;
            throw new GeneralSecurityException("invalid ciphertext", e);
        } catch (NegativeArraySizeException e2) {
            e = e2;
            throw new GeneralSecurityException("invalid ciphertext", e);
        } catch (BufferUnderflowException e3) {
            e = e3;
            throw new GeneralSecurityException("invalid ciphertext", e);
        }
    }
}
