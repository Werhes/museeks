package defpackage;

import android.view.ContentInfo;
import android.view.View;
import j$.util.Objects;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٗۜ۠, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC17277e {
    public static String[] ad(View view) {
        return view.getReceiveContentMimeTypes();
    }

    public static C4278e vip(View view, C4278e c4278e) {
        ContentInfo applovin = c4278e.ad.applovin();
        Objects.requireNonNull(applovin);
        ContentInfo performReceiveContent = view.performReceiveContent(applovin);
        if (performReceiveContent == null) {
            return null;
        }
        return performReceiveContent == applovin ? c4278e : new C4278e(new C7407e(performReceiveContent));
    }
}
