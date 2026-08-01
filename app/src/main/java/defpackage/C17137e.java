package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eّٜٗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C17137e extends C12478e {
    @Override // defpackage.C12478e, defpackage.AbstractC13717e
    public final void advert() {
        AbstractC15849e.appmetrica();
        throw null;
    }

    @Override // defpackage.C12478e
    public final C12478e crashlytics(Function1 function1, Function1 function12) {
        return (C12478e) ((AbstractC13717e) AbstractC12909e.appmetrica(new C2046e(10, new C17874e(function1, function12, 9))));
    }

    @Override // defpackage.C12478e
    public final AbstractC11912e isVip() {
        throw new IllegalStateException("Cannot apply the global snapshot directly. Call Snapshot.advanceGlobalSnapshot");
    }

    @Override // defpackage.C12478e, defpackage.AbstractC13717e
    public final void metrica() {
        synchronized (AbstractC12909e.metrica) {
            loadAd();
            Unit unit = Unit.INSTANCE;
        }
    }

    @Override // defpackage.C12478e, defpackage.AbstractC13717e
    public final void mopub() {
        AbstractC15849e.appmetrica();
        throw null;
    }

    @Override // defpackage.C12478e, defpackage.AbstractC13717e
    public final AbstractC13717e signatures(Function1 function1) {
        return (C9403e) ((AbstractC13717e) AbstractC12909e.appmetrica(new C2046e(10, new C7267e(0, function1))));
    }

    @Override // defpackage.C12478e, defpackage.AbstractC13717e
    public final void smaato() {
        AbstractC12909e.ad();
    }
}
