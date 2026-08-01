package defpackage;

import java.util.Iterator;
import java.util.List;
import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَْؕ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3270e implements InterfaceC8371e {
    public final /* synthetic */ int ad;

    public /* synthetic */ C3270e(int i) {
        this.ad = i;
    }

    public C3270e(C12691e c12691e) {
        this.ad = 13;
    }

    @Override // defpackage.InterfaceC8371e
    public final String ad(Object obj) {
        String valueOf;
        switch (this.ad) {
            case 0:
                return ((C5129e) obj).ad.f29799e;
            case 1:
                return ((C5129e) obj).billing ? "YES" : "NO";
            case 2:
                return ((C5129e) obj).yandex ? "YES" : "NO";
            case 3:
                return ((C5129e) obj).startapp ? "YES" : "NO";
            case 4:
                return Integer.toString(((InterfaceC13460e) obj).appmetrica());
            case 5:
                return Integer.toString(((InterfaceC13460e) obj).license());
            case 6:
                C3089e adcel = ((InterfaceC13460e) obj).adcel();
                return adcel.ad + "x" + adcel.vip;
            case 7:
                return String.valueOf(((InterfaceC13460e) obj).startapp());
            case 8:
                return BuildConfig.FLAVOR;
            case 9:
                return Float.toString(((C1828e) obj).ad);
            case 10:
                return ((C1828e) obj).vip ? "YES" : "NO";
            case 11:
                return ((C4903e) obj).ad.f19876e;
            case 12:
                List list = ((C4903e) obj).metrica;
                if (list == null || list.size() == 0) {
                    throw new IllegalArgumentException("hex might not be null or empty!");
                }
                StringBuilder sb = new StringBuilder(list.size() + 2);
                sb.append("0x");
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    sb.append(String.format("%02x", (Byte) it.next()));
                }
                return sb.toString();
            default:
                C5564e c5564e = ((C4438e) obj).vip;
                boolean z = c5564e.vip != null;
                long j = c5564e.ad;
                if (z) {
                    valueOf = String.valueOf(j) + '@' + String.valueOf(c5564e.vip);
                } else {
                    valueOf = String.valueOf(j);
                }
                return AbstractC6261e.purchase(valueOf, "EXT-X-MAP", false);
        }
    }

    @Override // defpackage.InterfaceC8371e
    public final boolean vip(Object obj) {
        switch (this.ad) {
            case 0:
                return true;
            case 1:
                return true;
            case 2:
                return true;
            case 3:
                return true;
            case 4:
                return true;
            case 5:
                return ((InterfaceC13460e) obj).ad();
            case 6:
                return ((InterfaceC13460e) obj).purchase();
            case 7:
                return ((InterfaceC13460e) obj).vip();
            case 8:
                return false;
            case 9:
                return true;
            case 10:
                return true;
            case 11:
                return true;
            case 12:
                return ((C4903e) obj).metrica != null;
            default:
                return ((C4438e) obj).vip != null;
        }
    }
}
