package defpackage;

import android.R;
import android.content.res.ColorStateList;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؚۣٛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C7289e extends C2887e {

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public static final int[][] f14892e = {new int[]{R.attr.state_enabled, R.attr.state_checked}, new int[]{R.attr.state_enabled, -16842912}, new int[]{-16842910, R.attr.state_checked}, new int[]{-16842910, -16842912}};

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public ColorStateList f14893e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public boolean f14894e;

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.f14893e == null) {
            int advert = AbstractC9546e.advert(this, ua.itaysonlab.vkx.R.attr.colorControlActivated);
            int advert2 = AbstractC9546e.advert(this, ua.itaysonlab.vkx.R.attr.colorOnSurface);
            int advert3 = AbstractC9546e.advert(this, ua.itaysonlab.vkx.R.attr.colorSurface);
            this.f14893e = new ColorStateList(f14892e, new int[]{AbstractC9546e.admob(advert3, 1.0f, advert), AbstractC9546e.admob(advert3, 0.54f, advert2), AbstractC9546e.admob(advert3, 0.38f, advert2), AbstractC9546e.admob(advert3, 0.38f, advert2)});
        }
        return this.f14893e;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f14894e && getButtonTintList() == null) {
            setUseMaterialThemeColors(true);
        }
    }

    public void setUseMaterialThemeColors(boolean z) {
        this.f14894e = z;
        if (z) {
            setButtonTintList(getMaterialThemeColorsTintList());
        } else {
            setButtonTintList(null);
        }
    }
}
