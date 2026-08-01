package defpackage;

import java.security.GeneralSecurityException;
import java.util.Iterator;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍٜۚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C9599e implements InterfaceC7304e {
    public final C8866e ad;

    public C9599e(C8866e c8866e) {
        this.ad = c8866e;
    }

    @Override // defpackage.InterfaceC7304e
    public final byte[] ad(byte[] bArr) {
        Iterator it = this.ad.ad(bArr).iterator();
        while (it.hasNext()) {
            try {
                return ((C7807e) it.next()).ad.ad(bArr);
            } catch (GeneralSecurityException unused) {
            }
        }
        throw new GeneralSecurityException("decryption failed");
    }
}
