package defpackage;

import java.security.GeneralSecurityException;
import java.util.Arrays;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eُٜٓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C14104e implements InterfaceC7304e {
    public final InterfaceC7304e ad;
    public final byte[] vip;

    public C14104e(InterfaceC7304e interfaceC7304e, byte[] bArr) {
        this.ad = interfaceC7304e;
        this.vip = bArr;
    }

    @Override // defpackage.InterfaceC7304e
    public final byte[] ad(byte[] bArr) {
        byte[] bArr2 = this.vip;
        int length = bArr2.length;
        InterfaceC7304e interfaceC7304e = this.ad;
        if (length == 0) {
            return interfaceC7304e.ad(bArr);
        }
        if (AbstractC6336e.vip(bArr2, bArr)) {
            return interfaceC7304e.ad(Arrays.copyOfRange(bArr, bArr2.length, bArr.length));
        }
        throw new GeneralSecurityException("Invalid ciphertext (output prefix mismatch)");
    }
}
