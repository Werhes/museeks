package defpackage;

import java.security.GeneralSecurityException;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍ٘۠, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C18049e implements InterfaceC14710e {
    public final C7988e ad;

    public C18049e(C7988e c7988e) {
        this.ad = c7988e;
    }

    @Override // defpackage.InterfaceC14710e
    public final byte[] ad(byte[] bArr) {
        InterfaceC14710e interfaceC14710e = (InterfaceC14710e) this.ad.f16176e;
        if (interfaceC14710e == null) {
            throw new GeneralSecurityException("keyset without primary key");
        }
        byte[] ad = interfaceC14710e.ad(bArr);
        int length = bArr.length;
        return ad;
    }
}
