package defpackage;

import android.view.View;
import android.view.ViewParent;
import android.view.ViewTreeObserver;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٖ٘, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewTreeObserverOnGlobalFocusChangeListenerC17789e extends AbstractC13616e implements InterfaceC6505e, ViewTreeObserver.OnGlobalFocusChangeListener {

    /* renamed from: eؚٕؒ, reason: contains not printable characters */
    public ViewTreeObserver f34875e;

    /* renamed from: eًؕۙ, reason: contains not printable characters */
    public final C13483e f34876e = new C13483e(this, 0);

    /* renamed from: eؙِۛ, reason: contains not printable characters */
    public final C13483e f34874e = new C13483e(this, 1);

    @Override // defpackage.AbstractC13616e
    /* renamed from: eّْٝ */
    public final void mo228e() {
        ViewTreeObserver viewTreeObserver = this.f34875e;
        if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnGlobalFocusChangeListener(this);
        }
        this.f34875e = null;
        AbstractC13482e.crashlytics(this).getViewTreeObserver().removeOnGlobalFocusChangeListener(this);
    }

    /* renamed from: eٌٔٗ, reason: contains not printable characters */
    public final C11795e m4421e() {
        boolean z;
        if (!this.f27022e.f27016e) {
            AbstractC14070e.metrica("visitLocalDescendants called on an unattached node");
        }
        AbstractC13616e abstractC13616e = this.f27022e;
        if ((abstractC13616e.f27020e & 1024) != 0) {
            boolean z2 = false;
            for (AbstractC13616e abstractC13616e2 = abstractC13616e.f27024e; abstractC13616e2 != null; abstractC13616e2 = abstractC13616e2.f27024e) {
                if ((abstractC13616e2.f27014e & 1024) != 0) {
                    AbstractC13616e abstractC13616e3 = abstractC13616e2;
                    C12431e c12431e = null;
                    while (abstractC13616e3 != null) {
                        if (abstractC13616e3 instanceof C11795e) {
                            C11795e c11795e = (C11795e) abstractC13616e3;
                            if (z2) {
                                return c11795e;
                            }
                            z = false;
                            z2 = true;
                        } else {
                            z = true;
                        }
                        if (z && (abstractC13616e3.f27014e & 1024) != 0 && (abstractC13616e3 instanceof AbstractC6126e)) {
                            int i = 0;
                            for (AbstractC13616e abstractC13616e4 = ((AbstractC6126e) abstractC13616e3).f12873e; abstractC13616e4 != null; abstractC13616e4 = abstractC13616e4.f27024e) {
                                if ((abstractC13616e4.f27014e & 1024) != 0) {
                                    i++;
                                    if (i == 1) {
                                        abstractC13616e3 = abstractC13616e4;
                                    } else {
                                        if (c12431e == null) {
                                            c12431e = new C12431e(0, new AbstractC13616e[16]);
                                        }
                                        if (abstractC13616e3 != null) {
                                            c12431e.license(abstractC13616e3);
                                            abstractC13616e3 = null;
                                        }
                                        c12431e.license(abstractC13616e4);
                                    }
                                }
                            }
                            if (i == 1) {
                            }
                        }
                        abstractC13616e3 = AbstractC5851e.vip(c12431e);
                    }
                }
            }
        }
        throw new IllegalStateException("Could not find focus target of embedded view wrapper");
    }

    @Override // defpackage.AbstractC13616e
    /* renamed from: e٘ٔ٘ */
    public final void mo229e() {
        ViewTreeObserver viewTreeObserver = AbstractC13482e.crashlytics(this).getViewTreeObserver();
        this.f34875e = viewTreeObserver;
        viewTreeObserver.addOnGlobalFocusChangeListener(this);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalFocusChangeListener
    public final void onGlobalFocusChanged(View view, View view2) {
        boolean z;
        if (AbstractC5851e.mopub(this).f27599e == null) {
            return;
        }
        View purchase = AbstractC1660e.purchase(this);
        InterfaceC16054e focusOwner = ((ViewTreeObserverOnGlobalLayoutListenerC5014e) AbstractC5851e.advert(this)).getFocusOwner();
        InterfaceC16590e advert = AbstractC5851e.advert(this);
        boolean z2 = true;
        if (view != null && !view.equals(advert)) {
            for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
                if (parent == purchase.getParent()) {
                    z = true;
                    break;
                }
            }
        }
        z = false;
        if (view2 != null && !view2.equals(advert)) {
            for (ViewParent parent2 = view2.getParent(); parent2 != null; parent2 = parent2.getParent()) {
                if (parent2 == purchase.getParent()) {
                    break;
                }
            }
        }
        z2 = false;
        if (z && z2) {
            return;
        }
        if (z2) {
            C11795e m4421e = m4421e();
            if (m4421e.m3239e().ad()) {
                return;
            }
            AbstractC8439e.advert(m4421e);
            return;
        }
        if (z && m4421e().m3239e().vip()) {
            ((C8212e) focusOwner).vip(8, false, false);
        }
    }

    @Override // defpackage.InterfaceC6505e
    /* renamed from: this */
    public final void mo578this(InterfaceC12296e interfaceC12296e) {
        interfaceC12296e.license(false);
        interfaceC12296e.purchase(this.f34876e);
        interfaceC12296e.metrica(this.f34874e);
    }
}
