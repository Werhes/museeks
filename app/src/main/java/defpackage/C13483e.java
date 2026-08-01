package defpackage;

import android.graphics.Rect;
import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍْۚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C13483e extends AbstractC16858e implements Function1 {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ ViewTreeObserverOnGlobalFocusChangeListenerC17789e f26756e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ int f26757e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C13483e(ViewTreeObserverOnGlobalFocusChangeListenerC17789e viewTreeObserverOnGlobalFocusChangeListenerC17789e, int i) {
        super(1);
        this.f26757e = i;
        this.f26756e = viewTreeObserverOnGlobalFocusChangeListenerC17789e;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f26757e) {
            case 0:
                C5732e c5732e = (C5732e) obj;
                ViewTreeObserverOnGlobalFocusChangeListenerC17789e viewTreeObserverOnGlobalFocusChangeListenerC17789e = this.f26756e;
                View purchase = AbstractC1660e.purchase(viewTreeObserverOnGlobalFocusChangeListenerC17789e);
                if (!purchase.isFocused() && !purchase.hasFocus()) {
                    InterfaceC16054e focusOwner = ((ViewTreeObserverOnGlobalLayoutListenerC5014e) AbstractC5851e.advert(viewTreeObserverOnGlobalFocusChangeListenerC17789e)).getFocusOwner();
                    View crashlytics = AbstractC13482e.crashlytics(viewTreeObserverOnGlobalFocusChangeListenerC17789e);
                    Integer metrica = AbstractC12410e.metrica(c5732e.ad);
                    int[] iArr = new int[2];
                    crashlytics.getLocationOnScreen(iArr);
                    int[] iArr2 = new int[2];
                    purchase.getLocationOnScreen(iArr2);
                    C11795e metrica2 = AbstractC11267e.metrica(((C8212e) focusOwner).metrica);
                    Rect rect = null;
                    C0763e license = metrica2 != null ? AbstractC11267e.license(metrica2) : null;
                    if (license != null) {
                        int i = (int) license.ad;
                        int i2 = iArr[0];
                        int i3 = iArr2[0];
                        int i4 = (int) license.vip;
                        int i5 = iArr[1];
                        int i6 = iArr2[1];
                        rect = new Rect((i + i2) - i3, (i4 + i5) - i6, (((int) license.metrica) + i2) - i3, (((int) license.license) + i5) - i6);
                    }
                    if (!AbstractC12410e.vip(purchase, metrica, rect)) {
                        c5732e.vip = true;
                    }
                }
                return Unit.INSTANCE;
            default:
                AbstractC1660e.purchase(this.f26756e);
                return Unit.INSTANCE;
        }
    }
}
