package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًؖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3972e extends AbstractC7185e implements Function2 {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final /* synthetic */ int f8860e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final /* synthetic */ C15290e f8861e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public /* synthetic */ Object f8862e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3972e(C15290e c15290e, InterfaceC5083e interfaceC5083e, int i) {
        super(2, interfaceC5083e);
        this.f8860e = i;
        this.f8861e = c15290e;
    }

    @Override // defpackage.AbstractC9049e
    public final InterfaceC5083e advert(InterfaceC5083e interfaceC5083e, Object obj) {
        switch (this.f8860e) {
            case 0:
                C3972e c3972e = new C3972e(this.f8861e, interfaceC5083e, 0);
                c3972e.f8862e = obj;
                return c3972e;
            default:
                C3972e c3972e2 = new C3972e(this.f8861e, interfaceC5083e, 1);
                c3972e2.f8862e = obj;
                return c3972e2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f8860e) {
            case 0:
                return ((C3972e) advert((InterfaceC5083e) obj2, (C16908e) obj)).loadAd(Unit.INSTANCE);
            default:
                return ((C3972e) advert((InterfaceC5083e) obj2, (C16955e) obj)).loadAd(Unit.INSTANCE);
        }
    }

    @Override // defpackage.AbstractC9049e
    public final Object loadAd(Object obj) {
        switch (this.f8860e) {
            case 0:
                C16908e c16908e = (C16908e) this.f8862e;
                AbstractC2003e.purchase(obj);
                if (!c16908e.ad) {
                    this.f8861e.purchase();
                }
                return Unit.INSTANCE;
            default:
                C16955e c16955e = (C16955e) this.f8862e;
                AbstractC2003e.purchase(obj);
                C15290e.isVip((C14111e) this.f8861e.tapsense().f26645e, c16955e);
                return Unit.INSTANCE;
        }
    }
}
