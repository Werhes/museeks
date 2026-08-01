package defpackage;

import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؑۦ۠, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0712e implements InterfaceC17353e {
    public final C17280e ad;
    public final C2107e metrica;
    public final C9485e vip;

    public C0712e(C17280e c17280e, C9485e c9485e, C2107e c2107e) {
        this.ad = c17280e;
        this.vip = c9485e;
        this.metrica = c2107e;
    }

    @Override // defpackage.InterfaceC17353e
    public final InterfaceC13821e ad(InterfaceC18069e interfaceC18069e, Map map, C13135e c13135e) {
        int i;
        ArrayList arrayList;
        C4590e c4590e = C4590e.f9880e;
        C9485e c9485e = this.vip;
        int i2 = c9485e.yandex;
        if (i2 == 0) {
            i = 0;
        } else if (i2 == 1) {
            i = 1;
        } else {
            if (i2 == 2) {
                throw new IllegalArgumentException("Unsupported session mode: " + ((Object) AbstractC7291e.adcel(c9485e.yandex)));
            }
            i = i2;
        }
        C5138e license = AbstractC12026e.license(c9485e, this.metrica, map);
        ArrayList arrayList2 = license.ad;
        if (arrayList2.isEmpty()) {
            Log.w("CXCP", "Failed to create OutputConfigurations for " + c9485e);
            c13135e.ad();
            return c4590e;
        }
        ArrayList arrayList3 = c9485e.license;
        if (arrayList3 != null) {
            arrayList = new ArrayList(AbstractC0746e.subscription(arrayList3, 10));
            Iterator it = arrayList3.iterator();
            while (it.hasNext()) {
                AbstractC17549e abstractC17549e = (AbstractC17549e) AbstractC13480e.m3590instanceof(((C7811e) it.next()).ad.ad);
                arrayList.add(new C2308e(abstractC17549e.ad.getWidth(), abstractC17549e.ad.getHeight(), abstractC17549e.vip));
            }
        } else {
            arrayList = null;
        }
        ArrayList arrayList4 = arrayList;
        if (arrayList4 != null && !arrayList4.isEmpty()) {
            Iterator it2 = arrayList4.iterator();
            while (it2.hasNext()) {
                if (((C2308e) it2.next()).metrica != ((C2308e) arrayList4.get(0)).metrica) {
                    throw new IllegalStateException("All InputStream.Config objects must have the same format for multi resolution");
                }
            }
        }
        if (interfaceC18069e.crashlytics(new C14510e(i, arrayList4, arrayList2, (Executor) this.ad.yandex.getValue(), c13135e, c9485e.purchase, c9485e.billing))) {
            return new C16336e(license.vip, license.license);
        }
        Log.w("CXCP", "Failed to create capture session from " + interfaceC18069e + " for " + c13135e + '!');
        c13135e.ad();
        return c4590e;
    }
}
