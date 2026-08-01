package defpackage;

import android.view.View;
import android.view.ViewGroup;
import ua.itaysonlab.vkx.R;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eْۦً, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewOnAttachStateChangeListenerC13636e implements View.OnAttachStateChangeListener {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ Object f27056e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ Object f27057e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f27058e = 1;

    public ViewOnAttachStateChangeListenerC13636e(View view, C8574e c8574e) {
        this.f27057e = view;
        this.f27056e = c8574e;
    }

    public ViewOnAttachStateChangeListenerC13636e(LayoutInflaterFactory2C12133e layoutInflaterFactory2C12133e, C5221e c5221e) {
        this.f27056e = layoutInflaterFactory2C12133e;
        this.f27057e = c5221e;
    }

    private final void ad(View view) {
    }

    private final void vip(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        C9290e c9290e;
        switch (this.f27058e) {
            case 0:
                C5221e c5221e = (C5221e) this.f27057e;
                AbstractComponentCallbacksC17875e abstractComponentCallbacksC17875e = c5221e.metrica;
                c5221e.mopub();
                ViewGroup viewGroup = (ViewGroup) abstractComponentCallbacksC17875e.f35098e.getParent();
                ((AbstractC15958e) ((LayoutInflaterFactory2C12133e) this.f27056e).f24297e).m4055goto();
                Object tag = viewGroup.getTag(R.id.special_effects_controller_view_tag);
                if (tag instanceof C9290e) {
                    c9290e = (C9290e) tag;
                } else {
                    c9290e = new C9290e(viewGroup);
                    viewGroup.setTag(R.id.special_effects_controller_view_tag, c9290e);
                }
                c9290e.yandex();
                return;
            default:
                return;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        switch (this.f27058e) {
            case 0:
                return;
            default:
                ((View) this.f27057e).removeOnAttachStateChangeListener(this);
                ((C8574e) this.f27056e).subs();
                return;
        }
    }
}
