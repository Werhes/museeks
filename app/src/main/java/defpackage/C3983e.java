package defpackage;

import android.view.textclassifier.TextClassifier;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًؖۚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3983e extends AbstractC7185e implements Function2 {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public int f8880e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public final /* synthetic */ CharSequence f8881e;

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public final /* synthetic */ long f8882e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final /* synthetic */ C13189e f8883e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public /* synthetic */ Object f8884e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3983e(long j, InterfaceC5083e interfaceC5083e, C13189e c13189e, CharSequence charSequence) {
        super(2, interfaceC5083e);
        this.f8883e = c13189e;
        this.f8881e = charSequence;
        this.f8882e = j;
    }

    @Override // defpackage.AbstractC9049e
    public final InterfaceC5083e advert(InterfaceC5083e interfaceC5083e, Object obj) {
        C3983e c3983e = new C3983e(this.f8882e, interfaceC5083e, this.f8883e, this.f8881e);
        c3983e.f8884e = obj;
        return c3983e;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C3983e) advert((InterfaceC5083e) obj2, C15945e.license(obj))).loadAd(Unit.INSTANCE);
    }

    @Override // defpackage.AbstractC9049e
    public final Object loadAd(Object obj) {
        int i = this.f8880e;
        if (i == 0) {
            AbstractC2003e.purchase(obj);
            TextClassifier license = C15945e.license(this.f8884e);
            this.f8880e = 1;
            Object ad = C13189e.ad(this.f8883e, this.f8881e, this.f8882e, license, this);
            EnumC2821e enumC2821e = EnumC2821e.f6782e;
            if (ad == enumC2821e) {
                return enumC2821e;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC2003e.purchase(obj);
        }
        return Unit.INSTANCE;
    }
}
