package defpackage;

import java.security.spec.KeySpec;

/* renamed from: eٍۦۙ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C9911e implements KeySpec {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final C9236e f19549e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final byte[] f19550e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final boolean f19551e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final byte[] f19552e;

    public C9911e(C9236e c9236e, byte[] bArr) {
        if (bArr.length != 64) {
            throw new IllegalArgumentException("incorrect length for seed");
        }
        this.f19551e = true;
        this.f19549e = c9236e;
        this.f19552e = AbstractC12442e.license(bArr);
        this.f19550e = null;
    }

    public C9911e(C9236e c9236e, byte[] bArr, byte[] bArr2) {
        this.f19551e = false;
        this.f19549e = c9236e;
        this.f19552e = AbstractC12442e.license(bArr);
        this.f19550e = AbstractC12442e.license(bArr2);
    }
}
