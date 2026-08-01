package defpackage;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.Typeface;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eِ٘ؔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC17691e {
    public static final ThreadLocal ad = new ThreadLocal();

    public static Typeface ad(Typeface typeface, C7282e c7282e, Context context) {
        if (typeface == null) {
            return null;
        }
        if (c7282e.ad.isEmpty()) {
            return typeface;
        }
        ThreadLocal threadLocal = ad;
        Paint paint = (Paint) threadLocal.get();
        if (paint == null) {
            paint = new Paint();
            threadLocal.set(paint);
        }
        paint.setFontVariationSettings(null);
        paint.setTypeface(typeface);
        paint.setFontVariationSettings(AbstractC16048e.m4102extends(c7282e, context));
        return paint.getTypeface();
    }
}
