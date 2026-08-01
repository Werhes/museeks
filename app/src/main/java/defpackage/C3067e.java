package defpackage;

import java.io.EOFException;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؕؑۗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3067e implements InterfaceC17430e {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final C12402e f7136e = new Object();

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public boolean f7137e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final C5694e f7138e;

    /* JADX WARN: Type inference failed for: r1v1, types: [eَّۙ, java.lang.Object] */
    public C3067e(C5694e c5694e) {
        this.f7138e = c5694e;
    }

    @Override // defpackage.InterfaceC17430e
    public final void admob(long j) {
        if (!request(j)) {
            throw new EOFException(AbstractC1634e.mopub(j, "Source doesn't contain required number of bytes (", ")."));
        }
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        if (this.f7137e) {
            return;
        }
        this.f7137e = true;
        this.f7138e.f12089e = true;
        C12402e c12402e = this.f7136e;
        c12402e.skip(c12402e.f24832e);
    }

    @Override // defpackage.InterfaceC17430e
    /* renamed from: eِؗؓ, reason: contains not printable characters */
    public final int mo1230e(int i, int i2, byte[] bArr) {
        AbstractC8913e.vip(bArr.length, i, i2);
        C12402e c12402e = this.f7136e;
        if (c12402e.f24832e == 0 && this.f7138e.mo805this(c12402e, 8192L) == -1) {
            return -1;
        }
        return c12402e.mo1230e(i, ((int) Math.min(i2 - i, c12402e.f24832e)) + i, bArr);
    }

    @Override // defpackage.InterfaceC17430e
    public final C12402e metrica() {
        return this.f7136e;
    }

    @Override // defpackage.InterfaceC17430e
    public final byte readByte() {
        admob(1L);
        return this.f7136e.readByte();
    }

    @Override // defpackage.InterfaceC17430e
    public final boolean request(long j) {
        C12402e c12402e;
        if (this.f7137e) {
            throw new IllegalStateException("Source is closed.");
        }
        if (j < 0) {
            throw new IllegalArgumentException(AbstractC0869e.isVip(j, "byteCount: ").toString());
        }
        do {
            c12402e = this.f7136e;
            if (c12402e.f24832e >= j) {
                return true;
            }
        } while (this.f7138e.mo805this(c12402e, 8192L) != -1);
        return false;
    }

    @Override // defpackage.InterfaceC6079e
    /* renamed from: this */
    public final long mo805this(C12402e c12402e, long j) {
        if (this.f7137e) {
            throw new IllegalStateException("Source is closed.");
        }
        if (j < 0) {
            throw new IllegalArgumentException(AbstractC0869e.isVip(j, "byteCount: ").toString());
        }
        C12402e c12402e2 = this.f7136e;
        if (c12402e2.f24832e == 0 && this.f7138e.mo805this(c12402e2, 8192L) == -1) {
            return -1L;
        }
        return c12402e2.mo805this(c12402e, Math.min(j, c12402e2.f24832e));
    }

    public final String toString() {
        return "buffered(" + this.f7138e + ')';
    }

    @Override // defpackage.InterfaceC17430e
    public final boolean yandex() {
        if (this.f7137e) {
            throw new IllegalStateException("Source is closed.");
        }
        C12402e c12402e = this.f7136e;
        return c12402e.yandex() && this.f7138e.mo805this(c12402e, 8192L) == -1;
    }
}
