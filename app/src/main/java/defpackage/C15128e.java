package defpackage;

import java.util.Map;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٔۨؕ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C15128e extends AbstractC11069e {
    public final AbstractC11069e signatures;
    public final AbstractC11069e tapsense;

    public C15128e(AbstractC11069e abstractC11069e, AbstractC11069e abstractC11069e2) {
        super(3, AbstractC3820e.ad.vip(Map.Entry.class), abstractC11069e2.appmetrica, null, 48);
        this.signatures = abstractC11069e;
        this.tapsense = abstractC11069e2;
    }

    @Override // defpackage.AbstractC11069e
    public final void billing(C17790e c17790e, Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        this.tapsense.adcel(c17790e, 2, entry.getValue());
        this.signatures.adcel(c17790e, 1, entry.getKey());
    }

    @Override // defpackage.AbstractC11069e
    public final Object metrica(C17546e c17546e) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.AbstractC11069e
    public final int mopub(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        return this.tapsense.advert(2, entry.getValue()) + this.signatures.advert(1, entry.getKey());
    }

    @Override // defpackage.AbstractC11069e
    public final void purchase(C0444e c0444e, Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        this.signatures.startapp(c0444e, 1, entry.getKey());
        this.tapsense.startapp(c0444e, 2, entry.getValue());
    }
}
