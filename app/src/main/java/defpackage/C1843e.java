package defpackage;

import android.content.Context;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.Spatializer;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import j$.util.Objects;
import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘٖؓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1843e {
    public final Spatializer ad;
    public final C14814e license;
    public final Handler metrica;
    public final boolean vip;

    public C1843e(Context context, Runnable runnable, Boolean bool) {
        AudioManager amazon = context == null ? null : AbstractC17305e.amazon(context);
        if (amazon == null || (bool != null && bool.booleanValue())) {
            this.ad = null;
            this.vip = false;
            this.metrica = null;
            this.license = null;
            return;
        }
        Spatializer spatializer = amazon.getSpatializer();
        this.ad = spatializer;
        this.vip = spatializer.getImmersiveAudioLevel() != 0;
        Looper myLooper = Looper.myLooper();
        myLooper.getClass();
        Handler handler = new Handler(myLooper);
        this.metrica = handler;
        C14814e c14814e = new C14814e(runnable);
        this.license = c14814e;
        spatializer.addOnSpatializerStateChangedListener(new ExecutorC17160e(0, handler), c14814e);
    }

    public final boolean ad(C3335e c3335e, C16975e c16975e) {
        if (this.ad == null || !this.vip || !metrica() || !license()) {
            return false;
        }
        String str = c16975e.loadAd;
        int i = c16975e.f33282interface;
        if (Objects.equals(str, "audio/eac3-joc")) {
            if (i == 16) {
                i = 12;
            }
        } else if (Objects.equals(str, "audio/iamf")) {
            if (i == -1) {
                i = 6;
            }
        } else if (Objects.equals(str, "audio/ac4") && (i == 18 || i == 21)) {
            i = 24;
        }
        int signatures = AbstractC9413e.signatures(i);
        if (signatures == 0) {
            return false;
        }
        AudioFormat.Builder channelMask = new AudioFormat.Builder().setEncoding(2).setChannelMask(signatures);
        int i2 = c16975e.f33281goto;
        if (i2 != -1) {
            channelMask.setSampleRate(i2);
        }
        Spatializer spatializer = this.ad;
        spatializer.getClass();
        return spatializer.canBeSpatialized(c3335e.metrica(), channelMask.build());
    }

    public final void appmetrica() {
        C14814e c14814e;
        Handler handler;
        Spatializer spatializer = this.ad;
        if (spatializer == null || (c14814e = this.license) == null || (handler = this.metrica) == null) {
            return;
        }
        spatializer.removeOnSpatializerStateChangedListener(c14814e);
        handler.removeCallbacksAndMessages(null);
    }

    public final boolean license() {
        Spatializer spatializer = this.ad;
        return spatializer != null && spatializer.isEnabled();
    }

    public final boolean metrica() {
        Spatializer spatializer = this.ad;
        return spatializer != null && spatializer.isAvailable();
    }

    public final List vip() {
        if (this.ad == null || !this.vip || !metrica() || !license()) {
            C2171e c2171e = AbstractC17475e.f34223e;
            return C1410e.f4222e;
        }
        if (Build.VERSION.SDK_INT < 36) {
            return AbstractC17475e.ads(252);
        }
        Spatializer spatializer = this.ad;
        spatializer.getClass();
        return spatializer.getSpatializedChannelMasks();
    }
}
