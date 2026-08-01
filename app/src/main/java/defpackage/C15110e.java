package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٔۦۤ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C15110e extends AbstractC1101e {
    public static final C14133e license;
    public final List metrica;
    public final List vip;

    static {
        C10445e c10445e = C14133e.license;
        license = AbstractC1266e.vip("application/x-www-form-urlencoded");
    }

    public C15110e(ArrayList arrayList, ArrayList arrayList2) {
        this.vip = AbstractC16286e.adcel(arrayList);
        this.metrica = AbstractC16286e.adcel(arrayList2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final long advert(InterfaceC11855e interfaceC11855e, boolean z) {
        C16151e obj = z ? new Object() : interfaceC11855e.metrica();
        List list = this.vip;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (i > 0) {
                obj.m4128final(38);
            }
            obj.m4126e((String) list.get(i));
            obj.m4128final(61);
            obj.m4126e((String) this.metrica.get(i));
        }
        if (!z) {
            return 0L;
        }
        long j = obj.f31731e;
        obj.ad();
        return j;
    }

    @Override // defpackage.AbstractC1101e
    public final C14133e license() {
        return license;
    }

    @Override // defpackage.AbstractC1101e
    public final long metrica() {
        return advert(null, true);
    }

    @Override // defpackage.AbstractC1101e
    public final void mopub(InterfaceC11855e interfaceC11855e) {
        advert(interfaceC11855e, false);
    }
}
