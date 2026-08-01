package defpackage;

import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘؕۢ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC3178e extends Drawable {
    public static final double ad = Math.cos(Math.toRadians(45.0d));

    public static float ad(float f, float f2, boolean z) {
        if (!z) {
            return f;
        }
        return (float) (((1.0d - ad) * f2) + f);
    }

    public static float vip(float f, float f2, boolean z) {
        if (!z) {
            return f * 1.5f;
        }
        return (float) (((1.0d - ad) * f2) + (f * 1.5f));
    }
}
