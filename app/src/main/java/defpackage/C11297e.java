package defpackage;

import android.view.accessibility.AccessibilityEvent;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eُ۟ٓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11297e extends AbstractC16858e implements Function1 {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ ViewOnAttachStateChangeListenerC2004e f22690e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ int f22691e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C11297e(ViewOnAttachStateChangeListenerC2004e viewOnAttachStateChangeListenerC2004e, int i) {
        super(1);
        this.f22691e = i;
        this.f22690e = viewOnAttachStateChangeListenerC2004e;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f22691e) {
            case 0:
                ViewOnAttachStateChangeListenerC2004e viewOnAttachStateChangeListenerC2004e = this.f22690e;
                return Boolean.valueOf(viewOnAttachStateChangeListenerC2004e.f5236e.getParent().requestSendAccessibilityEvent(viewOnAttachStateChangeListenerC2004e.f5236e, (AccessibilityEvent) obj));
            default:
                C16905e c16905e = (C16905e) obj;
                if (c16905e.f33127e.contains(c16905e)) {
                    ViewOnAttachStateChangeListenerC2004e viewOnAttachStateChangeListenerC2004e2 = this.f22690e;
                    C15087e snapshotObserver = viewOnAttachStateChangeListenerC2004e2.f5236e.getSnapshotObserver();
                    snapshotObserver.ad.metrica(c16905e, viewOnAttachStateChangeListenerC2004e2.f5211e, new C14194e(c16905e, viewOnAttachStateChangeListenerC2004e2, 1));
                }
                return Unit.INSTANCE;
        }
    }
}
