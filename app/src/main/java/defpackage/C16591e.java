package defpackage;

import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٖۣ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C16591e {
    public final String ad;
    public final boolean metrica;
    public final Function2 vip;

    public /* synthetic */ C16591e(String str) {
        this(str, C7123e.f14591e);
    }

    public C16591e(String str, int i) {
        this(str);
        this.metrica = true;
    }

    public C16591e(String str, Function2 function2) {
        this.ad = str;
        this.vip = function2;
    }

    public C16591e(String str, boolean z, Function2 function2) {
        this(str, function2);
        this.metrica = z;
    }

    public final String toString() {
        return "AccessibilityKey: " + this.ad;
    }
}
