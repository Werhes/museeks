package defpackage;

import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًٟ٘, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC8112e {
    public final ArrayList ad = new ArrayList();
    public InterfaceC8588e license;
    public final AbstractC9166e metrica;
    public Object vip;

    public AbstractC8112e(AbstractC9166e abstractC9166e) {
        this.metrica = abstractC9166e;
    }

    public abstract boolean ad(C13394e c13394e);

    public final void license(InterfaceC8588e interfaceC8588e, Object obj) {
        if (this.ad.isEmpty() || interfaceC8588e == null) {
            return;
        }
        if (obj == null || vip(obj)) {
            ((C16000e) interfaceC8588e).vip(this.ad);
            return;
        }
        ArrayList arrayList = this.ad;
        C16000e c16000e = (C16000e) interfaceC8588e;
        synchronized (c16000e.metrica) {
            try {
                ArrayList arrayList2 = new ArrayList();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    String str = (String) it.next();
                    if (c16000e.ad(str)) {
                        C5401e.loadAd().smaato(C16000e.license, "Constraints met for " + str, new Throwable[0]);
                        arrayList2.add(str);
                    }
                }
                InterfaceC6882e interfaceC6882e = c16000e.ad;
                if (interfaceC6882e != null) {
                    interfaceC6882e.purchase(arrayList2);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void metrica(Iterable iterable) {
        this.ad.clear();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            C13394e c13394e = (C13394e) it.next();
            if (ad(c13394e)) {
                this.ad.add(c13394e.ad);
            }
        }
        if (this.ad.isEmpty()) {
            this.metrica.vip(this);
        } else {
            AbstractC9166e abstractC9166e = this.metrica;
            synchronized (abstractC9166e.metrica) {
                try {
                    if (abstractC9166e.license.add(this)) {
                        if (abstractC9166e.license.size() == 1) {
                            abstractC9166e.appmetrica = abstractC9166e.ad();
                            C5401e.loadAd().smaato(AbstractC9166e.purchase, String.format("%s: initial state = %s", abstractC9166e.getClass().getSimpleName(), abstractC9166e.appmetrica), new Throwable[0]);
                            abstractC9166e.license();
                        }
                        Object obj = abstractC9166e.appmetrica;
                        this.vip = obj;
                        license(this.license, obj);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        license(this.license, this.vip);
    }

    public abstract boolean vip(Object obj);
}
