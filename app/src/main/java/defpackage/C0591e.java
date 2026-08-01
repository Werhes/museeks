package defpackage;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function5;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؑ۟ۡ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0591e extends AbstractC7185e implements Function5 {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public /* synthetic */ List f2785e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public /* synthetic */ EnumC2502e f2786e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public /* synthetic */ InterfaceC6912e f2787e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public /* synthetic */ List f2788e;

    /* JADX WARN: Type inference failed for: r0v0, types: [eؚٖؓ, eؑ۟ۡ] */
    @Override // kotlin.jvm.functions.Function5
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        ?? abstractC7185e = new AbstractC7185e(5, (InterfaceC5083e) obj5);
        abstractC7185e.f2785e = (List) obj;
        abstractC7185e.f2788e = (List) obj2;
        abstractC7185e.f2787e = (InterfaceC6912e) obj3;
        abstractC7185e.f2786e = (EnumC2502e) obj4;
        return abstractC7185e.loadAd(Unit.INSTANCE);
    }

    @Override // defpackage.AbstractC9049e
    public final Object loadAd(Object obj) {
        List list = this.f2785e;
        List list2 = this.f2788e;
        InterfaceC6912e interfaceC6912e = this.f2787e;
        EnumC2502e enumC2502e = this.f2786e;
        AbstractC2003e.purchase(obj);
        int ordinal = enumC2502e.ordinal();
        if (ordinal == 0) {
            return list;
        }
        if (ordinal == 1) {
            return list2;
        }
        if (ordinal == 2) {
            return interfaceC6912e;
        }
        throw new C14803e(10);
    }
}
