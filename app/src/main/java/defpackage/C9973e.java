package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَؑؑ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9973e extends AbstractC11069e {
    @Override // defpackage.AbstractC11069e
    public final void billing(C17790e c17790e, Object obj) {
        c17790e.m4424case(((C15625e) obj).ad());
    }

    @Override // defpackage.AbstractC11069e
    public final Object metrica(C17546e c17546e) {
        long license = c17546e.license();
        while (true) {
            int billing = c17546e.billing();
            if (billing == -1) {
                return new C15625e(c17546e.appmetrica(license));
            }
            c17546e.smaato(billing);
        }
    }

    @Override // defpackage.AbstractC11069e
    public final int mopub(Object obj) {
        return ((C15625e) obj).ad().license();
    }

    @Override // defpackage.AbstractC11069e
    public final void purchase(C0444e c0444e, Object obj) {
        c0444e.m356try(((C15625e) obj).ad());
    }
}
