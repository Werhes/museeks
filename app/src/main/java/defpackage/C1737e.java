package defpackage;

import android.media.AudioAttributes;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.media.AudioAttributesCompat;
import androidx.media.AudioAttributesImpl;
import j$.util.Objects;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍُؓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1737e {
    public static final AudioAttributesCompat appmetrica;
    public final AudioManager.OnAudioFocusChangeListener ad;
    public final Object license;
    public final AudioAttributesCompat metrica;
    public final Handler vip;

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, androidx.media.AudioAttributesCompat] */
    static {
        int i = AudioAttributesCompat.vip;
        C17974e c17974e = Build.VERSION.SDK_INT >= 26 ? new C17974e(4) : new C17974e(4);
        c17974e.subs();
        AudioAttributesImpl smaato = c17974e.smaato();
        ?? obj = new Object();
        obj.ad = smaato;
        appmetrica = obj;
    }

    public C1737e(C12350e c12350e, Handler handler, AudioAttributesCompat audioAttributesCompat) {
        this.vip = handler;
        this.metrica = audioAttributesCompat;
        int i = Build.VERSION.SDK_INT;
        if (i >= 26 || handler.getLooper() == Looper.getMainLooper()) {
            this.ad = c12350e;
        } else {
            this.ad = new C16744e(c12350e, handler);
        }
        if (i >= 26) {
            this.license = AbstractC3701e.ad(2, audioAttributesCompat != null ? (AudioAttributes) audioAttributesCompat.ad.smaato() : null, true, this.ad, handler);
        } else {
            this.license = null;
        }
    }

    public final AudioFocusRequest ad() {
        return C4403e.metrica(this.license);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1737e)) {
            return false;
        }
        C1737e c1737e = (C1737e) obj;
        return Objects.equals(this.ad, c1737e.ad) && this.vip.equals(c1737e.vip) && Objects.equals(this.metrica, c1737e.metrica);
    }

    public final int hashCode() {
        return Objects.hash(2, this.ad, this.vip, this.metrica, Boolean.TRUE);
    }
}
