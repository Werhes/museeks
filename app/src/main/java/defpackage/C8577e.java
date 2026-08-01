package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import android.media.AudioAttributes;
import android.media.AudioDeviceInfo;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.AudioTrack;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import j$.util.Objects;
import java.math.RoundingMode;
import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌٌٖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8577e implements InterfaceC11978e {
    public final Context ad;
    public Looper adcel;
    public final float appmetrica;
    public C17381e billing;
    public final C12916e license;
    public final InterfaceC5041e metrica;
    public Context mopub;
    public C0222e purchase;
    public C7116e startapp;
    public final C1400e vip;
    public C16717e yandex;

    public C8577e(C9142e c9142e) {
        Context context = (Context) c9142e.vip;
        this.ad = context;
        InterfaceC5041e interfaceC5041e = (InterfaceC5041e) c9142e.metrica;
        interfaceC5041e.getClass();
        this.metrica = interfaceC5041e;
        this.vip = (C1400e) c9142e.license;
        this.yandex = (C16717e) c9142e.appmetrica;
        this.license = context == null ? null : new C12916e(5, this);
        this.appmetrica = c9142e.ad;
        this.billing = C17381e.ad;
    }

    public final C11863e ad(C11816e c11816e) {
        Context context;
        Context context2;
        try {
            int i = c11816e.yandex;
            int i2 = c11816e.startapp;
            if (i2 == -1 || (context2 = this.ad) == null || Build.VERSION.SDK_INT < 34) {
                context = null;
            } else {
                Context context3 = this.mopub;
                if (context3 != null) {
                    if (context3.getDeviceId() != i2) {
                    }
                    context = this.mopub;
                    i = 0;
                }
                this.mopub = context2.createDeviceContext(i2);
                context = this.mopub;
                i = 0;
            }
            AudioTrack.Builder sessionId = new AudioTrack.Builder().setAudioAttributes(c11816e.license ? new AudioAttributes.Builder().setContentType(3).setFlags(16).setUsage(1).build() : c11816e.billing.metrica()).setAudioFormat(new AudioFormat.Builder().setSampleRate(c11816e.vip).setChannelMask(c11816e.metrica).setEncoding(c11816e.ad).build()).setTransferMode(1).setBufferSizeInBytes(c11816e.purchase).setSessionId(i);
            int i3 = Build.VERSION.SDK_INT;
            if (i3 >= 29) {
                sessionId.setOffloadedPlayback(c11816e.appmetrica);
            }
            if (i3 >= 34 && context != null) {
                sessionId.setContext(context);
            }
            AudioTrack build = sessionId.build();
            if (build.getState() == 1) {
                return new C11863e(build, c11816e, this.license, this.appmetrica, this.billing);
            }
            try {
                build.release();
            } catch (Exception unused) {
            }
            throw new Exception();
        } catch (IllegalArgumentException e) {
            e = e;
            throw new Exception(e);
        } catch (UnsupportedOperationException e2) {
            e = e2;
            throw new Exception(e);
        }
    }

    public final void appmetrica(C4181e c4181e) {
        Context context;
        C16717e vip;
        AudioDeviceInfo audioDeviceInfo = c4181e.metrica;
        C3335e c3335e = c4181e.vip;
        purchase();
        C7116e c7116e = this.startapp;
        if (c7116e == null && (context = this.ad) != null) {
            C7116e c7116e2 = new C7116e(context, new C0211e(5, this), c3335e, audioDeviceInfo);
            this.startapp = c7116e2;
            if (c7116e2.mopub) {
                vip = c7116e2.yandex;
                vip.getClass();
            } else {
                c7116e2.mopub = true;
                C2118e c2118e = c7116e2.purchase;
                if (c2118e != null) {
                    c2118e.ad.registerContentObserver(c2118e.vip, false, c2118e);
                }
                Context context2 = c7116e2.ad;
                AudioManager amazon = AbstractC17305e.amazon(context2);
                C10079e c10079e = c7116e2.license;
                Handler handler = c7116e2.metrica;
                amazon.registerAudioDeviceCallback(c10079e, handler);
                if (Build.VERSION.SDK_INT >= 32 && c7116e2.billing == null) {
                    c7116e2.billing = new C1843e(context2, new RunnableC17584e(8, c7116e2), Boolean.valueOf(AbstractC9413e.m2544abstract(context2)));
                }
                vip = C16717e.vip(context2, context2.registerReceiver(c7116e2.appmetrica, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG"), null, handler), c7116e2.adcel, c7116e2.startapp, c7116e2.ad());
                c7116e2.yandex = vip;
            }
            this.yandex = vip;
        } else if (c7116e != null) {
            if (audioDeviceInfo != null && !audioDeviceInfo.equals(c7116e.startapp)) {
                c7116e.startapp = audioDeviceInfo;
                Context context3 = c7116e.ad;
                C3335e c3335e2 = c7116e.adcel;
                List ad = c7116e.ad();
                C1410e c1410e = C16717e.appmetrica;
                c7116e.vip(C16717e.vip(context3, context3.registerReceiver(null, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG")), c3335e2, audioDeviceInfo, ad));
            }
            C7116e c7116e3 = this.startapp;
            if (!Objects.equals(c3335e, c7116e3.adcel)) {
                c7116e3.adcel = c3335e;
                Context context4 = c7116e3.ad;
                AudioDeviceInfo audioDeviceInfo2 = c7116e3.startapp;
                List ad2 = c7116e3.ad();
                C1410e c1410e2 = C16717e.appmetrica;
                c7116e3.vip(C16717e.vip(context4, context4.registerReceiver(null, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG")), c3335e, audioDeviceInfo2, ad2));
            }
        }
        this.yandex.getClass();
    }

    public final void license() {
        C1843e c1843e;
        C0222e c0222e = this.purchase;
        if (c0222e != null) {
            c0222e.license();
        }
        C7116e c7116e = this.startapp;
        if (c7116e != null) {
            Context context = c7116e.ad;
            if (c7116e.mopub) {
                c7116e.yandex = null;
                AbstractC17305e.amazon(context).unregisterAudioDeviceCallback(c7116e.license);
                if (Build.VERSION.SDK_INT >= 32 && (c1843e = c7116e.billing) != null) {
                    c1843e.appmetrica();
                    c7116e.billing = null;
                }
                context.unregisterReceiver(c7116e.appmetrica);
                C2118e c2118e = c7116e.purchase;
                if (c2118e != null) {
                    c2118e.ad.unregisterContentObserver(c2118e);
                }
                c7116e.mopub = false;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v8, types: [eَؘۤ, java.lang.Object] */
    public final C11816e metrica(C4181e c4181e) {
        int intValue;
        int i;
        boolean z;
        char c;
        double d;
        boolean z2;
        int i2;
        int adcel;
        int purchase;
        C16975e c16975e = c4181e.ad;
        boolean z3 = c4181e.appmetrica;
        boolean z4 = c4181e.license;
        C3335e c3335e = c4181e.vip;
        appmetrica(c4181e);
        String str = c16975e.loadAd;
        int i3 = c16975e.f33281goto;
        int i4 = c16975e.f33285this;
        int i5 = c16975e.f33282interface;
        if (Objects.equals(str, "audio/raw")) {
            AbstractC2301e.billing(AbstractC9413e.m2572try(i4));
            intValue = AbstractC9413e.signatures(i5);
            i = AbstractC9413e.tapsense(i4) * i5;
            z = false;
            c = 0;
        } else {
            C13395e ad = z3 ? ((C13179e) this.metrica).ad(c3335e, c16975e) : C13395e.license;
            if (z3 && ad.ad) {
                str.getClass();
                int metrica = AbstractC8542e.metrica(str, c16975e.mopub);
                int signatures = AbstractC9413e.signatures(i5);
                z = ad.vip;
                i = -1;
                c = 1;
                i4 = metrica;
                intValue = signatures;
                z4 = true;
            } else {
                Pair metrica2 = this.yandex.metrica(c3335e, c16975e);
                if (metrica2 == null) {
                    String str2 = "Unable to configure passthrough for: " + c16975e;
                    str2.getClass();
                    throw new Exception(str2);
                }
                i4 = ((Integer) metrica2.first).intValue();
                intValue = ((Integer) metrica2.second).intValue();
                i = -1;
                z = false;
                c = 2;
            }
        }
        int i6 = c16975e.adcel;
        if (Objects.equals(str, "audio/vnd.dts.hd;profile=lbr") && i6 == -1) {
            i6 = 768000;
        }
        int i7 = c4181e.startapp;
        if (i7 != -1) {
            z2 = true;
        } else {
            int minBufferSize = AudioTrack.getMinBufferSize(i3, intValue, i4);
            AbstractC2301e.subscription(minBufferSize != -2);
            if (i == -1) {
                i = 1;
            }
            double d2 = z4 ? this.appmetrica : 1.0d;
            this.vip.getClass();
            if (c != 0) {
                if (c != 1) {
                    z2 = true;
                    if (c != 2) {
                        throw new IllegalArgumentException();
                    }
                    int i8 = i4 == 5 ? 500000 : i4 == 8 ? 1000000 : 250000;
                    if (i6 != -1) {
                        RoundingMode roundingMode = RoundingMode.CEILING;
                        purchase = AbstractC17673e.purchase(i6, 8);
                    } else {
                        purchase = AbstractC9357e.purchase(i4);
                        AbstractC2301e.subscription(purchase != -2147483647);
                    }
                    d = d2;
                    adcel = AbstractC10509e.purchase((i8 * purchase) / 1000000);
                } else {
                    d = d2;
                    z2 = true;
                    int purchase2 = AbstractC9357e.purchase(i4);
                    AbstractC2301e.subscription(purchase2 != -2147483647);
                    adcel = AbstractC10509e.purchase((50000000 * purchase2) / 1000000);
                }
                i2 = i;
            } else {
                d = d2;
                z2 = true;
                long j = i3;
                long j2 = i;
                i2 = i;
                adcel = AbstractC9413e.adcel(minBufferSize * 4, AbstractC10509e.purchase(((250000 * j) * j2) / 1000000), AbstractC10509e.purchase(((750000 * j) * j2) / 1000000));
            }
            i7 = (((Math.max(minBufferSize, (int) (adcel * d)) + i2) - 1) / i2) * i2;
        }
        ?? obj = new Object();
        C3335e c3335e2 = C3335e.startapp;
        obj.startapp = -1;
        obj.vip = i3;
        obj.metrica = intValue;
        obj.ad = i4;
        obj.purchase = i7;
        obj.yandex = c4181e.purchase;
        obj.billing = c3335e;
        boolean z5 = z2;
        obj.appmetrica = c == z5 ? z5 : false;
        obj.license = c4181e.yandex;
        obj.adcel = z4;
        obj.mopub = z;
        obj.startapp = c4181e.billing;
        return new C11816e(obj);
    }

    public final void purchase() {
        if (this.ad == null) {
            return;
        }
        Looper myLooper = Looper.myLooper();
        Looper looper = this.adcel;
        boolean z = looper == null || looper == myLooper;
        String name = looper == null ? "null" : looper.getThread().getName();
        String name2 = myLooper != null ? myLooper.getThread().getName() : "null";
        if (!z) {
            throw new IllegalStateException(AbstractC12992e.adcel("AudioTrackAudioOutputProvider accessed on multiple threads: %s and %s", name, name2));
        }
        this.adcel = myLooper;
    }

    public final C12251e vip(C4181e c4181e) {
        appmetrica(c4181e);
        C16975e c16975e = c4181e.ad;
        C3335e c3335e = c4181e.vip;
        C13395e ad = ((C13179e) this.metrica).ad(c3335e, c16975e);
        C7198e c7198e = new C7198e();
        String str = c16975e.loadAd;
        int i = c16975e.f33285this;
        int i2 = 0;
        if (!Objects.equals(str, "audio/raw") ? this.yandex.metrica(c3335e, c16975e) != null : i == 2) {
            i2 = 2;
        }
        c7198e.ad = i2;
        c7198e.vip = ad.ad;
        c7198e.metrica = ad.vip;
        c7198e.license = ad.metrica;
        return c7198e.ad();
    }
}
