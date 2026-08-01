package defpackage;

import android.view.KeyEvent;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eُٗٔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11041e extends AbstractC13616e implements InterfaceC13409e {

    /* renamed from: eؚٕؒ, reason: contains not printable characters */
    public Function1 f21872e;

    /* renamed from: eًؕۙ, reason: contains not printable characters */
    public Function1 f21873e;

    @Override // defpackage.InterfaceC13409e
    public final boolean amazon(KeyEvent keyEvent) {
        Function1 function1 = this.f21873e;
        if (function1 != null) {
            return ((Boolean) function1.invoke(new C15301e(keyEvent))).booleanValue();
        }
        return false;
    }

    @Override // defpackage.InterfaceC13409e
    /* renamed from: native */
    public final boolean mo719native(KeyEvent keyEvent) {
        Function1 function1 = this.f21872e;
        if (function1 != null) {
            return ((Boolean) function1.invoke(new C15301e(keyEvent))).booleanValue();
        }
        return false;
    }
}
