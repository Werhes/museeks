package defpackage;

import android.view.KeyEvent;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًِۖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11910e implements Function1 {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC3314e f23852e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ C15274e f23853e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ Function0 f23854e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final /* synthetic */ C17612e f23855e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC18435e f23856e;

    public C11910e(InterfaceC18435e interfaceC18435e, Function0 function0, C15274e c15274e, C17612e c17612e, InterfaceC3314e interfaceC3314e) {
        this.f23856e = interfaceC18435e;
        this.f23854e = function0;
        this.f23853e = c15274e;
        this.f23855e = c17612e;
        this.f23852e = interfaceC3314e;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        KeyEvent keyEvent = ((C15301e) obj).ad;
        if (!AbstractC1660e.startapp(AbstractC9751e.ad, keyEvent.getKeyCode())) {
            return Boolean.FALSE;
        }
        int action = keyEvent.getAction();
        InterfaceC18435e interfaceC18435e = this.f23856e;
        C17612e c17612e = this.f23855e;
        C15274e c15274e = this.f23853e;
        if (action != 0) {
            if (action == 1) {
                InterfaceC3314e interfaceC3314e = this.f23852e;
                if (((Boolean) interfaceC3314e.getValue()).booleanValue()) {
                    interfaceC3314e.setValue(Boolean.FALSE);
                } else {
                    AbstractC5336e.purchase(interfaceC18435e, null, 0, new C5292e(c15274e, c17612e, null, 5), 3);
                    Function0 function0 = this.f23854e;
                    if (function0 != null) {
                        function0.invoke();
                    }
                }
            }
        } else if (keyEvent.getRepeatCount() == 0) {
            AbstractC5336e.purchase(interfaceC18435e, null, 0, new C5292e(c15274e, c17612e, null, 4), 3);
        }
        return Boolean.TRUE;
    }
}
