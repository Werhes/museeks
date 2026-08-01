package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import kotlin.Unit;
import ua.itaysonlab.vkx.R;
import ua.itaysonlab.vkx.VKXApplication;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؓٝۜ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1970e {
    public static final LayerDrawable ad(Context context, boolean z, int i, int i2, int i3) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(i);
        VKXApplication.Companion companion = VKXApplication.f36531e;
        gradientDrawable.setCornerRadius(VKXApplication.Companion.ad(z ? 32.0f : 8.0f));
        gradientDrawable.setBounds(0, 0, 10, 10);
        Unit unit = Unit.INSTANCE;
        Resources resources = context.getResources();
        Resources.Theme theme = context.getTheme();
        ThreadLocal threadLocal = AbstractC16340e.ad;
        Drawable drawable = resources.getDrawable(i3, theme);
        drawable.mutate();
        drawable.setTintList(ColorStateList.valueOf(i2));
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{gradientDrawable, drawable});
        layerDrawable.mutate();
        int ad = VKXApplication.Companion.ad(i3 == R.drawable.ic_playlist_outline_56 ? 12.0f : 8.0f);
        layerDrawable.setLayerInset(1, ad, ad, ad, ad);
        layerDrawable.setLayerGravity(1, 17);
        return layerDrawable;
    }
}
