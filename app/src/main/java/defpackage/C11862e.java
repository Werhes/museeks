package defpackage;

import java.util.Iterator;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eِٜۤ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11862e implements InterfaceC13140e {
    public final boolean ad;
    public final String vip;

    public C11862e(String str, boolean z) {
        this.ad = z;
        this.vip = str;
    }

    @Override // defpackage.InterfaceC13140e
    public final boolean ad(AbstractC14697e abstractC14697e) {
        int i;
        boolean z = this.ad;
        String str = this.vip;
        if (z && str == null) {
            str = abstractC14697e.amazon();
        }
        InterfaceC18321e interfaceC18321e = abstractC14697e.vip;
        if (interfaceC18321e != null) {
            Iterator it = interfaceC18321e.getChildren().iterator();
            i = 0;
            while (it.hasNext()) {
                AbstractC14697e abstractC14697e2 = (AbstractC14697e) ((AbstractC16408e) it.next());
                if (str == null || abstractC14697e2.amazon().equals(str)) {
                    i++;
                }
            }
        } else {
            i = 1;
        }
        return i == 1;
    }

    public final String toString() {
        return this.ad ? AbstractC5087e.m1746extends("only-of-type <", this.vip, ">") : "only-child";
    }
}
