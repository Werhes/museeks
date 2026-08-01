package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.Iterator;
import ua.itaysonlab.vkx.VKXApplication;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًّۡ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C12805e {
    public RunnableC12991e metrica;
    public final Handler ad = new Handler(Looper.getMainLooper());
    public final ArrayList vip = new ArrayList();
    public final C0576e license = AbstractC14533e.startapp(null);
    public final C0576e appmetrica = AbstractC14533e.startapp(null);
    public final C16330e purchase = new C16330e(0);
    public final C16330e billing = new C16330e(0);
    public final C0576e yandex = AbstractC14533e.startapp(Boolean.FALSE);

    public final void ad() {
        C7838e c7838e = VKXApplication.f36530e;
        if (c7838e == null) {
            c7838e = null;
        }
        c7838e.getClass();
        Long l = (Long) c7838e.yandex(new C1586e(c7838e, 0));
        long longValue = l != null ? l.longValue() : 0L;
        C7838e c7838e2 = VKXApplication.f36530e;
        C7838e c7838e3 = c7838e2 != null ? c7838e2 : null;
        c7838e3.getClass();
        long longValue2 = ((Number) c7838e3.yandex(new C1586e(c7838e3, 17))).longValue();
        ArrayList arrayList = this.vip;
        if (!arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            int i = 0;
            while (true) {
                if (!it.hasNext()) {
                    i = -1;
                    break;
                }
                InterfaceC12391e interfaceC12391e = (InterfaceC12391e) it.next();
                long vip = interfaceC12391e.vip() == 0 ? longValue2 : interfaceC12391e.vip();
                if (interfaceC12391e.ad() <= longValue && longValue <= vip) {
                    break;
                } else {
                    i++;
                }
            }
            C16330e c16330e = this.purchase;
            c16330e.startapp(i);
            int purchase = c16330e.purchase();
            C16330e c16330e2 = this.billing;
            if (purchase == -1 || !(arrayList.get(c16330e.purchase()) instanceof C13356e)) {
                c16330e2.startapp(0);
            } else {
                InterfaceC12391e interfaceC12391e2 = (InterfaceC12391e) arrayList.get(c16330e.purchase());
                long vip2 = (interfaceC12391e2.vip() - interfaceC12391e2.ad()) / 4;
                int i2 = longValue > interfaceC12391e2.ad() + vip2 ? 1 : 0;
                if (longValue > (2 * vip2) + interfaceC12391e2.ad()) {
                    i2++;
                }
                if (longValue > (vip2 * 3) + interfaceC12391e2.ad()) {
                    i2++;
                }
                c16330e2.startapp(i2);
            }
        }
        RunnableC12991e runnableC12991e = new RunnableC12991e(22, this);
        this.ad.postDelayed(runnableC12991e, 50L);
        this.metrica = runnableC12991e;
    }
}
