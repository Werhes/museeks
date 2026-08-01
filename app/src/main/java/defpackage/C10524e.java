package defpackage;

import android.content.Context;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَۛؓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10524e {
    public final Context ad;

    public C10524e(Context context, int i) {
        switch (i) {
            case 1:
                AbstractC9528e.startapp(context);
                Context applicationContext = context.getApplicationContext();
                AbstractC9528e.startapp(applicationContext);
                this.ad = applicationContext;
                return;
            default:
                this.ad = context;
                return;
        }
    }
}
