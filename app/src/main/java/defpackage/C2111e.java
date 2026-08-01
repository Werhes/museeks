package defpackage;

import android.net.Uri;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٖؓۜ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class C2111e implements InterfaceC18244e {
    public final /* synthetic */ int ad;
    public final Object metrica;
    public final Object vip;

    public /* synthetic */ C2111e(Object obj, Object obj2, int i) {
        this.ad = i;
        this.vip = obj;
        this.metrica = obj2;
    }

    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, eًۜؐ] */
    @Override // defpackage.InterfaceC18244e
    public final ListenableFuture apply(Object obj) {
        switch (this.ad) {
            case 0:
                C5590e c5590e = (C5590e) this.vip;
                return ((C0582e) c5590e.license.get()).ad(new C3223e(c5590e, (InterfaceC0590e) this.metrica));
            case 1:
                List list = (List) this.vip;
                C17176e c17176e = (C17176e) obj;
                int size = list.size();
                ArrayList arrayList = new ArrayList(size);
                Iterator it = list.iterator();
                if (it.hasNext()) {
                    throw AbstractC5087e.m1747goto(it);
                }
                C2111e vip = AbstractC9855e.vip(new C2634e(this, arrayList, size));
                EnumC3320e enumC3320e = EnumC3320e.f7489e;
                return AbstractC2017e.billing(AbstractC2017e.purchase(AbstractC2017e.billing(AbstractC2017e.appmetrica(c17176e.ad.appmetrica.m909e()), AbstractC9855e.vip(new C2111e(c17176e, vip, 3)), enumC3320e), new Object(), enumC3320e), AbstractC9855e.vip(new C2634e(this, size, arrayList)), enumC3320e);
            case 2:
                C14742e c14742e = (C14742e) this.vip;
                C12183e c12183e = (C12183e) this.metrica;
                c14742e.admob((Uri) AbstractC2017e.vip((ListenableFuture) c14742e.metrica), obj);
                synchronized (c14742e.startapp) {
                    c14742e.mopub = c12183e;
                }
                return AbstractC2017e.license(obj);
            case 3:
                return ((C17176e) this.vip).ad.metrica.loadAd((C2111e) this.metrica, EnumC3320e.f7489e);
            default:
                InterfaceC4766e ad = AbstractC5076e.ad(AbstractC5076e.vip(), (InterfaceC4766e) this.vip);
                try {
                    ListenableFuture apply = ((InterfaceC18244e) this.metrica).apply(obj);
                    if (apply != null) {
                        return apply;
                    }
                    throw new IllegalStateException("AsyncFunction should return a ListenableFuture instead of null.");
                } finally {
                }
        }
    }

    public String toString() {
        switch (this.ad) {
            case 4:
                InterfaceC18244e interfaceC18244e = (InterfaceC18244e) this.metrica;
                StringBuilder sb = new StringBuilder(interfaceC18244e.toString().length() + 14);
                sb.append("propagating=[");
                sb.append(interfaceC18244e);
                sb.append("]");
                return sb.toString();
            default:
                return super.toString();
        }
    }
}
