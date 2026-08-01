package defpackage;

import android.app.PendingIntent;
import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍؘؑ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9170e {
    public final Bundle ad;
    public final boolean appmetrica;
    public final CharSequence billing;
    public final boolean license;
    public final AbstractC3496e[] metrica;
    public final int purchase;
    public IconCompat vip;
    public final PendingIntent yandex;

    public C9170e(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent) {
        this(iconCompat, charSequence, pendingIntent, new Bundle(), null, true, true);
    }

    public C9170e(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle, AbstractC3496e[] abstractC3496eArr, boolean z, boolean z2) {
        this.appmetrica = true;
        this.vip = iconCompat;
        if (iconCompat != null && iconCompat.billing() == 2) {
            this.purchase = iconCompat.appmetrica();
        }
        this.billing = C11389e.metrica(charSequence);
        this.yandex = pendingIntent;
        this.ad = bundle == null ? new Bundle() : bundle;
        this.metrica = abstractC3496eArr;
        this.license = z;
        this.appmetrica = z2;
    }
}
