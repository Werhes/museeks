package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍٔٛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C14820e extends AbstractC16858e implements Function1 {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ DialogC4128e f29350e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ int f29351e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C14820e(DialogC4128e dialogC4128e, int i) {
        super(1);
        this.f29351e = i;
        this.f29350e = dialogC4128e;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f29351e) {
            case 0:
                DialogC4128e dialogC4128e = this.f29350e;
                dialogC4128e.show();
                return new C6035e(2, dialogC4128e);
            default:
                DialogC4128e dialogC4128e2 = this.f29350e;
                if (dialogC4128e2.f9098e.ad) {
                    dialogC4128e2.f9094e.invoke();
                }
                return Unit.INSTANCE;
        }
    }
}
