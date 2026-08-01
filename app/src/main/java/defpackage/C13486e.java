package defpackage;

import android.os.Bundle;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eْْۚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C13486e {
    public final /* synthetic */ int ad = 2;
    public boolean metrica;
    public List vip;

    public /* synthetic */ C13486e() {
    }

    public C13486e(ArrayList arrayList, boolean z) {
        if (arrayList.isEmpty()) {
            this.vip = Collections.EMPTY_LIST;
        } else {
            this.vip = DesugarCollections.unmodifiableList(new ArrayList(arrayList));
        }
        this.metrica = z;
    }

    public C13486e(List list, boolean z) {
        this.vip = list;
        this.metrica = z;
    }

    public static C13486e ad(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList parcelableArrayList = bundle.getParcelableArrayList("routes");
        if (parcelableArrayList != null) {
            for (int i = 0; i < parcelableArrayList.size(); i++) {
                Bundle bundle2 = (Bundle) parcelableArrayList.get(i);
                arrayList.add(bundle2 != null ? new C16289e(bundle2) : null);
            }
        }
        return new C13486e(arrayList, bundle.getBoolean("supportsDynamicGroupRoute", false));
    }

    public String toString() {
        switch (this.ad) {
            case 1:
                StringBuilder sb = new StringBuilder("MediaRouteProviderDescriptor{ routes=");
                List list = this.vip;
                sb.append(Arrays.toString(list.toArray()));
                sb.append(", isValid=");
                int size = list.size();
                boolean z = false;
                int i = 0;
                while (true) {
                    if (i >= size) {
                        z = true;
                    } else {
                        C16289e c16289e = (C16289e) list.get(i);
                        if (c16289e != null && c16289e.appmetrica()) {
                            i++;
                        }
                    }
                }
                return AbstractC8703e.signatures(sb, z, " }");
            default:
                return super.toString();
        }
    }
}
