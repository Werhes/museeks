package defpackage;

import android.os.Build;
import java.util.LinkedHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍٍؑ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9173e {
    public final C14826e ad;
    public final C13935e vip = new C13935e(7);
    public final Object metrica = new Object();
    public final LinkedHashMap license = new LinkedHashMap();
    public final CopyOnWriteArrayList appmetrica = new CopyOnWriteArrayList();

    public C9173e(C17280e c17280e, C11802e c11802e, InterfaceC10500e interfaceC10500e) {
        this.ad = AbstractC9743e.ad(AbstractC5797e.vip(new C6799e(interfaceC10500e), AbstractC5797e.vip(c17280e.purchase, new C5621e("CXCP-AudioRestrictionControllerImpl"))));
        c11802e.metrica(2, new RunnableC17584e(9, this));
    }

    public final void ad(C13471e c13471e) {
        if (Build.VERSION.SDK_INT < 30) {
            return;
        }
        synchronized (this.metrica) {
            try {
                this.appmetrica.add(c13471e);
                C17816e vip = vip();
                if (vip != null) {
                    AbstractC5336e.purchase(this.ad, null, 4, new C1247e(this.vip, new C4870e(c13471e, vip, null, 0), (InterfaceC5083e) null), 1);
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void license(C12701e c12701e) {
        synchronized (this.metrica) {
            C17816e vip = vip();
            this.license.remove(c12701e);
            C17816e vip2 = vip();
            if (vip2 != null && !vip2.equals(vip)) {
                AbstractC5336e.purchase(this.ad, null, 4, new C1247e(this.vip, new C4870e(this, vip2, null, 1), (InterfaceC5083e) null), 1);
            }
            Unit unit = Unit.INSTANCE;
        }
    }

    public final void metrica() {
        synchronized (this.metrica) {
        }
    }

    public final C17816e vip() {
        LinkedHashMap linkedHashMap = this.license;
        if (linkedHashMap.containsValue(new C17816e(3))) {
            return new C17816e(3);
        }
        synchronized (this.metrica) {
        }
        if (linkedHashMap.containsValue(new C17816e(1))) {
            return new C17816e(1);
        }
        metrica();
        if (linkedHashMap.containsValue(new C17816e(0))) {
            return new C17816e(0);
        }
        metrica();
        return null;
    }
}
