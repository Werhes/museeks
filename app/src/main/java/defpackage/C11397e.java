package defpackage;

import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eُۦۢ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C11397e extends AbstractC11069e {
    public final AbstractC11069e signatures;

    public C11397e(AbstractC11069e abstractC11069e) {
        super(abstractC11069e.license, AbstractC3820e.ad.vip(List.class), abstractC11069e.appmetrica, C13664e.f27089e, 32);
        this.signatures = abstractC11069e;
    }

    @Override // defpackage.AbstractC11069e
    public final void adcel(C17790e c17790e, int i, Object obj) {
        List list = (List) obj;
        if (list == null) {
            return;
        }
        int size = list.size();
        while (true) {
            size--;
            if (-1 >= size) {
                return;
            } else {
                this.signatures.adcel(c17790e, i, list.get(size));
            }
        }
    }

    @Override // defpackage.AbstractC11069e
    public final int advert(int i, Object obj) {
        List list = (List) obj;
        if (list == null) {
            return 0;
        }
        int size = list.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            i2 += this.signatures.advert(i, list.get(i3));
        }
        return i2;
    }

    @Override // defpackage.AbstractC11069e
    public final void billing(C17790e c17790e, Object obj) {
        throw new UnsupportedOperationException("Repeated values can only be encoded with a tag.");
    }

    @Override // defpackage.AbstractC11069e
    public final Object metrica(C17546e c17546e) {
        return Collections.singletonList(this.signatures.metrica(c17546e));
    }

    @Override // defpackage.AbstractC11069e
    public final int mopub(Object obj) {
        throw new UnsupportedOperationException("Repeated values can only be sized with a tag.");
    }

    @Override // defpackage.AbstractC11069e
    public final void purchase(C0444e c0444e, Object obj) {
        throw new UnsupportedOperationException("Repeated values can only be encoded with a tag.");
    }

    @Override // defpackage.AbstractC11069e
    public final void startapp(C0444e c0444e, int i, Object obj) {
        List list = (List) obj;
        if (list == null) {
            return;
        }
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.signatures.startapp(c0444e, i, list.get(i2));
        }
    }

    @Override // defpackage.AbstractC11069e
    public final Object vip(C17582e c17582e) {
        return Collections.singletonList(this.signatures.vip(c17582e));
    }
}
