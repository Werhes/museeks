package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍؚٜ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7294e extends AbstractC15049e implements Function2 {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public /* synthetic */ Object f14895e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ int f14896e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public int f14897e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final /* synthetic */ Function1 f14898e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C7294e(Function1 function1, InterfaceC5083e interfaceC5083e, int i) {
        super(2, interfaceC5083e);
        this.f14896e = i;
        this.f14898e = function1;
    }

    @Override // defpackage.AbstractC9049e
    public final InterfaceC5083e advert(InterfaceC5083e interfaceC5083e, Object obj) {
        switch (this.f14896e) {
            case 0:
                C7294e c7294e = new C7294e(this.f14898e, interfaceC5083e, 0);
                c7294e.f14895e = obj;
                return c7294e;
            case 1:
                C7294e c7294e2 = new C7294e(this.f14898e, interfaceC5083e, 1);
                c7294e2.f14895e = obj;
                return c7294e2;
            case 2:
                C7294e c7294e3 = new C7294e(this.f14898e, interfaceC5083e, 2);
                c7294e3.f14895e = obj;
                return c7294e3;
            default:
                C7294e c7294e4 = new C7294e(this.f14898e, interfaceC5083e, 3);
                c7294e4.f14895e = obj;
                return c7294e4;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        C14718e c14718e = (C14718e) obj;
        InterfaceC5083e interfaceC5083e = (InterfaceC5083e) obj2;
        switch (this.f14896e) {
            case 0:
                return ((C7294e) advert(interfaceC5083e, c14718e)).loadAd(Unit.INSTANCE);
            case 1:
                return ((C7294e) advert(interfaceC5083e, c14718e)).loadAd(Unit.INSTANCE);
            case 2:
                return ((C7294e) advert(interfaceC5083e, c14718e)).loadAd(Unit.INSTANCE);
            default:
                ((C7294e) advert(interfaceC5083e, c14718e)).loadAd(Unit.INSTANCE);
                return EnumC2821e.f6782e;
        }
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0032 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x009a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:9:0x0030 -> B:7:0x0033). Please report as a decompilation issue!!! */
    @Override // defpackage.AbstractC9049e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object loadAd(java.lang.Object r9) {
        /*
            Method dump skipped, instructions count: 400
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C7294e.loadAd(java.lang.Object):java.lang.Object");
    }
}
