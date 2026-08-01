package defpackage;

import android.view.MotionEvent;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٗؕۢ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC16776e {
    public static final C16658e ad = C5107e.f10951e;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.List, java.util.Collection, java.lang.Object] */
    public static final boolean ad(C2561e c2561e) {
        MotionEvent ad2;
        ?? r0 = c2561e.ad;
        int size = r0.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                break;
            }
            if (((C2401e) r0.get(i)).startapp == 2) {
                i++;
            } else {
                MotionEvent ad3 = c2561e.ad();
                if ((ad3 == null || !ad3.isFromSource(8194)) && ((ad2 = c2561e.ad()) == null || !ad2.isFromSource(1048584))) {
                    return false;
                }
            }
        }
        return true;
    }
}
