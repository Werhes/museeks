package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَْؓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1720e {
    public final /* synthetic */ int ad;
    public ArrayList vip;

    public C1720e(int i) {
        this.ad = i;
        switch (i) {
            case 1:
                this.vip = new ArrayList(1);
                return;
            default:
                this.vip = null;
                return;
        }
    }

    public void ad(C0831e c0831e) {
        if (this.vip == null) {
            this.vip = new ArrayList();
        }
        for (int i = 0; i < this.vip.size(); i++) {
            if (((C0831e) this.vip.get(i)).ad.vip > c0831e.ad.vip) {
                this.vip.add(i, c0831e);
                return;
            }
        }
        this.vip.add(c0831e);
    }

    public String toString() {
        switch (this.ad) {
            case 0:
                if (this.vip == null) {
                    return BuildConfig.FLAVOR;
                }
                StringBuilder sb = new StringBuilder();
                Iterator it = this.vip.iterator();
                while (it.hasNext()) {
                    sb.append(((C0831e) it.next()).toString());
                    sb.append('\n');
                }
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public void vip(C1720e c1720e) {
        if (c1720e.vip == null) {
            return;
        }
        if (this.vip == null) {
            this.vip = new ArrayList(c1720e.vip.size());
        }
        Iterator it = c1720e.vip.iterator();
        while (it.hasNext()) {
            ad((C0831e) it.next());
        }
    }
}
