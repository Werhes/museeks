package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؙٔۢ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6406e extends AbstractC7185e implements Function1 {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final /* synthetic */ int f13276e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final /* synthetic */ C15860e f13277e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C6406e(C15860e c15860e, InterfaceC5083e interfaceC5083e, int i) {
        super(1, interfaceC5083e);
        this.f13276e = i;
        this.f13277e = c15860e;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        InterfaceC5083e interfaceC5083e = (InterfaceC5083e) obj;
        switch (this.f13276e) {
            case 0:
                return ((C6406e) mopub(interfaceC5083e)).loadAd(Unit.INSTANCE);
            case 1:
                return ((C6406e) mopub(interfaceC5083e)).loadAd(Unit.INSTANCE);
            case 2:
                return ((C6406e) mopub(interfaceC5083e)).loadAd(Unit.INSTANCE);
            default:
                return ((C6406e) mopub(interfaceC5083e)).loadAd(Unit.INSTANCE);
        }
    }

    @Override // defpackage.AbstractC9049e
    public final Object loadAd(Object obj) {
        switch (this.f13276e) {
            case 0:
                AbstractC2003e.purchase(obj);
                this.f13277e.ads = false;
                return Unit.INSTANCE;
            case 1:
                AbstractC2003e.purchase(obj);
                this.f13277e.purchase();
                return Unit.INSTANCE;
            case 2:
                AbstractC2003e.purchase(obj);
                C15860e c15860e = this.f13277e;
                c15860e.license(c15860e.ads);
                return Unit.INSTANCE;
            default:
                AbstractC2003e.purchase(obj);
                this.f13277e.Signature();
                return Unit.INSTANCE;
        }
    }

    @Override // defpackage.AbstractC9049e
    public final InterfaceC5083e mopub(InterfaceC5083e interfaceC5083e) {
        switch (this.f13276e) {
            case 0:
                return new C6406e(this.f13277e, interfaceC5083e, 0);
            case 1:
                return new C6406e(this.f13277e, interfaceC5083e, 1);
            case 2:
                return new C6406e(this.f13277e, interfaceC5083e, 2);
            default:
                return new C6406e(this.f13277e, interfaceC5083e, 3);
        }
    }
}
