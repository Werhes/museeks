package defpackage;

import android.os.Build;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًؓؗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7673e {
    public static final /* synthetic */ C7673e ad = new Object();
    public static final String vip = InterfaceC9274e.class.getSimpleName();

    public static InterfaceC9274e ad() {
        int i = Build.VERSION.SDK_INT;
        return i >= 30 ? C8123e.f16497e : i >= 29 ? C6114e.f12845e : i >= 28 ? C10990e.f21754e : i >= 24 ? C5170e.f11055e : C5107e.f10952e;
    }
}
