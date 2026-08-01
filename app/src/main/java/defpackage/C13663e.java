package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eْۨٙ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C13663e implements Function1 {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ Function1 f27086e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ C2809e f27087e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f27088e;

    public /* synthetic */ C13663e(C2809e c2809e, Function1 function1, int i) {
        this.f27088e = i;
        this.f27087e = c2809e;
        this.f27086e = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f27088e) {
            case 0:
                C12476e c12476e = (C12476e) obj;
                C2809e c2809e = this.f27087e;
                if (c2809e != null) {
                    c2809e.ad.setValue(c12476e);
                }
                Function1 function1 = this.f27086e;
                if (function1 != null) {
                    function1.invoke(c12476e);
                }
                return Unit.INSTANCE;
            default:
                C2809e c2809e2 = this.f27087e;
                C12742e c12742e = c2809e2.metrica;
                Function1 function12 = this.f27086e;
                c12742e.add(function12);
                return new C15302e(c2809e2, function12, 7);
        }
    }
}
