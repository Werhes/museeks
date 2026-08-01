package defpackage;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import androidx.appcompat.widget.SwitchCompat;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؙۜۢ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC6677e extends SwitchCompat {

    /* renamed from: eٔۜۙ, reason: contains not printable characters */
    public static final int[][] f13773e = {new int[]{R.attr.state_enabled, R.attr.state_checked}, new int[]{R.attr.state_enabled, -16842912}, new int[]{-16842910, R.attr.state_checked}, new int[]{-16842910, -16842912}};

    /* renamed from: eؘؙؕ, reason: contains not printable characters */
    public boolean f13774e;

    /* renamed from: eًؕ۟, reason: contains not printable characters */
    public ColorStateList f13775e;

    /* renamed from: eِۢٔ, reason: contains not printable characters */
    public ColorStateList f13776e;

    /* renamed from: eًٜ٘, reason: contains not printable characters */
    public final C15190e f13777e;

    public AbstractC6677e(Context context, AttributeSet attributeSet) {
        super(AbstractC14436e.purchase(context, attributeSet, ua.itaysonlab.vkx.R.attr.switchStyle, ua.itaysonlab.vkx.R.style.Widget_MaterialComponents_CompoundButton_Switch), attributeSet, 0);
        Context context2 = getContext();
        this.f13777e = new C15190e(context2);
        AbstractC15787e.ad(context2, attributeSet, ua.itaysonlab.vkx.R.attr.switchStyle, ua.itaysonlab.vkx.R.style.Widget_MaterialComponents_CompoundButton_Switch);
        int[] iArr = AbstractC11408e.f22937goto;
        AbstractC15787e.vip(context2, attributeSet, iArr, ua.itaysonlab.vkx.R.attr.switchStyle, ua.itaysonlab.vkx.R.style.Widget_MaterialComponents_CompoundButton_Switch, new int[0]);
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr, ua.itaysonlab.vkx.R.attr.switchStyle, ua.itaysonlab.vkx.R.style.Widget_MaterialComponents_CompoundButton_Switch);
        this.f13774e = obtainStyledAttributes.getBoolean(0, false);
        obtainStyledAttributes.recycle();
    }

    private ColorStateList getMaterialThemeColorsThumbTintList() {
        if (this.f13776e == null) {
            int advert = AbstractC9546e.advert(this, ua.itaysonlab.vkx.R.attr.colorSurface);
            int advert2 = AbstractC9546e.advert(this, ua.itaysonlab.vkx.R.attr.colorControlActivated);
            float dimension = getResources().getDimension(ua.itaysonlab.vkx.R.dimen.mtrl_switch_thumb_elevation);
            C15190e c15190e = this.f13777e;
            if (c15190e.ad) {
                float f = 0.0f;
                for (ViewParent parent = getParent(); parent instanceof View; parent = parent.getParent()) {
                    WeakHashMap weakHashMap = AbstractC2016e.ad;
                    f += ((View) parent).getElevation();
                }
                dimension += f;
            }
            int ad = c15190e.ad(advert, dimension);
            this.f13776e = new ColorStateList(f13773e, new int[]{AbstractC9546e.admob(advert, 1.0f, advert2), ad, AbstractC9546e.admob(advert, 0.38f, advert2), ad});
        }
        return this.f13776e;
    }

    private ColorStateList getMaterialThemeColorsTrackTintList() {
        if (this.f13775e == null) {
            int advert = AbstractC9546e.advert(this, ua.itaysonlab.vkx.R.attr.colorSurface);
            int advert2 = AbstractC9546e.advert(this, ua.itaysonlab.vkx.R.attr.colorControlActivated);
            int advert3 = AbstractC9546e.advert(this, ua.itaysonlab.vkx.R.attr.colorOnSurface);
            this.f13775e = new ColorStateList(f13773e, new int[]{AbstractC9546e.admob(advert, 0.54f, advert2), AbstractC9546e.admob(advert, 0.32f, advert3), AbstractC9546e.admob(advert, 0.12f, advert2), AbstractC9546e.admob(advert, 0.12f, advert3)});
        }
        return this.f13775e;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f13774e && getThumbTintList() == null) {
            setThumbTintList(getMaterialThemeColorsThumbTintList());
        }
        if (this.f13774e && getTrackTintList() == null) {
            setTrackTintList(getMaterialThemeColorsTrackTintList());
        }
    }

    public void setUseMaterialThemeColors(boolean z) {
        this.f13774e = z;
        if (z) {
            setThumbTintList(getMaterialThemeColorsThumbTintList());
            setTrackTintList(getMaterialThemeColorsTrackTintList());
        } else {
            setThumbTintList(null);
            setTrackTintList(null);
        }
    }
}
