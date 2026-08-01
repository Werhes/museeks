package defpackage;

import java.io.Serializable;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًؓٚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1909e extends AbstractC15440e implements Serializable {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public int f5090e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public int f5091e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public int f5092e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public int f5093e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public int f5094e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public int f5095e;

    public C1909e(int i, int i2) {
        int i3 = ~i;
        this.f5092e = i;
        this.f5091e = i2;
        this.f5093e = 0;
        this.f5090e = 0;
        this.f5095e = i3;
        this.f5094e = (i << 10) ^ (i2 >>> 4);
        if ((i | i2 | i3) == 0) {
            throw new IllegalArgumentException("Initial state must have at least one non-zero element.");
        }
        for (int i4 = 0; i4 < 64; i4++) {
            license();
        }
    }

    @Override // defpackage.AbstractC15440e
    public final int ad(int i) {
        return ((-i) >> 31) & (license() >>> (32 - i));
    }

    @Override // defpackage.AbstractC15440e
    public final int license() {
        int i = this.f5092e;
        int i2 = i ^ (i >>> 2);
        this.f5092e = this.f5091e;
        this.f5091e = this.f5093e;
        this.f5093e = this.f5090e;
        int i3 = this.f5095e;
        this.f5090e = i3;
        int i4 = ((i2 ^ (i2 << 1)) ^ i3) ^ (i3 << 4);
        this.f5095e = i4;
        int i5 = this.f5094e + 362437;
        this.f5094e = i5;
        return i4 + i5;
    }
}
