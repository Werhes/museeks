package defpackage;

import android.media.session.MediaController;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٜ٘ٞ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C17905e extends C0813e {
    @Override // defpackage.C13935e
    /* renamed from: strictfp */
    public final void mo3744strictfp(float f) {
        if (f == 0.0f) {
            throw new IllegalArgumentException("speed must not be zero");
        }
        ((MediaController.TransportControls) this.f27641e).setPlaybackSpeed(f);
    }
}
