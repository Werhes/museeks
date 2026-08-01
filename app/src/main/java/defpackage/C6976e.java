package defpackage;

import android.content.res.ColorStateList;
import android.graphics.Color;
import android.util.Property;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؙؚٓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C6976e extends Property {
    public final /* synthetic */ AbstractC10517e ad;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6976e(AbstractC10517e abstractC10517e) {
        super(Float.class, "LABEL_OPACITY_PROPERTY");
        this.ad = abstractC10517e;
    }

    @Override // android.util.Property
    public final Object get(Object obj) {
        ExtendedFloatingActionButton extendedFloatingActionButton = (ExtendedFloatingActionButton) obj;
        return Float.valueOf(AbstractC16664e.ad(0.0f, 1.0f, (Color.alpha(extendedFloatingActionButton.getCurrentTextColor()) / 255.0f) / Color.alpha(extendedFloatingActionButton.f870e.getColorForState(extendedFloatingActionButton.getDrawableState(), this.ad.vip.f870e.getDefaultColor()))));
    }

    @Override // android.util.Property
    public final void set(Object obj, Object obj2) {
        ExtendedFloatingActionButton extendedFloatingActionButton = (ExtendedFloatingActionButton) obj;
        Float f = (Float) obj2;
        int colorForState = extendedFloatingActionButton.f870e.getColorForState(extendedFloatingActionButton.getDrawableState(), this.ad.vip.f870e.getDefaultColor());
        ColorStateList valueOf = ColorStateList.valueOf(Color.argb((int) (AbstractC16664e.ad(0.0f, Color.alpha(colorForState) / 255.0f, f.floatValue()) * 255.0f), Color.red(colorForState), Color.green(colorForState), Color.blue(colorForState)));
        if (f.floatValue() == 1.0f) {
            extendedFloatingActionButton.purchase(extendedFloatingActionButton.f870e);
        } else {
            extendedFloatingActionButton.purchase(valueOf);
        }
    }
}
