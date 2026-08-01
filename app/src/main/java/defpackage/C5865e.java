package defpackage;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.view.Surface;
import java.nio.ByteBuffer;
import java.util.ArrayList;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘۘ۠, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5865e implements InterfaceC5827e {
    public final MediaCodec ad;
    public final C2559e vip;

    public C5865e(MediaCodec mediaCodec, C2559e c2559e) {
        this.ad = mediaCodec;
        this.vip = c2559e;
        if (Build.VERSION.SDK_INT < 35 || c2559e == null) {
            return;
        }
        c2559e.ad(mediaCodec);
    }

    @Override // defpackage.InterfaceC5827e
    public final ByteBuffer Signature(int i) {
        return this.ad.getInputBuffer(i);
    }

    @Override // defpackage.InterfaceC5827e
    public final void ad(Bundle bundle) {
        this.ad.setParameters(bundle);
    }

    @Override // defpackage.InterfaceC5827e
    public final /* synthetic */ boolean adcel(C7988e c7988e) {
        return false;
    }

    @Override // defpackage.InterfaceC5827e
    public final void admob(Surface surface) {
        this.ad.setOutputSurface(surface);
    }

    @Override // defpackage.InterfaceC5827e
    public final void advert(int i, long j) {
        this.ad.releaseOutputBuffer(i, j);
    }

    @Override // defpackage.InterfaceC5827e
    public final int amazon(MediaCodec.BufferInfo bufferInfo) {
        int dequeueOutputBuffer;
        do {
            dequeueOutputBuffer = this.ad.dequeueOutputBuffer(bufferInfo, 0L);
        } while (dequeueOutputBuffer == -3);
        return dequeueOutputBuffer;
    }

    @Override // defpackage.InterfaceC5827e
    public final void billing(int i) {
        this.ad.releaseOutputBuffer(i, false);
    }

    @Override // defpackage.InterfaceC5827e
    public final void flush() {
        this.ad.flush();
    }

    @Override // defpackage.InterfaceC5827e
    public final void loadAd(int i) {
        this.ad.setVideoScalingMode(i);
    }

    @Override // defpackage.InterfaceC5827e
    public final void mopub() {
        this.ad.detachOutputSurface();
    }

    @Override // defpackage.InterfaceC5827e
    public final void pro(C6321e c6321e, Handler handler) {
        this.ad.setOnFrameRenderedListener(new C4331e(this, c6321e, 1), handler);
    }

    @Override // defpackage.InterfaceC5827e
    public final void purchase(int i, int i2, int i3, long j) {
        this.ad.queueInputBuffer(i, 0, i2, j, i3);
    }

    @Override // defpackage.InterfaceC5827e
    public final void release() {
        C2559e c2559e = this.vip;
        MediaCodec mediaCodec = this.ad;
        try {
            int i = Build.VERSION.SDK_INT;
            if (i >= 30 && i < 33) {
                mediaCodec.stop();
            }
            if (i >= 35 && c2559e != null) {
                c2559e.metrica(mediaCodec);
            }
            mediaCodec.release();
        } catch (Throwable th) {
            if (Build.VERSION.SDK_INT >= 35 && c2559e != null) {
                c2559e.metrica(mediaCodec);
            }
            mediaCodec.release();
            throw th;
        }
    }

    @Override // defpackage.InterfaceC5827e
    public final void remoteconfig(ArrayList arrayList) {
        this.ad.subscribeToVendorParameters(arrayList);
    }

    @Override // defpackage.InterfaceC5827e
    public final void signatures(ArrayList arrayList) {
        this.ad.unsubscribeFromVendorParameters(arrayList);
    }

    @Override // defpackage.InterfaceC5827e
    public final int smaato() {
        return this.ad.dequeueInputBuffer(0L);
    }

    @Override // defpackage.InterfaceC5827e
    public final MediaFormat startapp() {
        return this.ad.getOutputFormat();
    }

    @Override // defpackage.InterfaceC5827e
    public final ByteBuffer subscription(int i) {
        return this.ad.getOutputBuffer(i);
    }

    @Override // defpackage.InterfaceC5827e
    public final void vip(int i, C0579e c0579e, long j, int i2) {
        this.ad.queueSecureInputBuffer(i, 0, c0579e.startapp, j, i2);
    }

    @Override // defpackage.InterfaceC5827e
    public final void yandex(RunnableC7410e runnableC7410e) {
        runnableC7410e.run();
    }
}
