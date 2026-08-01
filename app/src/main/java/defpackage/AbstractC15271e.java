package defpackage;

import android.media.AudioAttributes;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٕؗۦ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC15271e {
    public static void ad(AudioAttributes.Builder builder, boolean z) {
        builder.setIsContentSpatialized(z);
    }

    public static void vip(AudioAttributes.Builder builder, int i) {
        builder.setSpatializationBehavior(i);
    }
}
