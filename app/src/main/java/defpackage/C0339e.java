package defpackage;

import android.view.View;
import java.util.Comparator;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٖؑٚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0339e implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        C2159e c2159e = (C2159e) ((View) obj).getLayoutParams();
        C2159e c2159e2 = (C2159e) ((View) obj2).getLayoutParams();
        boolean z = c2159e.ad;
        return z != c2159e2.ad ? z ? 1 : -1 : c2159e.appmetrica - c2159e2.appmetrica;
    }
}
