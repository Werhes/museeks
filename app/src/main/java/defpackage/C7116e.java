package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import android.media.AudioDeviceInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.provider.Settings;
import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؚّۣ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7116e {
    public final Context ad;
    public C3335e adcel;
    public final C13264e appmetrica;
    public C1843e billing;
    public final C10079e license;
    public final Handler metrica;
    public boolean mopub;
    public final C2118e purchase;
    public AudioDeviceInfo startapp;
    public final C0211e vip;
    public C16717e yandex;

    public C7116e(Context context, C0211e c0211e, C3335e c3335e, AudioDeviceInfo audioDeviceInfo) {
        Context applicationContext = context.getApplicationContext();
        this.ad = applicationContext;
        this.vip = c0211e;
        this.adcel = c3335e;
        this.startapp = audioDeviceInfo;
        Handler handler = new Handler(AbstractC9413e.applovin(), null);
        this.metrica = handler;
        this.license = new C10079e(0, this);
        this.appmetrica = new C13264e(2, this);
        C1410e c1410e = C16717e.appmetrica;
        String str = Build.MANUFACTURER;
        Uri uriFor = (str.equals("Amazon") || str.equals("Xiaomi")) ? Settings.Global.getUriFor("external_surround_sound_enabled") : null;
        this.purchase = uriFor != null ? new C2118e(this, handler, applicationContext.getContentResolver(), uriFor) : null;
    }

    public final List ad() {
        C1843e c1843e;
        if (Build.VERSION.SDK_INT >= 32 && (c1843e = this.billing) != null) {
            return c1843e.vip();
        }
        C2171e c2171e = AbstractC17475e.f34223e;
        return C1410e.f4222e;
    }

    public final void metrica() {
        List ad = ad();
        C3335e c3335e = this.adcel;
        AudioDeviceInfo audioDeviceInfo = this.startapp;
        C1410e c1410e = C16717e.appmetrica;
        IntentFilter intentFilter = new IntentFilter("android.media.action.HDMI_AUDIO_PLUG");
        Context context = this.ad;
        vip(C16717e.vip(context, context.registerReceiver(null, intentFilter), c3335e, audioDeviceInfo, ad));
    }

    public final void vip(C16717e c16717e) {
        if (!this.mopub || c16717e.equals(this.yandex)) {
            return;
        }
        this.yandex = c16717e;
        C8577e c8577e = (C8577e) this.vip.f1457e;
        c8577e.purchase();
        C16717e c16717e2 = c8577e.yandex;
        if (c16717e2 == null || c16717e.equals(c16717e2)) {
            return;
        }
        c8577e.yandex = c16717e;
        C0222e c0222e = c8577e.purchase;
        if (c0222e != null) {
            c0222e.billing(-1, new C4403e(16));
        }
    }
}
