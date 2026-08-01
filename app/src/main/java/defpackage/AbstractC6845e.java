package defpackage;

import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؚؑؑ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC6845e {
    public static final Object ad = AbstractC18039e.appmetrica(3, new C0996e(15));

    public static final AbstractC10727e ad(Drawable drawable, C13770e c13770e) {
        c13770e.m3676strictfp(1756822313);
        c13770e.m3676strictfp(289266787);
        boolean purchase = c13770e.purchase(drawable);
        Object m3681throw = c13770e.m3681throw();
        if (purchase || m3681throw == C2987e.ad) {
            if (drawable == null) {
                m3681throw = C13030e.f25952e;
            } else {
                m3681throw = drawable instanceof ColorDrawable ? new C6159e(AbstractC6532e.vip(((ColorDrawable) drawable).getColor())) : new C5530e(drawable.mutate());
            }
            c13770e.m3682throws(m3681throw);
        }
        AbstractC10727e abstractC10727e = (AbstractC10727e) m3681throw;
        c13770e.Signature(false);
        c13770e.Signature(false);
        return abstractC10727e;
    }
}
