package defpackage;

import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eِ٘ؐ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C17455e implements InterfaceC12462e {
    public int billing;
    public final AbstractC17471e license;
    public int purchase;
    public AbstractC17471e ad = null;
    public boolean vip = false;
    public boolean metrica = false;
    public int appmetrica = 1;
    public int yandex = 1;
    public C1542e startapp = null;
    public boolean adcel = false;
    public final ArrayList mopub = new ArrayList();
    public final ArrayList advert = new ArrayList();

    public C17455e(AbstractC17471e abstractC17471e) {
        this.license = abstractC17471e;
    }

    @Override // defpackage.InterfaceC12462e
    public final void ad(InterfaceC12462e interfaceC12462e) {
        ArrayList arrayList = this.advert;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (!((C17455e) it.next()).adcel) {
                return;
            }
        }
        this.metrica = true;
        AbstractC17471e abstractC17471e = this.ad;
        if (abstractC17471e != null) {
            abstractC17471e.ad(this);
        }
        if (this.vip) {
            this.license.ad(this);
            return;
        }
        Iterator it2 = arrayList.iterator();
        C17455e c17455e = null;
        int i = 0;
        while (it2.hasNext()) {
            C17455e c17455e2 = (C17455e) it2.next();
            if (!(c17455e2 instanceof C1542e)) {
                i++;
                c17455e = c17455e2;
            }
        }
        if (c17455e != null && i == 1 && c17455e.adcel) {
            C1542e c1542e = this.startapp;
            if (c1542e != null) {
                if (!c1542e.adcel) {
                    return;
                } else {
                    this.purchase = this.yandex * c1542e.billing;
                }
            }
            license(c17455e.billing + this.purchase);
        }
        AbstractC17471e abstractC17471e2 = this.ad;
        if (abstractC17471e2 != null) {
            abstractC17471e2.ad(this);
        }
    }

    public void license(int i) {
        if (this.adcel) {
            return;
        }
        this.adcel = true;
        this.billing = i;
        Iterator it = this.mopub.iterator();
        while (it.hasNext()) {
            InterfaceC12462e interfaceC12462e = (InterfaceC12462e) it.next();
            interfaceC12462e.ad(interfaceC12462e);
        }
    }

    public final void metrica() {
        this.advert.clear();
        this.mopub.clear();
        this.adcel = false;
        this.billing = 0;
        this.metrica = false;
        this.vip = false;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(this.license.vip.f22736else);
        sb.append(":");
        switch (this.appmetrica) {
            case 1:
                str = "UNKNOWN";
                break;
            case 2:
                str = "HORIZONTAL_DIMENSION";
                break;
            case 3:
                str = "VERTICAL_DIMENSION";
                break;
            case 4:
                str = "LEFT";
                break;
            case 5:
                str = "RIGHT";
                break;
            case 6:
                str = "TOP";
                break;
            case 7:
                str = "BOTTOM";
                break;
            case 8:
                str = "BASELINE";
                break;
            default:
                str = "null";
                break;
        }
        sb.append(str);
        sb.append("(");
        sb.append(this.adcel ? Integer.valueOf(this.billing) : "unresolved");
        sb.append(") <t=");
        sb.append(this.advert.size());
        sb.append(":d=");
        sb.append(this.mopub.size());
        sb.append(">");
        return sb.toString();
    }

    public final void vip(AbstractC17471e abstractC17471e) {
        this.mopub.add(abstractC17471e);
        if (this.adcel) {
            abstractC17471e.ad(abstractC17471e);
        }
    }
}
