package defpackage;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٖٓؑ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C13698e extends AbstractC7185e implements Function2 {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final /* synthetic */ int f27142e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public final /* synthetic */ String f27143e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final /* synthetic */ String f27144e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public /* synthetic */ Object f27145e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C13698e(String str, String str2, InterfaceC5083e interfaceC5083e, int i) {
        super(2, interfaceC5083e);
        this.f27142e = i;
        this.f27144e = str;
        this.f27143e = str2;
    }

    @Override // defpackage.AbstractC9049e
    public final InterfaceC5083e advert(InterfaceC5083e interfaceC5083e, Object obj) {
        switch (this.f27142e) {
            case 0:
                C13698e c13698e = new C13698e(this.f27144e, this.f27143e, interfaceC5083e, 0);
                c13698e.f27145e = obj;
                return c13698e;
            default:
                C13698e c13698e2 = new C13698e(this.f27144e, this.f27143e, interfaceC5083e, 1);
                c13698e2.f27145e = obj;
                return c13698e2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f27142e) {
            case 0:
                return ((C13698e) advert((InterfaceC5083e) obj2, (C0044e) obj)).loadAd(Unit.INSTANCE);
            default:
                return ((C13698e) advert((InterfaceC5083e) obj2, (C3487e) obj)).loadAd(Unit.INSTANCE);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v14, types: [java.util.Map] */
    @Override // defpackage.AbstractC9049e
    public final Object loadAd(Object obj) {
        LinkedHashMap linkedHashMap;
        switch (this.f27142e) {
            case 0:
                AbstractC2003e.purchase(obj);
                C0044e c0044e = (C0044e) this.f27145e;
                C0044e appmetrica = c0044e.appmetrica();
                C11951e c11951e = C1890e.billing;
                Set set = (Set) c0044e.metrica(c11951e);
                if (set == null) {
                    set = C3295e.f7451e;
                }
                String str = this.f27144e;
                appmetrica.license(c11951e, AbstractC4511e.Signature(set, str));
                appmetrica.license(C5749e.vip(C1890e.license, str), this.f27143e);
                return appmetrica.purchase();
            default:
                C3487e c3487e = (C3487e) this.f27145e;
                AbstractC2003e.purchase(obj);
                Map map = c3487e.f7758e;
                boolean isEmpty = map.isEmpty();
                String str2 = this.f27144e;
                String str3 = this.f27143e;
                if (isEmpty) {
                    linkedHashMap = Collections.singletonMap(str2, str3);
                } else {
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap(map);
                    linkedHashMap2.put(str2, str3);
                    linkedHashMap = linkedHashMap2;
                }
                return C3487e.vip(c3487e, 0, 0, 0, 0, 0, 0, false, false, false, false, linkedHashMap, 0, false, 15359);
        }
    }
}
