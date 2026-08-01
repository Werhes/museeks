package defpackage;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًِٚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11606e extends AbstractC1037e {
    public final /* synthetic */ int ad;
    public final Object vip;

    public /* synthetic */ C11606e(int i, Object obj) {
        this.ad = i;
        this.vip = obj;
    }

    public C11606e(C8200e c8200e) {
        this.ad = 3;
        this.vip = new WeakReference(c8200e);
    }

    public C11606e(List list) {
        this.ad = 0;
        this.vip = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AbstractC1037e abstractC1037e = (AbstractC1037e) it.next();
            if (!(abstractC1037e instanceof C16731e)) {
                ((ArrayList) this.vip).add(abstractC1037e);
            }
        }
    }

    @Override // defpackage.AbstractC1037e
    public void ad(int i) {
        switch (this.ad) {
            case 0:
                Iterator it = ((ArrayList) this.vip).iterator();
                while (it.hasNext()) {
                    ((AbstractC1037e) it.next()).ad(i);
                }
                return;
            default:
                return;
        }
    }

    @Override // defpackage.AbstractC1037e
    public void appmetrica(int i) {
        switch (this.ad) {
            case 0:
                Iterator it = ((ArrayList) this.vip).iterator();
                while (it.hasNext()) {
                    ((AbstractC1037e) it.next()).appmetrica(i);
                }
                return;
            case 1:
                AbstractC3062e.amazon().execute(new RunnableC15914e(this));
                return;
            default:
                return;
        }
    }

    @Override // defpackage.AbstractC1037e
    public void license(int i, int i2) {
        switch (this.ad) {
            case 0:
                Iterator it = ((ArrayList) this.vip).iterator();
                while (it.hasNext()) {
                    ((AbstractC1037e) it.next()).license(i, i2);
                }
                return;
            case 1:
                AbstractC3062e.amazon().execute(new RunnableC15914e(this, i2));
                return;
            default:
                return;
        }
    }

    @Override // defpackage.AbstractC1037e
    public void metrica(int i, C6114e c6114e) {
        switch (this.ad) {
            case 0:
                Iterator it = ((ArrayList) this.vip).iterator();
                while (it.hasNext()) {
                    ((AbstractC1037e) it.next()).metrica(i, c6114e);
                }
                return;
            default:
                return;
        }
    }

    @Override // defpackage.AbstractC1037e
    public void vip(int i, InterfaceC8500e interfaceC8500e) {
        switch (this.ad) {
            case 0:
                Iterator it = ((ArrayList) this.vip).iterator();
                while (it.hasNext()) {
                    ((AbstractC1037e) it.next()).vip(i, interfaceC8500e);
                }
                return;
            case 1:
            default:
                return;
            case 2:
                C8402e c8402e = (C8402e) this.vip;
                synchronized (c8402e.f17180e) {
                    try {
                        if (c8402e.f17170e) {
                            return;
                        }
                        c8402e.f17179e.put(interfaceC8500e.metrica(), new C2261e(interfaceC8500e));
                        c8402e.startapp();
                        return;
                    } finally {
                    }
                }
            case 3:
                C8200e c8200e = (C8200e) ((WeakReference) this.vip).get();
                if (c8200e != null) {
                    Iterator it2 = c8200e.f16692e.iterator();
                    while (it2.hasNext()) {
                        C11469e c11469e = ((AbstractC16510e) it2.next()).admob;
                        Iterator it3 = c11469e.billing.license.iterator();
                        while (it3.hasNext()) {
                            ((AbstractC1037e) it3.next()).vip(i, new C7699e(interfaceC8500e, c11469e.billing.appmetrica, -1L));
                        }
                    }
                    return;
                }
                return;
        }
    }
}
