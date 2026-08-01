package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٝؒ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C18237e implements InterfaceC10481e {
    public final Function1 ad;
    public final C0576e appmetrica;
    public final C0576e license;
    public final C0576e purchase;
    public final C15955e vip = new C15955e(this);
    public final C10684e metrica = new C10684e();

    public C18237e(Function1 function1) {
        this.ad = function1;
        Boolean bool = Boolean.FALSE;
        this.license = AbstractC14533e.startapp(bool);
        this.appmetrica = AbstractC14533e.startapp(bool);
        this.purchase = AbstractC14533e.startapp(bool);
    }

    @Override // defpackage.InterfaceC10481e
    public final boolean ad() {
        return ((Boolean) this.license.getValue()).booleanValue();
    }

    @Override // defpackage.InterfaceC10481e
    public final float appmetrica(float f) {
        return ((Number) this.ad.invoke(Float.valueOf(f))).floatValue();
    }

    @Override // defpackage.InterfaceC10481e
    public final /* synthetic */ boolean license() {
        return true;
    }

    @Override // defpackage.InterfaceC10481e
    public final /* synthetic */ boolean metrica() {
        return true;
    }

    @Override // defpackage.InterfaceC10481e
    public final Object vip(EnumC6955e enumC6955e, Function2 function2, InterfaceC5083e interfaceC5083e) {
        Object appmetrica = AbstractC9743e.appmetrica(new C8857e(this, enumC6955e, function2, (InterfaceC5083e) null, 0), interfaceC5083e);
        return appmetrica == EnumC2821e.f6782e ? appmetrica : Unit.INSTANCE;
    }
}
