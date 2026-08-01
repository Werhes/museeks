package defpackage;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؚٔٗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C14574e implements InterfaceC8498e {
    public final /* synthetic */ int ad;
    public final /* synthetic */ Object vip;

    public /* synthetic */ C14574e(int i, Object obj) {
        this.ad = i;
        this.vip = obj;
    }

    public /* synthetic */ C14574e(C14136e c14136e, C13391e c13391e) {
        this.ad = 0;
        this.vip = c13391e;
    }

    @Override // defpackage.InterfaceC8498e
    public final Bundle ad() {
        C6571e[] c6571eArr;
        switch (this.ad) {
            case 0:
                C13391e c13391e = (C13391e) this.vip;
                Bundle bundle = new Bundle();
                if (Boolean.TRUE.booleanValue()) {
                    C8633e admob = c13391e.admob();
                    bundle.putParcelable("STATE_KEEPER_STATE", new C4048e(admob, new C5363e(new Celse(admob, C8633e.Companion.serializer(), 21))));
                }
                return bundle;
            case 1:
                AbstractActivityC15824e abstractActivityC15824e = (AbstractActivityC15824e) this.vip;
                Bundle bundle2 = new Bundle();
                C6127e c6127e = abstractActivityC15824e.f31252e;
                c6127e.getClass();
                LinkedHashMap linkedHashMap = c6127e.vip;
                bundle2.putIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS", new ArrayList<>(linkedHashMap.values()));
                bundle2.putStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS", new ArrayList<>(linkedHashMap.keySet()));
                bundle2.putStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS", new ArrayList<>(c6127e.license));
                bundle2.putBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT", new Bundle(c6127e.billing));
                return bundle2;
            case 2:
                Map license = ((C16537e) this.vip).license();
                Bundle bundle3 = new Bundle();
                for (Map.Entry entry : license.entrySet()) {
                    String str = (String) entry.getKey();
                    List list = (List) entry.getValue();
                    bundle3.putParcelableArrayList(str, list instanceof ArrayList ? (ArrayList) list : new ArrayList<>(list));
                }
                return bundle3;
            case 3:
                AbstractActivityC1752e abstractActivityC1752e = (AbstractActivityC1752e) this.vip;
                do {
                } while (AbstractActivityC1752e.Signature(((C2386e) abstractActivityC1752e.f4791e.f15896e).f6095e));
                abstractActivityC1752e.f4794e.appmetrica(EnumC14621e.ON_STOP);
                return new Bundle();
            case 4:
                return ((AbstractC15958e) this.vip).m4065super();
            default:
                C18464e c18464e = (C18464e) this.vip;
                for (Map.Entry entry2 : AbstractC10064e.advert((LinkedHashMap) c18464e.f36189e).entrySet()) {
                    c18464e.m4490e(((C1615e) ((InterfaceC8384e) entry2.getValue())).getValue(), (String) entry2.getKey());
                }
                for (Map.Entry entry3 : AbstractC10064e.advert((LinkedHashMap) c18464e.f36190e).entrySet()) {
                    c18464e.m4490e(((InterfaceC8498e) entry3.getValue()).ad(), (String) entry3.getKey());
                }
                LinkedHashMap linkedHashMap2 = (LinkedHashMap) c18464e.f36191e;
                if (linkedHashMap2.isEmpty()) {
                    c6571eArr = new C6571e[0];
                } else {
                    ArrayList arrayList = new ArrayList(linkedHashMap2.size());
                    for (Map.Entry entry4 : linkedHashMap2.entrySet()) {
                        arrayList.add(new C6571e((String) entry4.getKey(), entry4.getValue()));
                    }
                    c6571eArr = (C6571e[]) arrayList.toArray(new C6571e[0]);
                }
                return AbstractC2301e.vip((C6571e[]) Arrays.copyOf(c6571eArr, c6571eArr.length));
        }
    }
}
