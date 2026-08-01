package defpackage;

import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَٜۥ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10396e extends AbstractC17471e {
    public int advert;
    public final ArrayList mopub;

    public C10396e(C11325e c11325e, int i) {
        super(c11325e);
        C11325e c11325e2;
        ArrayList arrayList = new ArrayList();
        this.mopub = arrayList;
        this.purchase = i;
        C11325e c11325e3 = this.vip;
        C11325e smaato = c11325e3.smaato(i);
        while (true) {
            c11325e2 = c11325e3;
            c11325e3 = smaato;
            if (c11325e3 == null) {
                break;
            } else {
                smaato = c11325e3.smaato(this.purchase);
            }
        }
        this.vip = c11325e2;
        int i2 = this.purchase;
        arrayList.add(i2 == 0 ? c11325e2.license : i2 == 1 ? c11325e2.appmetrica : null);
        C11325e advert = c11325e2.advert(this.purchase);
        while (advert != null) {
            int i3 = this.purchase;
            arrayList.add(i3 == 0 ? advert.license : i3 == 1 ? advert.appmetrica : null);
            advert = advert.advert(this.purchase);
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            AbstractC17471e abstractC17471e = (AbstractC17471e) it.next();
            int i4 = this.purchase;
            if (i4 == 0) {
                abstractC17471e.vip.vip = this;
            } else if (i4 == 1) {
                abstractC17471e.vip.metrica = this;
            }
        }
        if (this.purchase == 0 && ((C17688e) this.vip.f22730case).f34653e && arrayList.size() > 1) {
            this.vip = ((AbstractC17471e) AbstractC17861e.mopub(1, arrayList)).vip;
        }
        this.advert = this.purchase == 0 ? this.vip.f22756switch : this.vip.f22760throws;
    }

    /* JADX WARN: Code restructure failed: missing block: B:288:0x0392, code lost:
    
        r2 = r2 - r13;
     */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00dd  */
    @Override // defpackage.InterfaceC12462e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void ad(defpackage.InterfaceC12462e r28) {
        /*
            Method dump skipped, instructions count: 945
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C10396e.ad(eّٕٓ):void");
    }

    @Override // defpackage.AbstractC17471e
    public final long adcel() {
        ArrayList arrayList = this.mopub;
        int size = arrayList.size();
        long j = 0;
        for (int i = 0; i < size; i++) {
            j = r5.startapp.purchase + ((AbstractC17471e) arrayList.get(i)).adcel() + j + r5.yandex.purchase;
        }
        return j;
    }

    public final C11325e amazon() {
        ArrayList arrayList = this.mopub;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            C11325e c11325e = ((AbstractC17471e) arrayList.get(size)).vip;
            if (c11325e.f22752return != 8) {
                return c11325e;
            }
        }
        return null;
    }

    @Override // defpackage.AbstractC17471e
    public final void appmetrica() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.mopub;
            if (i >= arrayList.size()) {
                return;
            }
            ((AbstractC17471e) arrayList.get(i)).appmetrica();
            i++;
        }
    }

    @Override // defpackage.AbstractC17471e
    public final void license() {
        ArrayList arrayList = this.mopub;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((AbstractC17471e) it.next()).license();
        }
        int size = arrayList.size();
        if (size < 1) {
            return;
        }
        C11325e c11325e = ((AbstractC17471e) arrayList.get(0)).vip;
        C11325e c11325e2 = ((AbstractC17471e) arrayList.get(size - 1)).vip;
        int i = this.purchase;
        C17455e c17455e = this.startapp;
        C17455e c17455e2 = this.yandex;
        if (i == 0) {
            C9399e c9399e = c11325e.f22758this;
            C9399e c9399e2 = c11325e2.f22737extends;
            C17455e startapp = AbstractC17471e.startapp(c9399e, 0);
            int appmetrica = c9399e.appmetrica();
            C11325e smaato = smaato();
            if (smaato != null) {
                appmetrica = smaato.f22758this.appmetrica();
            }
            if (startapp != null) {
                AbstractC17471e.vip(c17455e2, startapp, appmetrica);
            }
            C17455e startapp2 = AbstractC17471e.startapp(c9399e2, 0);
            int appmetrica2 = c9399e2.appmetrica();
            C11325e amazon = amazon();
            if (amazon != null) {
                appmetrica2 = amazon.f22737extends.appmetrica();
            }
            if (startapp2 != null) {
                AbstractC17471e.vip(c17455e, startapp2, -appmetrica2);
            }
        } else {
            C9399e c9399e3 = c11325e.f22746native;
            C9399e c9399e4 = c11325e2.f22759throw;
            C17455e startapp3 = AbstractC17471e.startapp(c9399e3, 1);
            int appmetrica3 = c9399e3.appmetrica();
            C11325e smaato2 = smaato();
            if (smaato2 != null) {
                appmetrica3 = smaato2.f22746native.appmetrica();
            }
            if (startapp3 != null) {
                AbstractC17471e.vip(c17455e2, startapp3, appmetrica3);
            }
            C17455e startapp4 = AbstractC17471e.startapp(c9399e4, 1);
            int appmetrica4 = c9399e4.appmetrica();
            C11325e amazon2 = amazon();
            if (amazon2 != null) {
                appmetrica4 = amazon2.f22759throw.appmetrica();
            }
            if (startapp4 != null) {
                AbstractC17471e.vip(c17455e, startapp4, -appmetrica4);
            }
        }
        c17455e2.ad = this;
        c17455e.ad = this;
    }

    @Override // defpackage.AbstractC17471e
    public final boolean mopub() {
        ArrayList arrayList = this.mopub;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (!((AbstractC17471e) arrayList.get(i)).mopub()) {
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.AbstractC17471e
    public final void purchase() {
        this.metrica = null;
        Iterator it = this.mopub.iterator();
        while (it.hasNext()) {
            ((AbstractC17471e) it.next()).purchase();
        }
    }

    public final C11325e smaato() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.mopub;
            if (i >= arrayList.size()) {
                return null;
            }
            C11325e c11325e = ((AbstractC17471e) arrayList.get(i)).vip;
            if (c11325e.f22752return != 8) {
                return c11325e;
            }
            i++;
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ChainRun ");
        sb.append(this.purchase == 0 ? "horizontal : " : "vertical : ");
        Iterator it = this.mopub.iterator();
        while (it.hasNext()) {
            AbstractC17471e abstractC17471e = (AbstractC17471e) it.next();
            sb.append("<");
            sb.append(abstractC17471e);
            sb.append("> ");
        }
        return sb.toString();
    }
}
