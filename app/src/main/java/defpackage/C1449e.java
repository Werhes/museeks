package defpackage;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function4;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؒۥٌ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1449e extends AbstractC7150e {
    public final Function4 ad;
    public final Csuper metrica;
    public final Function1 vip;

    public C1449e(Function4 function4, Function1 function1, int i) {
        this.ad = function4;
        this.vip = function1;
        Csuper csuper = new Csuper((byte) 0, 21);
        csuper.appmetrica(i, new C2262e(function1, function4));
        this.metrica = csuper;
    }

    @Override // defpackage.AbstractC7150e
    public final Csuper license() {
        return this.metrica;
    }
}
