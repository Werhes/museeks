package defpackage;

import android.util.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٖٙٞ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C16301e extends AbstractC13960e {
    public static final C14595e yandex = new C14595e(1);
    public final boolean appmetrica;
    public final HashMap vip = new HashMap();
    public final HashMap metrica = new HashMap();
    public final HashMap license = new HashMap();
    public boolean purchase = false;
    public boolean billing = false;

    public C16301e(boolean z) {
        this.appmetrica = z;
    }

    public final void appmetrica(String str, boolean z) {
        HashMap hashMap = this.metrica;
        C16301e c16301e = (C16301e) hashMap.get(str);
        if (c16301e != null) {
            if (z) {
                ArrayList arrayList = new ArrayList();
                arrayList.addAll(c16301e.metrica.keySet());
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    c16301e.license((String) it.next(), true);
                }
            }
            c16301e.vip();
            hashMap.remove(str);
        }
        HashMap hashMap2 = this.license;
        C13462e c13462e = (C13462e) hashMap2.get(str);
        if (c13462e != null) {
            c13462e.ad();
            hashMap2.remove(str);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C16301e.class == obj.getClass()) {
            C16301e c16301e = (C16301e) obj;
            if (this.vip.equals(c16301e.vip) && this.metrica.equals(c16301e.metrica) && this.license.equals(c16301e.license)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.license.hashCode() + ((this.metrica.hashCode() + (this.vip.hashCode() * 31)) * 31);
    }

    public final void license(String str, boolean z) {
        if (AbstractC15958e.m4045native(3)) {
            Log.d("FragmentManager", "Clearing non-config state for saved state of Fragment " + str);
        }
        appmetrica(str, z);
    }

    public final void metrica(AbstractComponentCallbacksC17875e abstractComponentCallbacksC17875e, boolean z) {
        if (AbstractC15958e.m4045native(3)) {
            Log.d("FragmentManager", "Clearing non-config state for " + abstractComponentCallbacksC17875e);
        }
        appmetrica(abstractComponentCallbacksC17875e.f35068e, z);
    }

    public final void purchase(AbstractComponentCallbacksC17875e abstractComponentCallbacksC17875e) {
        if (this.billing) {
            if (AbstractC15958e.m4045native(2)) {
                Log.v("FragmentManager", "Ignoring removeRetainedFragment as the state is already saved");
            }
        } else {
            if (this.vip.remove(abstractComponentCallbacksC17875e.f35068e) == null || !AbstractC15958e.m4045native(2)) {
                return;
            }
            Log.v("FragmentManager", "Updating retained Fragments: Removed " + abstractComponentCallbacksC17875e);
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FragmentManagerViewModel{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} Fragments (");
        Iterator it = this.vip.values().iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") Child Non Config (");
        Iterator it2 = this.metrica.keySet().iterator();
        while (it2.hasNext()) {
            sb.append((String) it2.next());
            if (it2.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") ViewModelStores (");
        Iterator it3 = this.license.keySet().iterator();
        while (it3.hasNext()) {
            sb.append((String) it3.next());
            if (it3.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(')');
        return sb.toString();
    }

    @Override // defpackage.AbstractC13960e
    public final void vip() {
        if (AbstractC15958e.m4045native(3)) {
            Log.d("FragmentManager", "onCleared called for " + this);
        }
        this.purchase = true;
    }
}
