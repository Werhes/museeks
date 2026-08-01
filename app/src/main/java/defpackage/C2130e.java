package defpackage;

import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٜؓ۟, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2130e implements InterfaceC11152e {
    public final /* synthetic */ AbstractC15958e ad;

    public C2130e(AbstractC15958e abstractC15958e) {
        this.ad = abstractC15958e;
    }

    @Override // defpackage.InterfaceC11152e
    public final boolean ad(ArrayList arrayList, ArrayList arrayList2) {
        AbstractC15958e abstractC15958e = this.ad;
        ArrayList arrayList3 = abstractC15958e.amazon;
        if (AbstractC15958e.m4045native(2)) {
            Log.v("FragmentManager", "FragmentManager has the following pending actions inside of prepareBackStackState: " + abstractC15958e.ad);
        }
        boolean z = false;
        if (abstractC15958e.license.isEmpty()) {
            Log.i("FragmentManager", "Ignoring call to start back stack pop because the back stack is empty.");
        } else {
            C10159e c10159e = (C10159e) AbstractC17861e.mopub(1, abstractC15958e.license);
            abstractC15958e.yandex = c10159e;
            Iterator it = c10159e.ad.iterator();
            while (it.hasNext()) {
                AbstractComponentCallbacksC17875e abstractComponentCallbacksC17875e = ((C7659e) it.next()).vip;
                if (abstractComponentCallbacksC17875e != null) {
                    abstractComponentCallbacksC17875e.f35070e = true;
                }
            }
            z = abstractC15958e.m4056implements(arrayList, arrayList2, -1, 0);
        }
        if (!arrayList3.isEmpty() && arrayList.size() > 0) {
            ((Boolean) arrayList2.get(arrayList.size() - 1)).getClass();
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                linkedHashSet.addAll(AbstractC15958e.firebase((C10159e) it2.next()));
            }
            Iterator it3 = arrayList3.iterator();
            while (it3.hasNext()) {
                if (it3.next() != null) {
                    throw new ClassCastException();
                }
                Iterator it4 = linkedHashSet.iterator();
                if (it4.hasNext()) {
                    throw null;
                }
            }
        }
        return z;
    }
}
