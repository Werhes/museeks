package defpackage;

import android.media.session.PlaybackState;
import android.os.Bundle;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٔۡؐ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC15022e {
    public static Bundle ad(PlaybackState playbackState) {
        return playbackState.getExtras();
    }

    public static void vip(PlaybackState.Builder builder, Bundle bundle) {
        builder.setExtras(bundle);
    }
}
