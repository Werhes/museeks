package defpackage;

import java.security.GeneralSecurityException;
import java.util.Arrays;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٟؑۡ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0482e implements InterfaceC13627e {
    public final InterfaceC13627e ad;
    public final byte[] metrica;
    public final EnumC3021e vip;

    public C0482e(InterfaceC13627e interfaceC13627e, EnumC3021e enumC3021e, byte[] bArr) {
        this.ad = interfaceC13627e;
        this.vip = enumC3021e;
        this.metrica = bArr;
    }

    @Override // defpackage.InterfaceC13627e
    public final byte[] ad(byte[] bArr, byte[] bArr2) {
        EnumC3021e enumC3021e = this.vip;
        EnumC3021e enumC3021e2 = EnumC3021e.RAW;
        InterfaceC13627e interfaceC13627e = this.ad;
        return enumC3021e == enumC3021e2 ? interfaceC13627e.ad(bArr, bArr2) : AbstractC7640e.ad(this.metrica, interfaceC13627e.ad(bArr, bArr2));
    }

    @Override // defpackage.InterfaceC13627e
    public final byte[] vip(byte[] bArr, byte[] bArr2) {
        EnumC3021e enumC3021e = this.vip;
        EnumC3021e enumC3021e2 = EnumC3021e.RAW;
        InterfaceC13627e interfaceC13627e = this.ad;
        if (enumC3021e == enumC3021e2) {
            return interfaceC13627e.vip(bArr, bArr2);
        }
        if (AbstractC6336e.vip(this.metrica, bArr)) {
            return interfaceC13627e.vip(Arrays.copyOfRange(bArr, 5, bArr.length), bArr2);
        }
        throw new GeneralSecurityException("wrong prefix");
    }
}
