package defpackage;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Trace;
import android.view.Surface;
import java.nio.ByteBuffer;
import java.util.ArrayList;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَٜؔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10382e implements InterfaceC5827e {
    public final MediaCodec ad;
    public boolean appmetrica;
    public final C2559e license;
    public final InterfaceC11483e metrica;
    public int purchase = 0;
    public final C9713e vip;

    public C10382e(MediaCodec mediaCodec, HandlerThread handlerThread, InterfaceC11483e interfaceC11483e, C2559e c2559e) {
        this.ad = mediaCodec;
        this.vip = new C9713e(handlerThread);
        this.metrica = interfaceC11483e;
        this.license = c2559e;
    }

    public static String license(int i, String str) {
        StringBuilder sb = new StringBuilder(str);
        if (i == 1) {
            sb.append("Audio");
        } else if (i == 2) {
            sb.append("Video");
        } else {
            sb.append("Unknown(");
            sb.append(i);
            sb.append(")");
        }
        return sb.toString();
    }

    public static void metrica(C10382e c10382e, MediaFormat mediaFormat, Surface surface, MediaCrypto mediaCrypto, int i) {
        C2559e c2559e;
        C9713e c9713e = c10382e.vip;
        MediaCodec mediaCodec = c10382e.ad;
        HandlerThread handlerThread = c9713e.vip;
        AbstractC2301e.subscription(c9713e.metrica == null);
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper());
        mediaCodec.setCallback(c9713e, handler);
        c9713e.metrica = handler;
        Trace.beginSection("configureCodec");
        mediaCodec.configure(mediaFormat, surface, mediaCrypto, i);
        Trace.endSection();
        c10382e.metrica.start();
        Trace.beginSection("startCodec");
        mediaCodec.start();
        Trace.endSection();
        if (Build.VERSION.SDK_INT >= 35 && (c2559e = c10382e.license) != null) {
            c2559e.ad(mediaCodec);
        }
        c10382e.purchase = 1;
    }

    @Override // defpackage.InterfaceC5827e
    public final ByteBuffer Signature(int i) {
        return this.ad.getInputBuffer(i);
    }

    @Override // defpackage.InterfaceC5827e
    public final void ad(Bundle bundle) {
        this.metrica.ad(bundle);
    }

    @Override // defpackage.InterfaceC5827e
    public final boolean adcel(C7988e c7988e) {
        C9713e c9713e = this.vip;
        synchronized (c9713e.ad) {
            c9713e.loadAd = c7988e;
        }
        return true;
    }

    @Override // defpackage.InterfaceC5827e
    public final void admob(Surface surface) {
        this.ad.setOutputSurface(surface);
    }

    @Override // defpackage.InterfaceC5827e
    public final void advert(int i, long j) {
        this.ad.releaseOutputBuffer(i, j);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0022 A[Catch: all -> 0x0024, DONT_GENERATE, TryCatch #0 {all -> 0x0024, blocks: (B:4:0x000a, B:6:0x0017, B:12:0x0022, B:15:0x0027, B:19:0x0032, B:22:0x0036, B:24:0x0044, B:25:0x006b, B:29:0x0061, B:30:0x006d, B:31:0x0072), top: B:3:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0027 A[Catch: all -> 0x0024, TryCatch #0 {all -> 0x0024, blocks: (B:4:0x000a, B:6:0x0017, B:12:0x0022, B:15:0x0027, B:19:0x0032, B:22:0x0036, B:24:0x0044, B:25:0x006b, B:29:0x0061, B:30:0x006d, B:31:0x0072), top: B:3:0x000a }] */
    @Override // defpackage.InterfaceC5827e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int amazon(android.media.MediaCodec.BufferInfo r11) {
        /*
            r10 = this;
            eِؓۚ r0 = r10.metrica
            r0.pro()
            eٍْۙ r0 = r10.vip
            java.lang.Object r1 = r0.ad
            monitor-enter(r1)
            r0.vip()     // Catch: java.lang.Throwable -> L24
            long r2 = r0.advert     // Catch: java.lang.Throwable -> L24
            r4 = 0
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            r3 = 0
            r4 = 1
            if (r2 > 0) goto L1e
            boolean r2 = r0.smaato     // Catch: java.lang.Throwable -> L24
            if (r2 == 0) goto L1c
            goto L1e
        L1c:
            r2 = r3
            goto L1f
        L1e:
            r2 = r4
        L1f:
            r5 = -1
            if (r2 == 0) goto L27
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L24
            return r5
        L24:
            r0 = move-exception
            r11 = r0
            goto L73
        L27:
            eُؙۙ r2 = r0.appmetrica     // Catch: java.lang.Throwable -> L24
            int r6 = r2.vip     // Catch: java.lang.Throwable -> L24
            int r7 = r2.metrica     // Catch: java.lang.Throwable -> L24
            if (r6 != r7) goto L30
            r3 = r4
        L30:
            if (r3 == 0) goto L34
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L24
            return r5
        L34:
            if (r6 == r7) goto L6d
            java.lang.Object r3 = r2.appmetrica     // Catch: java.lang.Throwable -> L24
            int[] r3 = (int[]) r3     // Catch: java.lang.Throwable -> L24
            r3 = r3[r6]     // Catch: java.lang.Throwable -> L24
            int r6 = r6 + r4
            int r4 = r2.license     // Catch: java.lang.Throwable -> L24
            r4 = r4 & r6
            r2.vip = r4     // Catch: java.lang.Throwable -> L24
            if (r3 < 0) goto L5e
            android.media.MediaFormat r2 = r0.yandex     // Catch: java.lang.Throwable -> L24
            r2.getClass()     // Catch: java.lang.Throwable -> L24
            java.util.ArrayDeque r0 = r0.purchase     // Catch: java.lang.Throwable -> L24
            java.lang.Object r0 = r0.remove()     // Catch: java.lang.Throwable -> L24
            android.media.MediaCodec$BufferInfo r0 = (android.media.MediaCodec.BufferInfo) r0     // Catch: java.lang.Throwable -> L24
            int r5 = r0.offset     // Catch: java.lang.Throwable -> L24
            int r6 = r0.size     // Catch: java.lang.Throwable -> L24
            long r7 = r0.presentationTimeUs     // Catch: java.lang.Throwable -> L24
            int r9 = r0.flags     // Catch: java.lang.Throwable -> L24
            r4 = r11
            r4.set(r5, r6, r7, r9)     // Catch: java.lang.Throwable -> L24
            goto L6b
        L5e:
            r11 = -2
            if (r3 != r11) goto L6b
            java.util.ArrayDeque r11 = r0.billing     // Catch: java.lang.Throwable -> L24
            java.lang.Object r11 = r11.remove()     // Catch: java.lang.Throwable -> L24
            android.media.MediaFormat r11 = (android.media.MediaFormat) r11     // Catch: java.lang.Throwable -> L24
            r0.yandex = r11     // Catch: java.lang.Throwable -> L24
        L6b:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L24
            return r3
        L6d:
            java.lang.ArrayIndexOutOfBoundsException r11 = new java.lang.ArrayIndexOutOfBoundsException     // Catch: java.lang.Throwable -> L24
            r11.<init>()     // Catch: java.lang.Throwable -> L24
            throw r11     // Catch: java.lang.Throwable -> L24
        L73:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L24
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C10382e.amazon(android.media.MediaCodec$BufferInfo):int");
    }

    @Override // defpackage.InterfaceC5827e
    public final void billing(int i) {
        this.ad.releaseOutputBuffer(i, false);
    }

    @Override // defpackage.InterfaceC5827e
    public final void flush() {
        this.metrica.flush();
        this.ad.flush();
        C9713e c9713e = this.vip;
        synchronized (c9713e.ad) {
            c9713e.advert++;
            Handler handler = c9713e.metrica;
            String str = AbstractC9413e.ad;
            handler.post(new RunnableC17584e(6, c9713e));
        }
        this.ad.start();
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
        this.ad.setOnFrameRenderedListener(new C4331e(this, c6321e, 0), handler);
    }

    @Override // defpackage.InterfaceC5827e
    public final void purchase(int i, int i2, int i3, long j) {
        this.metrica.purchase(i, i2, i3, j);
    }

    @Override // defpackage.InterfaceC5827e
    public final void release() {
        C2559e c2559e;
        C2559e c2559e2;
        try {
            if (this.purchase == 1) {
                this.metrica.shutdown();
                C9713e c9713e = this.vip;
                synchronized (c9713e.ad) {
                    c9713e.smaato = true;
                    c9713e.vip.quit();
                    c9713e.ad();
                }
            }
            this.purchase = 2;
            if (this.appmetrica) {
                return;
            }
            try {
                int i = Build.VERSION.SDK_INT;
                if (i >= 30 && i < 33) {
                    this.ad.stop();
                }
                if (i >= 35 && (c2559e2 = this.license) != null) {
                    c2559e2.metrica(this.ad);
                }
                this.ad.release();
                this.appmetrica = true;
            } finally {
            }
        } catch (Throwable th) {
            if (!this.appmetrica) {
                try {
                    int i2 = Build.VERSION.SDK_INT;
                    if (i2 >= 30 && i2 < 33) {
                        this.ad.stop();
                    }
                    if (i2 >= 35 && (c2559e = this.license) != null) {
                        c2559e.metrica(this.ad);
                    }
                    this.ad.release();
                    this.appmetrica = true;
                } finally {
                }
            }
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

    /* JADX WARN: Removed duplicated region for block: B:12:0x0022 A[Catch: all -> 0x0024, DONT_GENERATE, TryCatch #0 {all -> 0x0024, blocks: (B:4:0x000a, B:6:0x0017, B:12:0x0022, B:15:0x0026, B:20:0x0040, B:23:0x0034, B:24:0x0042, B:25:0x0047), top: B:3:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0026 A[Catch: all -> 0x0024, TryCatch #0 {all -> 0x0024, blocks: (B:4:0x000a, B:6:0x0017, B:12:0x0022, B:15:0x0026, B:20:0x0040, B:23:0x0034, B:24:0x0042, B:25:0x0047), top: B:3:0x000a }] */
    @Override // defpackage.InterfaceC5827e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int smaato() {
        /*
            r7 = this;
            eِؓۚ r0 = r7.metrica
            r0.pro()
            eٍْۙ r0 = r7.vip
            java.lang.Object r1 = r0.ad
            monitor-enter(r1)
            r0.vip()     // Catch: java.lang.Throwable -> L24
            long r2 = r0.advert     // Catch: java.lang.Throwable -> L24
            r4 = 0
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            r3 = 0
            r4 = 1
            if (r2 > 0) goto L1e
            boolean r2 = r0.smaato     // Catch: java.lang.Throwable -> L24
            if (r2 == 0) goto L1c
            goto L1e
        L1c:
            r2 = r3
            goto L1f
        L1e:
            r2 = r4
        L1f:
            r5 = -1
            if (r2 == 0) goto L26
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L24
            return r5
        L24:
            r0 = move-exception
            goto L48
        L26:
            eُؙۙ r0 = r0.license     // Catch: java.lang.Throwable -> L24
            int r2 = r0.vip     // Catch: java.lang.Throwable -> L24
            int r6 = r0.metrica     // Catch: java.lang.Throwable -> L24
            if (r2 != r6) goto L2f
            r3 = r4
        L2f:
            if (r3 == 0) goto L32
            goto L40
        L32:
            if (r2 == r6) goto L42
            java.lang.Object r3 = r0.appmetrica     // Catch: java.lang.Throwable -> L24
            int[] r3 = (int[]) r3     // Catch: java.lang.Throwable -> L24
            r5 = r3[r2]     // Catch: java.lang.Throwable -> L24
            int r2 = r2 + r4
            int r3 = r0.license     // Catch: java.lang.Throwable -> L24
            r2 = r2 & r3
            r0.vip = r2     // Catch: java.lang.Throwable -> L24
        L40:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L24
            return r5
        L42:
            java.lang.ArrayIndexOutOfBoundsException r0 = new java.lang.ArrayIndexOutOfBoundsException     // Catch: java.lang.Throwable -> L24
            r0.<init>()     // Catch: java.lang.Throwable -> L24
            throw r0     // Catch: java.lang.Throwable -> L24
        L48:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L24
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C10382e.smaato():int");
    }

    @Override // defpackage.InterfaceC5827e
    public final MediaFormat startapp() {
        MediaFormat mediaFormat;
        C9713e c9713e = this.vip;
        synchronized (c9713e.ad) {
            try {
                mediaFormat = c9713e.yandex;
                if (mediaFormat == null) {
                    throw new IllegalStateException();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return mediaFormat;
    }

    @Override // defpackage.InterfaceC5827e
    public final ByteBuffer subscription(int i) {
        return this.ad.getOutputBuffer(i);
    }

    @Override // defpackage.InterfaceC5827e
    public final void vip(int i, C0579e c0579e, long j, int i2) {
        this.metrica.vip(i, c0579e, j, i2);
    }

    @Override // defpackage.InterfaceC5827e
    public final void yandex(RunnableC7410e runnableC7410e) {
        C9713e c9713e = this.vip;
        RunnableC16019e runnableC16019e = new RunnableC16019e(this, runnableC7410e, 5);
        synchronized (c9713e.ad) {
            c9713e.vip();
            runnableC16019e.run();
        }
    }
}
