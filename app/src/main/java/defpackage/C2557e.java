package defpackage;

import java.security.InvalidAlgorithmParameterException;
import java.util.Arrays;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eْؔۡ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2557e implements InterfaceC7648e {
    public static final byte[] appmetrica = {0};
    public final InterfaceC7218e ad;
    public final byte[] license;
    public final byte[] metrica;
    public final int vip;

    public C2557e(int i, C9556e c9556e) {
        this.ad = c9556e;
        this.vip = i;
        this.metrica = new byte[0];
        this.license = new byte[0];
        if (i < 10) {
            throw new InvalidAlgorithmParameterException("tag size too small, need at least 10 bytes");
        }
        c9556e.tapsense(i, new byte[0]);
    }

    public C2557e(C1127e c1127e) {
        this.ad = new C9556e("HMAC" + c1127e.ad.license, new SecretKeySpec(((C15768e) c1127e.vip.f35233e).vip(), "HMAC"));
        C9622e c9622e = c1127e.ad;
        this.vip = c9622e.vip;
        this.metrica = c1127e.metrica.vip();
        if (c9622e.metrica.equals(C2942e.license)) {
            this.license = Arrays.copyOf(appmetrica, 1);
        } else {
            this.license = new byte[0];
        }
    }

    public C2557e(C6345e c6345e) {
        this.ad = AbstractC2223e.vip(C15617e.advert(C2544e.vip(c6345e.ad.ad), c6345e.vip));
        C0834e c0834e = c6345e.ad;
        this.vip = c0834e.vip;
        this.metrica = c6345e.metrica.vip();
        if (c0834e.metrica.equals(C6594e.f13612e)) {
            this.license = Arrays.copyOf(appmetrica, 1);
        } else {
            this.license = new byte[0];
        }
    }

    public final byte[] ad(byte[] bArr) {
        byte[] bArr2 = this.license;
        int length = bArr2.length;
        int i = this.vip;
        InterfaceC7218e interfaceC7218e = this.ad;
        byte[] bArr3 = this.metrica;
        return length > 0 ? AbstractC7640e.ad(bArr3, interfaceC7218e.tapsense(i, AbstractC7640e.ad(bArr, bArr2))) : AbstractC7640e.ad(bArr3, interfaceC7218e.tapsense(i, bArr));
    }
}
