package defpackage;

import android.app.job.JobParameters;
import android.content.Context;
import android.content.Intent;
import android.graphics.SurfaceTexture;
import android.media.AudioManager;
import android.media.MediaCodec;
import android.media.MediaFormat;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.util.Size;
import android.view.Surface;
import android.view.View;
import android.view.ViewGroup;
import androidx.car.app.navigation.model.Maneuver;
import androidx.viewpager.widget.ViewPager;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import j$.util.Objects;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؔٗؑ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC2623e implements Runnable {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ Object f6485e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ Object f6486e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f6487e;

    public /* synthetic */ RunnableC2623e(Object obj, Object obj2, int i) {
        this.f6487e = i;
        this.f6486e = obj;
        this.f6485e = obj2;
    }

    private final void ad() {
        InterfaceC14812e interfaceC14812e;
        Executor executor;
        C11068e c11068e = (C11068e) this.f6486e;
        MediaFormat mediaFormat = (MediaFormat) this.f6485e;
        if (c11068e.adcel) {
            AbstractC9464e.remoteconfig(c11068e.advert.ad, "Receives onOutputFormatChanged after codec is reset.");
            return;
        }
        switch (AbstractC8703e.m2467class(c11068e.advert.f36090class)) {
            case 0:
            case 7:
            case 8:
                return;
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                synchronized (c11068e.advert.vip) {
                    C18405e c18405e = c11068e.advert;
                    interfaceC14812e = c18405e.pro;
                    executor = c18405e.signatures;
                }
                try {
                    executor.execute(new RunnableC8029e(interfaceC14812e, mediaFormat));
                    return;
                } catch (RejectedExecutionException e) {
                    AbstractC9464e.mopub(c11068e.advert.ad, "Unable to post to the supplied executor.", e);
                    return;
                }
            default:
                throw new IllegalStateException("Unknown state: ".concat(AbstractC4653e.m1645goto(c11068e.advert.f36090class)));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        AudioManager audioManager;
        int i;
        long j;
        boolean z;
        int i2 = 2;
        int i3 = 3;
        int i4 = 0;
        int i5 = 1;
        switch (this.f6487e) {
            case 0:
                C15762e c15762e = (C15762e) this.f6486e;
                Uri uri = (Uri) this.f6485e;
                c15762e.f31042e = false;
                c15762e.metrica(uri);
                return;
            case 1:
                C12894e c12894e = (C12894e) this.f6486e;
                Context context = (Context) this.f6485e;
                ((C17790e) c12894e.f25752e).getClass();
                String str = AbstractC9413e.ad;
                if (context.getPackageManager().hasSystemFeature("android.hardware.type.watch") && (audioManager = (AudioManager) context.getSystemService("audio")) != null) {
                    c12894e.f25751e = audioManager;
                    C10079e c10079e = new C10079e(i5, c12894e);
                    c12894e.f25750e = c10079e;
                    Looper myLooper = Looper.myLooper();
                    myLooper.getClass();
                    audioManager.registerAudioDeviceCallback(c10079e, new Handler(myLooper));
                    ((C17790e) c12894e.f25752e).m4432protected(Boolean.valueOf(c12894e.applovin()));
                    return;
                }
                return;
            case 2:
                C4546e.vip((C4546e) this.f6486e, (Context) this.f6485e);
                return;
            case 3:
                C6681e c6681e = (C6681e) this.f6486e;
                C13705e c13705e = (C13705e) this.f6485e;
                Surface license = c13705e.license(c6681e.f13788e, new C2780e(c6681e, c13705e, i2));
                c6681e.f13795e.advert(license);
                c6681e.f13791e.put(c13705e, license);
                return;
            case 4:
                final C6681e c6681e2 = (C6681e) this.f6486e;
                final C6122e c6122e = (C6122e) this.f6485e;
                c6681e2.f13794e++;
                C7188e c7188e = c6681e2.f13795e;
                AbstractC7328e.license((AtomicBoolean) c7188e.f14683e, true);
                AbstractC7328e.metrica((Thread) c7188e.f14680e);
                final SurfaceTexture surfaceTexture = new SurfaceTexture(c7188e.f14690e);
                Size size = c6122e.vip;
                surfaceTexture.setDefaultBufferSize(size.getWidth(), size.getHeight());
                final Surface surface = new Surface(surfaceTexture);
                ScheduledExecutorServiceC5380e scheduledExecutorServiceC5380e = c6681e2.f13788e;
                c6122e.vip(scheduledExecutorServiceC5380e, new C11565e(c6681e2, c6122e, 19));
                c6122e.ad(surface, scheduledExecutorServiceC5380e, new InterfaceC0867e() { // from class: eٍْۨ
                    @Override // defpackage.InterfaceC0867e
                    public final void accept(Object obj) {
                        C6681e c6681e3 = C6681e.this;
                        C6122e c6122e2 = c6122e;
                        SurfaceTexture surfaceTexture2 = surfaceTexture;
                        Surface surface2 = surface;
                        synchronized (c6122e2.ad) {
                            c6122e2.loadAd = null;
                            c6122e2.Signature = null;
                        }
                        surfaceTexture2.setOnFrameAvailableListener(null);
                        surfaceTexture2.release();
                        surface2.release();
                        c6681e3.f13794e--;
                        c6681e3.metrica();
                    }
                });
                surfaceTexture.setOnFrameAvailableListener(c6681e2, c6681e2.f13793e);
                return;
            case 5:
                ((C17075e) ((C17424e) this.f6486e).f34141e).yandex.vip((C2351e) this.f6485e);
                return;
            case 6:
                AbstractC5113e abstractC5113e = (AbstractC5113e) this.f6486e;
                String str2 = (String) this.f6485e;
                try {
                    abstractC5113e.appmetrica.get();
                    abstractC5113e.appmetrica(AbstractC5113e.smaato.decrementAndGet(), AbstractC5113e.advert.get(), "Surface terminated");
                    return;
                } catch (Exception e) {
                    AbstractC9464e.adcel("DeferrableSurface", "Unexpected surface termination for " + abstractC5113e + "\nStack Trace:\n" + str2);
                    synchronized (abstractC5113e.ad) {
                        throw new IllegalArgumentException(String.format("DeferrableSurface %s [closed: %b, use_count: %s] terminated with unexpected exception.", abstractC5113e, Boolean.valueOf(abstractC5113e.metrica), Integer.valueOf(abstractC5113e.vip)), e);
                    }
                }
            case 7:
                Callable callable = (Callable) this.f6486e;
                ScheduledFutureC18179e scheduledFutureC18179e = (ScheduledFutureC18179e) ((C6594e) this.f6485e).f13613e;
                try {
                    scheduledFutureC18179e.adcel(callable.call());
                    return;
                } catch (Exception e2) {
                    scheduledFutureC18179e.mopub(e2);
                    return;
                }
            case 8:
                C12799e c12799e = (C12799e) this.f6486e;
                C6122e c6122e2 = (C6122e) this.f6485e;
                c12799e.f25601e++;
                C2625e c2625e = c12799e.f25608e;
                boolean z2 = c6122e2.purchase;
                Size size2 = c6122e2.vip;
                AbstractC7328e.license((AtomicBoolean) c2625e.f14683e, true);
                AbstractC7328e.metrica((Thread) c2625e.f14680e);
                SurfaceTexture surfaceTexture2 = new SurfaceTexture(z2 ? c2625e.f6488e : c2625e.f6490e);
                surfaceTexture2.setDefaultBufferSize(size2.getWidth(), size2.getHeight());
                Surface surface2 = new Surface(surfaceTexture2);
                c6122e2.ad(surface2, c12799e.f25602e, new C15173e(i4, c12799e, surfaceTexture2, surface2));
                if (z2) {
                    c12799e.f25607e = surfaceTexture2;
                    return;
                } else {
                    c12799e.f25603e = surfaceTexture2;
                    surfaceTexture2.setOnFrameAvailableListener(c12799e, c12799e.f25606e);
                    return;
                }
            case 9:
                C12799e c12799e2 = (C12799e) this.f6486e;
                C13705e c13705e2 = (C13705e) this.f6485e;
                Surface license2 = c13705e2.license(c12799e2.f25602e, new C2780e(c12799e2, c13705e2, i3));
                c12799e2.f25608e.advert(license2);
                c12799e2.f25605e.put(c13705e2, license2);
                return;
            case 10:
                ((C18405e) this.f6486e).smaato.remove((C9030e) this.f6485e);
                return;
            case 11:
                Executor executor = (Executor) this.f6486e;
                C11068e c11068e = (C11068e) this.f6485e;
                Objects.requireNonNull(c11068e);
                executor.execute(new RunnableC2783e(4, c11068e));
                return;
            case 12:
                ((C18405e) this.f6486e).advert.remove((C7169e) this.f6485e);
                return;
            case 13:
                ((InterfaceC4868e) ((Map.Entry) this.f6486e).getKey()).ad((EnumC8291e) this.f6485e);
                return;
            case 14:
                C9396e c9396e = (C9396e) this.f6486e;
                InterfaceC4868e interfaceC4868e = (InterfaceC4868e) this.f6485e;
                LinkedHashMap linkedHashMap = c9396e.f18694e;
                interfaceC4868e.getClass();
                linkedHashMap.remove(interfaceC4868e);
                return;
            case 15:
                ((C7169e) this.f6485e).ad(((C9396e) this.f6486e).f18692e);
                return;
            case 16:
                ((InterfaceC4868e) this.f6486e).ad((EnumC8291e) this.f6485e);
                return;
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                C11068e c11068e2 = (C11068e) this.f6486e;
                MediaCodec.CodecException codecException = (MediaCodec.CodecException) this.f6485e;
                C18405e c18405e = c11068e2.advert;
                switch (AbstractC8703e.m2467class(c18405e.f36090class)) {
                    case 0:
                    case 7:
                    case 8:
                        return;
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                        c18405e.ad(1, codecException.getMessage(), codecException);
                        return;
                    default:
                        throw new IllegalStateException("Unknown state: ".concat(AbstractC4653e.m1645goto(c18405e.f36090class)));
                }
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                ad();
                return;
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                ((InterfaceC14812e) this.f6486e).admob((C7967e) this.f6485e);
                return;
            case 20:
                C17148e c17148e = (C17148e) this.f6486e;
                C6981e c6981e = (C6981e) this.f6485e;
                int i6 = c17148e.f33571e - c6981e.vip;
                c17148e.f33571e = i6;
                if (c6981e.appmetrica) {
                    c17148e.f33586e = c6981e.metrica;
                    c17148e.f33597e = true;
                }
                if (i6 == 0) {
                    AbstractC6690e abstractC6690e = ((C7422e) c6981e.purchase).ad;
                    int i7 = -1;
                    if (!c17148e.f33612e.ad.Signature() && abstractC6690e.Signature()) {
                        c17148e.f33582e = -1;
                        c17148e.f33625e = 0L;
                    }
                    if (!abstractC6690e.Signature()) {
                        List asList = Arrays.asList(((C9189e) abstractC6690e).mopub);
                        AbstractC2301e.subscription(asList.size() == c17148e.f33592e.size());
                        for (int i8 = 0; i8 < asList.size(); i8++) {
                            ((C1437e) c17148e.f33592e.get(i8)).metrica = (AbstractC6690e) asList.get(i8);
                        }
                    }
                    long j2 = -9223372036854775807L;
                    if (c17148e.f33597e) {
                        boolean z3 = ((C7422e) c6981e.purchase).ad.Signature() && c17148e.f33612e.ad.Signature();
                        boolean equals = ((C7422e) c6981e.purchase).vip.equals(c17148e.f33612e.vip);
                        boolean z4 = ((C7422e) c6981e.purchase).license == c17148e.f33612e.remoteconfig;
                        if (z3 || (equals && z4)) {
                            i5 = 0;
                        }
                        if (i5 != 0) {
                            i7 = c17148e.mo2115e();
                            if (abstractC6690e.Signature() || ((C7422e) c6981e.purchase).vip.vip()) {
                                j2 = ((C7422e) c6981e.purchase).license;
                            } else {
                                C7422e c7422e = (C7422e) c6981e.purchase;
                                C18208e c18208e = c7422e.vip;
                                long j3 = c7422e.license;
                                Object obj = c18208e.ad;
                                C6158e c6158e = c17148e.f33595e;
                                abstractC6690e.billing(obj, c6158e);
                                j2 = j3 + c6158e.appmetrica;
                            }
                        }
                        i = i7;
                        j = j2;
                        z = i5;
                    } else {
                        i = -1;
                        j = -9223372036854775807L;
                        z = 0;
                    }
                    c17148e.f33597e = false;
                    c17148e.m4249e((C7422e) c6981e.purchase, 1, z, c17148e.f33586e, j, i, false);
                    return;
                }
                return;
            case 21:
                ((C8374e) this.f6486e).ad((Intent) this.f6485e);
                return;
            case 22:
                ((C13578e) this.f6486e).m3618goto((C12940e) this.f6485e, Unit.INSTANCE);
                return;
            case 23:
                C2220e c2220e = (C2220e) this.f6486e;
                C8170e c8170e = (C8170e) this.f6485e;
                C9770e c9770e = c2220e.f5626e;
                Uri uri2 = c8170e.smaato;
                C4232e c4232e = (C4232e) ((C2247e) c9770e.f19315e).f5710e.f17919e.get(uri2);
                if (c4232e != null) {
                    C4232e.vip(c4232e, uri2, true);
                    return;
                }
                return;
            case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                C4052e c4052e = (C4052e) this.f6486e;
                C4052e c4052e2 = (C4052e) this.f6485e;
                c4052e.advert();
                if (c4052e2 != null) {
                    c4052e2.advert();
                    return;
                }
                return;
            case Maneuver.TYPE_FORK_LEFT /* 25 */:
                C2469e c2469e = (C2469e) this.f6486e;
                C8988e c8988e = (C8988e) this.f6485e;
                try {
                    c8988e.vip(c2469e.ad());
                    return;
                } catch (Exception e3) {
                    c8988e.ad(e3);
                    return;
                }
            case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                JobInfoSchedulerService jobInfoSchedulerService = (JobInfoSchedulerService) this.f6486e;
                JobParameters jobParameters = (JobParameters) this.f6485e;
                int i9 = JobInfoSchedulerService.f644e;
                jobInfoSchedulerService.jobFinished(jobParameters, false);
                return;
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                C2362e c2362e = (C2362e) this.f6486e;
                C17469e c17469e = (C17469e) this.f6485e;
                HashSet hashSet = new HashSet();
                if (c2362e != null) {
                    hashSet.addAll((LinkedHashSet) c2362e.f5914e);
                }
                c17469e.billing.getClass();
                return;
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                ((ViewGroup) this.f6486e).removeView((C7383e) this.f6485e);
                return;
            default:
                ((ViewPager) this.f6486e).addView((View) this.f6485e);
                return;
        }
    }
}
