package defpackage;

import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؔٝٞ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2740e {
    public final List ad;

    public C2740e(List list) {
        this.ad = list;
        AbstractC17549e abstractC17549e = (AbstractC17549e) AbstractC13480e.m3591interface(list);
        if (list.isEmpty()) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (((AbstractC17549e) it.next()).vip != abstractC17549e.vip) {
                throw new IllegalStateException("All outputs must have the same format!");
            }
        }
    }

    public final String toString() {
        return "CameraStream.Config(outputs=" + this.ad + ", imageSourceConfig=null)";
    }
}
