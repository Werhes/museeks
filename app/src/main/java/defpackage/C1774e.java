package defpackage;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eّؓۙ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1774e {
    public final Context ad;

    public C1774e(Context context) {
        this.ad = context;
    }

    public final void ad(String str) {
        try {
            this.ad.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
        } catch (ActivityNotFoundException e) {
            throw new IllegalArgumentException(AbstractC17861e.advert('.', "Can't open ", str), e);
        }
    }
}
