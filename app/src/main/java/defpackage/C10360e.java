package defpackage;

import java.security.SecureRandom;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَٚٚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C10360e extends AbstractC17648e {

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final SecureRandom f20464e;

    public C10360e(SecureRandom secureRandom) {
        this.f20464e = secureRandom;
    }

    @Override // defpackage.AbstractC15440e
    public final int ad(int i) {
        return ((-i) >> 31) & (this.f20464e.nextInt() >>> (32 - i));
    }

    @Override // defpackage.AbstractC15440e
    public final int license() {
        return this.f20464e.nextInt();
    }

    @Override // defpackage.AbstractC15440e
    public final byte[] metrica(byte[] bArr) {
        if (bArr.length == 0) {
            return bArr;
        }
        this.f20464e.nextBytes(bArr);
        return bArr;
    }

    @Override // defpackage.AbstractC15440e
    public final long purchase() {
        return this.f20464e.nextLong();
    }
}
