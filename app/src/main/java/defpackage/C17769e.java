package defpackage;

import java.security.SecureRandomSpi;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eۣ٘ٔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C17769e extends SecureRandomSpi {

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final AbstractC17648e f34849e;

    public C17769e(AbstractC17648e abstractC17648e) {
        this.f34849e = abstractC17648e;
    }

    @Override // java.security.SecureRandomSpi
    public final byte[] engineGenerateSeed(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // java.security.SecureRandomSpi
    public final void engineNextBytes(byte[] bArr) {
        if (bArr.length == 0) {
            return;
        }
        this.f34849e.metrica(bArr);
    }

    @Override // java.security.SecureRandomSpi
    public final void engineSetSeed(byte[] bArr) {
        throw new UnsupportedOperationException();
    }
}
