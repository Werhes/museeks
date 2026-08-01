package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٜۨ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C18538e implements InterfaceC2747e {
    public final C1382e ad;
    public boolean vip;

    public C18538e(C1382e c1382e) {
        this.ad = c1382e;
    }

    @Override // defpackage.InterfaceC2747e
    public final int ad(InterfaceC0732e interfaceC0732e, List list, int i) {
        if (list.isEmpty()) {
            return 0;
        }
        int loadAd = ((InterfaceC16719e) list.get(0)).loadAd(i);
        int billing = AbstractC6874e.billing(list);
        int i2 = 1;
        if (1 <= billing) {
            while (true) {
                int loadAd2 = ((InterfaceC16719e) list.get(i2)).loadAd(i);
                if (loadAd2 > loadAd) {
                    loadAd = loadAd2;
                }
                if (i2 == billing) {
                    break;
                }
                i2++;
            }
        }
        return loadAd;
    }

    @Override // defpackage.InterfaceC2747e
    public final int appmetrica(InterfaceC0732e interfaceC0732e, List list, int i) {
        if (list.isEmpty()) {
            return 0;
        }
        int mo2529while = ((InterfaceC16719e) list.get(0)).mo2529while(i);
        int billing = AbstractC6874e.billing(list);
        int i2 = 1;
        if (1 <= billing) {
            while (true) {
                int mo2529while2 = ((InterfaceC16719e) list.get(i2)).mo2529while(i);
                if (mo2529while2 > mo2529while) {
                    mo2529while = mo2529while2;
                }
                if (i2 == billing) {
                    break;
                }
                i2++;
            }
        }
        return mo2529while;
    }

    @Override // defpackage.InterfaceC2747e
    public final int license(InterfaceC0732e interfaceC0732e, List list, int i) {
        if (list.isEmpty()) {
            return 0;
        }
        int metrica = ((InterfaceC16719e) list.get(0)).metrica(i);
        int billing = AbstractC6874e.billing(list);
        int i2 = 1;
        if (1 <= billing) {
            while (true) {
                int metrica2 = ((InterfaceC16719e) list.get(i2)).metrica(i);
                if (metrica2 > metrica) {
                    metrica = metrica2;
                }
                if (i2 == billing) {
                    break;
                }
                i2++;
            }
        }
        return metrica;
    }

    @Override // defpackage.InterfaceC2747e
    public final int metrica(InterfaceC0732e interfaceC0732e, List list, int i) {
        if (list.isEmpty()) {
            return 0;
        }
        int smaato = ((InterfaceC16719e) list.get(0)).smaato(i);
        int billing = AbstractC6874e.billing(list);
        int i2 = 1;
        if (1 <= billing) {
            while (true) {
                int smaato2 = ((InterfaceC16719e) list.get(i2)).smaato(i);
                if (smaato2 > smaato) {
                    smaato = smaato2;
                }
                if (i2 == billing) {
                    break;
                }
                i2++;
            }
        }
        return smaato;
    }

    @Override // defpackage.InterfaceC2747e
    public final InterfaceC17242e vip(InterfaceC13158e interfaceC13158e, List list, long j) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        int i = 0;
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            AbstractC2832e admob = ((InterfaceC16719e) list.get(i3)).admob(j);
            i = Math.max(i, admob.f6806e);
            i2 = Math.max(i2, admob.f6804e);
            arrayList.add(admob);
        }
        boolean mo398transient = interfaceC13158e.mo398transient();
        C1382e c1382e = this.ad;
        if (mo398transient) {
            this.vip = true;
            c1382e.vip.setValue(new C12729e((4294967295L & i2) | (i << 32)));
        } else if (!this.vip) {
            c1382e.vip.setValue(new C12729e((4294967295L & i2) | (i << 32)));
        }
        return interfaceC13158e.ads(i, i2, C9139e.f18290e, new C9912e(2, arrayList));
    }
}
