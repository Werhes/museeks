package defpackage;

import android.view.MotionEvent;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌؗۤ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8513e extends AbstractC16858e implements Function1 {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ C9820e f17320e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ int f17321e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C8513e(C9820e c9820e, int i) {
        super(1);
        this.f17321e = i;
        this.f17320e = c9820e;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        boolean dispatchTouchEvent;
        switch (this.f17321e) {
            case 0:
                InterfaceC16590e interfaceC16590e = (InterfaceC16590e) obj;
                ViewTreeObserverOnGlobalLayoutListenerC5014e viewTreeObserverOnGlobalLayoutListenerC5014e = interfaceC16590e instanceof ViewTreeObserverOnGlobalLayoutListenerC5014e ? (ViewTreeObserverOnGlobalLayoutListenerC5014e) interfaceC16590e : null;
                C9820e c9820e = this.f17320e;
                if (viewTreeObserverOnGlobalLayoutListenerC5014e != null) {
                    viewTreeObserverOnGlobalLayoutListenerC5014e.getAndroidViewsHandler$ui().removeViewInLayout(c9820e);
                    AbstractC9476e.metrica(viewTreeObserverOnGlobalLayoutListenerC5014e.getAndroidViewsHandler$ui().getLayoutNodeToHolder()).remove(viewTreeObserverOnGlobalLayoutListenerC5014e.getAndroidViewsHandler$ui().getHolderToLayoutNode().remove(c9820e));
                    c9820e.setImportantForAccessibility(0);
                }
                c9820e.removeAllViewsInLayout();
                return Unit.INSTANCE;
            case 1:
                this.f17320e.f19645e = (Function1) obj;
                return Unit.INSTANCE;
            default:
                MotionEvent motionEvent = (MotionEvent) obj;
                int actionMasked = motionEvent.getActionMasked();
                C9820e c9820e2 = this.f17320e;
                switch (actionMasked) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                        dispatchTouchEvent = c9820e2.dispatchTouchEvent(motionEvent);
                        break;
                    default:
                        dispatchTouchEvent = c9820e2.dispatchGenericMotionEvent(motionEvent);
                        break;
                }
                return Boolean.valueOf(dispatchTouchEvent);
        }
    }
}
