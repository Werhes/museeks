package defpackage;

import android.util.Size;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eُٕٗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public enum EnumC15386e {
    VGA(0, new Size(640, 480)),
    X_VGA(1, new Size(1024, 768)),
    S720P_16_9(2, new Size(1280, 720)),
    PREVIEW(3, null),
    S1080P_4_3(4, new Size(1440, 1080)),
    S1080P_16_9(5, new Size(1920, 1080)),
    S1440P_4_3(6, new Size(1920, 1440)),
    S1440P_16_9(7, new Size(2560, 1440)),
    UHD(8, new Size(3840, 2160)),
    RECORD(9, null),
    MAXIMUM(10, null),
    MAXIMUM_4_3(11, null),
    MAXIMUM_16_9(12, null),
    ULTRA_MAXIMUM(13, null),
    NOT_SUPPORT(14, null);


    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final Size f30338e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final int f30339e;

    EnumC15386e(int i, Size size) {
        this.f30339e = i;
        this.f30338e = size;
    }
}
