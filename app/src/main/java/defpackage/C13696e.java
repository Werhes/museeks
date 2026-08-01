package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eْٓؑ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C13696e extends AbstractC7185e implements Function2 {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final /* synthetic */ int f27131e = 1;

    /* renamed from: eٕؒۙ, reason: contains not printable characters */
    public Object f27132e;

    /* renamed from: eٕؓۥ, reason: contains not printable characters */
    public Object f27133e;

    /* renamed from: eؙؔٞ, reason: contains not printable characters */
    public Object f27134e;

    /* renamed from: eَؕ۟, reason: contains not printable characters */
    public /* synthetic */ Object f27135e;

    /* renamed from: eؚٕؒ, reason: contains not printable characters */
    public final /* synthetic */ Object f27136e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public int f27137e;

    /* renamed from: eٍۗۛ, reason: contains not printable characters */
    public Object f27138e;

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public int f27139e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public int f27140e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public Object f27141e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13696e(InterfaceC5083e interfaceC5083e, C7576e c7576e, InterfaceC5979e interfaceC5979e, Function2 function2) {
        super(2, interfaceC5083e);
        this.f27135e = c7576e;
        this.f27136e = function2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13696e(List list, ArrayList arrayList, InterfaceC5083e interfaceC5083e) {
        super(2, interfaceC5083e);
        this.f27138e = list;
        this.f27136e = arrayList;
    }

    @Override // defpackage.AbstractC9049e
    public final InterfaceC5083e advert(InterfaceC5083e interfaceC5083e, Object obj) {
        switch (this.f27131e) {
            case 0:
                C13696e c13696e = new C13696e((List) this.f27138e, (ArrayList) this.f27136e, interfaceC5083e);
                c13696e.f27135e = obj;
                return c13696e;
            default:
                return new C13696e(interfaceC5083e, (C7576e) this.f27135e, null, (Function2) this.f27136e);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f27131e) {
            case 0:
                return ((C13696e) advert((InterfaceC5083e) obj2, obj)).loadAd(Unit.INSTANCE);
            default:
                return ((C13696e) advert((InterfaceC5083e) obj2, (InterfaceC18435e) obj)).loadAd(Unit.INSTANCE);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x019b  */
    /* JADX WARN: Type inference failed for: r1v14, types: [int] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:52:0x018d -> B:42:0x018f). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:53:0x0195 -> B:43:0x013a). Please report as a decompilation issue!!! */
    @Override // defpackage.AbstractC9049e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object loadAd(java.lang.Object r14) {
        /*
            Method dump skipped, instructions count: 420
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C13696e.loadAd(java.lang.Object):java.lang.Object");
    }
}
