package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌؔٙ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2667e {
    public static final List vip = AbstractC6874e.startapp(new C2667e(1), new C2667e(2), new C2667e(4));
    public final int ad;

    public /* synthetic */ C2667e(int i) {
        this.ad = i;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C2667e) {
            return this.ad == ((C2667e) obj).ad;
        }
        return false;
    }

    public final int hashCode() {
        return this.ad;
    }

    public final String toString() {
        int i = this.ad;
        if (i == 1) {
            return "CR";
        }
        if (i == 2) {
            return "LF";
        }
        if (i == 4) {
            return "CRLF";
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : vip) {
            if ((((C2667e) obj).ad | i) == i) {
                arrayList.add(obj);
            }
        }
        return arrayList.toString();
    }
}
