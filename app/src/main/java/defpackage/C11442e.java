package defpackage;

import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.os.Build;
import android.os.Handler;
import j$.util.Objects;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eِؑ٘, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11442e {
    public final int ad;
    public final boolean appmetrica;
    public final C3335e license;
    public final Handler metrica;
    public final Object purchase;
    public final AudioManager.OnAudioFocusChangeListener vip;

    public C11442e(int i, AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener, Handler handler, C3335e c3335e, boolean z, boolean z2) {
        this.ad = i;
        this.metrica = handler;
        this.license = c3335e;
        this.appmetrica = z;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 < 26) {
            this.vip = new C0708e(onAudioFocusChangeListener, handler);
        } else {
            this.vip = onAudioFocusChangeListener;
        }
        if (i2 >= 26) {
            this.purchase = new AudioFocusRequest.Builder(i).setAudioAttributes(c3335e.metrica()).setWillPauseWhenDucked(z).setOnAudioFocusChangeListener(onAudioFocusChangeListener, handler).setAcceptsDelayedFocusGain(z2).build();
        } else {
            this.purchase = null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C11442e)) {
            return false;
        }
        C11442e c11442e = (C11442e) obj;
        return this.ad == c11442e.ad && this.appmetrica == c11442e.appmetrica && Objects.equals(this.vip, c11442e.vip) && Objects.equals(this.metrica, c11442e.metrica) && Objects.equals(this.license, c11442e.license);
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.ad), this.vip, this.metrica, this.license, Boolean.valueOf(this.appmetrica));
    }
}
