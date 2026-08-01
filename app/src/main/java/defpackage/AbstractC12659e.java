package defpackage;

import android.view.ViewConfiguration;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eّۖٓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC12659e {
    public static final float ad = ViewConfiguration.getScrollFriction();
    public static final double metrica;
    public static final double vip;

    static {
        double log = Math.log(0.78d) / Math.log(0.9d);
        vip = log;
        metrica = log - 1.0d;
    }
}
