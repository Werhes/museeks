package defpackage;

import android.content.Context;
import android.graphics.Color;
import ua.itaysonlab.vkx.R;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًٕؓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C15190e {
    public static final int purchase = (int) Math.round(5.1000000000000005d);
    public final boolean ad;
    public final float appmetrica;
    public final int license;
    public final int metrica;
    public final int vip;

    public C15190e(Context context) {
        boolean amazon = AbstractC9476e.amazon(context, R.attr.elevationOverlayEnabled, false);
        int mopub = AbstractC9546e.mopub(context, R.attr.elevationOverlayColor, 0);
        int mopub2 = AbstractC9546e.mopub(context, R.attr.elevationOverlayAccentColor, 0);
        int mopub3 = AbstractC9546e.mopub(context, R.attr.colorSurface, 0);
        float f = context.getResources().getDisplayMetrics().density;
        this.ad = amazon;
        this.vip = mopub;
        this.metrica = mopub2;
        this.license = mopub3;
        this.appmetrica = f;
    }

    public final int ad(int i, float f) {
        int i2;
        if (!this.ad || AbstractC3898e.startapp(i, 255) != this.license) {
            return i;
        }
        float min = (this.appmetrica <= 0.0f || f <= 0.0f) ? 0.0f : Math.min(((((float) Math.log1p(f / r1)) * 4.5f) + 2.0f) / 100.0f, 1.0f);
        int alpha = Color.alpha(i);
        int admob = AbstractC9546e.admob(AbstractC3898e.startapp(i, 255), min, this.vip);
        if (min > 0.0f && (i2 = this.metrica) != 0) {
            admob = AbstractC3898e.billing(AbstractC3898e.startapp(i2, purchase), admob);
        }
        return AbstractC3898e.startapp(admob, alpha);
    }
}
