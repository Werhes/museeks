package defpackage;

import android.util.Size;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘؓۛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2084e {
    public static final Size ad = new Size(0, 0);
    public static final Size vip = new Size(320, 240);
    public static final Size metrica = new Size(640, 480);
    public static final Size license = new Size(720, 480);
    public static final Size appmetrica = new Size(1280, 720);
    public static final Size purchase = new Size(1920, 1080);
    public static final Size billing = new Size(1920, 1440);

    static {
        new Size(2560, 1440);
        new Size(3840, 2160);
    }

    public static int ad(Size size) {
        return size.getHeight() * size.getWidth();
    }
}
