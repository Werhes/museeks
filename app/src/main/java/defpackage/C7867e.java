package defpackage;

import java.security.GeneralSecurityException;
import java.util.Iterator;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًُۜ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C7867e implements InterfaceC13627e {
    public final C13987e ad;
    public final C8866e vip;

    public C7867e(C13987e c13987e, C8866e c8866e) {
        this.ad = c13987e;
        this.vip = c8866e;
    }

    @Override // defpackage.InterfaceC13627e
    public final byte[] ad(byte[] bArr, byte[] bArr2) {
        byte[] ad = this.ad.ad.ad(bArr, bArr2);
        int length = bArr.length;
        return ad;
    }

    @Override // defpackage.InterfaceC13627e
    public final byte[] vip(byte[] bArr, byte[] bArr2) {
        Iterator it = this.vip.ad(bArr).iterator();
        while (it.hasNext()) {
            try {
                return ((C13987e) it.next()).ad.vip(bArr, bArr2);
            } catch (GeneralSecurityException unused) {
            }
        }
        throw new GeneralSecurityException("decryption failed");
    }
}
