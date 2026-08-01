package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function3;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eِٝ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11864e extends AbstractC7185e implements Function3 {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final /* synthetic */ int f23786e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public /* synthetic */ Object f23787e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C11864e(int i, int i2, InterfaceC5083e interfaceC5083e) {
        super(i, interfaceC5083e);
        this.f23786e = i2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C11864e(Object obj, InterfaceC5083e interfaceC5083e, int i) {
        super(3, interfaceC5083e);
        this.f23786e = i;
        this.f23787e = obj;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.f23786e) {
            case 0:
                C6442e c6442e = (C6442e) obj2;
                new C11864e(3, 0, (InterfaceC5083e) obj3).f23787e = c6442e;
                AbstractC2003e.purchase(Unit.INSTANCE);
                return c6442e;
            case 1:
                C11864e c11864e = new C11864e(3, 1, (InterfaceC5083e) obj3);
                c11864e.f23787e = (C10263e) obj;
                c11864e.loadAd(Unit.INSTANCE);
                return null;
            case 2:
                return new C11864e((C9302e) this.f23787e, (InterfaceC5083e) obj3, 2).loadAd(Unit.INSTANCE);
            default:
                ((Number) obj2).floatValue();
                return new C11864e((C12339e) this.f23787e, (InterfaceC5083e) obj3, 3).loadAd(Unit.INSTANCE);
        }
    }

    @Override // defpackage.AbstractC9049e
    public final Object loadAd(Object obj) {
        switch (this.f23786e) {
            case 0:
                C6442e c6442e = (C6442e) this.f23787e;
                AbstractC2003e.purchase(obj);
                return c6442e;
            case 1:
                C10263e c10263e = (C10263e) this.f23787e;
                AbstractC2003e.purchase(obj);
                if (c10263e.purchase.purchase(AbstractC4902e.ad) == null) {
                    return null;
                }
                throw new ClassCastException();
            case 2:
                AbstractC2003e.purchase(obj);
                ((C9302e) this.f23787e).f18534e = true;
                return Unit.INSTANCE;
            default:
                AbstractC2003e.purchase(obj);
                ((C12339e) this.f23787e).mopub.invoke();
                return Unit.INSTANCE;
        }
    }
}
