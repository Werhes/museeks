package defpackage;

import android.graphics.Rect;
import kotlin.Unit;
import kotlin.jvm.functions.Function4;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًۥْ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8335e extends AbstractC16858e implements Function4 {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ int f17063e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ C12597e f17064e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8335e(C12597e c12597e, int i) {
        super(4);
        this.f17064e = c12597e;
        this.f17063e = i;
    }

    @Override // kotlin.jvm.functions.Function4
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int intValue = ((Number) obj).intValue();
        int intValue2 = ((Number) obj2).intValue();
        int intValue3 = ((Number) obj3).intValue();
        int intValue4 = ((Number) obj4).intValue();
        C12597e c12597e = this.f17064e;
        c12597e.f25318e.purchase(c12597e.f25313e, this.f17063e, new Rect(intValue, intValue2, intValue3, intValue4));
        return Unit.INSTANCE;
    }
}
