package defpackage;

import android.media.MediaCodec;
import android.os.Build;
import android.os.Bundle;
import android.os.HandlerThread;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eُؒؑ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0986e implements InterfaceC11483e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final C12594e f3423e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public HandlerC17797e f3424e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final HandlerThread f3425e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final AtomicReference f3426e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final MediaCodec f3427e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public boolean f3428e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public static final ArrayDeque f3422e = new ArrayDeque();

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public static final Object f3421e = new Object();

    public C0986e(MediaCodec mediaCodec, HandlerThread handlerThread) {
        C12594e c12594e = new C12594e();
        this.f3427e = mediaCodec;
        this.f3425e = handlerThread;
        this.f3423e = c12594e;
        this.f3426e = new AtomicReference();
    }

    public static void license(C8666e c8666e) {
        ArrayDeque arrayDeque = f3422e;
        synchronized (arrayDeque) {
            arrayDeque.add(c8666e);
        }
    }

    public static C8666e metrica() {
        ArrayDeque arrayDeque = f3422e;
        synchronized (arrayDeque) {
            try {
                if (arrayDeque.isEmpty()) {
                    return new C8666e();
                }
                return (C8666e) arrayDeque.removeFirst();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.InterfaceC11483e
    public final void ad(Bundle bundle) {
        pro();
        HandlerC17797e handlerC17797e = this.f3424e;
        String str = AbstractC9413e.ad;
        handlerC17797e.obtainMessage(4, bundle).sendToTarget();
    }

    @Override // defpackage.InterfaceC11483e
    public final void flush() {
        if (this.f3428e) {
            try {
                HandlerC17797e handlerC17797e = this.f3424e;
                handlerC17797e.getClass();
                handlerC17797e.removeCallbacksAndMessages(null);
                C12594e c12594e = this.f3423e;
                synchronized (c12594e) {
                    c12594e.vip = false;
                }
                HandlerC17797e handlerC17797e2 = this.f3424e;
                handlerC17797e2.getClass();
                handlerC17797e2.obtainMessage(3).sendToTarget();
                c12594e.ad();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                throw new IllegalStateException(e);
            }
        }
    }

    @Override // defpackage.InterfaceC11483e
    public final void pro() {
        RuntimeException runtimeException = (RuntimeException) this.f3426e.getAndSet(null);
        if (runtimeException != null) {
            throw runtimeException;
        }
    }

    @Override // defpackage.InterfaceC11483e
    public final void purchase(int i, int i2, int i3, long j) {
        pro();
        C8666e metrica = metrica();
        metrica.ad = i;
        metrica.vip = i2;
        metrica.license = j;
        metrica.appmetrica = i3;
        HandlerC17797e handlerC17797e = this.f3424e;
        String str = AbstractC9413e.ad;
        handlerC17797e.obtainMessage(1, metrica).sendToTarget();
    }

    @Override // defpackage.InterfaceC11483e
    public final void shutdown() {
        if (this.f3428e) {
            flush();
            this.f3425e.quit();
        }
        this.f3428e = false;
    }

    @Override // defpackage.InterfaceC11483e
    public final void start() {
        if (this.f3428e) {
            return;
        }
        HandlerThread handlerThread = this.f3425e;
        handlerThread.start();
        this.f3424e = new HandlerC17797e(this, handlerThread.getLooper(), 0);
        this.f3428e = true;
    }

    @Override // defpackage.InterfaceC11483e
    public final void vip(int i, C0579e c0579e, long j, int i2) {
        pro();
        C8666e metrica = metrica();
        metrica.ad = i;
        metrica.vip = 0;
        metrica.license = j;
        metrica.appmetrica = i2;
        MediaCodec.CryptoInfo cryptoInfo = metrica.metrica;
        cryptoInfo.numSubSamples = c0579e.purchase;
        int[] iArr = c0579e.license;
        int[] iArr2 = cryptoInfo.numBytesOfClearData;
        if (iArr != null) {
            if (iArr2 == null || iArr2.length < iArr.length) {
                iArr2 = Arrays.copyOf(iArr, iArr.length);
            } else {
                System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
            }
        }
        cryptoInfo.numBytesOfClearData = iArr2;
        int[] iArr3 = c0579e.appmetrica;
        int[] iArr4 = cryptoInfo.numBytesOfEncryptedData;
        if (iArr3 != null) {
            if (iArr4 == null || iArr4.length < iArr3.length) {
                iArr4 = Arrays.copyOf(iArr3, iArr3.length);
            } else {
                System.arraycopy(iArr3, 0, iArr4, 0, iArr3.length);
            }
        }
        cryptoInfo.numBytesOfEncryptedData = iArr4;
        byte[] bArr = c0579e.vip;
        byte[] bArr2 = cryptoInfo.key;
        if (bArr != null) {
            if (bArr2 == null || bArr2.length < bArr.length) {
                bArr2 = Arrays.copyOf(bArr, bArr.length);
            } else {
                System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
            }
        }
        bArr2.getClass();
        cryptoInfo.key = bArr2;
        byte[] bArr3 = c0579e.ad;
        byte[] bArr4 = cryptoInfo.iv;
        if (bArr3 != null) {
            if (bArr4 == null || bArr4.length < bArr3.length) {
                bArr4 = Arrays.copyOf(bArr3, bArr3.length);
            } else {
                System.arraycopy(bArr3, 0, bArr4, 0, bArr3.length);
            }
        }
        bArr4.getClass();
        cryptoInfo.iv = bArr4;
        cryptoInfo.mode = c0579e.metrica;
        if (Build.VERSION.SDK_INT >= 24) {
            cryptoInfo.setPattern(new MediaCodec.CryptoInfo.Pattern(c0579e.billing, c0579e.yandex));
        }
        HandlerC17797e handlerC17797e = this.f3424e;
        String str = AbstractC9413e.ad;
        handlerC17797e.obtainMessage(2, metrica).sendToTarget();
    }
}
