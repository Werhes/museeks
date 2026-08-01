package defpackage;

import android.media.audiofx.AudioEffect;
import android.media.audiofx.BassBoost;
import android.media.audiofx.EnvironmentalReverb;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًُٙ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10882e implements InterfaceC5387e {
    public final /* synthetic */ int ad;
    public AudioEffect vip;

    @Override // defpackage.InterfaceC5387e
    public final void ad(int i, C6442e c6442e) {
        switch (this.ad) {
            case 0:
                this.vip = new BassBoost(100, i);
                vip(c6442e);
                return;
            default:
                this.vip = new EnvironmentalReverb(100, i);
                vip(c6442e);
                return;
        }
    }

    @Override // defpackage.InterfaceC5387e
    public final void release() {
        switch (this.ad) {
            case 0:
                BassBoost bassBoost = (BassBoost) this.vip;
                if (bassBoost != null) {
                    bassBoost.release();
                }
                this.vip = null;
                return;
            default:
                EnvironmentalReverb environmentalReverb = (EnvironmentalReverb) this.vip;
                if (environmentalReverb != null) {
                    environmentalReverb.release();
                }
                this.vip = null;
                return;
        }
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [eٖؑۡ, eُۙۨ] */
    @Override // defpackage.InterfaceC5387e
    public final boolean vip(C6442e c6442e) {
        switch (this.ad) {
            case 0:
                BassBoost bassBoost = (BassBoost) this.vip;
                if (bassBoost != null) {
                    C6019e c6019e = c6442e.f13337e;
                    if (c6019e == null) {
                        c6019e = C1158e.appmetrica();
                    }
                    bassBoost.setEnabled(c6019e.f12677e);
                    bassBoost.setStrength((short) AbstractC3062e.license((int) (c6019e.f12676e * 10.0f), new C11241e(0, 1000, 1)));
                }
                return false;
            default:
                EnvironmentalReverb environmentalReverb = (EnvironmentalReverb) this.vip;
                if (environmentalReverb == null) {
                    return false;
                }
                C6019e c6019e2 = c6442e.f13339e;
                if (c6019e2 == null) {
                    c6019e2 = C1158e.appmetrica();
                }
                environmentalReverb.setEnabled(c6019e2.f12677e);
                float floatValue = ((Number) AbstractC3062e.purchase(Float.valueOf(c6019e2.f12676e), new C3721e(0.0f, 1.0f))).floatValue() * (-1000);
                short s = (short) floatValue;
                environmentalReverb.setRoomLevel(s);
                environmentalReverb.setReflectionsLevel(s);
                environmentalReverb.setDecayTime((int) (Math.abs(floatValue) + 500));
                return false;
        }
    }
}
