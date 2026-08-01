package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eّٞٛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C12631e implements InterfaceC0867e {
    public final /* synthetic */ int ad;
    public Object vip;

    public /* synthetic */ C12631e() {
        this.ad = 0;
    }

    public /* synthetic */ C12631e(int i, Object obj) {
        this.ad = i;
        this.vip = obj;
    }

    @Override // defpackage.InterfaceC0867e
    public final void accept(Object obj) {
        switch (this.ad) {
            case 0:
                ((InterfaceC0867e) this.vip).accept(obj);
                return;
            case 1:
                C14836e c14836e = (C14836e) obj;
                if (c14836e == null) {
                    c14836e = new C14836e(-3);
                }
                ((C17424e) this.vip).m4317interface(c14836e);
                return;
            default:
                C14836e c14836e2 = (C14836e) obj;
                synchronized (AbstractC4833e.metrica) {
                    try {
                        C17519e c17519e = AbstractC4833e.license;
                        ArrayList arrayList = (ArrayList) c17519e.get((String) this.vip);
                        if (arrayList == null) {
                            return;
                        }
                        c17519e.remove((String) this.vip);
                        for (int i = 0; i < arrayList.size(); i++) {
                            ((InterfaceC0867e) arrayList.get(i)).accept(c14836e2);
                        }
                        return;
                    } finally {
                    }
                }
        }
    }
}
