package defpackage;

import android.content.Context;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.os.Build;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَْٙ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C13179e implements InterfaceC5041e {
    public final Context ad;
    public Boolean vip;

    public C13179e(Context context) {
        this.ad = context == null ? null : context.getApplicationContext();
    }

    public final C13395e ad(C3335e c3335e, C16975e c16975e) {
        boolean booleanValue;
        c16975e.getClass();
        int i = c16975e.f33281goto;
        c3335e.getClass();
        int i2 = Build.VERSION.SDK_INT;
        if (i2 < 29 || i == -1) {
            return C13395e.license;
        }
        Boolean bool = this.vip;
        if (bool != null) {
            booleanValue = bool.booleanValue();
        } else {
            Context context = this.ad;
            if (context != null) {
                String parameters = AbstractC17305e.amazon(context).getParameters("offloadVariableRateSupported");
                this.vip = Boolean.valueOf(parameters != null && parameters.equals("offloadVariableRateSupported=1"));
            } else {
                this.vip = Boolean.FALSE;
            }
            booleanValue = this.vip.booleanValue();
        }
        String str = c16975e.loadAd;
        str.getClass();
        int metrica = AbstractC8542e.metrica(str, c16975e.mopub);
        if (metrica == 0 || i2 < AbstractC9413e.pro(metrica)) {
            return C13395e.license;
        }
        int signatures = AbstractC9413e.signatures(c16975e.f33282interface);
        if (signatures == 0) {
            return C13395e.license;
        }
        try {
            AudioFormat build = new AudioFormat.Builder().setSampleRate(i).setChannelMask(signatures).setEncoding(metrica).build();
            if (i2 >= 33) {
                int directPlaybackSupport = AudioManager.getDirectPlaybackSupport(build, c3335e.metrica());
                if ((directPlaybackSupport & 1) == 0) {
                    return C13395e.license;
                }
                r3 = (directPlaybackSupport & 3) == 3;
                C10233e c10233e = new C10233e(0);
                c10233e.vip = true;
                c10233e.metrica = r3;
                c10233e.license = booleanValue;
                return c10233e.ad();
            }
            if (i2 < 31) {
                if (!AudioManager.isOffloadedPlaybackSupported(build, c3335e.metrica())) {
                    return C13395e.license;
                }
                C10233e c10233e2 = new C10233e(0);
                c10233e2.vip = true;
                c10233e2.license = booleanValue;
                return c10233e2.ad();
            }
            int playbackOffloadSupport = AudioManager.getPlaybackOffloadSupport(build, c3335e.metrica());
            if (playbackOffloadSupport == 0) {
                return C13395e.license;
            }
            C10233e c10233e3 = new C10233e(0);
            if (i2 > 32 && playbackOffloadSupport == 2) {
                r3 = true;
            }
            c10233e3.vip = true;
            c10233e3.metrica = r3;
            c10233e3.license = booleanValue;
            return c10233e3.ad();
        } catch (IllegalArgumentException unused) {
            return C13395e.license;
        }
    }
}
