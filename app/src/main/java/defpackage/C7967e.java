package defpackage;

import android.media.MediaCodec;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًٖٜ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7967e implements AutoCloseable {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final C7169e f16137e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final int f16138e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final MediaCodec.BufferInfo f16139e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final C9689e f16140e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final MediaCodec f16141e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final AtomicBoolean f16142e = new AtomicBoolean(false);

    public C7967e(MediaCodec mediaCodec, int i, MediaCodec.BufferInfo bufferInfo) {
        mediaCodec.getClass();
        this.f16141e = mediaCodec;
        this.f16138e = i;
        mediaCodec.getOutputBuffer(i);
        this.f16139e = bufferInfo;
        AtomicReference atomicReference = new AtomicReference();
        this.f16140e = AbstractC5750e.purchase(new C17678e(atomicReference, 0));
        C7169e c7169e = (C7169e) atomicReference.get();
        c7169e.getClass();
        this.f16137e = c7169e;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        C7169e c7169e = this.f16137e;
        if (this.f16142e.getAndSet(true)) {
            return;
        }
        try {
            this.f16141e.releaseOutputBuffer(this.f16138e, false);
            c7169e.ad(null);
        } catch (IllegalStateException e) {
            c7169e.metrica(e);
        }
    }

    public final long size() {
        return this.f16139e.size;
    }
}
