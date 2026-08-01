package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؗۖؖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5082e implements InterfaceC16707e {
    public final ArrayList ad;

    public C5082e(ArrayList arrayList) {
        this.ad = arrayList;
        boolean z = false;
        if (!arrayList.isEmpty()) {
            long j = ((C4781e) arrayList.get(0)).vip;
            int i = 1;
            while (true) {
                if (i >= arrayList.size()) {
                    break;
                }
                if (((C4781e) arrayList.get(i)).ad < j) {
                    z = true;
                    break;
                } else {
                    j = ((C4781e) arrayList.get(i)).vip;
                    i++;
                }
            }
        }
        AbstractC2301e.billing(!z);
    }

    @Override // defpackage.InterfaceC16707e
    public final /* synthetic */ C16975e ad() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C5082e.class != obj.getClass()) {
            return false;
        }
        return this.ad.equals(((C5082e) obj).ad);
    }

    public final int hashCode() {
        return this.ad.hashCode();
    }

    @Override // defpackage.InterfaceC16707e
    public final /* synthetic */ byte[] metrica() {
        return null;
    }

    public final String toString() {
        return "SlowMotion: segments=" + this.ad;
    }

    @Override // defpackage.InterfaceC16707e
    public final /* synthetic */ void vip(C4761e c4761e) {
    }
}
