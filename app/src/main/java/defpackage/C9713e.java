package defpackage;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.HandlerThread;
import java.util.ArrayDeque;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍْۙ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9713e extends MediaCodec.Callback {
    public MediaCodec.CodecException adcel;
    public long advert;
    public IllegalStateException amazon;
    public C7988e loadAd;
    public Handler metrica;
    public MediaCodec.CryptoException mopub;
    public boolean smaato;
    public MediaFormat startapp;
    public final HandlerThread vip;
    public MediaFormat yandex;
    public final Object ad = new Object();
    public final C11226e license = new C11226e((byte) 0, 0);
    public final C11226e appmetrica = new C11226e((byte) 0, 0);
    public final ArrayDeque purchase = new ArrayDeque();
    public final ArrayDeque billing = new ArrayDeque();

    public C9713e(HandlerThread handlerThread) {
        this.vip = handlerThread;
    }

    public final void ad() {
        ArrayDeque arrayDeque = this.billing;
        if (!arrayDeque.isEmpty()) {
            this.startapp = (MediaFormat) arrayDeque.getLast();
        }
        C11226e c11226e = this.license;
        c11226e.metrica = c11226e.vip;
        C11226e c11226e2 = this.appmetrica;
        c11226e2.metrica = c11226e2.vip;
        this.purchase.clear();
        arrayDeque.clear();
    }

    public final void metrica(IllegalStateException illegalStateException) {
        synchronized (this.ad) {
            this.amazon = illegalStateException;
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onCryptoError(MediaCodec mediaCodec, MediaCodec.CryptoException cryptoException) {
        synchronized (this.ad) {
            this.mopub = cryptoException;
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onError(MediaCodec mediaCodec, MediaCodec.CodecException codecException) {
        synchronized (this.ad) {
            this.adcel = codecException;
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onInputBufferAvailable(MediaCodec mediaCodec, int i) {
        C14805e c14805e;
        synchronized (this.ad) {
            this.license.vip(i);
            C7988e c7988e = this.loadAd;
            if (c7988e != null && (c14805e = ((AbstractC17844e) c7988e.f16176e).f35009e) != null) {
                c14805e.ad();
            }
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onOutputBufferAvailable(MediaCodec mediaCodec, int i, MediaCodec.BufferInfo bufferInfo) {
        C14805e c14805e;
        synchronized (this.ad) {
            try {
                MediaFormat mediaFormat = this.startapp;
                if (mediaFormat != null) {
                    this.appmetrica.vip(-2);
                    this.billing.add(mediaFormat);
                    this.startapp = null;
                }
                this.appmetrica.vip(i);
                this.purchase.add(bufferInfo);
                C7988e c7988e = this.loadAd;
                if (c7988e != null && (c14805e = ((AbstractC17844e) c7988e.f16176e).f35009e) != null) {
                    c14805e.ad();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onOutputFormatChanged(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        synchronized (this.ad) {
            this.appmetrica.vip(-2);
            this.billing.add(mediaFormat);
            this.startapp = null;
        }
    }

    public final void vip() {
        IllegalStateException illegalStateException = this.amazon;
        if (illegalStateException != null) {
            this.amazon = null;
            throw illegalStateException;
        }
        MediaCodec.CodecException codecException = this.adcel;
        if (codecException != null) {
            this.adcel = null;
            throw codecException;
        }
        MediaCodec.CryptoException cryptoException = this.mopub;
        if (cryptoException == null) {
            return;
        }
        this.mopub = null;
        throw cryptoException;
    }
}
