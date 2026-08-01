package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;
import javax.security.auth.Destroyable;

/* renamed from: eٖٓۨ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C16198e implements Destroyable {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final byte[] f31812e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final byte[] f31813e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final AtomicBoolean f31814e = new AtomicBoolean(false);

    public C16198e(byte[] bArr, byte[] bArr2) {
        this.f31813e = bArr;
        this.f31812e = bArr2;
    }

    public final byte[] ad() {
        byte[] license = AbstractC12442e.license(this.f31812e);
        if (this.f31814e.get()) {
            throw new IllegalStateException("data has been destroyed");
        }
        return license;
    }

    @Override // javax.security.auth.Destroyable
    public final void destroy() {
        if (this.f31814e.getAndSet(true)) {
            return;
        }
        AbstractC12442e.metrica(this.f31813e);
        AbstractC12442e.metrica(this.f31812e);
    }

    @Override // javax.security.auth.Destroyable
    public final boolean isDestroyed() {
        return this.f31814e.get();
    }

    public final byte[] vip() {
        byte[] license = AbstractC12442e.license(this.f31813e);
        if (this.f31814e.get()) {
            throw new IllegalStateException("data has been destroyed");
        }
        return license;
    }
}
