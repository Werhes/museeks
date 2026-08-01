package defpackage;

import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍَٗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C16900e {
    public final ColorStateList ad;
    public final int metrica;
    public final Configuration vip;

    public C16900e(ColorStateList colorStateList, Configuration configuration, Resources.Theme theme) {
        this.ad = colorStateList;
        this.vip = configuration;
        this.metrica = theme == null ? 0 : theme.hashCode();
    }
}
