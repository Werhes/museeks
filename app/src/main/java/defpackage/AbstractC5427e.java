package defpackage;

import java.util.Random;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘؖؑ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC5427e extends AbstractC15440e {
    @Override // defpackage.AbstractC15440e
    public final int ad(int i) {
        return ((-i) >> 31) & (startapp().nextInt() >>> (32 - i));
    }

    public final int adcel(int i) {
        return startapp().nextInt(i);
    }

    @Override // defpackage.AbstractC15440e
    public final int license() {
        return startapp().nextInt();
    }

    @Override // defpackage.AbstractC15440e
    public final byte[] metrica(byte[] bArr) {
        startapp().nextBytes(bArr);
        return bArr;
    }

    @Override // defpackage.AbstractC15440e
    public final long purchase() {
        return startapp().nextLong();
    }

    public abstract Random startapp();
}
