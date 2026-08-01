package defpackage;

import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eْٕؐ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C15429e extends AbstractC11069e {
    public final AbstractC11069e signatures;

    public C15429e(AbstractC11069e abstractC11069e) {
        super(3, AbstractC3820e.ad.vip(List.class), abstractC11069e.appmetrica, C13664e.f27089e, 32);
        this.signatures = abstractC11069e;
    }

    @Override // defpackage.AbstractC11069e
    public final void adcel(C17790e c17790e, int i, Object obj) {
        List list = (List) obj;
        if (list == null || list.isEmpty()) {
            return;
        }
        super.adcel(c17790e, i, list);
    }

    @Override // defpackage.AbstractC11069e
    public final int advert(int i, Object obj) {
        List list = (List) obj;
        if (list == null || list.isEmpty()) {
            return 0;
        }
        return super.advert(i, list);
    }

    @Override // defpackage.AbstractC11069e
    public final void billing(C17790e c17790e, Object obj) {
        List list = (List) obj;
        int size = list.size();
        while (true) {
            size--;
            if (-1 >= size) {
                return;
            } else {
                this.signatures.billing(c17790e, list.get(size));
            }
        }
    }

    @Override // defpackage.AbstractC11069e
    public final Object metrica(C17546e c17546e) {
        return Collections.singletonList(this.signatures.metrica(c17546e));
    }

    @Override // defpackage.AbstractC11069e
    public final int mopub(Object obj) {
        List list = (List) obj;
        int size = list.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += this.signatures.mopub(list.get(i2));
        }
        return i;
    }

    @Override // defpackage.AbstractC11069e
    public final void purchase(C0444e c0444e, Object obj) {
        List list = (List) obj;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            this.signatures.purchase(c0444e, list.get(i));
        }
    }

    @Override // defpackage.AbstractC11069e
    public final void startapp(C0444e c0444e, int i, Object obj) {
        List list = (List) obj;
        if (list == null || list.isEmpty()) {
            return;
        }
        super.startapp(c0444e, i, list);
    }

    @Override // defpackage.AbstractC11069e
    public final Object vip(C17582e c17582e) {
        return Collections.singletonList(this.signatures.vip(c17582e));
    }
}
