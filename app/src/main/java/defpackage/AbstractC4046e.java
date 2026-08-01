package defpackage;

import android.os.Build;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eِؖؔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC4046e {
    public static final C16591e ad = new C16591e("MagnifierPositionInRoot");

    public static boolean ad() {
        return Build.VERSION.SDK_INT >= 28;
    }

    public static InterfaceC12864e vip(Function1 function1, Function1 function12, InterfaceC15277e interfaceC15277e) {
        return ad() ? new C0379e(function1, function12, interfaceC15277e) : C0115e.f1276e;
    }
}
