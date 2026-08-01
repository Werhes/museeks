package defpackage;

import android.media.LoudnessCodecController;
import android.media.MediaCodec;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؔٓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2559e {
    public final HashSet ad;
    public LoudnessCodecController metrica;
    public final C2282e vip;

    public C2559e() {
        C2282e c2282e = C2282e.f5780e;
        this.ad = new HashSet();
        this.vip = c2282e;
    }

    public final void ad(MediaCodec mediaCodec) {
        LoudnessCodecController loudnessCodecController = this.metrica;
        if (loudnessCodecController == null || loudnessCodecController.addMediaCodec(mediaCodec)) {
            AbstractC2301e.subscription(this.ad.add(mediaCodec));
        }
    }

    public final void license(int i) {
        LoudnessCodecController loudnessCodecController = this.metrica;
        if (loudnessCodecController != null) {
            loudnessCodecController.close();
            this.metrica = null;
        }
        LoudnessCodecController create = LoudnessCodecController.create(i, EnumC3320e.f7489e, new C18052e(this));
        this.metrica = create;
        Iterator it = this.ad.iterator();
        while (it.hasNext()) {
            if (!create.addMediaCodec((MediaCodec) it.next())) {
                it.remove();
            }
        }
    }

    public final void metrica(MediaCodec mediaCodec) {
        LoudnessCodecController loudnessCodecController;
        if (!this.ad.remove(mediaCodec) || (loudnessCodecController = this.metrica) == null) {
            return;
        }
        loudnessCodecController.removeMediaCodec(mediaCodec);
    }

    public final void vip() {
        this.ad.clear();
        LoudnessCodecController loudnessCodecController = this.metrica;
        if (loudnessCodecController != null) {
            loudnessCodecController.close();
        }
    }
}
