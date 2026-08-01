package defpackage;

import android.view.WindowInsets;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَٕؓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10273e extends AbstractC16858e implements Function1 {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ C9820e f20294e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ int f20295e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final /* synthetic */ C13915e f20296e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C10273e(C9820e c9820e, C13915e c13915e, int i) {
        super(1);
        this.f20295e = i;
        this.f20294e = c9820e;
        this.f20296e = c13915e;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        WindowInsets billing;
        switch (this.f20295e) {
            case 0:
                InterfaceC16590e interfaceC16590e = (InterfaceC16590e) obj;
                ViewTreeObserverOnGlobalLayoutListenerC5014e viewTreeObserverOnGlobalLayoutListenerC5014e = interfaceC16590e instanceof ViewTreeObserverOnGlobalLayoutListenerC5014e ? (ViewTreeObserverOnGlobalLayoutListenerC5014e) interfaceC16590e : null;
                C9820e c9820e = this.f20294e;
                if (viewTreeObserverOnGlobalLayoutListenerC5014e != null) {
                    HashMap<AbstractC9936e, C13915e> holderToLayoutNode = viewTreeObserverOnGlobalLayoutListenerC5014e.getAndroidViewsHandler$ui().getHolderToLayoutNode();
                    C13915e c13915e = this.f20296e;
                    holderToLayoutNode.put(c9820e, c13915e);
                    viewTreeObserverOnGlobalLayoutListenerC5014e.getAndroidViewsHandler$ui().addView(c9820e);
                    viewTreeObserverOnGlobalLayoutListenerC5014e.getAndroidViewsHandler$ui().getLayoutNodeToHolder().put(c13915e, c9820e);
                    c9820e.setImportantForAccessibility(1);
                    AbstractC2016e.loadAd(c9820e, new C16114e(viewTreeObserverOnGlobalLayoutListenerC5014e, c13915e, viewTreeObserverOnGlobalLayoutListenerC5014e));
                }
                if (c9820e.getView().getParent() != c9820e) {
                    c9820e.addView(c9820e.getView());
                }
                return Unit.INSTANCE;
            case 1:
                AbstractC8217e.metrica(this.f20294e, this.f20296e);
                return Unit.INSTANCE;
            default:
                C13915e c13915e2 = this.f20296e;
                C9820e c9820e2 = this.f20294e;
                AbstractC8217e.metrica(c9820e2, c13915e2);
                ((ViewTreeObserverOnGlobalLayoutListenerC5014e) c9820e2.f19639e).f10661e = true;
                int[] iArr = c9820e2.f19642e;
                int i = iArr[0];
                int i2 = iArr[1];
                c9820e2.getView().getLocationOnScreen(iArr);
                long j = c9820e2.f19646e;
                long advert = ((InterfaceC0043e) obj).advert();
                c9820e2.f19646e = advert;
                C12948e c12948e = c9820e2.f19647e;
                if (c12948e != null && ((i != iArr[0] || i2 != iArr[1] || !C12729e.vip(j, advert)) && (billing = c9820e2.smaato(c12948e).billing()) != null)) {
                    c9820e2.getView().dispatchApplyWindowInsets(billing);
                }
                return Unit.INSTANCE;
        }
    }
}
