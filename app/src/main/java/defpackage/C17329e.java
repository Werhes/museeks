package defpackage;

import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٗۡٗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C17329e implements InterfaceC13140e {
    public List ad;

    @Override // defpackage.InterfaceC13140e
    public final boolean ad(AbstractC14697e abstractC14697e) {
        Iterator it = this.ad.iterator();
        while (it.hasNext()) {
            if (crashlytics.m194this((C11026e) it.next(), abstractC14697e)) {
                return false;
            }
        }
        return true;
    }

    public final String toString() {
        return "not(" + this.ad + ")";
    }
}
