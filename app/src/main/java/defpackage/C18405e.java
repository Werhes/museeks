package defpackage;

import android.media.MediaCodec;
import android.media.MediaCodecInfo;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.util.LruCache;
import android.util.Range;
import android.util.Rational;
import android.view.Surface;
import androidx.camera.video.internal.compat.quirk.GLProcessingStuckOnCodecFlushQuirk;
import androidx.camera.video.internal.compat.quirk.PreviewFreezeAfterHighSpeedRecordingQuirk;
import androidx.camera.video.internal.compat.quirk.SignalEosOutputBufferNotComeQuirk;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Objects;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eُ۠, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C18405e implements InterfaceC1664e {

    /* renamed from: interface, reason: not valid java name */
    public static final Range f36089interface = Range.create(Long.MAX_VALUE, Long.MAX_VALUE);
    public final EnumC14627e Signature;
    public final String ad;
    public final C7169e adcel;
    public final C18540e admob;
    public final MediaCodec appmetrica;
    public final Cpackage billing;

    /* renamed from: class, reason: not valid java name */
    public int f36090class;
    public ScheduledFuture firebase;
    public final MediaFormat license;
    public final boolean metrica;
    public final InterfaceC17421e purchase;
    public final boolean remoteconfig;
    public final ListenableFuture startapp;
    public final Rational subscription;
    public final ExecutorC12245e yandex;
    public final Object vip = new Object();
    public final ArrayDeque mopub = new ArrayDeque();
    public final ArrayDeque advert = new ArrayDeque();
    public final HashSet smaato = new HashSet();
    public final HashSet amazon = new HashSet();
    public final ArrayDeque loadAd = new ArrayDeque();
    public InterfaceC14812e pro = InterfaceC14812e.signatures;
    public Executor signatures = AbstractC3062e.billing();
    public Range tapsense = f36089interface;
    public long isVip = 0;
    public boolean inmobi = false;
    public Long isPro = null;
    public ScheduledFuture applovin = null;
    public C11068e ads = null;
    public boolean premium = false;
    public boolean subs = false;
    public boolean crashlytics = false;

    public C18405e(Executor executor, InterfaceC18449e interfaceC18449e, int i) {
        boolean z = false;
        executor.getClass();
        LruCache lruCache = AbstractC3785e.ad;
        try {
            MediaCodec createEncoderByType = MediaCodec.createEncoderByType(interfaceC18449e.metrica());
            this.appmetrica = createEncoderByType;
            MediaCodecInfo codecInfo = createEncoderByType.getCodecInfo();
            this.yandex = new ExecutorC12245e(executor);
            MediaFormat ad = interfaceC18449e.ad();
            this.license = ad;
            EnumC14627e vip = interfaceC18449e.vip();
            this.Signature = vip;
            this.admob = new C18540e(new C0211e(26, this), new C6173e(10), 18);
            if (interfaceC18449e instanceof AbstractC10726e) {
                this.ad = "AudioEncoder";
                this.metrica = false;
                this.purchase = new C9396e(this);
                Cpackage cpackage = new Cpackage(codecInfo, (String) null);
                ((MediaCodecInfo.CodecCapabilities) cpackage.f36443e).getAudioCapabilities();
                this.billing = cpackage;
                this.subscription = new Rational(0, 0);
            } else {
                if (!(interfaceC18449e instanceof C12488e)) {
                    throw new Exception("Unknown encoder config type");
                }
                C12488e c12488e = (C12488e) interfaceC18449e;
                this.ad = "VideoEncoder";
                this.metrica = true;
                this.purchase = new C1311e(this);
                C0597e c0597e = new C0597e(codecInfo, c12488e.ad);
                if (ad.containsKey("bitrate")) {
                    int integer = ad.getInteger("bitrate");
                    int intValue = c0597e.f2808e.getBitrateRange().clamp(Integer.valueOf(integer)).intValue();
                    if (integer != intValue) {
                        ad.setInteger("bitrate", intValue);
                        AbstractC9464e.yandex("VideoEncoder", "updated bitrate from " + integer + " to " + intValue);
                    }
                }
                this.billing = c0597e;
                this.subscription = new Rational(c12488e.billing, c12488e.yandex);
            }
            AbstractC9464e.yandex(this.ad, "mInputTimebase = " + vip);
            AbstractC9464e.yandex(this.ad, "mMediaFormat = " + ad);
            AbstractC9464e.yandex(this.ad, "mCaptureToEncodeFrameRateRatio = " + this.subscription);
            try {
                purchase();
                AtomicReference atomicReference = new AtomicReference();
                this.startapp = AbstractC15792e.smaato(AbstractC5750e.purchase(new C17678e(atomicReference, 2)));
                C7169e c7169e = (C7169e) atomicReference.get();
                c7169e.getClass();
                this.adcel = c7169e;
                if (this.metrica && ((i == 1 && AbstractC12904e.ad.vip(PreviewFreezeAfterHighSpeedRecordingQuirk.class) != null) || AbstractC12904e.ad.vip(GLProcessingStuckOnCodecFlushQuirk.class) != null)) {
                    z = true;
                }
                this.remoteconfig = z;
                yandex(1);
            } catch (MediaCodec.CodecException e) {
                throw new Exception(e);
            }
        } catch (IOException e2) {
            throw new Exception(e2);
        } catch (IllegalArgumentException e3) {
            throw new Exception(e3);
        }
    }

    public final void ad(int i, String str, Throwable th) {
        switch (AbstractC8703e.m2467class(this.f36090class)) {
            case 0:
                metrica(i, str, th);
                purchase();
                return;
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                yandex(8);
                adcel(new RunnableC1459e(i, 0, this, str, th));
                return;
            case 7:
                AbstractC9464e.pro(this.ad, "Get more than one error: " + str + "(" + i + ")", th);
                return;
            default:
                return;
        }
    }

    public final void adcel(Runnable runnable) {
        String str = this.ad;
        AbstractC9464e.yandex(str, "stopMediaCodec");
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = this.amazon;
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            arrayList.add(AbstractC15792e.smaato(((C7967e) it.next()).f16140e));
        }
        HashSet hashSet2 = this.smaato;
        Iterator it2 = hashSet2.iterator();
        while (it2.hasNext()) {
            arrayList.add(AbstractC15792e.smaato(((C9030e) it2.next()).license));
        }
        if (!arrayList.isEmpty()) {
            AbstractC9464e.yandex(str, "Waiting for resources to return. encoded data = " + hashSet.size() + ", input buffers = " + hashSet2.size());
        }
        new C6907e(new ArrayList(arrayList), false, AbstractC3062e.billing()).ad(new RunnableC4904e(17, this, arrayList, runnable), this.yandex);
    }

    public final void appmetrica() {
        Bundle bundle = new Bundle();
        bundle.putInt("request-sync", 0);
        AbstractC9464e.yandex(this.ad, "mMediaCodec.setParameters - requestKeyFrameToMediaCodec");
        this.appmetrica.setParameters(bundle);
    }

    public final void billing(boolean z) {
        Bundle bundle = new Bundle();
        bundle.putInt("drop-input-frames", z ? 1 : 0);
        AbstractC9464e.yandex(this.ad, "mMediaCodec.setParameters - setMediaCodecPaused: " + z);
        this.appmetrica.setParameters(bundle);
    }

    public final void license() {
        Surface surface;
        AbstractC9464e.yandex(this.ad, "releaseInternal");
        if (this.premium) {
            if (!this.remoteconfig) {
                AbstractC9464e.yandex(this.ad, "mMediaCodec.stop()");
                this.appmetrica.stop();
            }
            this.premium = false;
        }
        AbstractC9464e.yandex(this.ad, "mMediaCodec.release()");
        this.appmetrica.release();
        InterfaceC17421e interfaceC17421e = this.purchase;
        if (interfaceC17421e instanceof C1311e) {
            C1311e c1311e = (C1311e) interfaceC17421e;
            synchronized (c1311e.f4031e) {
                surface = c1311e.f4030e;
                c1311e.f4030e = null;
            }
            if (surface != null) {
                surface.release();
            }
        }
        yandex(9);
        this.adcel.ad(null);
    }

    public final void metrica(int i, String str, Throwable th) {
        InterfaceC14812e interfaceC14812e;
        Executor executor;
        synchronized (this.vip) {
            interfaceC14812e = this.pro;
            executor = this.signatures;
        }
        try {
            executor.execute(new RunnableC4904e(interfaceC14812e, i, str, th));
        } catch (RejectedExecutionException e) {
            AbstractC9464e.mopub(this.ad, "Unable to post to the supplied executor.", e);
        }
    }

    public final long mopub(long j) {
        Rational rational = this.subscription;
        if (rational != null && rational.getDenominator() == rational.getNumerator()) {
            return j;
        }
        return Math.round(rational.doubleValue() * j);
    }

    public final void purchase() {
        this.tapsense = f36089interface;
        this.isVip = 0L;
        this.loadAd.clear();
        this.mopub.clear();
        ArrayDeque arrayDeque = this.advert;
        Iterator it = arrayDeque.iterator();
        while (it.hasNext()) {
            ((C7169e) it.next()).vip();
        }
        arrayDeque.clear();
        String str = this.ad;
        AbstractC9464e.yandex(str, "mMediaCodec.reset()");
        MediaCodec mediaCodec = this.appmetrica;
        mediaCodec.reset();
        this.premium = false;
        this.subs = false;
        this.crashlytics = false;
        this.inmobi = false;
        ScheduledFuture scheduledFuture = this.applovin;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
            this.applovin = null;
        }
        ScheduledFuture scheduledFuture2 = this.firebase;
        if (scheduledFuture2 != null) {
            scheduledFuture2.cancel(false);
            this.firebase = null;
        }
        C11068e c11068e = this.ads;
        if (c11068e != null) {
            c11068e.adcel = true;
        }
        this.ads = new C11068e(this);
        AbstractC9464e.yandex(str, "mMediaCodec.setCallback()");
        mediaCodec.setCallback(this.ads);
        AbstractC9464e.yandex(str, "mMediaCodec.configure()");
        mediaCodec.configure(this.license, (Surface) null, (MediaCrypto) null, 1);
        InterfaceC17421e interfaceC17421e = this.purchase;
        if (interfaceC17421e instanceof C1311e) {
            C1311e c1311e = (C1311e) interfaceC17421e;
            c1311e.f4029e.appmetrica.setInputSurface(c1311e.ad());
        }
    }

    public final void startapp() {
        AbstractC9464e.yandex(this.ad, "signalCodecStop");
        InterfaceC17421e interfaceC17421e = this.purchase;
        if (interfaceC17421e instanceof C9396e) {
            ((C9396e) interfaceC17421e).ad(false);
            ArrayList arrayList = new ArrayList();
            Iterator it = this.smaato.iterator();
            while (it.hasNext()) {
                arrayList.add(AbstractC15792e.smaato(((C9030e) it.next()).license));
            }
            new C6907e(new ArrayList(arrayList), false, AbstractC3062e.billing()).ad(new RunnableC4127e(this, 1), this.yandex);
            return;
        }
        if (interfaceC17421e instanceof C1311e) {
            try {
                if (AbstractC12904e.ad.vip(SignalEosOutputBufferNotComeQuirk.class) != null) {
                    C11068e c11068e = this.ads;
                    ExecutorC12245e executorC12245e = this.yandex;
                    ScheduledFuture scheduledFuture = this.firebase;
                    if (scheduledFuture != null) {
                        scheduledFuture.cancel(false);
                    }
                    this.firebase = AbstractC3062e.amazon().schedule(new RunnableC2623e(executorC12245e, c11068e, 11), 1000L, TimeUnit.MILLISECONDS);
                }
                AbstractC9464e.yandex(this.ad, "mMediaCodec.signalEndOfInputStream()");
                this.appmetrica.signalEndOfInputStream();
                this.crashlytics = true;
            } catch (MediaCodec.CodecException e) {
                ad(1, e.getMessage(), e);
            }
        }
    }

    public final void vip() {
        while (true) {
            ArrayDeque arrayDeque = this.advert;
            if (arrayDeque.isEmpty()) {
                return;
            }
            ArrayDeque arrayDeque2 = this.mopub;
            if (arrayDeque2.isEmpty()) {
                return;
            }
            C7169e c7169e = (C7169e) arrayDeque.poll();
            Objects.requireNonNull(c7169e);
            Integer num = (Integer) arrayDeque2.poll();
            Objects.requireNonNull(num);
            try {
                C9030e c9030e = new C9030e(this, this.appmetrica, num.intValue());
                if (c7169e.ad(c9030e)) {
                    this.smaato.add(c9030e);
                    AbstractC15792e.smaato(c9030e.license).ad(new RunnableC2623e(this, c9030e, 10), this.yandex);
                } else {
                    C7169e c7169e2 = c9030e.appmetrica;
                    if (!c9030e.purchase.getAndSet(true)) {
                        try {
                            c9030e.ad.queueInputBuffer(c9030e.vip, 0, 0, 0L, 0);
                            c7169e2.ad(null);
                        } catch (IllegalStateException e) {
                            c7169e2.metrica(e);
                        }
                    }
                }
            } catch (MediaCodec.CodecException e2) {
                ad(1, e2.getMessage(), e2);
                return;
            }
        }
    }

    public final void yandex(int i) {
        if (this.f36090class == i) {
            return;
        }
        AbstractC9464e.yandex(this.ad, "Transitioning encoder internal state: " + AbstractC4653e.m1645goto(this.f36090class) + " --> " + AbstractC4653e.m1645goto(i));
        this.f36090class = i;
    }
}
