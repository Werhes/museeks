package defpackage;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.LinkedHashMap;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌُّ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C12409e implements InterfaceC7805e {
    public final /* synthetic */ int ad;
    public final /* synthetic */ AbstractActivityC15824e vip;

    public /* synthetic */ C12409e(AbstractActivityC15824e abstractActivityC15824e, int i) {
        this.ad = i;
        this.vip = abstractActivityC15824e;
    }

    @Override // defpackage.InterfaceC7805e
    public final void ad() {
        switch (this.ad) {
            case 0:
                AbstractActivityC15824e abstractActivityC15824e = this.vip;
                Bundle isPro = ((C3168e) abstractActivityC15824e.f31251e.f12439e).isPro("android:support:activity-result");
                if (isPro != null) {
                    C6127e c6127e = abstractActivityC15824e.f31252e;
                    LinkedHashMap linkedHashMap = c6127e.vip;
                    LinkedHashMap linkedHashMap2 = c6127e.ad;
                    Bundle bundle = c6127e.billing;
                    ArrayList<Integer> integerArrayList = isPro.getIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS");
                    ArrayList<String> stringArrayList = isPro.getStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS");
                    if (stringArrayList == null || integerArrayList == null) {
                        return;
                    }
                    ArrayList<String> stringArrayList2 = isPro.getStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS");
                    if (stringArrayList2 != null) {
                        c6127e.license.addAll(stringArrayList2);
                    }
                    Bundle bundle2 = isPro.getBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT");
                    if (bundle2 != null) {
                        bundle.putAll(bundle2);
                    }
                    int size = stringArrayList.size();
                    for (int i = 0; i < size; i++) {
                        String str = stringArrayList.get(i);
                        if (linkedHashMap.containsKey(str)) {
                            Integer num = (Integer) linkedHashMap.remove(str);
                            if (!bundle.containsKey(str)) {
                                AbstractC9476e.metrica(linkedHashMap2).remove(num);
                            }
                        }
                        int intValue = integerArrayList.get(i).intValue();
                        String str2 = stringArrayList.get(i);
                        linkedHashMap2.put(Integer.valueOf(intValue), str2);
                        c6127e.vip.put(str2, Integer.valueOf(intValue));
                    }
                    return;
                }
                return;
            default:
                C2386e c2386e = (C2386e) ((AbstractActivityC1752e) this.vip).f4791e.f15896e;
                c2386e.f6095e.vip(c2386e, c2386e, null);
                return;
        }
    }
}
