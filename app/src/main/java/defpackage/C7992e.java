package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eً٘ٔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7992e extends AbstractC7453e {
    public static final C7992e metrica = new C7992e("Undefined intrinsics block and it is required", 0);
    public final /* synthetic */ int vip;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C7992e(String str, int i) {
        super(str);
        this.vip = i;
    }

    @Override // defpackage.InterfaceC2747e
    public final InterfaceC17242e vip(InterfaceC13158e interfaceC13158e, List list, long j) {
        switch (this.vip) {
            case 0:
                int size = list.size();
                C9139e c9139e = C9139e.f18290e;
                if (size == 0) {
                    return interfaceC13158e.ads(C5602e.adcel(j), C5602e.startapp(j), c9139e, C8082e.f16413e);
                }
                if (size == 1) {
                    AbstractC2832e admob = ((InterfaceC16719e) list.get(0)).admob(j);
                    return interfaceC13158e.ads(AbstractC2278e.billing(admob.f6806e, j), AbstractC2278e.purchase(admob.f6804e, j), c9139e, new C8684e(admob, 6));
                }
                ArrayList arrayList = new ArrayList(list.size());
                int size2 = list.size();
                int i = 0;
                int i2 = 0;
                for (int i3 = 0; i3 < size2; i3++) {
                    AbstractC2832e admob2 = ((InterfaceC16719e) list.get(i3)).admob(j);
                    i = Math.max(admob2.f6806e, i);
                    i2 = Math.max(admob2.f6804e, i2);
                    arrayList.add(admob2);
                }
                return interfaceC13158e.ads(AbstractC2278e.billing(i, j), AbstractC2278e.purchase(i2, j), c9139e, new C9912e(3, arrayList));
            default:
                throw new IllegalStateException("Undefined measure and it is required");
        }
    }
}
