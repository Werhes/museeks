package defpackage;

import android.view.View;
import android.view.ViewParent;
import java.util.Iterator;
import ua.itaysonlab.vkx.R;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؕؑؔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewOnAttachStateChangeListenerC3060e implements View.OnAttachStateChangeListener {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ AbstractC5133e f7125e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f7126e;

    public /* synthetic */ ViewOnAttachStateChangeListenerC3060e(AbstractC5133e abstractC5133e, int i) {
        this.f7126e = i;
        this.f7125e = abstractC5133e;
    }

    private final void ad(View view) {
    }

    private final void vip(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        int i = this.f7126e;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        boolean z;
        switch (this.f7126e) {
            case 0:
                this.f7125e.appmetrica();
                return;
            default:
                AbstractC5133e abstractC5133e = this.f7125e;
                Iterator it = AbstractC7762e.advert(abstractC5133e.getParent(), C12226e.f24544e).iterator();
                while (true) {
                    if (it.hasNext()) {
                        Object obj = (ViewParent) it.next();
                        if (obj instanceof View) {
                            Object tag = ((View) obj).getTag(R.id.is_pooling_container_tag);
                            Boolean bool = tag instanceof Boolean ? (Boolean) tag : null;
                            if (bool != null ? bool.booleanValue() : false) {
                                z = true;
                            }
                        }
                    }
                }
                if (z) {
                    return;
                }
                abstractC5133e.appmetrica();
                return;
        }
    }
}
