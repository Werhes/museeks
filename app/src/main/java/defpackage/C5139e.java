package defpackage;

import android.content.Context;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.os.Build;
import android.util.Log;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import kotlin.Unit;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eّؗۚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5139e implements InterfaceC6343e {
    public final Context ad;
    public final C7646e vip;
    public final Object metrica = new Object();
    public Object license = C9139e.f18290e;

    public C5139e(Context context, C7646e c7646e, Set set) {
        this.ad = context;
        this.vip = c7646e;
        try {
            ad(AbstractC13480e.m3575continue(set));
        } catch (C7311e e) {
            throw new Exception(e);
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.Map, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.util.Map, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v6, types: [java.util.Map, java.lang.Object] */
    @Override // defpackage.InterfaceC6343e
    public final void ad(List list) {
        List<String> list2;
        InterfaceC4716e interfaceC4716e;
        synchronized (this.metrica) {
            Set keySet = this.license.keySet();
            Set m3575continue = keySet instanceof Collection ? keySet : AbstractC13480e.m3575continue(keySet);
            if (m3575continue.isEmpty()) {
                list2 = AbstractC13480e.m3575continue(list);
            } else {
                ArrayList arrayList = new ArrayList();
                for (Object obj : list) {
                    if (!m3575continue.contains(obj)) {
                        arrayList.add(obj);
                    }
                }
                list2 = arrayList;
            }
            Unit unit = Unit.INSTANCE;
        }
        if (!list2.isEmpty() && AbstractC9464e.smaato("CXCP")) {
            Log.d("CXCP", "Creating new surface combinations for: " + list2);
        }
        C7646e c7646e = this.vip;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (!list2.isEmpty()) {
            try {
                for (String str : list2) {
                    C16417e ad = c7646e.ad();
                    C5060e.ad(str);
                    InterfaceC2531e license = AbstractC17861e.license(ad, str);
                    C1209e c1209e = new C1209e(license, new C15436e((StreamConfigurationMap) ((C9000e) license).metrica(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP), new C3031e(license)));
                    Context context = this.ad;
                    C2801e c2801e = new C2801e(str, c1209e.ad());
                    if (Build.VERSION.SDK_INT >= 35) {
                        C9872e c9872e = (C9872e) c7646e.ad.f6385e;
                        AbstractC1513e.appmetrica(c9872e);
                        interfaceC4716e = new C0909e(license, c9872e, c1209e);
                    } else {
                        interfaceC4716e = InterfaceC4716e.inmobi;
                    }
                    linkedHashMap.put(str, new C14132e(context, license, c2801e, interfaceC4716e));
                }
            } catch (C15895e e) {
                throw new Exception("Failed to query camera metadata", e);
            } catch (Exception e2) {
                throw new Exception("Failed to build surface combinations", e2);
            }
        }
        synchronized (this.metrica) {
            try {
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    String str2 = (String) it.next();
                    if (this.license.containsKey(str2)) {
                        linkedHashMap2.put(str2, this.license.get(str2));
                    }
                }
                linkedHashMap2.putAll(linkedHashMap);
                this.license = linkedHashMap2;
                if (AbstractC9464e.smaato("CXCP")) {
                    Log.d("CXCP", "Committed new surface combination map. Total cameras: " + linkedHashMap2.size());
                }
                Unit unit2 = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
