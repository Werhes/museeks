package defpackage;

import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؙؑٛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0408e implements InterfaceC4095e {
    public final ArrayList ad = new ArrayList();

    @Override // defpackage.InterfaceC4095e
    public final void onDestroy() {
        ArrayList arrayList = this.ad;
        Iterator it = AbstractC13480e.m3575continue(arrayList).iterator();
        while (it.hasNext()) {
            C16722e vip = ((InterfaceC10306e) it.next()).vip();
            if (vip != null) {
                vip.billing();
            }
        }
        arrayList.clear();
    }
}
