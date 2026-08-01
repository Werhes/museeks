package defpackage;

import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؚّؗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4836e extends AbstractC15049e implements Function2 {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public /* synthetic */ Object f10305e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ int f10306e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public int f10307e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final /* synthetic */ Object f10308e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C4836e(Object obj, InterfaceC5083e interfaceC5083e, int i) {
        super(2, interfaceC5083e);
        this.f10306e = i;
        this.f10308e = obj;
    }

    @Override // defpackage.AbstractC9049e
    public final InterfaceC5083e advert(InterfaceC5083e interfaceC5083e, Object obj) {
        switch (this.f10306e) {
            case 0:
                C4836e c4836e = new C4836e((C11644e) this.f10308e, interfaceC5083e, 0);
                c4836e.f10305e = obj;
                return c4836e;
            case 1:
                C4836e c4836e2 = new C4836e((EnumC13456e) this.f10308e, interfaceC5083e, 1);
                c4836e2.f10305e = obj;
                return c4836e2;
            case 2:
                C4836e c4836e3 = new C4836e((Function2) this.f10308e, interfaceC5083e, 2);
                c4836e3.f10305e = obj;
                return c4836e3;
            case 3:
                C4836e c4836e4 = new C4836e((C7765e) this.f10308e, interfaceC5083e, 3);
                c4836e4.f10305e = obj;
                return c4836e4;
            default:
                C4836e c4836e5 = new C4836e((View) this.f10308e, interfaceC5083e, 4);
                c4836e5.f10305e = obj;
                return c4836e5;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f10306e) {
            case 0:
                return ((C4836e) advert((InterfaceC5083e) obj2, (C14718e) obj)).loadAd(Unit.INSTANCE);
            case 1:
                return ((C4836e) advert((InterfaceC5083e) obj2, (C14718e) obj)).loadAd(Unit.INSTANCE);
            case 2:
                return ((C4836e) advert((InterfaceC5083e) obj2, (C14718e) obj)).loadAd(Unit.INSTANCE);
            case 3:
                ((C4836e) advert((InterfaceC5083e) obj2, (C14718e) obj)).loadAd(Unit.INSTANCE);
                return EnumC2821e.f6782e;
            default:
                return ((C4836e) advert((InterfaceC5083e) obj2, (C4300e) obj)).loadAd(Unit.INSTANCE);
        }
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:94:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01e0 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r12v8, types: [java.util.List, java.util.Collection, java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x0098 -> B:28:0x009b). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:83:0x019c -> B:64:0x019f). Please report as a decompilation issue!!! */
    @Override // defpackage.AbstractC9049e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object loadAd(java.lang.Object r12) {
        /*
            Method dump skipped, instructions count: 528
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C4836e.loadAd(java.lang.Object):java.lang.Object");
    }
}
