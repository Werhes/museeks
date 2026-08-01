package defpackage;

import android.util.Log;
import android.view.Surface;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌؓۜ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1698e implements InterfaceC17353e {
    public final C2107e ad;

    public C1698e(C2107e c2107e) {
        this.ad = c2107e;
    }

    @Override // defpackage.InterfaceC17353e
    public final InterfaceC13821e ad(InterfaceC18069e interfaceC18069e, Map map, C13135e c13135e) {
        ArrayList arrayList = new ArrayList(map.size());
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            arrayList.add((Surface) ((Map.Entry) it.next()).getValue());
        }
        if (interfaceC18069e.mo3564extends(arrayList, c13135e)) {
            return new C16336e(C9139e.f18290e, AbstractC12026e.vip(map, this.ad));
        }
        Log.w("CXCP", "Failed to create ConstrainedHighSpeedCaptureSession from " + interfaceC18069e + " for " + c13135e + '!');
        c13135e.ad();
        return C4590e.f9880e;
    }
}
