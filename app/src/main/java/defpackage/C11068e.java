package defpackage;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.util.Range;
import androidx.camera.video.internal.compat.quirk.AudioEncoderIgnoresInputTimestampQuirk;
import androidx.camera.video.internal.compat.quirk.CameraUseInconsistentTimebaseQuirk;
import androidx.camera.video.internal.compat.quirk.CodecStuckOnFlushQuirk;
import androidx.camera.video.internal.compat.quirk.VideoEncoderSuspendDoesNotIncludeSuspendTimeQuirk;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Objects;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledFuture;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eُ٘۠, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11068e extends MediaCodec.Callback {
    public final C4201e ad;
    public final /* synthetic */ C18405e advert;
    public boolean mopub;
    public final boolean vip;
    public boolean metrica = false;
    public boolean license = false;
    public boolean appmetrica = false;
    public long purchase = 0;
    public long billing = 0;
    public boolean yandex = false;
    public boolean startapp = false;
    public boolean adcel = false;

    public C11068e(C18405e c18405e) {
        this.advert = c18405e;
        this.vip = true;
        boolean z = c18405e.metrica;
        this.mopub = z;
        if (z) {
            this.ad = new C4201e(c18405e.admob, c18405e.Signature, (CameraUseInconsistentTimebaseQuirk) AbstractC12904e.ad.vip(CameraUseInconsistentTimebaseQuirk.class));
        } else {
            this.ad = null;
        }
        if (((CodecStuckOnFlushQuirk) AbstractC12904e.ad.vip(CodecStuckOnFlushQuirk.class)) == null || !"video/mp4v-es".equals(c18405e.license.getString("mime"))) {
            return;
        }
        this.vip = false;
    }

    public final boolean ad(MediaCodec.BufferInfo bufferInfo) {
        boolean z;
        Executor executor;
        InterfaceC14812e interfaceC14812e;
        if (this.appmetrica) {
            AbstractC9464e.yandex(this.advert.ad, "Drop buffer by already reach end of stream.");
            return false;
        }
        if (bufferInfo.size <= 0) {
            AbstractC9464e.yandex(this.advert.ad, "Drop buffer by invalid buffer size.");
            return false;
        }
        if ((bufferInfo.flags & 2) != 0) {
            AbstractC9464e.yandex(this.advert.ad, "Drop buffer by codec config.");
            return false;
        }
        C4201e c4201e = this.ad;
        if (c4201e != null) {
            bufferInfo.presentationTimeUs = c4201e.ad(bufferInfo.presentationTimeUs);
        }
        long j = bufferInfo.presentationTimeUs;
        if (j <= this.purchase) {
            AbstractC9464e.yandex(this.advert.ad, "Drop buffer by out of order buffer from MediaCodec.");
            return false;
        }
        this.purchase = j;
        if (this.advert.tapsense.contains((Range) Long.valueOf(j))) {
            C18405e c18405e = this.advert;
            long j2 = bufferInfo.presentationTimeUs;
            ArrayDeque arrayDeque = c18405e.loadAd;
            while (!arrayDeque.isEmpty()) {
                Range range = (Range) arrayDeque.getFirst();
                if (j2 <= ((Long) range.getUpper()).longValue()) {
                    break;
                }
                arrayDeque.removeFirst();
                long longValue = (((Long) range.getUpper()).longValue() - ((Long) range.getLower()).longValue()) + c18405e.isVip;
                c18405e.isVip = longValue;
                AbstractC9464e.yandex(c18405e.ad, "Total paused duration = ".concat(AbstractC9476e.advert(longValue)));
            }
            C18405e c18405e2 = this.advert;
            long j3 = bufferInfo.presentationTimeUs;
            Iterator it = c18405e2.loadAd.iterator();
            while (it.hasNext()) {
                Range range2 = (Range) it.next();
                if (range2.contains((Range) Long.valueOf(j3))) {
                    z = true;
                    break;
                }
                if (j3 < ((Long) range2.getLower()).longValue()) {
                    break;
                }
            }
            z = false;
            boolean z2 = this.yandex;
            if (!z2 && z) {
                AbstractC9464e.yandex(this.advert.ad, "Switch to pause state");
                this.yandex = true;
                synchronized (this.advert.vip) {
                    C18405e c18405e3 = this.advert;
                    executor = c18405e3.signatures;
                    interfaceC14812e = c18405e3.pro;
                }
                Objects.requireNonNull(interfaceC14812e);
                executor.execute(new RunnableC8029e(interfaceC14812e, 0));
                C18405e c18405e4 = this.advert;
                if (c18405e4.f36090class == 3 && ((c18405e4.metrica || AbstractC12904e.ad.vip(AudioEncoderIgnoresInputTimestampQuirk.class) == null) && (!this.advert.metrica || AbstractC12904e.ad.vip(VideoEncoderSuspendDoesNotIncludeSuspendTimeQuirk.class) == null))) {
                    InterfaceC17421e interfaceC17421e = this.advert.purchase;
                    if (interfaceC17421e instanceof C9396e) {
                        ((C9396e) interfaceC17421e).ad(false);
                    }
                    this.advert.billing(true);
                }
                this.advert.isPro = Long.valueOf(bufferInfo.presentationTimeUs);
                C18405e c18405e5 = this.advert;
                if (c18405e5.inmobi) {
                    ScheduledFuture scheduledFuture = c18405e5.applovin;
                    if (scheduledFuture != null) {
                        scheduledFuture.cancel(true);
                    }
                    this.advert.startapp();
                    this.advert.inmobi = false;
                }
            } else if (z2 && !z) {
                AbstractC9464e.yandex(this.advert.ad, "Switch to resume state");
                this.yandex = false;
                if (this.advert.metrica && (bufferInfo.flags & 1) == 0) {
                    this.startapp = true;
                }
            }
            if (this.yandex) {
                AbstractC9464e.yandex(this.advert.ad, "Drop buffer by pause.");
                return false;
            }
            C18405e c18405e6 = this.advert;
            long j4 = c18405e6.isVip;
            if ((j4 > 0 ? bufferInfo.presentationTimeUs - j4 : bufferInfo.presentationTimeUs) > this.billing) {
                if (!this.license && !this.startapp && c18405e6.metrica) {
                    this.startapp = true;
                }
                if (!this.startapp) {
                    return true;
                }
                if ((bufferInfo.flags & 1) != 0) {
                    this.startapp = false;
                    return true;
                }
                AbstractC9464e.yandex(c18405e6.ad, "Drop buffer by not a key frame.");
                this.advert.appmetrica();
                return false;
            }
            AbstractC9464e.yandex(c18405e6.ad, "Drop buffer by adjusted time is less than the last sent time.");
            if (this.advert.metrica && (bufferInfo.flags & 1) != 0) {
                this.startapp = true;
            }
        } else {
            AbstractC9464e.yandex(this.advert.ad, "Drop buffer by not in start-stop range.");
            C18405e c18405e7 = this.advert;
            if (c18405e7.inmobi && bufferInfo.presentationTimeUs >= ((Long) c18405e7.tapsense.getUpper()).longValue()) {
                ScheduledFuture scheduledFuture2 = this.advert.applovin;
                if (scheduledFuture2 != null) {
                    scheduledFuture2.cancel(true);
                }
                this.advert.isPro = Long.valueOf(bufferInfo.presentationTimeUs);
                this.advert.startapp();
                this.advert.inmobi = false;
                return false;
            }
        }
        return false;
    }

    public final void metrica(C7967e c7967e, InterfaceC14812e interfaceC14812e, Executor executor) {
        C18405e c18405e = this.advert;
        c18405e.amazon.add(c7967e);
        ListenableFuture smaato = AbstractC15792e.smaato(c7967e.f16140e);
        C16911e c16911e = new C16911e(this, c7967e);
        smaato.ad(new RunnableC17144e(smaato, c16911e, 0), c18405e.yandex);
        try {
            executor.execute(new RunnableC2623e(interfaceC14812e, c7967e, 19));
        } catch (RejectedExecutionException e) {
            AbstractC9464e.mopub(c18405e.ad, "Unable to post to the supplied executor.", e);
            c7967e.close();
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onError(MediaCodec mediaCodec, MediaCodec.CodecException codecException) {
        this.advert.yandex.execute(new RunnableC2623e(this, codecException, 17));
    }

    @Override // android.media.MediaCodec.Callback
    public final void onInputBufferAvailable(MediaCodec mediaCodec, int i) {
        this.advert.yandex.execute(new RunnableC9766e(this, i, 5));
    }

    @Override // android.media.MediaCodec.Callback
    public final void onOutputBufferAvailable(MediaCodec mediaCodec, int i, MediaCodec.BufferInfo bufferInfo) {
        this.advert.yandex.execute(new RunnableC1459e(this, bufferInfo, mediaCodec, i));
    }

    @Override // android.media.MediaCodec.Callback
    public final void onOutputFormatChanged(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        C18405e c18405e = this.advert;
        String str = c18405e.ad;
        StringBuilder sb = new StringBuilder("onOutputFormatChanged: mediaFormat = ");
        sb.append(mediaFormat);
        sb.append(", CSD data = ");
        StringBuilder sb2 = new StringBuilder("{csd-0 = ");
        sb2.append(AbstractC9476e.billing(mediaFormat.getByteBuffer("csd-0")));
        if (mediaFormat.containsKey("csd-1")) {
            sb2.append(", csd-1 = ");
            sb2.append(AbstractC9476e.billing(mediaFormat.getByteBuffer("csd-1")));
        }
        if (mediaFormat.containsKey("csd-2")) {
            sb2.append(", csd-2 = ");
            sb2.append(AbstractC9476e.billing(mediaFormat.getByteBuffer("csd-2")));
        }
        sb2.append("}");
        sb.append(sb2.toString());
        AbstractC9464e.yandex(str, sb.toString());
        c18405e.yandex.execute(new RunnableC2623e(this, mediaFormat, 18));
    }

    public final void vip() {
        C18405e c18405e;
        InterfaceC14812e interfaceC14812e;
        Executor executor;
        AbstractC9464e.yandex(this.advert.ad, "reachEndData");
        if (this.appmetrica) {
            return;
        }
        this.appmetrica = true;
        ScheduledFuture scheduledFuture = this.advert.firebase;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
            this.advert.firebase = null;
        }
        synchronized (this.advert.vip) {
            c18405e = this.advert;
            interfaceC14812e = c18405e.pro;
            executor = c18405e.signatures;
        }
        c18405e.adcel(new RunnableC4904e(20, this, executor, interfaceC14812e));
    }
}
