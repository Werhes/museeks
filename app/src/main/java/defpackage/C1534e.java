package defpackage;

import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؓؒؕ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1534e implements InterfaceC4323e {
    public final ArrayList ad;

    public C1534e(Context context, C6758e c6758e) {
        ArrayList arrayList = new ArrayList();
        this.ad = arrayList;
        arrayList.add(new C15838e(context, c6758e));
    }

    @Override // defpackage.InterfaceC4323e
    public final void ad(C7306e c7306e) {
        Iterator it = this.ad.iterator();
        while (it.hasNext()) {
            ((InterfaceC4323e) it.next()).ad(c7306e);
        }
    }
}
