package defpackage;

import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٓؔۧ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C13755e implements InterfaceC1626e {
    public final ArrayList ad;

    public C13755e(Context context, C9257e c9257e) {
        ArrayList arrayList = new ArrayList();
        this.ad = arrayList;
        arrayList.add(new C17721e(context, c9257e));
    }

    @Override // defpackage.InterfaceC1626e
    public final void ad(C9271e c9271e) {
        Iterator it = this.ad.iterator();
        while (it.hasNext()) {
            ((InterfaceC1626e) it.next()).ad(c9271e);
        }
    }
}
