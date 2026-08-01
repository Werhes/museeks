package defpackage;

import android.graphics.Rect;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import kotlin.Unit;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٖۣۢ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C16586e extends AbstractC13616e implements InterfaceC6756e, InterfaceC17453e, InterfaceC13409e, InterfaceC17303e, InterfaceC6459e, InterfaceC5077e {

    /* renamed from: eؚٕؒ, reason: contains not printable characters */
    public final C17097e f32537e = new C17097e(2, this);

    /* renamed from: eًؕۙ, reason: contains not printable characters */
    public final /* synthetic */ ViewTreeObserverOnGlobalLayoutListenerC5014e f32538e;

    public C16586e(ViewTreeObserverOnGlobalLayoutListenerC5014e viewTreeObserverOnGlobalLayoutListenerC5014e) {
        this.f32538e = viewTreeObserverOnGlobalLayoutListenerC5014e;
    }

    @Override // defpackage.InterfaceC17303e
    public final /* synthetic */ int ad(AbstractC9292e abstractC9292e, InterfaceC16719e interfaceC16719e, int i) {
        return AbstractC0869e.appmetrica(this, abstractC9292e, interfaceC16719e, i);
    }

    @Override // defpackage.InterfaceC17453e
    public final void adcel(InterfaceC15671e interfaceC15671e) {
    }

    @Override // defpackage.InterfaceC6459e
    public final Object admob() {
        return "androidx.compose.ui.layout.WindowInsetsRulers";
    }

    @Override // defpackage.InterfaceC13409e
    public final boolean amazon(KeyEvent keyEvent) {
        return false;
    }

    @Override // defpackage.InterfaceC17303e
    public final /* synthetic */ int billing(AbstractC9292e abstractC9292e, InterfaceC16719e interfaceC16719e, int i) {
        return AbstractC0869e.billing(this, abstractC9292e, interfaceC16719e, i);
    }

    @Override // defpackage.InterfaceC17453e
    /* renamed from: break */
    public final /* synthetic */ boolean mo358break() {
        return false;
    }

    @Override // defpackage.InterfaceC17453e
    /* renamed from: eؒۖۗ */
    public final /* synthetic */ boolean mo359e() {
        return false;
    }

    @Override // defpackage.InterfaceC17303e
    public final InterfaceC17242e license(InterfaceC13158e interfaceC13158e, InterfaceC16719e interfaceC16719e, long j) {
        AbstractC2832e admob = interfaceC16719e.admob(j);
        return interfaceC13158e.mo500public(admob.f6806e, admob.f6804e, C9139e.f18290e, this.f32537e, new C8684e(admob, 0));
    }

    @Override // defpackage.InterfaceC13409e
    /* renamed from: native */
    public final boolean mo719native(KeyEvent keyEvent) {
        C10202e c10202e;
        int[] iArr = AbstractC12410e.ad;
        long startapp = AbstractC9835e.startapp(keyEvent);
        boolean z = true;
        if (AbstractC13232e.ad(startapp, AbstractC13232e.vip)) {
            c10202e = new C10202e(2);
        } else if (AbstractC13232e.ad(startapp, AbstractC13232e.metrica)) {
            c10202e = new C10202e(1);
        } else if (AbstractC13232e.ad(startapp, AbstractC13232e.Signature)) {
            c10202e = new C10202e(keyEvent.isShiftPressed() ? 2 : 1);
        } else {
            c10202e = AbstractC13232e.ad(startapp, AbstractC13232e.billing) ? new C10202e(4) : AbstractC13232e.ad(startapp, AbstractC13232e.purchase) ? new C10202e(3) : (AbstractC13232e.ad(startapp, AbstractC13232e.license) || AbstractC13232e.ad(startapp, AbstractC13232e.subs)) ? new C10202e(5) : (AbstractC13232e.ad(startapp, AbstractC13232e.appmetrica) || AbstractC13232e.ad(startapp, AbstractC13232e.crashlytics)) ? new C10202e(6) : (AbstractC13232e.ad(startapp, AbstractC13232e.yandex) || AbstractC13232e.ad(startapp, AbstractC13232e.subscription) || AbstractC13232e.ad(startapp, AbstractC13232e.firebase)) ? new C10202e(7) : (AbstractC13232e.ad(startapp, AbstractC13232e.ad) || AbstractC13232e.ad(startapp, AbstractC13232e.signatures)) ? new C10202e(8) : null;
        }
        if (c10202e != null) {
            int i = c10202e.ad;
            if (AbstractC9835e.adcel(keyEvent) == 2) {
                ViewTreeObserverOnGlobalLayoutListenerC5014e viewTreeObserverOnGlobalLayoutListenerC5014e = this.f32538e;
                C11795e purchase = ((C8212e) viewTreeObserverOnGlobalLayoutListenerC5014e.getFocusOwner()).purchase();
                if (purchase == null || !purchase.f23671e || !viewTreeObserverOnGlobalLayoutListenerC5014e.inmobi(i)) {
                    Boolean appmetrica = ((C8212e) viewTreeObserverOnGlobalLayoutListenerC5014e.getFocusOwner()).appmetrica(i, viewTreeObserverOnGlobalLayoutListenerC5014e.getEmbeddedViewFocusRect(), new C17097e(1, c10202e));
                    if (!(appmetrica != null ? appmetrica.booleanValue() : true)) {
                        if (i != 1 && i != 2) {
                            z = false;
                        }
                        if (z) {
                            Integer metrica = AbstractC12410e.metrica(i);
                            View findNextFocus = FocusFinder.getInstance().findNextFocus((ViewGroup) viewTreeObserverOnGlobalLayoutListenerC5014e.getRootView(), viewTreeObserverOnGlobalLayoutListenerC5014e.getView(), metrica != null ? metrica.intValue() : 2);
                            if (findNextFocus == null || findNextFocus.equals(viewTreeObserverOnGlobalLayoutListenerC5014e)) {
                                return ((C8212e) viewTreeObserverOnGlobalLayoutListenerC5014e.getFocusOwner()).yandex(i);
                            }
                        }
                    }
                }
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.InterfaceC17303e
    public final /* synthetic */ int purchase(AbstractC9292e abstractC9292e, InterfaceC16719e interfaceC16719e, int i) {
        return AbstractC0869e.metrica(this, abstractC9292e, interfaceC16719e, i);
    }

    @Override // defpackage.InterfaceC17453e
    public final /* synthetic */ boolean smaato() {
        return true;
    }

    @Override // defpackage.InterfaceC17303e
    public final /* synthetic */ int startapp(AbstractC9292e abstractC9292e, InterfaceC16719e interfaceC16719e, int i) {
        return AbstractC0869e.startapp(this, abstractC9292e, interfaceC16719e, i);
    }

    @Override // defpackage.InterfaceC6756e
    /* renamed from: while */
    public final Object mo2243while(AbstractC17732e abstractC17732e, C14194e c14194e, AbstractC10731e abstractC10731e) {
        long mo211this = abstractC17732e.mo211this(0L);
        C0763e c0763e = (C0763e) c14194e.invoke();
        C0763e amazon = c0763e != null ? c0763e.amazon(mo211this) : null;
        if (amazon != null) {
            this.f32538e.requestRectangleOnScreen(new Rect((int) amazon.ad, (int) amazon.vip, (int) amazon.metrica, (int) amazon.license), false);
        }
        return Unit.INSTANCE;
    }
}
