package defpackage;

import java.security.spec.KeySpec;

/* renamed from: eٖؗۗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4928e implements KeySpec {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final C10373e f10427e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final byte[] f10428e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final boolean f10429e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final byte[] f10430e;

    public C4928e(C10373e c10373e, byte[] bArr) {
        if (bArr.length != 32) {
            throw new IllegalArgumentException("incorrect length for seed");
        }
        this.f10429e = true;
        this.f10427e = c10373e;
        this.f10430e = AbstractC12442e.license(bArr);
        this.f10428e = null;
    }

    public C4928e(C10373e c10373e, byte[] bArr, byte[] bArr2) {
        this.f10429e = false;
        this.f10427e = c10373e;
        this.f10430e = AbstractC12442e.license(bArr);
        this.f10428e = AbstractC12442e.license(bArr2);
    }
}
