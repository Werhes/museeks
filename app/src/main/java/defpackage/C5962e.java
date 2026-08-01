package defpackage;

import android.hardware.camera2.params.InputConfiguration;
import android.util.Log;
import android.view.Surface;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘۡؕ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5962e implements InterfaceC17353e {
    public final /* synthetic */ int ad;
    public final C9485e metrica;
    public final C2107e vip;

    public /* synthetic */ C5962e(C2107e c2107e, C9485e c9485e, int i) {
        this.ad = i;
        this.vip = c2107e;
        this.metrica = c9485e;
    }

    @Override // defpackage.InterfaceC17353e
    public final InterfaceC13821e ad(InterfaceC18069e interfaceC18069e, Map map, C13135e c13135e) {
        boolean mo3565final;
        switch (this.ad) {
            case 0:
                C4590e c4590e = C4590e.f9880e;
                ArrayList arrayList = this.metrica.license;
                if (arrayList != null) {
                    AbstractC17549e abstractC17549e = (AbstractC17549e) AbstractC13480e.m3590instanceof(((C7811e) AbstractC13480e.m3590instanceof(arrayList)).ad.ad);
                    InputConfiguration inputConfiguration = new InputConfiguration(abstractC17549e.ad.getWidth(), abstractC17549e.ad.getHeight(), abstractC17549e.vip);
                    ArrayList arrayList2 = new ArrayList(map.size());
                    Iterator it = map.entrySet().iterator();
                    while (it.hasNext()) {
                        arrayList2.add((Surface) ((Map.Entry) it.next()).getValue());
                    }
                    if (!interfaceC18069e.mo3562const(inputConfiguration, arrayList2, c13135e)) {
                        Log.w("CXCP", "Failed to create reprocessable captures session from " + interfaceC18069e + " for " + c13135e + '!');
                        c13135e.ad();
                        return c4590e;
                    }
                } else {
                    ArrayList arrayList3 = new ArrayList(map.size());
                    Iterator it2 = map.entrySet().iterator();
                    while (it2.hasNext()) {
                        arrayList3.add((Surface) ((Map.Entry) it2.next()).getValue());
                    }
                    if (!interfaceC18069e.mo3561break(arrayList3, c13135e)) {
                        Log.w("CXCP", "Failed to create captures session from " + interfaceC18069e + " for " + c13135e + '!');
                        c13135e.ad();
                        return c4590e;
                    }
                }
                return new C16336e(C9139e.f18290e, AbstractC12026e.vip(map, this.vip));
            default:
                C4590e c4590e2 = C4590e.f9880e;
                C2107e c2107e = this.vip;
                C9485e c9485e = this.metrica;
                C5138e license = AbstractC12026e.license(c9485e, c2107e, map);
                ArrayList arrayList4 = license.ad;
                if (arrayList4.isEmpty()) {
                    Log.w("CXCP", "Failed to create OutputConfigurations for " + c9485e);
                    c13135e.ad();
                    return c4590e2;
                }
                ArrayList arrayList5 = c9485e.license;
                if (arrayList5 == null) {
                    mo3565final = interfaceC18069e.mo3567implements(arrayList4, c13135e);
                } else {
                    AbstractC17549e abstractC17549e2 = (AbstractC17549e) AbstractC13480e.m3590instanceof(((C7811e) AbstractC13480e.m3590instanceof(arrayList5)).ad.ad);
                    mo3565final = interfaceC18069e.mo3565final(new C2308e(abstractC17549e2.ad.getWidth(), abstractC17549e2.ad.getHeight(), abstractC17549e2.vip), arrayList4, c13135e);
                }
                if (mo3565final) {
                    return new C16336e(C9139e.f18290e, license.license);
                }
                Log.w("CXCP", "Failed to create capture session from " + interfaceC18069e + " for " + c13135e + '!');
                c13135e.ad();
                return c4590e2;
        }
    }
}
