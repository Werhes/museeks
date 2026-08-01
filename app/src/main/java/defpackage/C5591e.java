package defpackage;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘِۖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5591e extends AbstractC7185e implements Function2 {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final /* synthetic */ int f11943e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final /* synthetic */ List f11944e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public int f11945e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C5591e(int i, InterfaceC5083e interfaceC5083e, List list) {
        super(2, interfaceC5083e);
        this.f11943e = i;
        this.f11944e = list;
    }

    @Override // defpackage.AbstractC9049e
    public final InterfaceC5083e advert(InterfaceC5083e interfaceC5083e, Object obj) {
        switch (this.f11943e) {
            case 0:
                return new C5591e(0, interfaceC5083e, this.f11944e);
            default:
                return new C5591e(1, interfaceC5083e, this.f11944e);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC18435e interfaceC18435e = (InterfaceC18435e) obj;
        InterfaceC5083e interfaceC5083e = (InterfaceC5083e) obj2;
        switch (this.f11943e) {
            case 0:
                return ((C5591e) advert(interfaceC5083e, interfaceC18435e)).loadAd(Unit.INSTANCE);
            default:
                return ((C5591e) advert(interfaceC5083e, interfaceC18435e)).loadAd(Unit.INSTANCE);
        }
    }

    @Override // defpackage.AbstractC9049e
    public final Object loadAd(Object obj) {
        switch (this.f11943e) {
            case 0:
                int i = this.f11945e;
                if (i != 0) {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC2003e.purchase(obj);
                    return obj;
                }
                AbstractC2003e.purchase(obj);
                C5107e c5107e = C5107e.f10973e;
                this.f11945e = 1;
                Serializable startapp = c5107e.startapp(this.f11944e, this);
                EnumC2821e enumC2821e = EnumC2821e.f6782e;
                return startapp == enumC2821e ? enumC2821e : startapp;
            default:
                int i2 = this.f11945e;
                if (i2 != 0) {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC2003e.purchase(obj);
                    return obj;
                }
                AbstractC2003e.purchase(obj);
                List list = this.f11944e;
                ArrayList arrayList = new ArrayList(AbstractC0746e.subscription(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(AbstractC15792e.smaato(((AbstractC5113e) it.next()).metrica()));
                }
                C6907e c6907e = new C6907e(new ArrayList(arrayList), false, AbstractC3062e.billing());
                this.f11945e = 1;
                Object metrica = AbstractC5418e.metrica(c6907e, this);
                EnumC2821e enumC2821e2 = EnumC2821e.f6782e;
                return metrica == enumC2821e2 ? enumC2821e2 : metrica;
        }
    }
}
