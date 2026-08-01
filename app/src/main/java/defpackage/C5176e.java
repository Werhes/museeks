package defpackage;

import android.os.Handler;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import ua.itaysonlab.catalogkit.objects.Catalog2Response;
import ua.itaysonlab.vkapi2.objects.users.VKProfile;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؗۜ۟, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5176e extends AbstractC7185e implements Function2 {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final /* synthetic */ int f11080e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public final /* synthetic */ Object f11081e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final /* synthetic */ Object f11082e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public /* synthetic */ Object f11083e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C5176e(Object obj, Object obj2, InterfaceC5083e interfaceC5083e, int i) {
        super(2, interfaceC5083e);
        this.f11080e = i;
        this.f11082e = obj;
        this.f11081e = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C5176e(Object obj, Object obj2, Object obj3, InterfaceC5083e interfaceC5083e, int i) {
        super(2, interfaceC5083e);
        this.f11080e = i;
        this.f11083e = obj;
        this.f11082e = obj2;
        this.f11081e = obj3;
    }

    @Override // defpackage.AbstractC9049e
    public final InterfaceC5083e advert(InterfaceC5083e interfaceC5083e, Object obj) {
        switch (this.f11080e) {
            case 0:
                return new C5176e((Handler) this.f11083e, (DialogC11829e) this.f11082e, (C4246e) this.f11081e, interfaceC5083e, 0);
            case 1:
                C5176e c5176e = new C5176e((C10675e) this.f11082e, (C15718e) this.f11081e, interfaceC5083e, 1);
                c5176e.f11083e = obj;
                return c5176e;
            case 2:
                return new C5176e((C1875e) this.f11083e, (VKProfile) this.f11082e, (C0714e) this.f11081e, interfaceC5083e, 2);
            case 3:
                return new C5176e((InterfaceC13033e) this.f11083e, (C12025e) this.f11082e, (AbstractC0232e) this.f11081e, interfaceC5083e, 3);
            case 4:
                C5176e c5176e2 = new C5176e((AbstractC15876e) this.f11082e, (Catalog2Response) this.f11081e, interfaceC5083e, 4);
                c5176e2.f11083e = obj;
                return c5176e2;
            case 5:
                C5176e c5176e3 = new C5176e((InterfaceC13742e) this.f11082e, (InterfaceC11944e) this.f11081e, interfaceC5083e, 5);
                c5176e3.f11083e = obj;
                return c5176e3;
            case 6:
                C5176e c5176e4 = new C5176e((C2007e) this.f11082e, (String) this.f11081e, interfaceC5083e, 6);
                c5176e4.f11083e = obj;
                return c5176e4;
            case 7:
                C5176e c5176e5 = new C5176e((C7838e) this.f11082e, (String) this.f11081e, interfaceC5083e, 7);
                c5176e5.f11083e = obj;
                return c5176e5;
            case 8:
                return new C5176e((C9456e) this.f11083e, (InterfaceC16054e) this.f11082e, (C6260e) this.f11081e, interfaceC5083e, 8);
            case 9:
                C5176e c5176e6 = new C5176e((C9456e) this.f11082e, (InterfaceC16132e) this.f11081e, interfaceC5083e, 9);
                c5176e6.f11083e = obj;
                return c5176e6;
            case 10:
                C5176e c5176e7 = new C5176e((C1902e) this.f11082e, (InterfaceC13742e) this.f11081e, interfaceC5083e, 10);
                c5176e7.f11083e = obj;
                return c5176e7;
            default:
                C5176e c5176e8 = new C5176e((C7765e) this.f11082e, (InterfaceC13742e) this.f11081e, interfaceC5083e, 11);
                c5176e8.f11083e = obj;
                return c5176e8;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f11080e) {
            case 0:
                return ((C5176e) advert((InterfaceC5083e) obj2, (InterfaceC18435e) obj)).loadAd(Unit.INSTANCE);
            case 1:
                return ((C5176e) advert((InterfaceC5083e) obj2, (InterfaceC18435e) obj)).loadAd(Unit.INSTANCE);
            case 2:
                return ((C5176e) advert((InterfaceC5083e) obj2, (InterfaceC18435e) obj)).loadAd(Unit.INSTANCE);
            case 3:
                return ((C5176e) advert((InterfaceC5083e) obj2, (InterfaceC18435e) obj)).loadAd(Unit.INSTANCE);
            case 4:
                return ((C5176e) advert((InterfaceC5083e) obj2, (InterfaceC18435e) obj)).loadAd(Unit.INSTANCE);
            case 5:
                return ((C5176e) advert((InterfaceC5083e) obj2, (InterfaceC18435e) obj)).loadAd(Unit.INSTANCE);
            case 6:
                return ((C5176e) advert((InterfaceC5083e) obj2, (InterfaceC18435e) obj)).loadAd(Unit.INSTANCE);
            case 7:
                return ((C5176e) advert((InterfaceC5083e) obj2, (C12318e) obj)).loadAd(Unit.INSTANCE);
            case 8:
                return ((C5176e) advert((InterfaceC5083e) obj2, (InterfaceC18435e) obj)).loadAd(Unit.INSTANCE);
            case 9:
                return ((C5176e) advert((InterfaceC5083e) obj2, (String) obj)).loadAd(Unit.INSTANCE);
            case 10:
                return ((C5176e) advert((InterfaceC5083e) obj2, (InterfaceC18435e) obj)).loadAd(Unit.INSTANCE);
            default:
                return ((C5176e) advert((InterfaceC5083e) obj2, (InterfaceC18435e) obj)).loadAd(Unit.INSTANCE);
        }
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0371  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0389  */
    /* JADX WARN: Type inference failed for: r14v3 */
    /* JADX WARN: Type inference failed for: r14v4 */
    /* JADX WARN: Type inference failed for: r14v5 */
    /* JADX WARN: Type inference failed for: r14v6 */
    /* JADX WARN: Type inference failed for: r14v7 */
    /* JADX WARN: Type inference failed for: r14v8 */
    /* JADX WARN: Type inference failed for: r2v15, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v29 */
    /* JADX WARN: Type inference failed for: r2v30 */
    /* JADX WARN: Type inference failed for: r2v33 */
    /* JADX WARN: Type inference failed for: r6v11, types: [java.util.LinkedHashMap, java.util.Map] */
    @Override // defpackage.AbstractC9049e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object loadAd(java.lang.Object r24) {
        /*
            Method dump skipped, instructions count: 1202
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C5176e.loadAd(java.lang.Object):java.lang.Object");
    }
}
