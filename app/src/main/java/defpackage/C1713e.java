package defpackage;

import androidx.recyclerview.widget.startapp;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍؓۘ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1713e extends AbstractC7185e implements Function2 {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final /* synthetic */ int f4659e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final /* synthetic */ AbstractC3655e f4660e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public /* synthetic */ Object f4661e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1713e(AbstractC3655e abstractC3655e, InterfaceC5083e interfaceC5083e, int i) {
        super(2, interfaceC5083e);
        this.f4659e = i;
        this.f4660e = abstractC3655e;
    }

    @Override // defpackage.AbstractC9049e
    public final InterfaceC5083e advert(InterfaceC5083e interfaceC5083e, Object obj) {
        switch (this.f4659e) {
            case 0:
                C1713e c1713e = new C1713e(this.f4660e, interfaceC5083e, 0);
                c1713e.f4661e = obj;
                return c1713e;
            default:
                C1713e c1713e2 = new C1713e(this.f4660e, interfaceC5083e, 1);
                c1713e2.f4661e = obj;
                return c1713e2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f4659e) {
            case 0:
                return ((C1713e) advert((InterfaceC5083e) obj2, (C17510e) obj)).loadAd(Unit.INSTANCE);
            default:
                return ((C1713e) advert((InterfaceC5083e) obj2, (C12920e) obj)).loadAd(Unit.INSTANCE);
        }
    }

    @Override // defpackage.AbstractC9049e
    public final Object loadAd(Object obj) {
        switch (this.f4659e) {
            case 0:
                C17510e c17510e = (C17510e) this.f4661e;
                AbstractC2003e.purchase(obj);
                startapp startappVar = this.f4660e.f8233e;
                if (startappVar == null) {
                    startappVar = null;
                }
                C11268e c11268e = startappVar instanceof C11268e ? (C11268e) startappVar : null;
                if (c11268e != null) {
                    c11268e.m3187goto(c17510e);
                }
                return Unit.INSTANCE;
            default:
                C12920e c12920e = (C12920e) this.f4661e;
                AbstractC2003e.purchase(obj);
                startapp startappVar2 = this.f4660e.f8233e;
                if (startappVar2 == null) {
                    startappVar2 = null;
                }
                C11268e c11268e2 = startappVar2 instanceof C11268e ? (C11268e) startappVar2 : null;
                if (c11268e2 != null) {
                    c11268e2.m3188interface(c12920e);
                }
                return Unit.INSTANCE;
        }
    }
}
