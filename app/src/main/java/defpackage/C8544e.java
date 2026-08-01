package defpackage;

import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌٍؚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8544e extends AbstractC7185e implements Function2 {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final /* synthetic */ int f17348e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final /* synthetic */ C15820e f17349e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public /* synthetic */ Object f17350e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C8544e(C15820e c15820e, InterfaceC5083e interfaceC5083e, int i) {
        super(2, interfaceC5083e);
        this.f17348e = i;
        this.f17349e = c15820e;
    }

    @Override // defpackage.AbstractC9049e
    public final InterfaceC5083e advert(InterfaceC5083e interfaceC5083e, Object obj) {
        switch (this.f17348e) {
            case 0:
                C8544e c8544e = new C8544e(this.f17349e, interfaceC5083e, 0);
                c8544e.f17350e = obj;
                return c8544e;
            default:
                C8544e c8544e2 = new C8544e(this.f17349e, interfaceC5083e, 1);
                c8544e2.f17350e = obj;
                return c8544e2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f17348e) {
            case 0:
                return ((C8544e) advert((InterfaceC5083e) obj2, (C17510e) obj)).loadAd(Unit.INSTANCE);
            default:
                return ((C8544e) advert((InterfaceC5083e) obj2, (C12920e) obj)).loadAd(Unit.INSTANCE);
        }
    }

    @Override // defpackage.AbstractC9049e
    public final Object loadAd(Object obj) {
        switch (this.f17348e) {
            case 0:
                C17510e c17510e = (C17510e) this.f17350e;
                AbstractC2003e.purchase(obj);
                Iterator it = this.f17349e.f31214e.values().iterator();
                while (it.hasNext()) {
                    ((C11268e) it.next()).m3187goto(c17510e);
                }
                return Unit.INSTANCE;
            default:
                C12920e c12920e = (C12920e) this.f17350e;
                AbstractC2003e.purchase(obj);
                Iterator it2 = this.f17349e.f31214e.values().iterator();
                while (it2.hasNext()) {
                    ((C11268e) it2.next()).m3188interface(c12920e);
                }
                return Unit.INSTANCE;
        }
    }
}
